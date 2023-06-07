package com.hcc.controllers;

import com.hcc.dtos.AssignmentResponseDto;
import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.repositories.AssignmentRepository;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class AssignmentController {
    @Autowired
    AssignmentService assignmentService;

    @Autowired
    AssignmentRepository assignmentRepository;

    @GetMapping("api/assignments")
    public ResponseEntity<?> getAssignmentByUser(@AuthenticationPrincipal User user) {
        Optional<Assignment> http = assignmentRepository.findAssignmentByUser(user);
        return ResponseEntity.ok(http);
    }

    @GetMapping("/api/assignments/{id}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long id, @AuthenticationPrincipal User user) {
        Optional<Assignment> assignment = assignmentRepository.findById(id);
        return ResponseEntity.ok(new AssignmentResponseDto(assignment.orElse(new Assignment())));
    }

    @PutMapping("api/assignments/{id}")
    public ResponseEntity<?> putAssignmentById(@PathVariable Long id, @RequestBody Assignment assignment,
                                               @AuthenticationPrincipal User user) {
        Optional http = assignmentRepository.findById(id);
        return ResponseEntity.ok(http);
    }

    @PostMapping("api/assignments")
    public ResponseEntity<?> postAssignment(@AuthenticationPrincipal User user) {
        Assignment assignment = assignmentService.save(user);
        return ResponseEntity.ok(assignment);
    }
}

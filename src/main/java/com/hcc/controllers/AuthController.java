package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.repositories.AssignmentRepository;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping
public class AuthController {
    @Autowired
    AssignmentService assignmentService;

    @Autowired
    AssignmentRepository assignmentRepository;

    @GetMapping("/api/assignments")
    public ResponseEntity<?> getAssignmentByUser(@AuthenticationPrincipal User user) {
        Optional<Set<Assignment>> http = assignmentRepository.findAssignmentByUser(user);
        return ResponseEntity.ok(http);
    }
}

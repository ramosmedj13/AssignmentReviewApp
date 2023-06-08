package com.hcc.services;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.enums.AssignmentStatusEnum;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;

    public Assignment save(User user) {
        Assignment assignment = new Assignment();
        assignment.setUser(user);
        assignment.setStatus(AssignmentStatusEnum.READY_TO_CLAIM.getStatus());
        return assignmentRepository.save(assignment);
    }

    private Integer nextAssignment(User user) {
        Optional<Assignment> assignmentByUser = assignmentRepository.findAssignmentByUser(user);
        if (assignmentByUser == null) return 1;

        Optional<Integer> assignments = assignmentByUser.stream()
                .sorted((firstAssignment, secondAssignment) -> {
                    if (firstAssignment.getNumber() == null) return 1;
                    if (secondAssignment.getNumber() == null) return 1;

                    return secondAssignment.getNumber().compareTo(firstAssignment.getNumber());
                }).map(assignment -> {
                    if (assignment.getNumber() == null) return 1;

                    return assignment.getNumber() + 1;
                }).findFirst();

        return assignments.orElse(1);
    }
}

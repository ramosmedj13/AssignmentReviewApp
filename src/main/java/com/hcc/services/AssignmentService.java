package com.hcc.services;

import com.hcc.entities.Assignment;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;
}

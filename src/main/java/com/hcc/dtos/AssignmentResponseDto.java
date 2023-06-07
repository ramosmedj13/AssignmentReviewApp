package com.hcc.dtos;

import com.hcc.entities.Assignment;
import com.hcc.enums.AssignmentEnum;
import com.hcc.enums.AssignmentStatusEnum;

public class AssignmentResponseDto {
    private Assignment assignment;
    private AssignmentEnum[] assignmentEnums = AssignmentEnum.values();
    private AssignmentStatusEnum[] assignmentStatusEnums = AssignmentStatusEnum.values();

    public AssignmentResponseDto(Assignment assignment) {
        this.assignment = assignment;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public AssignmentEnum[] getAssignmentEnums() {
        return assignmentEnums;
    }

    public void setAssignmentEnums(AssignmentEnum[] assignmentEnums) {
        this.assignmentEnums = assignmentEnums;
    }

    public AssignmentStatusEnum[] getAssignmentStatusEnums() {
        return assignmentStatusEnums;
    }

    public void setAssignmentStatusEnums(AssignmentStatusEnum[] assignmentStatusEnums) {
        this.assignmentStatusEnums = assignmentStatusEnums;
    }
}

package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentStatusEnum {
    READY_TO_CLAIM("Ready to Claim"),
    CLAIMED("Claimed"),
    REJECTED("Rejected"),
    COMPLETED("Completed"),
    RESUBMITTED("Resubmitted");

    private final String status;

    AssignmentStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

package com.hcc.enums;

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

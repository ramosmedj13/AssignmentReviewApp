package com.hcc.enums;

public enum AssignmentEnum {
    WORKING_ON("Working On"),
    SUBMITTED("Submitted"),
    REJECTED("Rejected"),
    COMPLETED("Completed");

    private final String status;

    AssignmentEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
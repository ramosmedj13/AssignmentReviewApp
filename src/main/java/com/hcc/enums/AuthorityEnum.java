package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AuthorityEnum {
    ROLE_STUDENT("ROLE_STUDENT"),
    ROLE_REVIEWER("ROLE_REVIEWER");

    private final String authority;

    AuthorityEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}

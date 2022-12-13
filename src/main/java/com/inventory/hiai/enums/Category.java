package com.inventory.hiai.enums;

import lombok.Getter;

public enum Category {
    GROCERY,
    ELECTRONIC,
    APPLIANCE,
    ENTERTAINMENT,
    FURNITURE,
    OTHER;

    @Getter
    private String description;

    static {
        for (Category c : values()) {
            c.description = c.name();
        }
    }
}
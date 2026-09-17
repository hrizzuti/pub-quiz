package com.elsevier.pubquiz;

public enum Theme {
    ALL("All themes"),
    AI("AI"),
    ELSEVIER("Elsevier"),
    INDIA("India"),
    SDD("SDD"),
    FRANCE("France"),
    BRITAIN("Britain");

    private final String displayName;

    Theme(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}

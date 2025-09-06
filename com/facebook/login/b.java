package com.facebook.login;

public enum b {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String f;

    private b(String s1) {
        this.f = s1;
    }

    public String b() {
        return this.f;
    }
}


package com.google.firebase.installations;

import a2.k;

public class d extends k {
    public static enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS;

    }

    private final a f;

    public d(a d$a0) {
        this.f = d$a0;
    }

    public d(String s, a d$a0) {
        super(s);
        this.f = d$a0;
    }
}


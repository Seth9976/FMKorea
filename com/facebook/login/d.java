package com.facebook.login;

public enum d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);

    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    private d(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    boolean b() {
        return this.j;
    }

    boolean f() {
        return this.i;
    }

    boolean g() {
        return this.k;
    }

    boolean h() {
        return this.f;
    }

    boolean i() {
        return this.g;
    }

    boolean j() {
        return this.h;
    }
}


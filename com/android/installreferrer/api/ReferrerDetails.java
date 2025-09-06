package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {
    private final Bundle a;

    public ReferrerDetails(Bundle bundle0) {
        this.a = bundle0;
    }

    public String a() {
        return this.a.getString("install_referrer");
    }
}


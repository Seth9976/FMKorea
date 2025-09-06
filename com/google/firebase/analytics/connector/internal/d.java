package com.google.firebase.analytics.connector.internal;

import b2.a.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

public final class d {
    Set a;
    private b b;
    private AppMeasurementSdk c;
    private c d;

    public d(AppMeasurementSdk appMeasurementSdk0, b a$b0) {
        this.b = a$b0;
        this.c = appMeasurementSdk0;
        c c0 = new c(this);
        this.d = c0;
        this.c.registerOnMeasurementEventListener(c0);
        this.a = new HashSet();
    }

    static b a(d d0) {
        return d0.b;
    }
}


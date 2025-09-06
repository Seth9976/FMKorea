package com.google.firebase.analytics.connector.internal;

import b2.a.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public final class f {
    private b a;
    private AppMeasurementSdk b;
    private e c;

    public f(AppMeasurementSdk appMeasurementSdk0, b a$b0) {
        this.a = a$b0;
        this.b = appMeasurementSdk0;
        e e0 = new e(this);
        this.c = e0;
        this.b.registerOnMeasurementEventListener(e0);
    }
}


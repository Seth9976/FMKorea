package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;

final class c implements OnEventListener {
    private final d a;

    public c(d d0) {
        this.a = d0;
        super();
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        if(!this.a.a.contains(s1)) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putString("events", a.a(s1));
        d.a(this.a).a(2, bundle1);
    }
}


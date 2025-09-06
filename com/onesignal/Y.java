package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;
import z3.k;

public final class y {
    public static final y a;

    static {
        y.a = new y();
    }

    public final x a(Context context0, JSONObject jSONObject0) {
        k.e(context0, "context");
        k.e(jSONObject0, "fcmPayload");
        Z0 z00 = new Z0(context0, jSONObject0);
        return new x(context0, this.b(z00.b()), this.c(z00.a(), jSONObject0));
    }

    private final Intent b(Uri uri0) {
        return uri0 == null ? null : OSUtils.O(uri0);
    }

    private final boolean c(boolean z, JSONObject jSONObject0) {
        return I0.a(jSONObject0) != null ? z | true : z;
    }
}


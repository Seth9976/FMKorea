package com.onesignal;

import android.content.Context;
import android.content.Intent;
import z3.k;

public final class x {
    private final Context a;
    private final Intent b;
    private final boolean c;

    public x(Context context0, Intent intent0, boolean z) {
        k.e(context0, "context");
        super();
        this.a = context0;
        this.b = intent0;
        this.c = z;
    }

    private final Intent a() {
        if(!this.c) {
            return null;
        }
        Intent intent0 = this.a.getPackageManager().getLaunchIntentForPackage("com.fmkorea.m.fmk");
        if(intent0 == null) {
            return null;
        }
        intent0.setPackage(null);
        intent0.setFlags(0x10200000);
        return intent0;
    }

    public final Intent b() {
        return this.b == null ? this.a() : this.b;
    }
}


package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import b1.a;
import com.facebook.appevents.m;

public class b extends BroadcastReceiver {
    private Context a;
    private static b b;

    private b(Context context0) {
        this.a = context0.getApplicationContext();
    }

    private void a() {
        if(a.d(this)) {
            return;
        }
        try {
            X.a.b(this.a).e(this);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    public static b b(Context context0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            b b0 = b.b;
            if(b0 != null) {
                return b0;
            }
            b b1 = new b(context0);
            b.b = b1;
            b1.c();
            return b.b;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private void c() {
        if(a.d(this)) {
            return;
        }
        try {
            X.a.b(this.a).c(this, new IntentFilter("com.parse.bolts.measurement_event"));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    @Override
    protected void finalize() {
        if(a.d(this)) {
            return;
        }
        try {
            this.a();
            return;
        }
        catch(Throwable throwable0) {
        }
        finally {
            super.finalize();
        }
        a.b(throwable0, this);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(a.d(this)) {
            return;
        }
        try {
            m m0 = new m(context0);
            String s = "bf_" + intent0.getStringExtra("event_name");
            Bundle bundle0 = intent0.getBundleExtra("event_args");
            Bundle bundle1 = new Bundle();
            for(Object object0: bundle0.keySet()) {
                bundle1.putString(((String)object0).replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), ((String)bundle0.get(((String)object0))));
            }
            m0.g(s, bundle1);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }
}


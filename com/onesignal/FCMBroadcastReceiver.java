package com.onesignal;

import U.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;

public class FCMBroadcastReceiver extends a {
    private static boolean c(Intent intent0) {
        if("com.google.android.c2dm.intent.RECEIVE".equals(intent0.getAction())) {
            String s = intent0.getStringExtra("message_type");
            return s == null || "gcm".equals(s);
        }
        return false;
    }

    private static void d(Context context0, Intent intent0, Bundle bundle0, e s$e0) {
        class b implements e {
            final e a;
            final Context b;
            final Bundle c;

            b(e s$e0, Context context0, Bundle bundle0) {
                this.b = context0;
                this.c = bundle0;
                super();
            }

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
                if(s$f0 != null && s$f0.c()) {
                    this.a.a(s$f0);
                    return;
                }
                FCMBroadcastReceiver.h(this.b, this.c);
                this.a.a(s$f0);
            }
        }

        if(!FCMBroadcastReceiver.c(intent0)) {
            s$e0.a(null);
        }
        S.h(context0, bundle0, new b(s$e0, context0, bundle0));
    }

    private void e() {
        if(this.isOrderedBroadcast()) {
            this.abortBroadcast();
            this.setResultCode(-1);
        }
    }

    private static m f(Bundle bundle0, m m0) {
        m0.a("json_payload", S.a(bundle0).toString());
        m0.c("timestamp", ((long)(I1.H0().a() / 1000L)));
        return m0;
    }

    private void g() {
        if(this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }

    static void h(Context context0, Bundle bundle0) {
        C i1$C0 = C.k;
        I1.a(i1$C0, "startFCMService from: " + context0 + " and bundle: " + bundle0);
        if(!S.c(bundle0)) {
            I1.a(i1$C0, "startFCMService with no remote resources, no need for services");
            S.j(context0, FCMBroadcastReceiver.f(bundle0, o.a()));
            return;
        }
        if(Integer.parseInt(bundle0.getString("pri", "0")) <= 9 && Build.VERSION.SDK_INT >= 26) {
            FCMBroadcastReceiver.i(context0, bundle0);
            return;
        }
        try {
            FCMBroadcastReceiver.j(context0, bundle0);
        }
        catch(IllegalStateException unused_ex) {
            FCMBroadcastReceiver.i(context0, bundle0);
        }
    }

    private static void i(Context context0, Bundle bundle0) {
        m m0 = FCMBroadcastReceiver.f(bundle0, o.a());
        Intent intent0 = new Intent(context0, FCMIntentJobService.class);
        intent0.putExtra("Bundle:Parcelable:Extras", ((Parcelable)m0.e()));
        FCMIntentJobService.j(context0, intent0);
    }

    private static void j(Context context0, Bundle bundle0) {
        ComponentName componentName0 = new ComponentName("com.fmkorea.m.fmk", "com.onesignal.FCMIntentService");
        m m0 = FCMBroadcastReceiver.f(bundle0, new n());
        a.startWakefulService(context0, new Intent().replaceExtras(((Bundle)m0.e())).setComponent(componentName0));
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        class com.onesignal.FCMBroadcastReceiver.a implements e {
            final FCMBroadcastReceiver a;

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
                if(s$f0 == null) {
                    FCMBroadcastReceiver.this.g();
                    return;
                }
                if(!s$f0.a() && !s$f0.b()) {
                    FCMBroadcastReceiver.this.g();
                    return;
                }
                FCMBroadcastReceiver.this.e();
            }
        }

        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null && !"google.com/iid".equals(bundle0.getString("from"))) {
            I1.X0(context0);
            FCMBroadcastReceiver.d(context0, intent0, bundle0, new com.onesignal.FCMBroadcastReceiver.a(this));
        }
    }
}


package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import m1.p.a;
import m1.p;
import m1.u;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static void a() {
    }

    private static void b() {
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        String s = intent0.getData().getQueryParameter("backendName");
        String s1 = intent0.getData().getQueryParameter("extras");
        int v = (int)Integer.valueOf(intent0.getData().getQueryParameter("priority"));
        int v1 = intent0.getExtras().getInt("attemptNumber");
        u.f(context0);
        a p$a0 = p.a().b(s).d(x1.a.b(v));
        if(s1 != null) {
            p$a0.c(Base64.decode(s1, 0));
        }
        u.c().e().v(p$a0.a(), v1, new t1.a());
    }
}


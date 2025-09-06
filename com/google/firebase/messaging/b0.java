package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class b0 implements Runnable {
    class a extends BroadcastReceiver {
        private b0 a;
        final b0 b;

        public a(b0 b01) {
            this.a = b01;
        }

        public void a() {
            if(b0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            b0.this.f.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            synchronized(this) {
                b0 b00 = this.a;
                if(b00 == null) {
                    return;
                }
                if(!b00.i()) {
                    return;
                }
                if(b0.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.i.l(this.a, 0L);
                context0.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    private final Context f;
    private final F g;
    private final PowerManager.WakeLock h;
    private final a0 i;
    private final long j;
    private static final Object k;
    private static Boolean l;
    private static Boolean m;

    static {
        b0.k = new Object();
    }

    b0(a0 a00, Context context0, F f0, long v) {
        this.i = a00;
        this.f = context0;
        this.j = v;
        this.g = f0;
        this.h = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String s) [...] // Inlined contents

    private static boolean f(Context context0) {
        Boolean boolean0;
        synchronized(b0.k) {
            boolean0 = Boolean.valueOf((b0.m == null ? b0.g(context0, "android.permission.ACCESS_NETWORK_STATE", null) : b0.m.booleanValue()));
            b0.m = boolean0;
        }
        return boolean0.booleanValue();
    }

    private static boolean g(Context context0, String s, Boolean boolean0) {
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        boolean z = context0.checkCallingOrSelfPermission(s) == 0;
        if(!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + s + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    private static boolean h(Context context0) {
        Boolean boolean0;
        synchronized(b0.k) {
            boolean0 = Boolean.valueOf((b0.l == null ? b0.g(context0, "android.permission.WAKE_LOCK", null) : b0.l.booleanValue()));
            b0.l = boolean0;
        }
        return boolean0.booleanValue();
    }

    private boolean i() {
        synchronized(this) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)this.f.getSystemService("connectivity");
            NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnected();
        }
    }

    // 去混淆评级： 低(30)
    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override
    public void run() {
        PowerManager.WakeLock powerManager$WakeLock0;
        if(b0.h(this.f)) {
            this.h.acquire(e.a);
        }
        try {
            this.i.m(true);
            if(!this.g.g()) {
                goto label_18;
            }
            if(b0.f(this.f) && !this.i()) {
                goto label_12;
            }
            if(this.i.p()) {
                this.i.m(false);
            }
            else {
                this.i.q(this.j);
            }
        }
        catch(IOException iOException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        if(b0.h(this.f)) {
            try {
                powerManager$WakeLock0 = this.h;
                goto label_25;
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                return;
            }
            try {
            label_12:
                new a(this, this).a();
            }
            catch(IOException iOException0) {
                goto label_21;
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
            if(b0.h(this.f)) {
                try {
                    this.h.release();
                    return;
                }
                catch(RuntimeException unused_ex) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                }
            }
            return;
            try {
                try {
                label_18:
                    this.i.m(false);
                    goto label_36;
                }
                catch(IOException iOException0) {
                }
            label_21:
                Log.e("FirebaseMessaging", "Failed to sync topics. Won\'t retry sync. " + iOException0.getMessage());
                this.i.m(false);
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
            if(b0.h(this.f)) {
                try {
                    powerManager$WakeLock0 = this.h;
                label_25:
                    powerManager$WakeLock0.release();
                }
                catch(RuntimeException unused_ex) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                }
                return;
            }
        }
        return;
    label_31:
        if(b0.h(this.f)) {
            try {
                this.h.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
        throw throwable0;
    label_36:
        if(b0.h(this.f)) {
            try {
                this.h.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
    }
}


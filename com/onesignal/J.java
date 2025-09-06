package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import z3.g;
import z3.k;

public abstract class j {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final ApplicationInfo a(Context context0) {
            k.e(context0, "context");
            if(j.b != null) {
                return j.b;
            }
            PackageManager packageManager0 = context0.getPackageManager();
            try {
                j.b = packageManager0.getApplicationInfo("com.fmkorea.m.fmk", 0x80);
                return j.b;
            }
            catch(RuntimeException runtimeException0) {
                if(!i.a(runtimeException0.getCause())) {
                    throw runtimeException0;
                }
                return null;
            }
        }
    }

    public static final a a;
    private static ApplicationInfo b;

    static {
        j.a = new a(null);
    }
}


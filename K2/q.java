package K2;

import M2.h;
import a2.e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Build;
import u2.a;
import w2.d;
import z3.k;

public final class q {
    public static final q a;
    private static final a b;

    static {
        q.a = new q();
        a a0 = new d().j(c.a).k(true).i();
        k.d(a0, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        q.b = a0;
    }

    public final b a(e e0) {
        k.e(e0, "firebaseApp");
        Context context0 = e0.j();
        k.d(context0, "firebaseApp.applicationContext");
        PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0);
        String s = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo0.versionCode) : String.valueOf(packageInfo0.getLongVersionCode());
        String s1 = e0.m().c();
        k.d(s1, "firebaseApp.options.applicationId");
        String s2 = Build.MODEL;
        k.d(s2, "MODEL");
        String s3 = Build.VERSION.RELEASE;
        k.d(s3, "RELEASE");
        k.d("com.fmkorea.m.fmk", "packageName");
        String s4 = packageInfo0.versionName;
        k.d(s4, "packageInfo.versionName");
        String s5 = Build.MANUFACTURER;
        k.d(s5, "MANUFACTURER");
        K2.a a0 = new K2.a("com.fmkorea.m.fmk", s4, s, s5);
        return new b(s1, s2, "1.0.0", s3, m.j, a0);
    }

    public final a b() {
        return q.b;
    }

    public final p c(e e0, o o0, h h0) {
        k.e(e0, "firebaseApp");
        k.e(o0, "sessionDetails");
        k.e(h0, "sessionsSettings");
        s s0 = new s(o0.b(), o0.a(), o0.c(), o0.d(), new f(null, null, h0.b(), 3, null), null, 0x20, null);
        b b0 = this.a(e0);
        return new p(j.h, s0, b0);
    }
}


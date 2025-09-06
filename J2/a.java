package j2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import g2.e;
import java.util.List;

public class a {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final e h;

    public a(String s, String s1, List list0, String s2, String s3, String s4, String s5, e e0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = e0;
    }

    public static a a(Context context0, y y0, String s, String s1, List list0, e e0) {
        String s2 = y0.g();
        PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0);
        return new a(s, s1, list0, s2, "com.fmkorea.m.fmk", a.b(packageInfo0), (packageInfo0.versionName == null ? "0.0" : packageInfo0.versionName), e0);
    }

    private static String b(PackageInfo packageInfo0) {
        return Build.VERSION.SDK_INT < 28 ? Integer.toString(packageInfo0.versionCode) : Long.toString(packageInfo0.getLongVersionCode());
    }
}


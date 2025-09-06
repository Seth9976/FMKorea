package p2;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.tasks.Task;
import j2.D;
import j2.r;
import java.nio.charset.Charset;
import k1.g;
import l2.B;
import m1.u;
import m2.h;
import q2.i;

public class b {
    private final e a;
    private final k1.e b;
    private static final h c;
    private static final String d;
    private static final String e;
    private static final k1.e f;

    static {
        b.c = new h();
        b.d = "https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog";
        b.e = "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M";
        b.f = (B b0) -> b.d(b0);
    }

    b(e e0, k1.e e1) {
        this.a = e0;
        this.b = e1;
    }

    // 检测为 Lambda 实现
    public static byte[] a(B b0) [...]

    public static b b(Context context0, i i0, D d0) {
        u.f(context0);
        g g0 = u.c().g(new a("https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M"));
        k1.b b0 = k1.b.b("json");
        return new b(new e(g0.a("FIREBASE_CRASHLYTICS_REPORT", B.class, b0, b.f), i0.b(), d0), b.f);
    }

    public Task c(r r0, boolean z) {
        return this.a.i(r0, z).getTask();
    }

    private static byte[] d(B b0) {
        return b.c.G(b0).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String s, String s1) {
        int v = s.length() - s1.length();
        if(v < 0 || v > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + s1.length());
        for(int v1 = 0; v1 < s.length(); ++v1) {
            stringBuilder0.append(s.charAt(v1));
            if(s1.length() > v1) {
                stringBuilder0.append(s1.charAt(v1));
            }
        }
        return stringBuilder0.toString();
    }
}


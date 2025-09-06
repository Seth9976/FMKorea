package f2;

import B2.a;
import android.os.Bundle;
import h2.e;
import h2.f;
import i2.b;
import i2.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d {
    private final a a;
    private volatile h2.a b;
    private volatile b c;
    private final List d;

    public d(a a0) {
        this(a0, new c(), new f());
    }

    public d(a a0, b b0, h2.a a1) {
        this.a = a0;
        this.c = b0;
        this.d = new ArrayList();
        this.b = a1;
        this.f();
    }

    // 检测为 Lambda 实现
    public static void a(d d0, B2.b b0) [...]

    // 检测为 Lambda 实现
    public static void b(d d0, String s, Bundle bundle0) [...]

    // 检测为 Lambda 实现
    public static void c(d d0, i2.a a0) [...]

    public h2.a d() {
        return (String s, Bundle bundle0) -> this.g(s, bundle0);
    }

    public b e() {
        return (i2.a a0) -> this.h(a0);
    }

    private void f() {
        f2.c c0 = (B2.b b0) -> this.i(b0);
        this.a.a(c0);
    }

    private void g(String s, Bundle bundle0) {
        this.b.a(s, bundle0);
    }

    private void h(i2.a a0) {
        synchronized(this) {
            if(this.c instanceof c) {
                this.d.add(a0);
            }
            this.c.a(a0);
        }
    }

    private void i(B2.b b0) {
        g2.f.f().b("AnalyticsConnector now available.");
        b2.a a0 = (b2.a)b0.get();
        e e0 = new e(a0);
        f2.e e1 = new f2.e();
        if(d.j(a0, e1) != null) {
            g2.f.f().b("Registered Firebase Analytics listener.");
            h2.d d0 = new h2.d();
            h2.c c0 = new h2.c(e0, 500, TimeUnit.MILLISECONDS);
            synchronized(this) {
                for(Object object0: this.d) {
                    d0.a(((i2.a)object0));
                }
                e1.d(d0);
                e1.e(c0);
                this.c = d0;
                this.b = c0;
            }
            return;
        }
        g2.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static b2.a.a j(b2.a a0, f2.e e0) {
        b2.a.a a$a0 = a0.a("clx", e0);
        if(a$a0 == null) {
            g2.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a$a0 = a0.a("crash", e0);
            if(a$a0 != null) {
                g2.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a$a0;
    }
}


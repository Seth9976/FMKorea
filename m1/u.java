package m1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import k1.b;
import k1.h;
import s1.e;
import t1.r;
import w1.a;

public class u implements t {
    private final a a;
    private final a b;
    private final e c;
    private final r d;
    private static volatile v e;

    static {
    }

    u(a a0, a a1, e e0, r r0, t1.v v0) {
        this.a = a0;
        this.b = a1;
        this.c = e0;
        this.d = r0;
        v0.c();
    }

    @Override  // m1.t
    public void a(o o0, h h0) {
        p p0 = o0.f().f(o0.c().c());
        i i0 = this.b(o0);
        this.c.a(p0, i0, h0);
    }

    private i b(o o0) {
        return i.a().i(this.a.a()).k(this.b.a()).j(o0.g()).h(new m1.h(o0.b(), o0.d())).g(o0.c().a()).d();
    }

    public static u c() {
        v v0 = u.e;
        if(v0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return v0.b();
    }

    // 去混淆评级： 低(20)
    private static Set d(f f0) {
        return f0 instanceof g ? Collections.unmodifiableSet(((g)f0).a()) : Collections.singleton(b.b("proto"));
    }

    public r e() {
        return this.d;
    }

    public static void f(Context context0) {
        if(u.e == null) {
            Class class0 = u.class;
            synchronized(class0) {
                if(u.e == null) {
                    u.e = m1.e.f().a(context0).build();
                }
            }
        }
    }

    public k1.g g(f f0) {
        return new q(u.d(f0), p.a().b(f0.getName()).c(f0.getExtras()).a(), this);
    }
}


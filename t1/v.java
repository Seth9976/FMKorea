package t1;

import java.util.concurrent.Executor;
import m1.p;
import u1.d;
import v1.b;

public class v {
    private final Executor a;
    private final d b;
    private final x c;
    private final b d;

    v(Executor executor0, d d0, x x0, b b0) {
        this.a = executor0;
        this.b = d0;
        this.c = x0;
        this.d = b0;
    }

    // 检测为 Lambda 实现
    public static Object a(v v0) [...]

    // 检测为 Lambda 实现
    public static void b(v v0) [...]

    public void c() {
        t t0 = () -> this.e();
        this.a.execute(t0);
    }

    private Object d() {
        for(Object object0: this.b.s()) {
            this.c.b(((p)object0), 1);
        }
        return null;
    }

    private void e() {
        u u0 = () -> this.d();
        this.d.a(u0);
    }
}


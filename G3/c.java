package g3;

import com.onesignal.J1;
import com.onesignal.O1;
import com.onesignal.Q0;
import com.onesignal.m1;
import z3.k;

public final class c {
    private final Q0 a;
    private final J1 b;
    private final a c;
    private h3.c d;

    public c(Q0 q00, J1 j10, O1 o10, m1 m10) {
        k.e(q00, "logger");
        k.e(j10, "apiClient");
        super();
        this.a = q00;
        this.b = j10;
        k.b(o10);
        k.b(m10);
        this.c = new a(q00, o10, m10);
    }

    private final d a() {
        if(this.c.j()) {
            h h0 = new h(this.b);
            return new g(this.a, this.c, h0);
        }
        f f0 = new f(this.b);
        return new e(this.a, this.c, f0);
    }

    public final h3.c b() {
        return this.d != null ? this.c() : this.a();
    }

    private final h3.c c() {
        if(!this.c.j()) {
            h3.c c0 = this.d;
            if(c0 instanceof e) {
                k.b(c0);
                return c0;
            }
        }
        if(this.c.j()) {
            h3.c c1 = this.d;
            if(c1 instanceof g) {
                k.b(c1);
                return c1;
            }
        }
        return this.a();
    }
}


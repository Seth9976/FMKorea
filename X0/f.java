package x0;

import android.database.Cursor;
import g0.i;
import g0.u;
import g0.x;
import i0.b;
import java.util.Collections;
import java.util.List;
import k0.k;

public final class f implements e {
    private final u a;
    private final i b;

    public f(u u0) {
        class a extends i {
            final f d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            @Override  // g0.i
            public void i(k k0, Object object0) {
                this.k(k0, ((d)object0));
            }

            public void k(k k0, d d0) {
                if(d0.a() == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, d0.a());
                }
                if(d0.b() == null) {
                    k0.P(2);
                    return;
                }
                k0.x(2, ((long)d0.b()));
            }
        }

        this.a = u0;
        this.b = new a(this, u0);
    }

    @Override  // x0.e
    public Long a(String s) {
        x x0 = x.f("SELECT long_value FROM Preference where `key`=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Long long0 = null;
        Cursor cursor0 = b.b(this.a, x0, false, null);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                long0 = cursor0.getLong(0);
            }
            return long0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.e
    public void b(d d0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(d0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    public static List c() {
        return Collections.emptyList();
    }
}


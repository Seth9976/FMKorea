package x0;

import android.database.Cursor;
import g0.i;
import g0.u;
import g0.x;
import i0.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.k;

public final class p implements o {
    private final u a;
    private final i b;

    public p(u u0) {
        class a extends i {
            final p d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override  // g0.i
            public void i(k k0, Object object0) {
                this.k(k0, ((n)object0));
            }

            public void k(k k0, n n0) {
                if(n0.a() == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, n0.a());
                }
                if(n0.b() == null) {
                    k0.P(2);
                    return;
                }
                k0.l(2, n0.b());
            }
        }

        this.a = u0;
        this.b = new a(this, u0);
    }

    @Override  // x0.o
    public void a(n n0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(n0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    @Override  // x0.o
    public List b(String s) {
        x x0 = x.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = b.b(this.a, x0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    public static List c() {
        return Collections.emptyList();
    }
}


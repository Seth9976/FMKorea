package x0;

import android.database.Cursor;
import g0.A;
import g0.i;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k implements j {
    private final u a;
    private final i b;
    private final A c;
    private final A d;

    public k(u u0) {
        class a extends i {
            final k d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            @Override  // g0.i
            public void i(k0.k k0, Object object0) {
                this.k(k0, ((x0.i)object0));
            }

            public void k(k0.k k0, x0.i i0) {
                String s = i0.a;
                if(s == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, s);
                }
                k0.x(2, ((long)i0.a()));
                k0.x(3, ((long)i0.c));
            }
        }


        class b extends A {
            final k d;

            b(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        }


        class c extends A {
            final k d;

            c(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        }

        this.a = u0;
        this.b = new a(this, u0);
        this.c = new b(this, u0);
        this.d = new c(this, u0);
    }

    @Override  // x0.j
    public x0.i a(m m0) {
        return x0.j.a.a(this, m0);
    }

    @Override  // x0.j
    public List b() {
        x x0 = x.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
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

    @Override  // x0.j
    public void c(m m0) {
        x0.j.a.b(this, m0);
    }

    @Override  // x0.j
    public void d(String s, int v) {
        this.a.d();
        k0.k k0 = this.c.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        k0.x(2, ((long)v));
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.c.h(k0);
        }
    }

    @Override  // x0.j
    public void e(String s) {
        this.a.d();
        k0.k k0 = this.d.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.d.h(k0);
        }
    }

    @Override  // x0.j
    public x0.i f(String s, int v) {
        x x0 = x.f("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        x0.x(2, ((long)v));
        this.a.d();
        x0.i i0 = null;
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v2 = i0.a.e(cursor0, "work_spec_id");
            int v3 = i0.a.e(cursor0, "generation");
            int v4 = i0.a.e(cursor0, "system_id");
            if(cursor0.moveToFirst()) {
                if(!cursor0.isNull(v2)) {
                    i0 = cursor0.getString(v2);
                }
                i0 = new x0.i(((String)i0), cursor0.getInt(v3), cursor0.getInt(v4));
            }
            return i0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.j
    public void g(x0.i i0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(i0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    public static List h() {
        return Collections.emptyList();
    }
}


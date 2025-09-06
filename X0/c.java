package x0;

import android.database.Cursor;
import g0.i;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.k;

public final class c implements b {
    private final u a;
    private final i b;

    public c(u u0) {
        class a extends i {
            final c d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override  // g0.i
            public void i(k k0, Object object0) {
                this.k(k0, ((x0.a)object0));
            }

            public void k(k k0, x0.a a0) {
                if(a0.b() == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, a0.b());
                }
                if(a0.a() == null) {
                    k0.P(2);
                    return;
                }
                k0.l(2, a0.a());
            }
        }

        this.a = u0;
        this.b = new a(this, u0);
    }

    @Override  // x0.b
    public List a(String s) {
        x x0 = x.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
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

    @Override  // x0.b
    public boolean b(String s) {
        boolean z = true;
        x x0 = x.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        boolean z1 = false;
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                if(cursor0.getInt(0) == 0) {
                    z = false;
                }
                z1 = z;
            }
            return z1;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.b
    public void c(x0.a a0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(a0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    @Override  // x0.b
    public boolean d(String s) {
        boolean z = true;
        x x0 = x.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        boolean z1 = false;
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                if(cursor0.getInt(0) == 0) {
                    z = false;
                }
                z1 = z;
            }
            return z1;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    public static List e() {
        return Collections.emptyList();
    }
}


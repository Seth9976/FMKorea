package g0;

import android.database.Cursor;
import java.util.List;
import k0.h.a;
import w3.b;
import z3.g;
import z3.k;

public class w extends a {
    public static final class g0.w.a {
        private g0.w.a() {
        }

        public g0.w.a(g g0) {
        }

        public final boolean a(k0.g g0) {
            boolean z = false;
            k.e(g0, "db");
            Cursor cursor0 = g0.H("SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) == 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                b.a(cursor0, throwable0);
                throw throwable0;
            }
            b.a(cursor0, null);
            return z;
        }

        public final boolean b(k0.g g0) {
            boolean z = false;
            k.e(g0, "db");
            Cursor cursor0 = g0.H("SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) != 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                b.a(cursor0, throwable0);
                throw throwable0;
            }
            b.a(cursor0, null);
            return z;
        }
    }

    public static abstract class g0.w.b {
        public final int a;

        public g0.w.b(int v) {
            this.a = v;
        }

        public abstract void a(k0.g arg1);

        public abstract void b(k0.g arg1);

        public abstract void c(k0.g arg1);

        public abstract void d(k0.g arg1);

        public abstract void e(k0.g arg1);

        public abstract void f(k0.g arg1);

        public abstract c g(k0.g arg1);
    }

    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean z, String s) {
            this.a = z;
            this.b = s;
        }
    }

    private f c;
    private final g0.w.b d;
    private final String e;
    private final String f;
    public static final g0.w.a g;

    static {
        w.g = new g0.w.a(null);
    }

    public w(f f0, g0.w.b w$b0, String s, String s1) {
        k.e(f0, "configuration");
        k.e(w$b0, "delegate");
        k.e(s, "identityHash");
        k.e(s1, "legacyHash");
        super(w$b0.a);
        this.c = f0;
        this.d = w$b0;
        this.e = s;
        this.f = s1;
    }

    @Override  // k0.h$a
    public void b(k0.g g0) {
        k.e(g0, "db");
        super.b(g0);
    }

    @Override  // k0.h$a
    public void d(k0.g g0) {
        k.e(g0, "db");
        boolean z = w.g.a(g0);
        this.d.a(g0);
        if(!z) {
            c w$c0 = this.d.g(g0);
            if(!w$c0.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + w$c0.b);
            }
        }
        this.j(g0);
        this.d.c(g0);
    }

    @Override  // k0.h$a
    public void e(k0.g g0, int v, int v1) {
        k.e(g0, "db");
        this.g(g0, v, v1);
    }

    @Override  // k0.h$a
    public void f(k0.g g0) {
        k.e(g0, "db");
        super.f(g0);
        this.h(g0);
        this.d.d(g0);
        this.c = null;
    }

    @Override  // k0.h$a
    public void g(k0.g g0, int v, int v1) {
        k.e(g0, "db");
        f f0 = this.c;
        if(f0 != null) {
            List list0 = f0.d.d(v, v1);
            if(list0 != null) {
                this.d.f(g0);
                for(Object object0: list0) {
                    ((h0.b)object0).a(g0);
                }
                c w$c0 = this.d.g(g0);
                if(!w$c0.a) {
                    throw new IllegalStateException("Migration didn\'t properly handle: " + w$c0.b);
                }
                this.d.e(g0);
                this.j(g0);
                return;
            }
        }
        if(this.c == null || this.c.a(v, v1)) {
            throw new IllegalStateException("A migration from " + v + " to " + v1 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.d.b(g0);
        this.d.a(g0);
    }

    private final void h(k0.g g0) {
        String s;
        if(w.g.b(g0)) {
            Cursor cursor0 = g0.C(new k0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                s = cursor0.moveToFirst() ? cursor0.getString(0) : null;
            }
            catch(Throwable throwable0) {
                b.a(cursor0, throwable0);
                throw throwable0;
            }
            b.a(cursor0, null);
            if(!k.a(this.e, s) && !k.a(this.f, s)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.e + ", found: " + s);
            }
            return;
        }
        c w$c0 = this.d.g(g0);
        if(!w$c0.a) {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + w$c0.b);
        }
        this.d.e(g0);
        this.j(g0);
    }

    private final void i(k0.g g0) {
        g0.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(k0.g g0) {
        this.i(g0);
        g0.k(v.a(this.e));
    }
}


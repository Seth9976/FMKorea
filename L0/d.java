package l0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import k0.h;
import l3.i;
import z3.g;
import z3.k;
import z3.l;

public final class d implements h {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    static final class b {
        private c a;

        public b(c c0) {
            this.a = c0;
        }

        public final c a() {
            return this.a;
        }

        public final void b(c c0) {
            this.a = c0;
        }
    }

    static final class l0.d.c extends SQLiteOpenHelper {
        static final class l0.d.c.a extends RuntimeException {
            private final l0.d.c.b f;
            private final Throwable g;

            public l0.d.c.a(l0.d.c.b d$c$b0, Throwable throwable0) {
                k.e(d$c$b0, "callbackName");
                k.e(throwable0, "cause");
                super(throwable0);
                this.f = d$c$b0;
                this.g = throwable0;
            }

            public final l0.d.c.b a() {
                return this.f;
            }

            @Override
            public Throwable getCause() {
                return this.g;
            }
        }

        public static enum l0.d.c.b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;

            private static final l0.d.c.b[] b() [...] // Inlined contents
        }

        public static final class l0.d.c.c {
            private l0.d.c.c() {
            }

            public l0.d.c.c(g g0) {
            }

            public final c a(b d$b0, SQLiteDatabase sQLiteDatabase0) {
                k.e(d$b0, "refHolder");
                k.e(sQLiteDatabase0, "sqLiteDatabase");
                c c0 = d$b0.a();
                if(c0 == null || !c0.f(sQLiteDatabase0)) {
                    c0 = new c(sQLiteDatabase0);
                    d$b0.b(c0);
                }
                return c0;
            }
        }

        public abstract class l0.d.c.d {
            public static final int[] a;

            static {
                int[] arr_v = new int[l0.d.c.b.values().length];
                try {
                    arr_v[l0.d.c.b.f.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[l0.d.c.b.g.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[l0.d.c.b.h.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[l0.d.c.b.i.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[l0.d.c.b.j.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                l0.d.c.d.a = arr_v;
            }
        }

        private final Context f;
        private final b g;
        private final k0.h.a h;
        private final boolean i;
        private boolean j;
        private final m0.a k;
        private boolean l;
        public static final l0.d.c.c m;

        static {
            l0.d.c.m = new l0.d.c.c(null);
        }

        public l0.d.c(Context context0, String s, b d$b0, k0.h.a h$a0, boolean z) {
            k.e(context0, "context");
            k.e(d$b0, "dbRef");
            k.e(h$a0, "callback");
            e e0 = (SQLiteDatabase sQLiteDatabase0) -> l0.d.c.b(h$a0, d$b0, sQLiteDatabase0);
            super(context0, s, null, h$a0.a, e0);
            this.f = context0;
            this.g = d$b0;
            this.h = h$a0;
            this.i = z;
            if(s == null) {
                s = "8cbb2154-b947-4658-8f96-027530ea0a4a";
                k.d("8cbb2154-b947-4658-8f96-027530ea0a4a", "randomUUID().toString()");
            }
            File file0 = context0.getCacheDir();
            k.d(file0, "context.cacheDir");
            this.k = new m0.a(s, file0, false);
        }

        // 检测为 Lambda 实现
        public static void a(k0.h.a h$a0, b d$b0, SQLiteDatabase sQLiteDatabase0) [...]

        private static final void b(k0.h.a h$a0, b d$b0, SQLiteDatabase sQLiteDatabase0) {
            k.e(h$a0, "$callback");
            k.e(d$b0, "$dbRef");
            k.d(sQLiteDatabase0, "dbObj");
            h$a0.c(l0.d.c.m.a(d$b0, sQLiteDatabase0));
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void close() {
            try {
                m0.a.c(this.k, false, 1, null);
                super.close();
                this.g.b(null);
                this.l = false;
            }
            finally {
                this.k.d();
            }
        }

        public final k0.g f(boolean z) {
            k0.g g1;
            k0.g g0;
            SQLiteDatabase sQLiteDatabase0;
            try {
                boolean z1 = !this.l && this.getDatabaseName() != null;
                this.k.b(z1);
                this.j = false;
                sQLiteDatabase0 = this.r(z);
                if(this.j) {
                    this.close();
                    g0 = this.f(z);
                    goto label_7;
                }
                g1 = this.g(sQLiteDatabase0);
                goto label_14;
            }
            catch(Throwable throwable0) {
                this.k.d();
                throw throwable0;
            }
        label_7:
            this.k.d();
            return g0;
            try {
                g1 = this.g(sQLiteDatabase0);
            }
            catch(Throwable throwable0) {
                this.k.d();
                throw throwable0;
            }
        label_14:
            this.k.d();
            return g1;
        }

        public final c g(SQLiteDatabase sQLiteDatabase0) {
            k.e(sQLiteDatabase0, "sqLiteDatabase");
            return l0.d.c.m.a(this.g, sQLiteDatabase0);
        }

        private final SQLiteDatabase j(boolean z) {
            SQLiteDatabase sQLiteDatabase0;
            if(z) {
                sQLiteDatabase0 = super.getWritableDatabase();
                k.d(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
                return sQLiteDatabase0;
            }
            sQLiteDatabase0 = super.getReadableDatabase();
            k.d(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
            return sQLiteDatabase0;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase0) {
            k.e(sQLiteDatabase0, "db");
            try {
                c c0 = this.g(sQLiteDatabase0);
                this.h.b(c0);
            }
            catch(Throwable throwable0) {
                throw new l0.d.c.a(l0.d.c.b.f, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase0) {
            k.e(sQLiteDatabase0, "sqLiteDatabase");
            try {
                c c0 = this.g(sQLiteDatabase0);
                this.h.d(c0);
            }
            catch(Throwable throwable0) {
                throw new l0.d.c.a(l0.d.c.b.g, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            k.e(sQLiteDatabase0, "db");
            this.j = true;
            try {
                c c0 = this.g(sQLiteDatabase0);
                this.h.e(c0, v, v1);
            }
            catch(Throwable throwable0) {
                throw new l0.d.c.a(l0.d.c.b.i, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase0) {
            k.e(sQLiteDatabase0, "db");
            if(!this.j) {
                try {
                    c c0 = this.g(sQLiteDatabase0);
                    this.h.f(c0);
                }
                catch(Throwable throwable0) {
                    throw new l0.d.c.a(l0.d.c.b.j, throwable0);
                }
            }
            this.l = true;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            k.e(sQLiteDatabase0, "sqLiteDatabase");
            this.j = true;
            try {
                c c0 = this.g(sQLiteDatabase0);
                this.h.g(c0, v, v1);
            }
            catch(Throwable throwable0) {
                throw new l0.d.c.a(l0.d.c.b.h, throwable0);
            }
        }

        private final SQLiteDatabase r(boolean z) {
            String s = this.getDatabaseName();
            if(s != null) {
                File file0 = this.f.getDatabasePath(s).getParentFile();
                if(file0 != null) {
                    file0.mkdirs();
                    if(!file0.isDirectory()) {
                        Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + file0);
                    }
                }
            }
            try {
                return this.j(z);
            }
            catch(Throwable unused_ex) {
                super.close();
                try {
                    Thread.sleep(500L);
                }
                catch(InterruptedException unused_ex) {
                }
                try {
                    return this.j(z);
                }
                catch(Throwable throwable0) {
                }
            }
            super.close();
            if(throwable0 instanceof l0.d.c.a) {
                Throwable throwable1 = ((l0.d.c.a)throwable0).getCause();
                switch(l0.d.c.d.a[((l0.d.c.a)throwable0).a().ordinal()]) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        throw throwable1;
                    label_18:
                        if(!(throwable1 instanceof SQLiteException)) {
                            throw throwable1;
                        }
                        goto label_21;
                    }
                    default: {
                        goto label_18;
                    }
                }
            }
            if(throwable0 instanceof SQLiteException && s != null && this.i) {
            label_21:
                this.f.deleteDatabase(s);
                try {
                    return this.j(z);
                }
                catch(l0.d.c.a d$c$a0) {
                    throw d$c$a0.getCause();
                }
            }
            throw throwable0;
        }
    }

    private final Context f;
    private final String g;
    private final k0.h.a h;
    private final boolean i;
    private final boolean j;
    private final l3.h k;
    private boolean l;
    public static final a m;

    static {
        d.m = new a(null);
    }

    public d(Context context0, String s, k0.h.a h$a0, boolean z, boolean z1) {
        static final class l0.d.d extends l implements y3.a {
            final d g;

            l0.d.d(d d0) {
                this.g = d0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                return this.b();
            }

            public final l0.d.c b() {
                l0.d.c d$c0;
                if(d.g(this.g) == null || !d.j(this.g)) {
                    d$c0 = new l0.d.c(d.f(this.g), d.g(this.g), new b(null), d.b(this.g), d.a(this.g));
                }
                else {
                    File file0 = new File(k0.d.a(d.f(this.g)), d.g(this.g));
                    d$c0 = new l0.d.c(d.f(this.g), file0.getAbsolutePath(), new b(null), d.b(this.g), d.a(this.g));
                }
                k0.b.d(d$c0, d.r(this.g));
                return d$c0;
            }
        }

        k.e(context0, "context");
        k.e(h$a0, "callback");
        super();
        this.f = context0;
        this.g = s;
        this.h = h$a0;
        this.i = z;
        this.j = z1;
        this.k = i.a(new l0.d.d(this));
    }

    @Override  // k0.h
    public k0.g G() {
        return this.t().f(true);
    }

    public static final boolean a(d d0) {
        return d0.j;
    }

    public static final k0.h.a b(d d0) {
        return d0.h;
    }

    @Override  // k0.h
    public void close() {
        if(this.k.isInitialized()) {
            this.t().close();
        }
    }

    public static final Context f(d d0) {
        return d0.f;
    }

    public static final String g(d d0) {
        return d0.g;
    }

    @Override  // k0.h
    public String getDatabaseName() {
        return this.g;
    }

    public static final boolean j(d d0) {
        return d0.i;
    }

    public static final boolean r(d d0) {
        return d0.l;
    }

    @Override  // k0.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        if(this.k.isInitialized()) {
            k0.b.d(this.t(), z);
        }
        this.l = z;
    }

    private final l0.d.c t() {
        return (l0.d.c)this.k.getValue();
    }
}


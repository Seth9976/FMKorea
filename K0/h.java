package k0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import z3.g;
import z3.k;

public interface h extends Closeable {
    public static abstract class a {
        public static final class k0.h.a.a {
            private k0.h.a.a() {
            }

            public k0.h.a.a(g g0) {
            }
        }

        public final int a;
        public static final k0.h.a.a b;

        static {
            a.b = new k0.h.a.a(null);
        }

        public a(int v) {
            this.a = v;
        }

        private final void a(String s) {
            if(!G3.h.n(s, ":memory:", true)) {
                int v = s.length() - 1;
                int v1 = 0;
                boolean z = false;
                while(v1 <= v) {
                    boolean z1 = k.f(s.charAt((z ? v : v1)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v;
                    }
                    else if(z1) {
                        ++v1;
                    }
                    else {
                        z = true;
                    }
                }
                if(s.subSequence(v1, v + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + s);
                    try {
                        b.a(new File(s));
                    }
                    catch(Exception exception0) {
                        Log.w("SupportSQLite", "delete failed: ", exception0);
                    }
                }
            }
        }

        public void b(k0.g g0) {
            k.e(g0, "db");
        }

        public void c(k0.g g0) {
            k.e(g0, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + g0 + ".path");
            if(!g0.h()) {
                String s = g0.S();
                if(s != null) {
                    this.a(s);
                }
                return;
            }
            try {
                List list0 = null;
                list0 = g0.i();
            }
            catch(SQLiteException unused_ex) {
            }
            finally {
                if(list0 == null) {
                    String s1 = g0.S();
                    if(s1 != null) {
                        this.a(s1);
                    }
                }
                else {
                    for(Object object0: list0) {
                        Object object1 = ((Pair)object0).second;
                        k.d(object1, "p.second");
                        this.a(((String)object1));
                    }
                }
            }
            try {
                g0.close();
            }
            catch(IOException unused_ex) {
            }
        }

        public abstract void d(k0.g arg1);

        public abstract void e(k0.g arg1, int arg2, int arg3);

        public void f(k0.g g0) {
            k.e(g0, "db");
        }

        public abstract void g(k0.g arg1, int arg2, int arg3);
    }

    public static final class k0.h.b {
        public static class k0.h.b.a {
            private final Context a;
            private String b;
            private a c;
            private boolean d;
            private boolean e;

            public k0.h.b.a(Context context0) {
                k.e(context0, "context");
                super();
                this.a = context0;
            }

            public k0.h.b.a a(boolean z) {
                this.e = z;
                return this;
            }

            public k0.h.b b() {
                a h$a0 = this.c;
                if(h$a0 == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if(this.d && (this.b == null || this.b.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new k0.h.b(this.a, this.b, h$a0, this.d, this.e);
            }

            public k0.h.b.a c(a h$a0) {
                k.e(h$a0, "callback");
                this.c = h$a0;
                return this;
            }

            public k0.h.b.a d(String s) {
                this.b = s;
                return this;
            }

            public k0.h.b.a e(boolean z) {
                this.d = z;
                return this;
            }
        }

        public static final class k0.h.b.b {
            private k0.h.b.b() {
            }

            public k0.h.b.b(g g0) {
            }

            public final k0.h.b.a a(Context context0) {
                k.e(context0, "context");
                return new k0.h.b.a(context0);
            }
        }

        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;
        public static final k0.h.b.b f;

        static {
            k0.h.b.f = new k0.h.b.b(null);
        }

        public k0.h.b(Context context0, String s, a h$a0, boolean z, boolean z1) {
            k.e(context0, "context");
            k.e(h$a0, "callback");
            super();
            this.a = context0;
            this.b = s;
            this.c = h$a0;
            this.d = z;
            this.e = z1;
        }

        public static final k0.h.b.a a(Context context0) {
            return k0.h.b.f.a(context0);
        }
    }

    public interface c {
        h a(k0.h.b arg1);
    }

    k0.g G();

    @Override
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean arg1);
}


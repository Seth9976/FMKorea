package M;

import I3.I;
import J.f;
import J.g;
import K.b;
import java.io.File;
import java.util.List;
import y3.a;
import z3.k;
import z3.l;

public final class c {
    public static final c a;

    static {
        c.a = new c();
    }

    public final f a(b b0, List list0, I i0, a a0) {
        static final class M.c.a extends l implements a {
            final a g;

            M.c.a(a a0) {
                this.g = a0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                return this.b();
            }

            public final File b() {
                File file0 = (File)this.g.a();
                if(!k.a(w3.c.a(file0), "preferences_pb")) {
                    throw new IllegalStateException(("File extension for file: " + file0 + " does not match required extension for Preferences file: " + "preferences_pb").toString());
                }
                return file0;
            }
        }

        k.e(list0, "migrations");
        k.e(i0, "scope");
        k.e(a0, "produceFile");
        M.c.a c$a0 = new M.c.a(a0);
        return new M.b(g.a.a(h.a, b0, list0, i0, c$a0));
    }
}


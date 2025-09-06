package L;

import A3.a;
import E3.g;
import I3.I;
import J.f;
import K.b;
import android.content.Context;
import java.io.File;
import java.util.List;
import y3.l;
import z3.k;

public final class c implements a {
    private final String a;
    private final l b;
    private final I c;
    private final Object d;
    private volatile f e;

    public c(String s, b b0, l l0, I i0) {
        k.e(s, "name");
        k.e(l0, "produceMigrations");
        k.e(i0, "scope");
        super();
        this.a = s;
        this.b = l0;
        this.c = i0;
        this.d = new Object();
    }

    @Override  // A3.a
    public Object a(Object object0, g g0) {
        return this.c(((Context)object0), g0);
    }

    public f c(Context context0, g g0) {
        static final class L.c.a extends z3.l implements y3.a {
            final Context g;
            final c h;

            L.c.a(Context context0, c c0) {
                this.g = context0;
                this.h = c0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                return this.b();
            }

            public final File b() {
                k.d(this.g, "applicationContext");
                String s = this.h.a;
                return L.b.a(this.g, s);
            }
        }

        k.e(context0, "thisRef");
        k.e(g0, "property");
        f f0 = this.e;
        if(f0 == null) {
            synchronized(this.d) {
                if(this.e == null) {
                    Context context1 = context0.getApplicationContext();
                    k.d(context1, "applicationContext");
                    List list0 = (List)this.b.h(context1);
                    L.c.a c$a0 = new L.c.a(context1, this);
                    this.e = M.c.a.a(null, list0, this.c, c$a0);
                }
                f f1 = this.e;
                k.b(f1);
                return f1;
            }
        }
        return f0;
    }
}


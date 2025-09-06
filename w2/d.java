package w2;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import u2.e;
import u2.f;
import u2.g;
import v2.b;

public final class d implements b {
    static final class w2.d.b implements f {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
            w2.d.b.a = simpleDateFormat0;
            simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private w2.d.b() {
        }

        w2.d.b(a d$a0) {
        }

        @Override  // u2.f
        public void a(Object object0, Object object1) {
            this.b(((Date)object0), ((g)object1));
        }

        public void b(Date date0, g g0) {
            g0.f(w2.d.b.a.format(date0));
        }
    }

    private final Map a;
    private final Map b;
    private u2.d c;
    private boolean d;
    private static final u2.d e;
    private static final f f;
    private static final f g;
    private static final w2.d.b h;

    static {
        d.e = (Object object0, e e0) -> d.l(object0, e0);
        d.f = (String s, g g0) -> d.m(s, g0);
        d.g = (Boolean boolean0, g g0) -> d.n(boolean0, g0);
        d.h = new w2.d.b(null);
    }

    public d() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = d.e;
        this.d = false;
        this.p(String.class, d.f);
        this.p(Boolean.class, d.g);
        this.p(Date.class, d.h);
    }

    @Override  // v2.b
    public b a(Class class0, u2.d d0) {
        return this.o(class0, d0);
    }

    // 检测为 Lambda 实现
    public static void b(Boolean boolean0, g g0) [...]

    // 检测为 Lambda 实现
    public static void c(Object object0, e e0) [...]

    // 检测为 Lambda 实现
    public static void d(String s, g g0) [...]

    public u2.a i() {
        class a implements u2.a {
            final d a;

            @Override  // u2.a
            public void a(Object object0, Writer writer0) {
                w2.e e0 = new w2.e(writer0, d.this.a, d.this.b, d.this.c, d.this.d);
                e0.k(object0, false);
                e0.u();
            }

            @Override  // u2.a
            public String b(Object object0) {
                StringWriter stringWriter0 = new StringWriter();
                try {
                    this.a(object0, stringWriter0);
                }
                catch(IOException unused_ex) {
                }
                return stringWriter0.toString();
            }
        }

        return new a(this);
    }

    public d j(v2.a a0) {
        a0.a(this);
        return this;
    }

    public d k(boolean z) {
        this.d = z;
        return this;
    }

    private static void l(Object object0, e e0) {
        throw new u2.b("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
    }

    private static void m(String s, g g0) {
        g0.f(s);
    }

    private static void n(Boolean boolean0, g g0) {
        g0.g(boolean0.booleanValue());
    }

    public d o(Class class0, u2.d d0) {
        this.a.put(class0, d0);
        this.b.remove(class0);
        return this;
    }

    public d p(Class class0, f f0) {
        this.b.put(class0, f0);
        this.a.remove(class0);
        return this;
    }
}


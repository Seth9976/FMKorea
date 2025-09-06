package x2;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import u2.c;
import u2.d;
import u2.e;

final class f implements e {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[x2.d.a.values().length];
            a.a = arr_v;
            try {
                arr_v[x2.d.a.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x2.d.a.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x2.d.a.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private OutputStream a;
    private final Map b;
    private final Map c;
    private final d d;
    private final i e;
    private static final Charset f;
    private static final c g;
    private static final c h;
    private static final d i;

    static {
        f.f = Charset.forName("UTF-8");
        f.g = c.a("key").b(x2.a.b().c(1).a()).a();
        f.h = c.a("value").b(x2.a.b().c(2).a()).a();
        f.i = (Map.Entry map$Entry0, e e0) -> f.w(map$Entry0, e0);
    }

    f(OutputStream outputStream0, Map map0, Map map1, d d0) {
        this.e = new i(this);
        this.a = outputStream0;
        this.b = map0;
        this.c = map1;
        this.d = d0;
    }

    @Override  // u2.e
    public e a(c c0, boolean z) {
        return this.n(c0, z);
    }

    @Override  // u2.e
    public e b(c c0, double f) {
        return this.g(c0, f, true);
    }

    @Override  // u2.e
    public e c(c c0, int v) {
        return this.j(c0, v);
    }

    @Override  // u2.e
    public e d(c c0, long v) {
        return this.l(c0, v);
    }

    @Override  // u2.e
    public e e(c c0, Object object0) {
        return this.i(c0, object0, true);
    }

    // 检测为 Lambda 实现
    public static void f(Map.Entry map$Entry0, e e0) [...]

    e g(c c0, double f, boolean z) {
        if(z && f == 0.0) {
            return this;
        }
        this.x(f.v(c0) << 3 | 1);
        this.a.write(f.p(8).putDouble(f).array());
        return this;
    }

    e h(c c0, float f, boolean z) {
        if(z && f == 0.0f) {
            return this;
        }
        this.x(f.v(c0) << 3 | 5);
        this.a.write(f.p(4).putFloat(f).array());
        return this;
    }

    e i(c c0, Object object0, boolean z) {
        if(object0 == null) {
            return this;
        }
        if(object0 instanceof CharSequence) {
            if(z && ((CharSequence)object0).length() == 0) {
                return this;
            }
            this.x(f.v(c0) << 3 | 2);
            byte[] arr_b = ((CharSequence)object0).toString().getBytes(f.f);
            this.x(arr_b.length);
            this.a.write(arr_b);
            return this;
        }
        if(object0 instanceof Collection) {
            for(Object object1: ((Collection)object0)) {
                this.i(c0, object1, false);
            }
            return this;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                this.r(f.i, c0, ((Map.Entry)object2), false);
            }
            return this;
        }
        if(object0 instanceof Double) {
            return this.g(c0, ((double)(((Double)object0))), z);
        }
        if(object0 instanceof Float) {
            return this.h(c0, ((float)(((Float)object0))), z);
        }
        if(object0 instanceof Number) {
            return this.m(c0, ((Number)object0).longValue(), z);
        }
        if(object0 instanceof Boolean) {
            return this.o(c0, ((Boolean)object0).booleanValue(), z);
        }
        if(object0 instanceof byte[]) {
            if(z && ((byte[])object0).length == 0) {
                return this;
            }
            this.x(f.v(c0) << 3 | 2);
            this.x(((byte[])object0).length);
            this.a.write(((byte[])object0));
            return this;
        }
        Class class0 = object0.getClass();
        d d0 = (d)this.b.get(class0);
        if(d0 != null) {
            return this.r(d0, c0, object0, z);
        }
        Class class1 = object0.getClass();
        u2.f f0 = (u2.f)this.c.get(class1);
        if(f0 != null) {
            return this.s(f0, c0, object0, z);
        }
        if(object0 instanceof x2.c) {
            return this.j(c0, ((x2.c)object0).a());
        }
        return object0 instanceof Enum ? this.j(c0, ((Enum)object0).ordinal()) : this.r(this.d, c0, object0, z);
    }

    public f j(c c0, int v) {
        return this.k(c0, v, true);
    }

    f k(c c0, int v, boolean z) {
        if(z && v == 0) {
            return this;
        }
        x2.d d0 = f.u(c0);
        int v1 = a.a[d0.intEncoding().ordinal()];
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.x(d0.tag() << 3);
                    this.x(v << 1 ^ v >> 0x1F);
                    return this;
                }
                case 3: {
                    this.x(d0.tag() << 3 | 5);
                    this.a.write(f.p(4).putInt(v).array());
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.x(d0.tag() << 3);
        this.x(v);
        return this;
    }

    public f l(c c0, long v) {
        return this.m(c0, v, true);
    }

    f m(c c0, long v, boolean z) {
        if(z && v == 0L) {
            return this;
        }
        x2.d d0 = f.u(c0);
        int v1 = a.a[d0.intEncoding().ordinal()];
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.x(d0.tag() << 3);
                    this.y(v >> 0x3F ^ v << 1);
                    return this;
                }
                case 3: {
                    this.x(d0.tag() << 3 | 1);
                    this.a.write(f.p(8).putLong(v).array());
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.x(d0.tag() << 3);
        this.y(v);
        return this;
    }

    public f n(c c0, boolean z) {
        return this.o(c0, z, true);
    }

    f o(c c0, boolean z, boolean z1) {
        return this.k(c0, ((int)z), z1);
    }

    private static ByteBuffer p(int v) {
        return ByteBuffer.allocate(v).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(d d0, Object object0) {
        try(b b0 = new b()) {
            OutputStream outputStream0 = this.a;
            this.a = b0;
            try {
                d0.a(object0, this);
            }
            finally {
                this.a = outputStream0;
            }
            return b0.a();
        }
    }

    private f r(d d0, c c0, Object object0, boolean z) {
        long v = this.q(d0, object0);
        if(z && v == 0L) {
            return this;
        }
        this.x(f.v(c0) << 3 | 2);
        this.y(v);
        d0.a(object0, this);
        return this;
    }

    private f s(u2.f f0, c c0, Object object0, boolean z) {
        this.e.b(c0, z);
        f0.a(object0, this.e);
        return this;
    }

    f t(Object object0) {
        if(object0 == null) {
            return this;
        }
        Class class0 = object0.getClass();
        d d0 = (d)this.b.get(class0);
        if(d0 == null) {
            throw new u2.b("No encoder for " + object0.getClass());
        }
        d0.a(object0, this);
        return this;
    }

    private static x2.d u(c c0) {
        x2.d d0 = (x2.d)c0.c(x2.d.class);
        if(d0 == null) {
            throw new u2.b("Field has no @Protobuf config");
        }
        return d0;
    }

    private static int v(c c0) {
        x2.d d0 = (x2.d)c0.c(x2.d.class);
        if(d0 == null) {
            throw new u2.b("Field has no @Protobuf config");
        }
        return d0.tag();
    }

    private static void w(Map.Entry map$Entry0, e e0) {
        Object object0 = map$Entry0.getKey();
        e0.e(f.g, object0);
        Object object1 = map$Entry0.getValue();
        e0.e(f.h, object1);
    }

    private void x(int v) {
        while(((long)(v & 0xFFFFFF80)) != 0L) {
            this.a.write(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(v & 0x7F);
    }

    private void y(long v) {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.a.write(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(((int)v) & 0x7F);
    }
}


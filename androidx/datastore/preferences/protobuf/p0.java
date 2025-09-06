package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class p0 {
    static final class b extends e {
        b(Unsafe unsafe0) {
            super(unsafe0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public boolean c(Object object0, long v) {
            return p0.x ? p0.q(object0, v) : p0.r(object0, v);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public byte d(Object object0, long v) {
            return p0.x ? p0.t(object0, v) : p0.u(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public double e(Object object0, long v) {
            return Double.longBitsToDouble(this.h(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public float f(Object object0, long v) {
            return Float.intBitsToFloat(this.g(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void k(Object object0, long v, boolean z) {
            if(p0.x) {
                p0.F(object0, v, z);
                return;
            }
            p0.G(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void l(Object object0, long v, byte b) {
            if(p0.x) {
                p0.I(object0, v, b);
                return;
            }
            p0.J(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void m(Object object0, long v, double f) {
            this.p(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void n(Object object0, long v, float f) {
            this.o(object0, v, Float.floatToIntBits(f));
        }
    }

    static final class c extends e {
        c(Unsafe unsafe0) {
            super(unsafe0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public boolean c(Object object0, long v) {
            return p0.x ? p0.q(object0, v) : p0.r(object0, v);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public byte d(Object object0, long v) {
            return p0.x ? p0.t(object0, v) : p0.u(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public double e(Object object0, long v) {
            return Double.longBitsToDouble(this.h(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public float f(Object object0, long v) {
            return Float.intBitsToFloat(this.g(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void k(Object object0, long v, boolean z) {
            if(p0.x) {
                p0.F(object0, v, z);
                return;
            }
            p0.G(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void l(Object object0, long v, byte b) {
            if(p0.x) {
                p0.I(object0, v, b);
                return;
            }
            p0.J(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void m(Object object0, long v, double f) {
            this.p(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void n(Object object0, long v, float f) {
            this.o(object0, v, Float.floatToIntBits(f));
        }
    }

    static final class d extends e {
        d(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public boolean c(Object object0, long v) {
            return this.a.getBoolean(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public byte d(Object object0, long v) {
            return this.a.getByte(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public double e(Object object0, long v) {
            return this.a.getDouble(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public float f(Object object0, long v) {
            return this.a.getFloat(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void k(Object object0, long v, boolean z) {
            this.a.putBoolean(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void l(Object object0, long v, byte b) {
            this.a.putByte(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void m(Object object0, long v, double f) {
            this.a.putDouble(object0, v, f);
        }

        @Override  // androidx.datastore.preferences.protobuf.p0$e
        public void n(Object object0, long v, float f) {
            this.a.putFloat(object0, v, f);
        }
    }

    static abstract class e {
        Unsafe a;

        e(Unsafe unsafe0) {
            this.a = unsafe0;
        }

        public final int a(Class class0) {
            return this.a.arrayBaseOffset(class0);
        }

        public final int b(Class class0) {
            return this.a.arrayIndexScale(class0);
        }

        public abstract boolean c(Object arg1, long arg2);

        public abstract byte d(Object arg1, long arg2);

        public abstract double e(Object arg1, long arg2);

        public abstract float f(Object arg1, long arg2);

        public final int g(Object object0, long v) {
            return this.a.getInt(object0, v);
        }

        public final long h(Object object0, long v) {
            return this.a.getLong(object0, v);
        }

        public final Object i(Object object0, long v) {
            return this.a.getObject(object0, v);
        }

        public final long j(Field field0) {
            return this.a.objectFieldOffset(field0);
        }

        public abstract void k(Object arg1, long arg2, boolean arg3);

        public abstract void l(Object arg1, long arg2, byte arg3);

        public abstract void m(Object arg1, long arg2, double arg3);

        public abstract void n(Object arg1, long arg2, float arg3);

        public final void o(Object object0, long v, int v1) {
            this.a.putInt(object0, v, v1);
        }

        public final void p(Object object0, long v, long v1) {
            this.a.putLong(object0, v, v1);
        }

        public final void q(Object object0, long v, Object object1) {
            this.a.putObject(object0, v, object1);
        }
    }

    private static final Logger a;
    private static final Unsafe b;
    private static final Class c;
    private static final boolean d;
    private static final boolean e;
    private static final e f;
    private static final boolean g;
    private static final boolean h;
    static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final int w;
    static final boolean x;

    static {
        p0.a = Logger.getLogger("androidx.datastore.preferences.protobuf.p0");
        p0.b = p0.B();
        p0.c = androidx.datastore.preferences.protobuf.d.b();
        p0.d = p0.m(Long.TYPE);
        p0.e = p0.m(Integer.TYPE);
        p0.f = p0.z();
        p0.g = p0.Q();
        p0.h = p0.P();
        long v = (long)p0.j(byte[].class);
        p0.i = v;
        p0.j = (long)p0.j(boolean[].class);
        p0.k = (long)p0.k(boolean[].class);
        p0.l = (long)p0.j(int[].class);
        p0.m = (long)p0.k(int[].class);
        p0.n = (long)p0.j(long[].class);
        p0.o = (long)p0.k(long[].class);
        p0.p = (long)p0.j(float[].class);
        p0.q = (long)p0.k(float[].class);
        p0.r = (long)p0.j(double[].class);
        p0.s = (long)p0.k(double[].class);
        p0.t = (long)p0.j(Object[].class);
        p0.u = (long)p0.k(Object[].class);
        p0.v = p0.o(p0.l());
        p0.w = (int)(v & 7L);
        p0.x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object object0, long v) {
        return p0.f.i(object0, v);
    }

    static Unsafe B() {
        static final class a implements PrivilegedExceptionAction {
            public Unsafe a() {
                Class class0 = Unsafe.class;
                Field[] arr_field = class0.getDeclaredFields();
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    field0.setAccessible(true);
                    Object object0 = field0.get(null);
                    if(class0.isInstance(object0)) {
                        return (Unsafe)class0.cast(object0);
                    }
                }
                return null;
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        try {
            return (Unsafe)AccessController.doPrivileged(new a());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static boolean C() [...] // 潜在的解密器

    static boolean D() [...] // 潜在的解密器

    static void E(Object object0, long v, boolean z) {
        p0.f.k(object0, v, z);
    }

    private static void F(Object object0, long v, boolean z) {
        p0.I(object0, v, ((byte)z));
    }

    private static void G(Object object0, long v, boolean z) {
        p0.J(object0, v, ((byte)z));
    }

    static void H(byte[] arr_b, long v, byte b) {
        p0.f.l(arr_b, p0.i + v, b);
    }

    private static void I(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        p0.M(object0, -4L & v, (0xFF & b) << v1 | p0.x(object0, -4L & v) & ~(0xFF << v1));
    }

    private static void J(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        p0.M(object0, -4L & v, (0xFF & b) << v1 | p0.x(object0, -4L & v) & ~(0xFF << v1));
    }

    static void K(Object object0, long v, double f) {
        p0.f.m(object0, v, f);
    }

    static void L(Object object0, long v, float f) {
        p0.f.n(object0, v, f);
    }

    static void M(Object object0, long v, int v1) {
        p0.f.o(object0, v, v1);
    }

    static void N(Object object0, long v, long v1) {
        p0.f.p(object0, v, v1);
    }

    static void O(Object object0, long v, Object object1) {
        p0.f.q(object0, v, object1);
    }

    private static boolean P() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = p0.b;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class2 = unsafe0.getClass();
            class2.getMethod("objectFieldOffset", Field.class);
            class2.getMethod("arrayBaseOffset", class0);
            class2.getMethod("arrayIndexScale", class0);
            Class class3 = Long.TYPE;
            class2.getMethod("getInt", class1, class3);
            class2.getMethod("putInt", class1, class3, Integer.TYPE);
            class2.getMethod("getLong", class1, class3);
            class2.getMethod("putLong", class1, class3, class3);
            class2.getMethod("getObject", class1, class3);
            class2.getMethod("putObject", class1, class3, class1);
            class2.getMethod("getByte", class1, class3);
            class2.getMethod("putByte", class1, class3, Byte.TYPE);
            class2.getMethod("getBoolean", class1, class3);
            class2.getMethod("putBoolean", class1, class3, Boolean.TYPE);
            class2.getMethod("getFloat", class1, class3);
            class2.getMethod("putFloat", class1, class3, Float.TYPE);
            class2.getMethod("getDouble", class1, class3);
            class2.getMethod("putDouble", class1, class3, Double.TYPE);
            return true;
        }
        catch(Throwable throwable0) {
            p0.a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    private static boolean Q() {
        Class class0 = Object.class;
        Unsafe unsafe0 = p0.b;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class1 = unsafe0.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            Class class2 = Long.TYPE;
            class1.getMethod("getLong", class0, class2);
            if(p0.l() == null) {
                return false;
            }
            class1.getMethod("getByte", class2);
            class1.getMethod("putByte", class2, Byte.TYPE);
            class1.getMethod("getInt", class2);
            class1.getMethod("putInt", class2, Integer.TYPE);
            class1.getMethod("getLong", class2);
            class1.getMethod("putLong", class2, class2);
            class1.getMethod("copyMemory", class2, class2, class2);
            class1.getMethod("copyMemory", class0, class2, class0, class2, class2);
            return true;
        }
        catch(Throwable throwable0) {
            p0.a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    static Object i(Class class0) {
        try {
            return p0.b.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    private static int j(Class class0) {
        return p0.f.a(class0);
    }

    private static int k(Class class0) {
        return p0.f.b(class0);
    }

    // 去混淆评级： 低(20)
    private static Field l() {
        Field field0 = p0.n(Buffer.class, "address");
        return field0 != null && field0.getType() == Long.TYPE ? field0 : null;
    }

    // 去混淆评级： 低(30)
    private static boolean m(Class class0) {
        return false;
    }

    private static Field n(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static long o(Field field0) {
        if(field0 != null) {
            return p0.f == null ? -1L : p0.f.j(field0);
        }
        return -1L;
    }

    static boolean p(Object object0, long v) {
        return p0.f.c(object0, v);
    }

    private static boolean q(Object object0, long v) {
        return p0.t(object0, v) != 0;
    }

    private static boolean r(Object object0, long v) {
        return p0.u(object0, v) != 0;
    }

    static byte s(byte[] arr_b, long v) {
        return p0.f.d(arr_b, p0.i + v);
    }

    private static byte t(Object object0, long v) {
        return (byte)(p0.x(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF);
    }

    private static byte u(Object object0, long v) {
        return (byte)(p0.x(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF);
    }

    static double v(Object object0, long v) {
        return p0.f.e(object0, v);
    }

    static float w(Object object0, long v) {
        return p0.f.f(object0, v);
    }

    static int x(Object object0, long v) {
        return p0.f.g(object0, v);
    }

    static long y(Object object0, long v) {
        return p0.f.h(object0, v);
    }

    private static e z() {
        Unsafe unsafe0 = p0.b;
        return unsafe0 == null ? null : new d(unsafe0);
    }
}


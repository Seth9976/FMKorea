package androidx.datastore.preferences.protobuf;

public abstract class r0 {
    static abstract class a {
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static class b extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class androidx.datastore.preferences.protobuf.r0.b.a extends b {
            androidx.datastore.preferences.protobuf.r0.b.a(String s, int v, c r0$c0, int v1) {
                super(s, v, r0$c0, v1, null);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class androidx.datastore.preferences.protobuf.r0.b.b extends b {
            androidx.datastore.preferences.protobuf.r0.b.b(String s, int v, c r0$c0, int v1) {
                super(s, v, r0$c0, v1, null);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class androidx.datastore.preferences.protobuf.r0.b.c extends b {
            androidx.datastore.preferences.protobuf.r0.b.c(String s, int v, c r0$c0, int v1) {
                super(s, v, r0$c0, v1, null);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class d extends b {
            d(String s, int v, c r0$c0, int v1) {
                super(s, v, r0$c0, v1, null);
            }
        }

        private final c f;
        private final int g;
        public static final enum b h;
        public static final enum b i;
        public static final enum b j;
        public static final enum b k;
        public static final enum b l;
        public static final enum b m;
        public static final enum b n;
        public static final enum b o;
        public static final enum b p;
        public static final enum b q;
        public static final enum b r;
        public static final enum b s;
        public static final enum b t;
        public static final enum b u;
        public static final enum b v;
        public static final enum b w;
        public static final enum b x;
        public static final enum b y;
        private static final b[] z;

        static {
            b.h = new b("DOUBLE", 0, c.j, 1);
            b.i = new b("FLOAT", 1, c.i, 5);
            b.j = new b("INT64", 2, c.h, 0);
            b.k = new b("UINT64", 3, c.h, 0);
            b.l = new b("INT32", 4, c.g, 0);
            b.m = new b("FIXED64", 5, c.h, 1);
            b.n = new b("FIXED32", 6, c.g, 5);
            b.o = new b("BOOL", 7, c.k, 0);
            androidx.datastore.preferences.protobuf.r0.b.a r0$b$a0 = new androidx.datastore.preferences.protobuf.r0.b.a("STRING", 8, c.l, 2);
            b.p = r0$b$a0;
            androidx.datastore.preferences.protobuf.r0.b.b r0$b$b0 = new androidx.datastore.preferences.protobuf.r0.b.b("GROUP", 9, c.o, 3);
            b.q = r0$b$b0;
            androidx.datastore.preferences.protobuf.r0.b.c r0$b$c0 = new androidx.datastore.preferences.protobuf.r0.b.c("MESSAGE", 10, c.o, 2);
            b.r = r0$b$c0;
            d r0$b$d0 = new d("BYTES", 11, c.m, 2);
            b.s = r0$b$d0;
            b.t = new b("UINT32", 12, c.g, 0);
            b.u = new b("ENUM", 13, c.n, 0);
            b.v = new b("SFIXED32", 14, c.g, 5);
            b.w = new b("SFIXED64", 15, c.h, 1);
            b.x = new b("SINT32", 16, c.g, 0);
            b.y = new b("SINT64", 17, c.h, 0);
            b.z = new b[]{b.h, b.i, b.j, b.k, b.l, b.m, b.n, b.o, r0$b$a0, r0$b$b0, r0$b$c0, r0$b$d0, b.t, b.u, b.v, b.w, b.x, b.y};
        }

        private b(String s, int v, c r0$c0, int v1) {
            super(s, v);
            this.f = r0$c0;
            this.g = v1;
        }

        b(String s, int v, c r0$c0, int v1, a r0$a0) {
            this(s, v, r0$c0, v1);
        }

        public c b() {
            return this.f;
        }

        public int f() {
            return this.g;
        }

        public static b valueOf(String s) {
            return (b)Enum.valueOf(b.class, s);
        }

        public static b[] values() {
            return (b[])b.z.clone();
        }
    }

    public static enum c {
        INT(0),
        LONG(0L),
        FLOAT(0.0f),
        DOUBLE(0.0),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(g.g),
        ENUM(null),
        MESSAGE(null);

        private final Object f;

        private c(Object object0) {
            this.f = object0;
        }
    }

    static final int a;
    static final int b;
    static final int c;
    static final int d;

    static {
        r0.a = 11;
        r0.b = 12;
        r0.c = 16;
        r0.d = 26;
    }

    public static int a(int v) [...] // Inlined contents

    public static int b(int v) [...] // Inlined contents

    static int c(int v, int v1) [...] // Inlined contents
}


package androidx.datastore.preferences.protobuf;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class A extends Enum {
    private final Class f;
    private final Class g;
    private final Object h;
    public static final enum A i;
    public static final enum A j;
    public static final enum A k;
    public static final enum A l;
    public static final enum A m;
    public static final enum A n;
    public static final enum A o;
    public static final enum A p;
    public static final enum A q;
    public static final enum A r;
    private static final A[] s;

    static {
        A.i = new A("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        A.j = new A("INT", 1, class0, Integer.class, 0);
        A.k = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        A.l = new A("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        A.m = new A("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        A.n = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        A.o = new A("STRING", 6, String.class, String.class, "");
        A.p = new A("BYTE_STRING", 7, g.class, g.class, g.g);
        A.q = new A("ENUM", 8, class0, Integer.class, null);
        A.r = new A("MESSAGE", 9, Object.class, Object.class, null);
        A.s = new A[]{A.i, A.j, A.k, A.l, A.m, A.n, A.o, A.p, A.q, A.r};
    }

    private A(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.f = class0;
        this.g = class1;
        this.h = object0;
    }

    public Class b() {
        return this.g;
    }

    public static A valueOf(String s) {
        return (A)Enum.valueOf(A.class, s);
    }

    public static A[] values() {
        return (A[])A.s.clone();
    }
}


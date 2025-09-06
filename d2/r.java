package d2;

public final class r {
    private final F a;
    private final int b;
    private final int c;

    private r(F f0, int v, int v1) {
        this.a = (F)E.c(f0, "Null dependency anInterface.");
        this.b = v;
        this.c = v1;
    }

    private r(Class class0, int v, int v1) {
        this(F.b(class0), v, v1);
    }

    public static r a(Class class0) {
        return new r(class0, 0, 2);
    }

    private static String b(int v) {
        switch(v) {
            case 0: {
                return "direct";
            }
            case 1: {
                return "provider";
            }
            case 2: {
                return "deferred";
            }
            default: {
                throw new AssertionError("Unsupported injection: " + v);
            }
        }
    }

    public F c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof r && this.a.equals(((r)object0).a) && this.b == ((r)object0).b && this.c == ((r)object0).c;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public static r h(Class class0) {
        return new r(class0, 0, 0);
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    public static r i(Class class0) {
        return new r(class0, 0, 1);
    }

    public static r j(F f0) {
        return new r(f0, 1, 0);
    }

    public static r k(Class class0) {
        return new r(class0, 1, 0);
    }

    public static r l(F f0) {
        return new r(f0, 1, 1);
    }

    public static r m(Class class0) {
        return new r(class0, 1, 1);
    }

    public static r n(Class class0) {
        return new r(class0, 2, 0);
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        stringBuilder0.append(r.b(this.c));
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}


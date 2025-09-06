package B;

public class d {
    public final Object a;
    public final Object b;

    public d(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public static d a(Object object0, Object object1) {
        return new d(object0, object1);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof d ? c.a(((d)object0).a, this.a) && c.a(((d)object0).b, this.b) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}


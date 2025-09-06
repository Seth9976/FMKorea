package z3;

public final class m implements d {
    private final Class a;
    private final String b;

    public m(Class class0, String s) {
        k.e(class0, "jClass");
        k.e(s, "moduleName");
        super();
        this.a = class0;
        this.b = s;
    }

    @Override  // z3.d
    public Class b() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof m && k.a(this.b(), ((m)object0).b());
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    public String toString() {
        return this.b() + " (Kotlin reflection is not available)";
    }
}


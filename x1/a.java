package X1;

final class a extends g {
    static final a f;
    private static final long serialVersionUID;

    static {
        a.f = new a();
    }

    @Override  // X1.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override  // X1.g
    public boolean c() {
        return false;
    }

    static g e() {
        return a.f;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this;
    }

    @Override
    public int hashCode() {
        return 2040732332;
    }

    private Object readResolve() {
        return a.f;
    }

    @Override
    public String toString() {
        return "Optional.absent()";
    }
}


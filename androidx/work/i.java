package androidx.work;

public abstract class i {
    public abstract h a(String arg1);

    public final h b(String s) {
        h h0 = this.a(s);
        return h0 == null ? h.a(s) : h0;
    }

    public static i c() {
        class a extends i {
            a() {
                super();
            }

            @Override  // androidx.work.i
            public h a(String s) {
                return null;
            }
        }

        return new a();
    }
}


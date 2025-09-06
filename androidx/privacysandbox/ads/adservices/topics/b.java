package androidx.privacysandbox.ads.adservices.topics;

import z3.k;

public final class b {
    public static final class a {
        private String a;
        private boolean b;

        public a() {
            this.a = "";
            this.b = true;
        }

        public final b a() {
            if(this.a.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            return new b(this.a, this.b);
        }

        public final a b(String s) {
            k.e(s, "adsSdkName");
            this.a = s;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    private final String a;
    private final boolean b;

    public b(String s, boolean z) {
        k.e(s, "adsSdkName");
        super();
        this.a = s;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? k.a(this.a, ((b)object0).a) && this.b == ((b)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + androidx.privacysandbox.ads.adservices.topics.a.a(this.b);
    }

    @Override
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }
}


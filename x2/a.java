package x2;

public final class a {
    static final class x2.a.a implements d {
        private final int a;
        private final x2.d.a b;

        x2.a.a(int v, x2.d.a d$a0) {
            this.a = v;
            this.b = d$a0;
        }

        @Override
        public Class annotationType() {
            return d.class;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof d)) {
                return false;
            }
            int v = ((d)object0).tag();
            if(this.a == v) {
                x2.d.a d$a0 = ((d)object0).intEncoding();
                return this.b.equals(d$a0);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (0xDE0D66 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override  // x2.d
        public x2.d.a intEncoding() {
            return this.b;
        }

        @Override  // x2.d
        public int tag() {
            return this.a;
        }

        @Override
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    private int a;
    private x2.d.a b;

    public a() {
        this.b = x2.d.a.f;
    }

    public d a() {
        return new x2.a.a(this.a, this.b);
    }

    public static a b() {
        return new a();
    }

    public a c(int v) {
        this.a = v;
        return this;
    }
}


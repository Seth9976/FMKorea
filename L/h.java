package L;

import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w.d;
import androidx.datastore.preferences.protobuf.w;

public final class h extends w implements P {
    public static final class a extends androidx.datastore.preferences.protobuf.w.a implements P {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        a(e e0) {
        }

        public a A(L.g.a g$a0) {
            this.p();
            ((h)this.g).f0(g$a0);
            return this;
        }

        public a u(boolean z) {
            this.p();
            ((h)this.g).Z(z);
            return this;
        }

        public a v(double f) {
            this.p();
            ((h)this.g).a0(f);
            return this;
        }

        public a w(float f) {
            this.p();
            ((h)this.g).b0(f);
            return this;
        }

        public a x(int v) {
            this.p();
            ((h)this.g).c0(v);
            return this;
        }

        public a y(long v) {
            this.p();
            ((h)this.g).d0(v);
            return this;
        }

        public a z(String s) {
            this.p();
            ((h)this.g).e0(s);
            return this;
        }
    }

    public static enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int f;

        private b(int v1) {
            this.f = v1;
        }

        public static b b(int v) {
            switch(v) {
                case 0: {
                    return b.n;
                }
                case 1: {
                    return b.g;
                }
                case 2: {
                    return b.h;
                }
                case 3: {
                    return b.i;
                }
                case 4: {
                    return b.j;
                }
                case 5: {
                    return b.k;
                }
                case 6: {
                    return b.l;
                }
                case 7: {
                    return b.m;
                }
                default: {
                    return null;
                }
            }
        }
    }

    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE = null;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_;
    private Object value_;

    static {
        h h0 = new h();
        h.DEFAULT_INSTANCE = h0;
        w.F(h.class, h0);
    }

    private h() {
        this.valueCase_ = 0;
    }

    public boolean P() {
        return this.valueCase_ == 1 ? ((Boolean)this.value_).booleanValue() : false;
    }

    public static h Q() {
        return h.DEFAULT_INSTANCE;
    }

    public double R() {
        return this.valueCase_ == 7 ? ((double)(((Double)this.value_))) : 0.0;
    }

    public float S() {
        return this.valueCase_ == 2 ? ((float)(((Float)this.value_))) : 0.0f;
    }

    public int T() {
        return this.valueCase_ == 3 ? ((int)(((Integer)this.value_))) : 0;
    }

    public long U() {
        return this.valueCase_ == 4 ? ((long)(((Long)this.value_))) : 0L;
    }

    public String V() [...] // 潜在的解密器

    public g W() {
        return this.valueCase_ == 6 ? ((g)this.value_) : g.L();
    }

    public b X() {
        return b.b(this.valueCase_);
    }

    public static a Y() {
        return (a)h.DEFAULT_INSTANCE.p();
    }

    private void Z(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    private void a0(double f) {
        this.valueCase_ = 7;
        this.value_ = f;
    }

    private void b0(float f) {
        this.valueCase_ = 2;
        this.value_ = f;
    }

    private void c0(int v) {
        this.valueCase_ = 3;
        this.value_ = v;
    }

    private void d0(long v) {
        this.valueCase_ = 4;
        this.value_ = v;
    }

    private void e0(String s) {
        s.getClass();
        this.valueCase_ = 5;
        this.value_ = s;
    }

    private void f0(L.g.a g$a0) {
        this.value_ = g$a0.m();
        this.valueCase_ = 6;
    }

    @Override  // androidx.datastore.preferences.protobuf.w
    protected final Object s(d w$d0, Object object0, Object object1) {
        switch(w$d0) {
            case 1: {
                return new h();
            }
            case 2: {
                return new a(null);
            }
            case 3: {
                return w.C(h.DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            }
            case 4: {
                return h.DEFAULT_INSTANCE;
            }
            case 5: {
                X x0 = h.PARSER;
                if(x0 == null) {
                    Class class0 = h.class;
                    synchronized(class0) {
                        x0 = h.PARSER;
                        if(x0 == null) {
                            x0 = new androidx.datastore.preferences.protobuf.w.b(h.DEFAULT_INSTANCE);
                            h.PARSER = x0;
                        }
                    }
                }
                return x0;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}


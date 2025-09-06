package L;

import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w.d;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y.b;
import java.util.List;

public final class g extends w implements P {
    public static final class a extends androidx.datastore.preferences.protobuf.w.a implements P {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        a(e e0) {
        }

        public a u(Iterable iterable0) {
            this.p();
            ((g)this.g).J(iterable0);
            return this;
        }
    }

    private static final g DEFAULT_INSTANCE = null;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private b strings_;

    static {
        g g0 = new g();
        g.DEFAULT_INSTANCE = g0;
        w.F(g.class, g0);
    }

    private g() {
        this.strings_ = w.t();
    }

    private void J(Iterable iterable0) {
        this.K();
        androidx.datastore.preferences.protobuf.a.g(iterable0, this.strings_);
    }

    private void K() {
        if(!this.strings_.J()) {
            this.strings_ = w.A(this.strings_);
        }
    }

    public static g L() {
        return g.DEFAULT_INSTANCE;
    }

    public List M() {
        return this.strings_;
    }

    public static a N() {
        return (a)g.DEFAULT_INSTANCE.p();
    }

    @Override  // androidx.datastore.preferences.protobuf.w
    protected final Object s(d w$d0, Object object0, Object object1) {
        switch(w$d0) {
            case 1: {
                return new g();
            }
            case 2: {
                return new a(null);
            }
            case 3: {
                return w.C(g.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"strings_"});
            }
            case 4: {
                return g.DEFAULT_INSTANCE;
            }
            case 5: {
                X x0 = g.PARSER;
                if(x0 == null) {
                    Class class0 = g.class;
                    synchronized(class0) {
                        x0 = g.PARSER;
                        if(x0 == null) {
                            x0 = new androidx.datastore.preferences.protobuf.w.b(g.DEFAULT_INSTANCE);
                            g.PARSER = x0;
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


package L;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w.d;
import androidx.datastore.preferences.protobuf.w;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f extends w implements P {
    public static final class a extends androidx.datastore.preferences.protobuf.w.a implements P {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        a(e e0) {
        }

        public a u(String s, h h0) {
            s.getClass();
            h0.getClass();
            this.p();
            ((f)this.g).J().put(s, h0);
            return this;
        }
    }

    static abstract class b {
        static final H a;

        static {
            h h0 = h.Q();
            b.a = H.d(androidx.datastore.preferences.protobuf.r0.b.p, "", androidx.datastore.preferences.protobuf.r0.b.r, h0);
        }
    }

    private static final f DEFAULT_INSTANCE = null;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_;

    static {
        f f0 = new f();
        f.DEFAULT_INSTANCE = f0;
        w.F(f.class, f0);
    }

    private f() {
        this.preferences_ = I.f();
    }

    private Map J() {
        return this.L();
    }

    public Map K() {
        return Collections.unmodifiableMap(this.M());
    }

    private I L() {
        if(!this.preferences_.k()) {
            this.preferences_ = this.preferences_.n();
        }
        return this.preferences_;
    }

    private I M() {
        return this.preferences_;
    }

    public static a N() {
        return (a)f.DEFAULT_INSTANCE.p();
    }

    public static f O(InputStream inputStream0) {
        return (f)w.D(f.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.w
    protected final Object s(d w$d0, Object object0, Object object1) {
        switch(w$d0) {
            case 1: {
                return new f();
            }
            case 2: {
                return new a(null);
            }
            case 3: {
                return w.C(f.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            }
            case 4: {
                return f.DEFAULT_INSTANCE;
            }
            case 5: {
                X x0 = f.PARSER;
                if(x0 == null) {
                    Class class0 = f.class;
                    synchronized(class0) {
                        x0 = f.PARSER;
                        if(x0 == null) {
                            x0 = new androidx.datastore.preferences.protobuf.w.b(f.DEFAULT_INSTANCE);
                            f.PARSER = x0;
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


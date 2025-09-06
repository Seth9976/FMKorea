package k0;

import z3.g;
import z3.k;

public final class a implements j {
    public static final class k0.a.a {
        private k0.a.a() {
        }

        public k0.a.a(g g0) {
        }

        private final void a(i i0, int v, Object object0) {
            if(object0 == null) {
                i0.P(v);
                return;
            }
            if(object0 instanceof byte[]) {
                i0.D(v, ((byte[])object0));
                return;
            }
            if(object0 instanceof Float) {
                i0.q(v, ((double)((Number)object0).floatValue()));
                return;
            }
            if(object0 instanceof Double) {
                i0.q(v, ((Number)object0).doubleValue());
                return;
            }
            if(object0 instanceof Long) {
                i0.x(v, ((Number)object0).longValue());
                return;
            }
            if(object0 instanceof Integer) {
                i0.x(v, ((long)((Number)object0).intValue()));
                return;
            }
            if(object0 instanceof Short) {
                i0.x(v, ((long)((Number)object0).shortValue()));
                return;
            }
            if(object0 instanceof Byte) {
                i0.x(v, ((long)((Number)object0).byteValue()));
                return;
            }
            if(object0 instanceof String) {
                i0.l(v, ((String)object0));
                return;
            }
            if(!(object0 instanceof Boolean)) {
                throw new IllegalArgumentException("Cannot bind " + object0 + " at index " + v + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
            i0.x(v, (((Boolean)object0).booleanValue() ? 1L : 0L));
        }

        public final void b(i i0, Object[] arr_object) {
            k.e(i0, "statement");
            if(arr_object == null) {
                return;
            }
            int v = 0;
            while(v < arr_object.length) {
                Object object0 = arr_object[v];
                ++v;
                this.a(i0, v, object0);
            }
        }
    }

    private final String f;
    private final Object[] g;
    public static final k0.a.a h;

    static {
        a.h = new k0.a.a(null);
    }

    public a(String s) {
        k.e(s, "query");
        this(s, null);
    }

    public a(String s, Object[] arr_object) {
        k.e(s, "query");
        super();
        this.f = s;
        this.g = arr_object;
    }

    @Override  // k0.j
    public void a(i i0) {
        k.e(i0, "statement");
        a.h.b(i0, this.g);
    }

    @Override  // k0.j
    public String b() {
        return this.f;
    }
}


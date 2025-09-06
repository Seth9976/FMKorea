package I0;

import D3.d;
import java.util.LinkedHashMap;
import m3.F;
import z3.g;
import z3.k;

public enum f {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final f a(String s) {
            k.e(s, "symbol");
            f f0 = (f)f.h.get(s);
            return f0 == null ? f.l : f0;
        }
    }

    public abstract class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[f.values().length];
            arr_v[f.i.ordinal()] = 1;
            arr_v[f.j.ordinal()] = 2;
            arr_v[f.k.ordinal()] = 3;
            b.a = arr_v;
        }
    }

    NO_CACHE("no_cache"),
    CACHE_ONLY("cache_only"),
    CACHE_ELSE_NETWORK("cache_else_network"),
    DEFAULT("default");

    private final String f;
    public static final a g;
    private static final LinkedHashMap h;

    static {
        f.g = new a(null);
        f[] arr_f = (f[])f.m.clone();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(d.a(F.e(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            f f0 = arr_f[v];
            linkedHashMap0.put(f0.f, f0);
        }
        f.h = linkedHashMap0;
    }

    private f(String s1) {
        this.f = s1;
    }

    public static final f f(String s) {
        return f.g.a(s);
    }

    public final int g() {
        int v = b.a[this.ordinal()];
        if(v != 1) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 1;
                }
                default: {
                    return -1;
                }
            }
        }
        return 2;
    }
}


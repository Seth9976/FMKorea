package V2;

import O2.a;
import O2.c;
import O2.g;
import R2.b;
import java.util.Map;

public abstract class n implements g {
    @Override  // O2.g
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + v + 'x' + v1);
        }
        int v2 = this.d();
        if(map0 != null) {
            c c0 = c.k;
            if(map0.containsKey(c0)) {
                v2 = Integer.parseInt(map0.get(c0).toString());
            }
        }
        return n.e(this.c(s), v, v1, v2);
    }

    protected static int b(boolean[] arr_z, int v, int[] arr_v, boolean z) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            int v4 = 0;
            while(v4 < v3) {
                arr_z[v] = z;
                ++v4;
                ++v;
            }
            v2 += v3;
            z = !z;
        }
        return v2;
    }

    public abstract boolean[] c(String arg1);

    public int d() {
        return 10;
    }

    private static b e(boolean[] arr_z, int v, int v1, int v2) {
        int v3 = v2 + arr_z.length;
        int v4 = Math.max(v, v3);
        int v5 = Math.max(1, v1);
        int v6 = v4 / v3;
        int v7 = (v4 - arr_z.length * v6) / 2;
        b b0 = new b(v4, v5);
        int v8 = 0;
        while(v8 < arr_z.length) {
            if(arr_z[v8]) {
                b0.j(v7, 0, v6, v5);
            }
            ++v8;
            v7 += v6;
        }
        return b0;
    }
}


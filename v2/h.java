package V2;

import O2.a;
import R2.b;
import java.util.Map;

public class h extends n {
    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.i) {
            throw new IllegalArgumentException("Can only encode CODE_93, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        if(v > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v);
        }
        int[] arr_v = new int[9];
        h.h(g.b[0x2F], arr_v);
        boolean[] arr_z = new boolean[(s.length() + 4) * 9 + 1];
        int v2 = h.f(arr_z, 0, arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            h.h(g.b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(s.charAt(v1))], arr_v);
            v2 += h.f(arr_z, v2, arr_v);
        }
        int v3 = h.g(s, 20);
        h.h(g.b[v3], arr_v);
        int v4 = v2 + h.f(arr_z, v2, arr_v);
        h.h(g.b[h.g((s + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(v3)), 15)], arr_v);
        int v5 = v4 + h.f(arr_z, v4, arr_v);
        h.h(g.b[0x2F], arr_v);
        arr_z[v5 + h.f(arr_z, v5, arr_v)] = true;
        return arr_z;
    }

    private static int f(boolean[] arr_z, int v, int[] arr_v) {
        int v1 = 0;
        while(v1 < arr_v.length) {
            arr_z[v] = arr_v[v1] != 0;
            ++v1;
            ++v;
        }
        return 9;
    }

    private static int g(String s, int v) {
        int v1 = s.length() - 1;
        int v2 = 0;
        int v3 = 1;
        while(v1 >= 0) {
            v2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(s.charAt(v1)) * v3;
            ++v3;
            v3 = v3 <= v ? v3 + 1 : 1;
            --v1;
        }
        return v2 % 0x2F;
    }

    private static void h(int v, int[] arr_v) {
        for(int v1 = 0; true; ++v1) {
            int v2 = 1;
            if(v1 >= 9) {
                break;
            }
            if((1 << 8 - v1 & v) == 0) {
                v2 = 0;
            }
            arr_v[v1] = v2;
        }
    }
}


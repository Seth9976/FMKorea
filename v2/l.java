package V2;

import O2.a;
import R2.b;
import java.util.Map;

public final class l extends n {
    private static final int[] a;
    private static final int[] b;
    private static final int[][] c;

    static {
        l.a = new int[]{1, 1, 1, 1};
        l.b = new int[]{3, 1, 1};
        l.c = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.n) {
            throw new IllegalArgumentException("Can only encode ITF, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if(v > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v);
        }
        boolean[] arr_z = new boolean[v * 9 + 9];
        int v1 = n.b(arr_z, 0, l.a, true);
        for(int v2 = 0; v2 < v; v2 += 2) {
            int v3 = Character.digit(s.charAt(v2), 10);
            int v4 = Character.digit(s.charAt(v2 + 1), 10);
            int[] arr_v = new int[10];
            for(int v5 = 0; v5 < 5; ++v5) {
                arr_v[v5 * 2] = l.c[v3][v5];
                arr_v[v5 * 2 + 1] = l.c[v4][v5];
            }
            v1 += n.b(arr_z, v1, arr_v, true);
        }
        n.b(arr_z, v1, l.b, true);
        return arr_z;
    }
}


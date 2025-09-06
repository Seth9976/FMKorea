package V2;

import O2.d;

public abstract class p extends m {
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[][] d;
    static final int[][] e;

    static {
        p.a = new int[]{1, 1, 1};
        p.b = new int[]{1, 1, 1, 1, 1};
        p.c = new int[]{1, 1, 1, 1, 1, 1};
        int[][] arr2_v = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        p.d = arr2_v;
        int[][] arr2_v1 = new int[20][];
        p.e = arr2_v1;
        System.arraycopy(arr2_v, 0, arr2_v1, 0, 10);
        for(int v = 10; v < 20; ++v) {
            int[] arr_v = p.d[v - 10];
            int[] arr_v1 = new int[arr_v.length];
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arr_v1[v1] = arr_v[arr_v.length - v1 - 1];
            }
            p.e[v] = arr_v1;
        }
    }

    static boolean a(CharSequence charSequence0) {
        int v = charSequence0.length();
        if(v == 0) {
            return false;
        }
        int v1 = Character.digit(charSequence0.charAt(v - 1), 10);
        return p.b(charSequence0.subSequence(0, v - 1)) == v1;
    }

    static int b(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = v - 1;
        int v2 = 0;
        while(v1 >= 0) {
            int v3 = charSequence0.charAt(v1);
            if(v3 - 0x30 < 0 || v3 - 0x30 > 9) {
                throw d.a();
            }
            v2 += v3 - 0x30;
            v1 -= 2;
        }
        int v4 = v2 * 3;
        for(int v5 = v - 2; v5 >= 0; v5 -= 2) {
            int v6 = charSequence0.charAt(v5);
            if(v6 - 0x30 < 0 || v6 - 0x30 > 9) {
                throw d.a();
            }
            v4 += v6 - 0x30;
        }
        return (1000 - v4) % 10;
    }
}


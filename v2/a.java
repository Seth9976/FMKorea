package V2;

public abstract class a extends m {
    static final char[] a;
    static final int[] b;
    private static final char[] c;

    static {
        a.a = "0123456789-$:/.+ABCD".toCharArray();
        a.b = new int[]{3, 6, 9, 0x60, 18, 66, 33, 36, 0x30, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
        a.c = new char[]{'A', 'B', 'C', 'D'};
    }

    static boolean a(char[] arr_c, char c) {
        if(arr_c != null) {
            for(int v = 0; v < arr_c.length; ++v) {
                if(arr_c[v] == c) {
                    return true;
                }
            }
        }
        return false;
    }
}


package androidx.profileinstaller;

import java.util.Arrays;

public abstract class p {
    static final byte[] a;
    static final byte[] b;
    static final byte[] c;
    static final byte[] d;
    static final byte[] e;
    static final byte[] f;
    static final byte[] g;

    static {
        p.a = new byte[]{0x30, 49, 53, 0};
        p.b = new byte[]{0x30, 49, 0x30, 0};
        p.c = new byte[]{0x30, 0x30, 57, 0};
        p.d = new byte[]{0x30, 0x30, 53, 0};
        p.e = new byte[]{0x30, 0x30, 49, 0};
        p.f = new byte[]{0x30, 0x30, 49, 0};
        p.g = new byte[]{0x30, 0x30, 50, 0};
    }

    static String a(byte[] arr_b) {
        if(Arrays.equals(arr_b, p.e)) {
            return ":";
        }
        return Arrays.equals(arr_b, p.d) ? ":" : "!";
    }
}


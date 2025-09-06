package V2;

import O2.a;
import O2.d;
import R2.b;
import java.util.Map;

public final class j extends q {
    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.m) {
            throw new IllegalArgumentException("Can only encode EAN_13, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 12: {
                try {
                    s = s + p.b(s);
                    break;
                }
                catch(d d0) {
                    throw new IllegalArgumentException(d0);
                }
            }
            case 13: {
                try {
                    if(!p.a(s)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                    break;
                }
                catch(d unused_ex) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            }
            default: {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + v);
            }
        }
        int v1 = i.f[Character.digit(s.charAt(0), 10)];
        boolean[] arr_z = new boolean[0x5F];
        int v2 = n.b(arr_z, 0, p.a, true);
        for(int v3 = 1; v3 <= 6; ++v3) {
            v2 += n.b(arr_z, v2, p.e[((v1 >> 6 - v3 & 1) == 1 ? Character.digit(s.charAt(v3), 10) + 10 : Character.digit(s.charAt(v3), 10))], false);
        }
        int v4 = v2 + n.b(arr_z, v2, p.b, false);
        for(int v5 = 7; v5 <= 12; ++v5) {
            v4 += n.b(arr_z, v4, p.d[Character.digit(s.charAt(v5), 10)], true);
        }
        n.b(arr_z, v4, p.a, true);
        return arr_z;
    }
}


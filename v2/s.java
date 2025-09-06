package V2;

import O2.a;
import O2.d;
import R2.b;
import java.util.Map;

public final class s extends q {
    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.u) {
            throw new IllegalArgumentException("Can only encode UPC_E, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 7: {
                try {
                    s = s + p.b(r.c(s));
                    break;
                }
                catch(d d0) {
                    throw new IllegalArgumentException(d0);
                }
            }
            case 8: {
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
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + v);
            }
        }
        int v1 = Character.digit(s.charAt(0), 10);
        if(v1 != 0 && v1 != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int v2 = r.g[v1][Character.digit(s.charAt(7), 10)];
        boolean[] arr_z = new boolean[51];
        int v3 = n.b(arr_z, 0, p.a, true);
        for(int v4 = 1; v4 <= 6; ++v4) {
            v3 += n.b(arr_z, v3, p.e[((v2 >> 6 - v4 & 1) == 1 ? Character.digit(s.charAt(v4), 10) + 10 : Character.digit(s.charAt(v4), 10))], false);
        }
        n.b(arr_z, v3, p.c, false);
        return arr_z;
    }
}


package V2;

import O2.a;
import O2.d;
import R2.b;
import java.util.Map;

public final class k extends q {
    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.l) {
            throw new IllegalArgumentException("Can only encode EAN_8, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 7: {
                try {
                    s = s + p.b(s);
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
        boolean[] arr_z = new boolean[67];
        int v1 = n.b(arr_z, 0, p.a, true);
        for(int v2 = 0; v2 <= 3; ++v2) {
            v1 += n.b(arr_z, v1, p.d[Character.digit(s.charAt(v2), 10)], false);
        }
        int v3 = v1 + n.b(arr_z, v1, p.b, false);
        for(int v4 = 4; v4 <= 7; ++v4) {
            v3 += n.b(arr_z, v3, p.d[Character.digit(s.charAt(v4), 10)], true);
        }
        n.b(arr_z, v3, p.a, true);
        return arr_z;
    }
}


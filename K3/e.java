package K3;

import y3.l;

public abstract class e {
    public static final d a(int v, a a0, l l0) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    if(a0 != a.f) {
                        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                    }
                    return new k(1, a.g, l0);
                }
                case 0: {
                    return a0 == a.f ? new b(0, l0) : new k(1, a0, l0);
                }
                default: {
                    if(v != 0x7FFFFFFF) {
                        return a0 == a.f ? new b(v, l0) : new k(v, a0, l0);
                    }
                    return new b(0x7FFFFFFF, l0);
                }
            }
        }
        return a0 == a.f ? new b(0x40, l0) : new k(1, a0, l0);
    }

    public static d b(int v, a a0, l l0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            a0 = a.f;
        }
        if((v1 & 4) != 0) {
            l0 = null;
        }
        return e.a(v, a0, l0);
    }
}


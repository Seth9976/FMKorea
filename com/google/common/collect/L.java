package com.google.common.collect;

abstract class l {
    static int a(int v, double f) {
        int v1 = Math.max(v, 2);
        int v2 = Integer.highestOneBit(v1);
        if(v1 > ((int)(f * ((double)v2)))) {
            return v2 << 1 > 0 ? v2 << 1 : 0x40000000;
        }
        return v2;
    }

    static int b(int v) [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    static int c(Object object0) {
        return object0 == null ? 0 : l.b(object0.hashCode());
    }
}


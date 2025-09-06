package com.google.android.gms.internal.ads;

public abstract class zzftx {
    public abstract zzftx zzb(Object arg1);

    static int zze(int v, int v1) {
        int v2 = v + (v >> 1) + 1;
        if(v2 < v1) {
            int v3 = Integer.highestOneBit(v1 - 1);
            v2 = v3 + v3;
        }
        return v2 >= 0 ? v2 : 0x7FFFFFFF;
    }
}


package com.google.android.gms.internal.ads;

public final class zzfwl extends zzfwm {
    public static int zza(long v) {
        zzfri.zzg(((long)(((int)v))) == v, "Out of range: %s", v);
        return (int)v;
    }

    public static int zzb(int v, int v1, int v2) [...] // 潜在的解密器

    public static int zzc(long v) {
        if(v > 0x7FFFFFFFL) {
            return 0x7FFFFFFF;
        }
        return v >= 0xFFFFFFFF80000000L ? ((int)v) : 0x80000000;
    }
}


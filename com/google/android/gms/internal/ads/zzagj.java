package com.google.android.gms.internal.ads;

class zzagj {
    public final int zzd;

    public zzagj(int v) {
        this.zzd = v;
    }

    @Override
    public String toString() {
        return zzagj.zzf(this.zzd);
    }

    public static int zze(int v) [...] // Inlined contents

    public static String zzf(int v) {
        return ((char)(v >> 24 & 0xFF)) + ((char)(v >> 16 & 0xFF)) + ((char)(v >> 8 & 0xFF)) + ((char)(v & 0xFF));
    }
}


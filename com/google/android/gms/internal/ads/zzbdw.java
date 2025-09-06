package com.google.android.gms.internal.ads;

public final class zzbdw {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;

    static {
        zzbdw.zza = zzbcw.zzb("gads:ad_loader:timeout_ms", 60000L);
        zzbdw.zzb = zzbcw.zzb("gads:rendering:timeout_ms", 60000L);
        zzbdw.zzc = zzbcw.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}


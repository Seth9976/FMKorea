package com.google.android.gms.internal.ads;

public final class zzbdx {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;

    static {
        zzbdx.zza = zzbcw.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdx.zzb = zzbcw.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdx.zzc = zzbcw.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdx.zzd = zzbcw.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}


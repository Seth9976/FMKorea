package com.google.android.gms.internal.ads;

public final class zzbdq {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;

    static {
        zzbdq.zza = zzbcw.zzd("gads:separate_url_generation:enabled", false);
        zzbdq.zzb = zzbcw.zzc("gads:google_ad_request_domains", "googleads.g.doubleclick.net;pubads.g.doubleclick.net");
        zzbdq.zzc = zzbcw.zzb("gads:url_cache:max_size", 200L);
        zzbdq.zzd = zzbcw.zzd("gads:use_request_id_as_url_cache_key:enabled", true);
    }
}


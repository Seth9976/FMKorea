package com.google.android.gms.internal.ads;

public final class zzbdi {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;
    public static final zzbcw zze;
    public static final zzbcw zzf;
    public static final zzbcw zzg;
    public static final zzbcw zzh;
    public static final zzbcw zzi;
    public static final zzbcw zzj;
    public static final zzbcw zzk;
    public static final zzbcw zzl;

    static {
        zzbdi.zza = zzbcw.zzd("gads:init:init_on_bg_thread", true);
        zzbdi.zzb = zzbcw.zzd("gads:init:init_on_single_bg_thread", false);
        zzbdi.zzc = zzbcw.zzd("gads:adloader_load_bg_thread", true);
        zzbdi.zzd = zzbcw.zzd("gads:appopen_load_on_bg_thread", true);
        zzbdi.zze = zzbcw.zzd("gads:banner_destroy_bg_thread", false);
        zzbdi.zzf = zzbcw.zzd("gads:banner_load_bg_thread", true);
        zzbdi.zzg = zzbcw.zzd("gads:banner_pause_bg_thread", false);
        zzbdi.zzh = zzbcw.zzd("gads:banner_resume_bg_thread", false);
        zzbdi.zzi = zzbcw.zzd("gads:interstitial_load_on_bg_thread", true);
        zzbdi.zzj = zzbcw.zzd("gads:persist_flags_on_bg_thread", true);
        zzbdi.zzk = zzbcw.zzd("gads:query_info_bg_thread", true);
        zzbdi.zzl = zzbcw.zzd("gads:rewarded_load_bg_thread", true);
    }
}


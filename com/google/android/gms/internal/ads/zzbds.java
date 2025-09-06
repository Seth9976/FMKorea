package com.google.android.gms.internal.ads;

public final class zzbds {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;
    public static final zzbcw zze;
    public static final zzbcw zzf;
    public static final zzbcw zzg;

    static {
        zzbds.zza = zzbcw.zzb("gads:dynamite_load:fail:sample_rate", 10000L);
        zzbds.zzb = zzbcw.zzd("gads:report_dynamite_crash_in_background_thread", false);
        zzbds.zzc = zzbcw.zzc("gads:public_beta:traffic_multiplier", "1.0");
        zzbds.zzd = zzbcw.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
        zzbds.zze = zzbcw.zzd("gads:sdk_crash_report_enabled", false);
        zzbds.zzf = zzbcw.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzbds.zzg = zzbcw.zza("gads:trapped_exception_sample_rate", 0.01);
    }
}


package com.google.android.gms.internal.ads;

public final class zzbdb {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;
    public static final zzbcw zze;

    static {
        zzbdb.zza = zzbcx.zzf("gads:consent:gmscore:dsid:enabled", true);
        zzbdb.zzb = zzbcx.zzf("gads:consent:gmscore:lat:enabled", true);
        zzbdb.zzc = new zzbcx("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
        zzbdb.zzd = new zzbcx("gads:consent:gmscore:time_out", 10000L, 2);
        zzbdb.zze = zzbcx.zzf("gads:consent:gmscore:enabled", true);
    }
}


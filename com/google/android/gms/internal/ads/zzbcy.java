package com.google.android.gms.internal.ads;

public final class zzbcy {
    public static final zzbcw zza;
    public static final zzbcw zzb;
    public static final zzbcw zzc;
    public static final zzbcw zzd;

    static {
        zzbcy.zza = zzbcw.zzd("gads:afs:csa_send_tcf_data", true);
        zzbcy.zzb = zzbcw.zzc("gads:afs:csa_tcf_data_to_collect", "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
        zzbcy.zzc = zzbcw.zzc("gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
        zzbcy.zzd = zzbcw.zzc("gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    }
}


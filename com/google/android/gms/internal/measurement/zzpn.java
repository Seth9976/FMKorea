package com.google.android.gms.internal.measurement;

public final class zzpn implements zzpk {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;
    private static final zzgn zzf;
    private static final zzgn zzg;
    private static final zzgn zzh;
    private static final zzgn zzi;
    private static final zzgn zzj;
    private static final zzgn zzk;
    private static final zzgn zzl;
    private static final zzgn zzm;
    private static final zzgn zzn;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpn.zza = zzgv0.zza("measurement.redaction.app_instance_id", true);
        zzpn.zzb = zzgv0.zza("measurement.redaction.client_ephemeral_aiid_generation", true);
        zzpn.zzc = zzgv0.zza("measurement.redaction.config_redacted_fields", true);
        zzpn.zzd = zzgv0.zza("measurement.redaction.device_info", true);
        zzpn.zze = zzgv0.zza("measurement.redaction.e_tag", true);
        zzpn.zzf = zzgv0.zza("measurement.redaction.enhanced_uid", true);
        zzpn.zzg = zzgv0.zza("measurement.redaction.populate_ephemeral_app_instance_id", true);
        zzpn.zzh = zzgv0.zza("measurement.redaction.google_signals", true);
        zzpn.zzi = zzgv0.zza("measurement.redaction.no_aiid_in_config_request", true);
        zzpn.zzj = zzgv0.zza("measurement.redaction.retain_major_os_version", true);
        zzpn.zzk = zzgv0.zza("measurement.redaction.scion_payload_generator", true);
        zzpn.zzl = zzgv0.zza("measurement.redaction.upload_redacted_fields", true);
        zzpn.zzm = zzgv0.zza("measurement.redaction.upload_subdomain_override", true);
        zzpn.zzn = zzgv0.zza("measurement.redaction.user_id", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpk
    public final boolean zza() {
        return ((Boolean)zzpn.zzj.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpk
    public final boolean zzb() {
        return ((Boolean)zzpn.zzk.zza()).booleanValue();
    }
}


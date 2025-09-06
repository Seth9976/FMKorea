package com.google.android.gms.internal.measurement;

public final class zzpz implements zzpw {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;
    private static final zzgn zzf;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpz.zza = zzgv0.zza("measurement.client.sessions.background_sessions_enabled", true);
        zzpz.zzb = zzgv0.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzpz.zzc = zzgv0.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzpz.zzd = zzgv0.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzpz.zze = zzgv0.zza("measurement.client.sessions.session_id_enabled", true);
        zzpz.zzf = zzgv0.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpw
    public final boolean zza() {
        return ((Boolean)zzpz.zzb.zza()).booleanValue();
    }
}


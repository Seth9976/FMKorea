package com.google.android.gms.internal.measurement;

public final class zznl implements zzni {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznl.zza = zzgv0.zza("measurement.client.consent_state_v1", true);
        zznl.zzb = zzgv0.zza("measurement.client.3p_consent_state_v1", true);
        zznl.zzc = zzgv0.zza("measurement.service.consent_state_v1_W36", true);
        zznl.zzd = zzgv0.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzni
    public final long zza() {
        return (long)(((Long)zznl.zzd.zza()));
    }
}


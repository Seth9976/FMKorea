package com.google.android.gms.internal.measurement;

public final class zznr implements zzno {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;
    private static final zzgn zzf;
    private static final zzgn zzg;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznr.zza = zzgv0.zza("measurement.dma_consent.client", false);
        zznr.zzb = zzgv0.zza("measurement.dma_consent.client_bow_check", false);
        zznr.zzc = zzgv0.zza("measurement.dma_consent.service", false);
        zznr.zzd = zzgv0.zza("measurement.dma_consent.service_gcs_v2", false);
        zznr.zze = zzgv0.zza("measurement.dma_consent.service_npa_remote_default", false);
        zznr.zzf = zzgv0.zza("measurement.dma_consent.service_split_batch_on_consent", false);
        zznr.zzg = zzgv0.zza("measurement.id.dma_consent.service", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zzb() {
        return ((Boolean)zznr.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zzc() {
        return ((Boolean)zznr.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zzd() {
        return ((Boolean)zznr.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zze() {
        return ((Boolean)zznr.zzd.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zzf() {
        return ((Boolean)zznr.zze.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final boolean zzg() {
        return ((Boolean)zznr.zzf.zza()).booleanValue();
    }
}


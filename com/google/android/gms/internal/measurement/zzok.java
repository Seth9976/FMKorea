package com.google.android.gms.internal.measurement;

public final class zzok implements zzol {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzok.zza = zzgv0.zza("measurement.gbraid_campaign.gbraid.client.dev", false);
        zzok.zzb = zzgv0.zza("measurement.gbraid_campaign.gbraid.service", false);
        zzok.zzc = zzgv0.zza("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzol
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzol
    public final boolean zzb() {
        return ((Boolean)zzok.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzol
    public final boolean zzc() {
        return ((Boolean)zzok.zzb.zza()).booleanValue();
    }
}


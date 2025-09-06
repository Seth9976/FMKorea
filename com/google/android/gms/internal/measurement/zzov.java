package com.google.android.gms.internal.measurement;

public final class zzov implements zzos {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzov.zza = zzgv0.zza("measurement.item_scoped_custom_parameters.client", true);
        zzov.zzb = zzgv0.zza("measurement.item_scoped_custom_parameters.service", false);
        zzov.zzc = zzgv0.zza("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final boolean zzb() {
        return ((Boolean)zzov.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final boolean zzc() {
        return ((Boolean)zzov.zzb.zza()).booleanValue();
    }
}


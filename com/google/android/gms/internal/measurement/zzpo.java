package com.google.android.gms.internal.measurement;

public final class zzpo implements zzpp {
    private static final zzgn zza;
    private static final zzgn zzb;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpo.zza = zzgv0.zza("measurement.remove_app_background.client", false);
        zzpo.zzb = zzgv0.zza("measurement.id.remove_app_background.client", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpp
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpp
    public final boolean zzb() {
        return ((Boolean)zzpo.zza.zza()).booleanValue();
    }
}


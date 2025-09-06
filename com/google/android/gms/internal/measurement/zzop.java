package com.google.android.gms.internal.measurement;

public final class zzop implements zzom {
    private static final zzgn zza;

    static {
        zzop.zza = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.gmscore_feature_tracking", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzom
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzom
    public final boolean zzb() {
        return ((Boolean)zzop.zza.zza()).booleanValue();
    }
}


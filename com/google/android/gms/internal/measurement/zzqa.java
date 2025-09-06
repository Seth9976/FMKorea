package com.google.android.gms.internal.measurement;

public final class zzqa implements zzqb {
    private static final zzgn zza;
    private static final zzgn zzb;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzqa.zza = zzgv0.zza("measurement.sfmc.client", true);
        zzqa.zzb = zzgv0.zza("measurement.sfmc.service", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzqb
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzqb
    public final boolean zzb() {
        return ((Boolean)zzqa.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzqb
    public final boolean zzc() {
        return ((Boolean)zzqa.zzb.zza()).booleanValue();
    }
}


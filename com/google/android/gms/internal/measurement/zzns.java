package com.google.android.gms.internal.measurement;

public final class zzns implements zznt {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzns.zza = zzgv0.zza("measurement.collection.event_safelist", true);
        zzns.zzb = zzgv0.zza("measurement.service.store_null_safelist", true);
        zzns.zzc = zzgv0.zza("measurement.service.store_safelist", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznt
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznt
    public final boolean zzb() {
        return ((Boolean)zzns.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznt
    public final boolean zzc() {
        return ((Boolean)zzns.zzc.zza()).booleanValue();
    }
}


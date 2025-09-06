package com.google.android.gms.internal.measurement;

public final class zznm implements zznn {
    private static final zzgn zza;
    private static final zzgn zzb;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznm.zza = zzgv0.zza("measurement.service.deferred_first_open", false);
        zznm.zzb = zzgv0.zza("measurement.id.service.deferred_first_open", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznn
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznn
    public final boolean zzb() {
        return ((Boolean)zznm.zza.zza()).booleanValue();
    }
}


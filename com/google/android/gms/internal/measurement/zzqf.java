package com.google.android.gms.internal.measurement;

public final class zzqf implements zzqc {
    private static final zzgn zza;
    private static final zzgn zzb;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzqf.zza = zzgv0.zza("measurement.sgtm.client.dev", false);
        zzqf.zzb = zzgv0.zza("measurement.sgtm.service", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzqc
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzqc
    public final boolean zzb() {
        return ((Boolean)zzqf.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzqc
    public final boolean zzc() {
        return ((Boolean)zzqf.zzb.zza()).booleanValue();
    }
}


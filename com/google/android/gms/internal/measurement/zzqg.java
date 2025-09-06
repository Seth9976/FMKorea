package com.google.android.gms.internal.measurement;

public final class zzqg implements zzqh {
    private static final zzgn zza;

    static {
        zzqg.zza = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.integration.disable_firebase_instance_id", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzqh
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzqh
    public final boolean zzb() {
        return ((Boolean)zzqg.zza.zza()).booleanValue();
    }
}


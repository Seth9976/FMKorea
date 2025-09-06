package com.google.android.gms.internal.measurement;

public final class zzny implements zznz {
    private static final zzgn zza;

    static {
        zzny.zza = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.client.ad_id_consent_fix", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznz
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznz
    public final boolean zzb() {
        return ((Boolean)zzny.zza.zza()).booleanValue();
    }
}


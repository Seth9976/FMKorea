package com.google.android.gms.internal.measurement;

public final class zzow implements zzox {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzow.zza = zzgv0.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzow.zzb = zzgv0.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzow.zzc = zzgv0.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzow.zzd = zzgv0.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzox
    public final boolean zza() {
        return ((Boolean)zzow.zzc.zza()).booleanValue();
    }
}


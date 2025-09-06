package com.google.android.gms.internal.measurement;

public final class zzpb implements zzoy {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpb.zza = zzgv0.zza("measurement.id.lifecycle.app_in_background_parameter", 0L);
        zzpb.zzb = zzgv0.zza("measurement.lifecycle.app_backgrounded_tracking", true);
        zzpb.zzc = zzgv0.zza("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zza() {
        return ((Boolean)zzpb.zzc.zza()).booleanValue();
    }
}


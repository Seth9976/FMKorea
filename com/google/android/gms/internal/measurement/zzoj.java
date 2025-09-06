package com.google.android.gms.internal.measurement;

public final class zzoj implements zzog {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzoj.zza = zzgv0.zza("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzoj.zzb = zzgv0.zza("measurement.client.sessions.check_on_startup", true);
        zzoj.zzc = zzgv0.zza("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzog
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzog
    public final boolean zzb() {
        return ((Boolean)zzoj.zza.zza()).booleanValue();
    }
}


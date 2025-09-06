package com.google.android.gms.internal.measurement;

public final class zzpu implements zzpv {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpu.zza = zzgv0.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzpu.zzb = zzgv0.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zzpu.zzc = zzgv0.zza("measurement.session_stitching_token_enabled", false);
        zzpu.zzd = zzgv0.zza("measurement.link_sst_to_sid", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpv
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpv
    public final boolean zzb() {
        return ((Boolean)zzpu.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpv
    public final boolean zzc() {
        return ((Boolean)zzpu.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpv
    public final boolean zzd() {
        return ((Boolean)zzpu.zzc.zza()).booleanValue();
    }
}


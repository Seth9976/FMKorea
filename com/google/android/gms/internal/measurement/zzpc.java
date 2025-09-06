package com.google.android.gms.internal.measurement;

public final class zzpc implements zzpd {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpc.zza = zzgv0.zza("measurement.test.boolean_flag", false);
        zzpc.zzb = zzgv0.zza("measurement.test.double_flag", -3.0);
        zzpc.zzc = zzgv0.zza("measurement.test.int_flag", -2L);
        zzpc.zzd = zzgv0.zza("measurement.test.long_flag", -1L);
        zzpc.zze = zzgv0.zza("measurement.test.string_flag", "---");
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final double zza() {
        return (double)(((Double)zzpc.zzb.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final long zzb() {
        return (long)(((Long)zzpc.zzc.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final long zzc() {
        return (long)(((Long)zzpc.zzd.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final String zzd() {
        return (String)zzpc.zze.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zze() {
        return ((Boolean)zzpc.zza.zza()).booleanValue();
    }
}


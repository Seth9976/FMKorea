package com.google.android.gms.internal.measurement;

public final class zzpi implements zzpj {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;
    private static final zzgn zzf;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpi.zza = zzgv0.zza("measurement.rb.attribution.client2", false);
        zzpi.zzb = zzgv0.zza("measurement.rb.attribution.followup1.service", false);
        zzpi.zzc = zzgv0.zza("measurement.rb.attribution.service", false);
        zzpi.zzd = zzgv0.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzpi.zze = zzgv0.zza("measurement.rb.attribution.uuid_generation", true);
        zzpi.zzf = zzgv0.zza("measurement.id.rb.attribution.service", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzb() {
        return ((Boolean)zzpi.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzc() {
        return ((Boolean)zzpi.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzd() {
        return ((Boolean)zzpi.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zze() {
        return ((Boolean)zzpi.zzd.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzf() {
        return ((Boolean)zzpi.zze.zza()).booleanValue();
    }
}


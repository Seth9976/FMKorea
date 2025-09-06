package com.google.android.gms.internal.measurement;

public final class zzod implements zzoa {
    private static final zzgn zza;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzod.zza = zzgv0.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zzod.zzb = zzgv0.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzod.zzc = zzgv0.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzod.zzd = zzgv0.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoa
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoa
    public final boolean zzb() {
        return ((Boolean)zzod.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoa
    public final boolean zzc() {
        return ((Boolean)zzod.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoa
    public final boolean zzd() {
        return ((Boolean)zzod.zzd.zza()).booleanValue();
    }
}


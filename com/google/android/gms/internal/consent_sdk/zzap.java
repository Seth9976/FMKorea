package com.google.android.gms.internal.consent_sdk;

final class zzap implements zzaz {
    private final zzaj zza;
    private final zzap zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;

    zzap(zzaj zzaj0, zzbs zzbs0, zzao zzao0) {
        this.zzb = this;
        this.zza = zzaj0;
        zzdr zzdr0 = zzdn.zza(new zzbz(zzaj0.zzb));
        this.zzc = zzdr0;
        zzdo zzdo0 = zzdp.zza(zzbs0);
        this.zzd = zzdo0;
        zzdm zzdm0 = new zzdm();
        this.zze = zzdm0;
        zzcd zzcd0 = new zzcd(zzaj0.zzb, zzdr0, zzau.zza(), zzaw.zza(), zzaj0.zzi, zzaj0.zzj, zzdm0, zzaj0.zzc);
        this.zzf = zzcd0;
        zzbx zzbx0 = new zzbx(zzdr0, zzau.zza(), zzcd0);
        this.zzg = zzbx0;
        zzdm.zza(zzdm0, zzdn.zza(new zzbf(zzaj0.zzb, zzaj0.zzd, zzdr0, zzaj0.zzc, zzdo0, zzbx0)));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzaz
    public final zzbe zza() {
        return (zzbe)this.zze.zzb();
    }
}


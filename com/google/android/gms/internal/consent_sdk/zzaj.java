package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

final class zzaj extends zzc {
    private final zzaj zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    private final zzdr zzi;
    private final zzdr zzj;
    private final zzdr zzk;
    private final zzdr zzl;
    private final zzdr zzm;

    zzaj(Application application0, zzai zzai0) {
        this.zza = this;
        zzdo zzdo0 = zzdp.zza(application0);
        this.zzb = zzdo0;
        zzdr zzdr0 = zzdn.zza(new zzat(zzdo0));
        this.zzc = zzdr0;
        zzdr zzdr1 = zzdn.zza(zzaf.zza);
        this.zzd = zzdr1;
        zzah zzah0 = new zzah(this);
        this.zze = zzah0;
        zzdr zzdr2 = zzdn.zza(new zzbr(zzah0, zzaw.zza()));
        this.zzf = zzdr2;
        zzb zzb0 = new zzb(zzdo0);
        this.zzg = zzb0;
        zzq zzq0 = new zzq(zzdo0, zzb0, zzdr0);
        this.zzh = zzq0;
        zzdr zzdr3 = zzdn.zza(new zzh(zzaw.zza()));
        this.zzi = zzdr3;
        zzar zzar0 = new zzar(zzdo0, zzdr0, zzaw.zza());
        this.zzj = zzar0;
        zzad zzad0 = new zzad(zzdr3, zzar0, zzdr0);
        this.zzk = zzad0;
        zzy zzy0 = new zzy(zzdo0, zzdr1, zzau.zza(), zzaw.zza(), zzdr0, zzdr2, zzq0, zzad0, zzdr3);
        this.zzl = zzy0;
        this.zzm = zzdn.zza(new zzm(zzdr0, zzy0, zzdr2));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzc
    public final zzl zzb() {
        return (zzl)this.zzm.zzb();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzc
    public final zzbq zzc() {
        return (zzbq)this.zzf.zzb();
    }

    static zzaj zzd(zzaj zzaj0) {
        return zzaj0.zza;
    }
}


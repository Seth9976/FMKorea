package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzdbt {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private zzeys zzo;

    public zzdbt() {
        this.zza = new HashSet();
        this.zzb = new HashSet();
        this.zzc = new HashSet();
        this.zzd = new HashSet();
        this.zze = new HashSet();
        this.zzf = new HashSet();
        this.zzg = new HashSet();
        this.zzh = new HashSet();
        this.zzi = new HashSet();
        this.zzj = new HashSet();
        this.zzk = new HashSet();
        this.zzl = new HashSet();
        this.zzm = new HashSet();
        this.zzn = new HashSet();
    }

    public final zzdbt zza(zza zza0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zza0, executor0);
        this.zzc.add(zzddo0);
        return this;
    }

    public final zzdbt zzb(zzcwl zzcwl0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcwl0, executor0);
        this.zzi.add(zzddo0);
        return this;
    }

    public final zzdbt zzc(zzcwy zzcwy0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcwy0, executor0);
        this.zzl.add(zzddo0);
        return this;
    }

    public final zzdbt zzd(zzcxc zzcxc0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcxc0, executor0);
        this.zzf.add(zzddo0);
        return this;
    }

    public final zzdbt zze(zzcwi zzcwi0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcwi0, executor0);
        this.zze.add(zzddo0);
        return this;
    }

    public final zzdbt zzf(zzcxw zzcxw0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcxw0, executor0);
        this.zzh.add(zzddo0);
        return this;
    }

    public final zzdbt zzg(zzcyh zzcyh0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcyh0, executor0);
        this.zzg.add(zzddo0);
        return this;
    }

    public final zzdbt zzh(zzo zzo0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzo0, executor0);
        this.zzn.add(zzddo0);
        return this;
    }

    public final zzdbt zzi(zzcyt zzcyt0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzcyt0, executor0);
        this.zzm.add(zzddo0);
        return this;
    }

    public final zzdbt zzj(zzczd zzczd0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzczd0, executor0);
        this.zzb.add(zzddo0);
        return this;
    }

    public final zzdbt zzk(AppEventListener appEventListener0, Executor executor0) {
        zzddo zzddo0 = new zzddo(appEventListener0, executor0);
        this.zzk.add(zzddo0);
        return this;
    }

    public final zzdbt zzl(zzddw zzddw0, Executor executor0) {
        zzddo zzddo0 = new zzddo(zzddw0, executor0);
        this.zzd.add(zzddo0);
        return this;
    }

    public final zzdbt zzm(zzeys zzeys0) {
        this.zzo = zzeys0;
        return this;
    }

    public final zzdbv zzn() {
        return new zzdbv(this, null);
    }
}


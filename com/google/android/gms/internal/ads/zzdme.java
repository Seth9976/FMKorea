package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdme extends zzbfk {
    private final String zza;
    private final zzdhx zzb;
    private final zzdic zzc;

    public zzdme(String s, zzdhx zzdhx0, zzdic zzdic0) {
        this.zza = s;
        this.zzb = zzdhx0;
        this.zzc = zzdic0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final double zzb() {
        return this.zzc.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final zzdq zzd() {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final zzbeo zze() {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final zzbew zzf() {
        return this.zzc.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final IObjectWrapper zzg() {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzl() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzm() {
        return this.zzc.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final String zzn() {
        return this.zzc.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final List zzo() {
        return this.zzc.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final void zzp() {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final void zzq(Bundle bundle0) {
        this.zzb.zzE(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final void zzr(Bundle bundle0) {
        this.zzb.zzJ(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzs(Bundle bundle0) {
        return this.zzb.zzW(bundle0);
    }
}


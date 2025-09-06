package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdmg extends zzbfm {
    private final String zza;
    private final zzdhx zzb;
    private final zzdic zzc;

    public zzdmg(String s, zzdhx zzdhx0, zzdic zzdic0) {
        this.zza = s;
        this.zzb = zzdhx0;
        this.zzc = zzdic0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final zzdq zzc() {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final zzbeo zzd() {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final zzbew zze() {
        return this.zzc.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzf() {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final String zzh() {
        return this.zzc.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final String zzl() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final List zzm() {
        return this.zzc.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final void zzn() {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(Bundle bundle0) {
        this.zzb.zzE(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(Bundle bundle0) {
        this.zzb.zzJ(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzq(Bundle bundle0) {
        return this.zzb.zzW(bundle0);
    }
}


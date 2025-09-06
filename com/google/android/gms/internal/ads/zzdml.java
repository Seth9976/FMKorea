package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdml extends zzbgs {
    private final String zza;
    private final zzdhx zzb;
    private final zzdic zzc;
    private final zzdrh zzd;

    public zzdml(String s, zzdhx zzdhx0, zzdic zzdic0, zzdrh zzdrh0) {
        this.zza = s;
        this.zzb = zzdhx0;
        this.zzc = zzdic0;
        this.zzd = zzdrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzA() {
        this.zzb.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzB(Bundle bundle0) {
        this.zzb.zzJ(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzC() {
        this.zzb.zzL();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzD(zzcs zzcs0) {
        this.zzb.zzM(zzcs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzE(zzdg zzdg0) {
        try {
            if(!zzdg0.zzf()) {
                this.zzd.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzb.zzN(zzdg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzF(zzbgq zzbgq0) {
        this.zzb.zzO(zzbgq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzG() {
        return this.zzb.zzT();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzH() {
        return !this.zzc.zzH().isEmpty() && this.zzc.zzk() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzI(Bundle bundle0) {
        return this.zzb.zzW(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final double zze() {
        return this.zzc.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzdn zzg() {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue() ? null : this.zzb.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzdq zzh() {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbeo zzi() {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbet zzj() {
        return this.zzb.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbew zzk() {
        return this.zzc.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzl() {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzn() {
        return this.zzc.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzo() {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzp() {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzq() {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzr() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzs() {
        return this.zzc.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzt() {
        return this.zzc.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final List zzu() {
        return this.zzc.zzG();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final List zzv() {
        return this.zzH() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzw() {
        this.zzb.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzx() {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzy(zzcw zzcw0) {
        this.zzb.zzA(zzcw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzz(Bundle bundle0) {
        this.zzb.zzE(bundle0);
    }
}


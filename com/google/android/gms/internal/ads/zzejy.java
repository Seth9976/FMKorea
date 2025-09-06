package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzejy extends zzbt {
    private final Context zza;
    private final zzbh zzb;
    private final zzfca zzc;
    private final zzcqc zzd;
    private final ViewGroup zze;
    private final zzdrh zzf;

    public zzejy(Context context0, zzbh zzbh0, zzfca zzfca0, zzcqc zzcqc0, zzdrh zzdrh0) {
        this.zza = context0;
        this.zzb = zzbh0;
        this.zzc = zzfca0;
        this.zzd = zzcqc0;
        this.zzf = zzdrh0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.removeAllViews();
        frameLayout0.addView(zzcqc0.zzc(), new ViewGroup.LayoutParams(-1, -1));
        frameLayout0.setMinimumHeight(this.zzg().zzc);
        frameLayout0.setMinimumWidth(this.zzg().zzf);
        this.zze = frameLayout0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        this.zzd.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
        zzcaa.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
        zzcaa.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
        zzcaa.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcqc zzcqc0 = this.zzd;
        if(zzcqc0 != null) {
            zzcqc0.zzh(this.zze, zzq0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
        zzekx zzekx0 = this.zzc.zzc;
        if(zzekx0 != null) {
            zzekx0.zzm(zzcb0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawb0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzci0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzdu0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbsl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
        zzcaa.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        zzcaa.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkq)).booleanValue()) {
            zzekx zzekx0 = this.zzc.zzc;
            if(zzekx0 != null) {
                try {
                    if(!zzdg0.zzf()) {
                        this.zzf.zze();
                    }
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
                }
                zzekx0.zzl(zzdg0);
            }
            return;
        }
        zzcaa.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbso0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvj0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzfl0) {
        zzcaa.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        zzcaa.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
        zzcaa.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        zzcaa.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        List list0 = Collections.singletonList(this.zzd.zze());
        return zzfce.zza(this.zza, list0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.zzc.zzn;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return this.zzd.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return this.zzd.zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return this.zzd.zzl() == null ? null : this.zzd.zzl().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return this.zzd.zzl() == null ? null : this.zzd.zzl().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}


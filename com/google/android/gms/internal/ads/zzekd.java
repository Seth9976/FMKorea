package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzekd extends zzbt implements zzcyy {
    private final Context zza;
    private final zzexq zzb;
    private final String zzc;
    private final zzekx zzd;
    private zzq zze;
    private final zzfby zzf;
    private final zzcag zzg;
    private final zzdrh zzh;
    private zzcqc zzi;

    public zzekd(Context context0, zzq zzq0, String s, zzexq zzexq0, zzekx zzekx0, zzcag zzcag0, zzdrh zzdrh0) {
        this.zza = context0;
        this.zzb = zzexq0;
        this.zze = zzq0;
        this.zzc = s;
        this.zzd = zzekx0;
        this.zzf = zzexq0.zzi();
        this.zzg = zzcag0;
        this.zzh = zzdrh0;
        zzexq0.zzp(this);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        synchronized(this) {
            Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                zzcqc0.zzg();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        synchronized(this) {
            if(!((Boolean)zzbdi.zzh.zze()).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzjY)).booleanValue() || this.zzg.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzke))))) {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                zzcqc0.zzm().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
        if(this.zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbe0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
        if(this.zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbh0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
            this.zzf.zzr(zzq0);
            this.zze = zzq0;
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                zzcqc0.zzh(this.zzb.zzd(), zzq0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
        if(this.zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcb0);
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
        synchronized(this) {
            if(this.zzh()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzy(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.zzb.zzq(zzbcp0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
        if(this.zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if(!zzdg0.zzf()) {
                this.zzh.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzd.zzl(zzdg0);
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
        synchronized(this) {
            if(this.zzh()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzF(zzfl0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        synchronized(this) {
            return this.zzb.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcyy
    public final void zza() {
        synchronized(this) {
            if(this.zzb.zzr()) {
                zzq zzq0 = this.zzf.zzg();
                if(this.zzi != null && this.zzi.zzf() != null && this.zzf.zzO()) {
                    List list0 = Collections.singletonList(this.zzi.zzf());
                    zzq0 = zzfce.zza(this.zza, list0);
                }
                this.zze(zzq0);
                try {
                    this.zzf(this.zzf.zze());
                }
                catch(RemoteException unused_ex) {
                    zzcaa.zzj("Failed to refresh the banner ad.");
                }
                return;
            }
            this.zzb.zzn();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        synchronized(this) {
            this.zze(this.zze);
            return this.zzf(zzl0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
        synchronized(this) {
            Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
            this.zzf.zzQ(zzcf0);
        }
    }

    static zzcqc zzb(zzekd zzekd0) {
        return zzekd0.zzi;
    }

    static void zzc(zzekd zzekd0, zzcqc zzcqc0) {
        zzekd0.zzi = zzcqc0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    private final void zze(zzq zzq0) {
        synchronized(this) {
            this.zzf.zzr(zzq0);
            this.zzf.zzw(this.zze.zzn);
        }
    }

    private final boolean zzf(zzl zzl0) {
        synchronized(this) {
            if(this.zzh()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzE(this.zza) && zzl0.zzs == null) {
                zzcaa.zzg("Failed to load the ad because app ID is missing.");
                zzekx zzekx0 = this.zzd;
                if(zzekx0 != null) {
                    zzekx0.zzbF(zzfdb.zzd(4, null, null));
                }
                return false;
            }
            zzfcv.zza(this.zza, zzl0.zzf);
            zzekc zzekc0 = new zzekc(this);
            return this.zzb.zzb(zzl0, this.zzc, null, zzekc0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        synchronized(this) {
            Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                List list0 = Collections.singletonList(zzcqc0.zze());
                return zzfce.zza(this.zza, list0);
            }
        }
        return this.zzf.zzg();
    }

    private final boolean zzh() {
        boolean z = ((Boolean)zzbdi.zzf.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue();
        return this.zzg.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzkd)))) || !z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.zzd.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.zzd.zzi();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        zzcqc zzcqc0;
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
                return null;
            }
            zzcqc0 = this.zzi;
            if(zzcqc0 == null) {
                return null;
            }
        }
        return zzcqc0.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        synchronized(this) {
            Preconditions.checkMainThread("getVideoController must be called from the main thread.");
            zzcqc zzcqc0 = this.zzi;
            return zzcqc0 != null ? zzcqc0.zzd() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        if(this.zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        synchronized(this) {
            zzcqc zzcqc0 = this.zzi;
            return zzcqc0 != null && zzcqc0.zzl() != null ? zzcqc0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        synchronized(this) {
            zzcqc zzcqc0 = this.zzi;
            return zzcqc0 != null && zzcqc0.zzl() != null ? zzcqc0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        synchronized(this) {
            if(!((Boolean)zzbdi.zze.zze()).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzjZ)).booleanValue() || this.zzg.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzke))))) {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                zzcqc0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        synchronized(this) {
            if(!((Boolean)zzbdi.zzg.zze()).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzka)).booleanValue() || this.zzg.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzke))))) {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            zzcqc zzcqc0 = this.zzi;
            if(zzcqc0 != null) {
                zzcqc0.zzm().zzb(null);
            }
        }
    }
}


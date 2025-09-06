package com.google.android.gms.internal.ads;

import android.app.Activity;
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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzelf extends zzbt {
    private final zzq zza;
    private final Context zzb;
    private final zzezh zzc;
    private final String zzd;
    private final zzcag zze;
    private final zzekx zzf;
    private final zzfah zzg;
    private final zzaqx zzh;
    private final zzdrh zzi;
    private zzdep zzj;
    private boolean zzk;

    public zzelf(Context context0, zzq zzq0, String s, zzezh zzezh0, zzekx zzekx0, zzfah zzfah0, zzcag zzcag0, zzaqx zzaqx0, zzdrh zzdrh0) {
        this.zza = zzq0;
        this.zzd = s;
        this.zzb = context0;
        this.zzc = zzezh0;
        this.zzf = zzekx0;
        this.zzg = zzfah0;
        this.zze = zzcag0;
        this.zzk = ((Boolean)zzba.zzc().zzb(zzbbr.zzaD)).booleanValue();
        this.zzh = zzaqx0;
        this.zzi = zzdrh0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            zzdep zzdep0 = this.zzj;
            if(zzdep0 != null) {
                zzdep0.zzm().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbh0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcb0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawb0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzci0) {
        this.zzf.zzn(zzci0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzdu0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zzk = z;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbsl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.zzc.zzi(zzbcp0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if(!zzdg0.zzf()) {
                this.zzi.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzf.zzl(zzdg0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbso0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvj0) {
        this.zzg.zzm(zzbvj0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzfl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzj == null) {
                zzcaa.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdb.zzd(9, null, null);
                this.zzf.zzp(zze0);
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzh.zzc().zzn(arr_stackTraceElement);
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zzj.zzc(this.zzk, activity0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        synchronized(this) {
            Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
            if(this.zzj == null) {
                zzcaa.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdb.zzd(9, null, null);
                this.zzf.zzp(zze0);
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzh.zzc().zzn(arr_stackTraceElement);
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        synchronized(this) {
            return this.zzc.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        synchronized(this) {
            Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
            return this.zze();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        synchronized(this) {
            boolean z = ((Boolean)zzbdi.zzi.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue();
            if(this.zze.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzkd)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzE(this.zzb) && zzl0.zzs == null) {
                zzcaa.zzg("Failed to load the ad because app ID is missing.");
                zzekx zzekx0 = this.zzf;
                if(zzekx0 != null) {
                    zzekx0.zzbF(zzfdb.zzd(4, null, null));
                }
                return false;
            }
            if(this.zze()) {
                return false;
            }
            zzfcv.zza(this.zzb, zzl0.zzf);
            this.zzj = null;
            zzeza zzeza0 = new zzeza(this.zza);
            zzele zzele0 = new zzele(this);
            return this.zzc.zzb(zzl0, this.zzd, zzeza0, zzele0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
    }

    static zzdep zzb(zzelf zzelf0) {
        return zzelf0.zzj;
    }

    static void zzc(zzelf zzelf0, zzdep zzdep0) {
        zzelf0.zzj = zzdep0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    private final boolean zze() {
        synchronized(this) {
            return this.zzj != null && !this.zzj.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.zzf.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.zzf.zzi();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        zzdep zzdep0;
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
                return null;
            }
            zzdep0 = this.zzj;
            if(zzdep0 == null) {
                return null;
            }
        }
        return zzdep0.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        synchronized(this) {
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        synchronized(this) {
            zzdep zzdep0 = this.zzj;
            return zzdep0 != null && zzdep0.zzl() != null ? zzdep0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        synchronized(this) {
            zzdep zzdep0 = this.zzj;
            return zzdep0 != null && zzdep0.zzl() != null ? zzdep0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzdep zzdep0 = this.zzj;
            if(zzdep0 != null) {
                zzdep0.zzm().zza(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
        this.zzf.zzk(zzbk0);
        this.zzaa(zzl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            zzdep zzdep0 = this.zzj;
            if(zzdep0 != null) {
                zzdep0.zzm().zzb(null);
            }
        }
    }
}


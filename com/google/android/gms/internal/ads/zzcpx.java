package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcpx extends zzavx {
    private final zzcpw zza;
    private final zzbu zzb;
    private final zzexc zzc;
    private boolean zzd;
    private final zzdrh zze;

    public zzcpx(zzcpw zzcpw0, zzbu zzbu0, zzexc zzexc0, zzdrh zzdrh0) {
        this.zzd = ((Boolean)zzba.zzc().zzb(zzbbr.zzaE)).booleanValue();
        this.zza = zzcpw0;
        this.zzb = zzbu0;
        this.zzc = zzexc0;
        this.zze = zzdrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final zzbu zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final zzdn zzf() {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue() ? null : this.zza.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzh(zzdg zzdg0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if(this.zzc != null) {
            try {
                if(!zzdg0.zzf()) {
                    this.zze.zze();
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
            }
            this.zzc.zzn(zzdg0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzi(IObjectWrapper iObjectWrapper0, zzawf zzawf0) {
        try {
            this.zzc.zzq(zzawf0);
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zza.zzd(activity0, zzawf0, this.zzd);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}


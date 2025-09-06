package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

public final class zzdnl extends VideoLifecycleCallbacks {
    private final zzdic zza;

    public zzdnl(zzdic zzdic0) {
        this.zza = zzdic0;
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdt zzdt0 = zzdnl.zza(this.zza);
        if(zzdt0 == null) {
            return;
        }
        try {
            zzdt0.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdt zzdt0 = zzdnl.zza(this.zza);
        if(zzdt0 == null) {
            return;
        }
        try {
            zzdt0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdt zzdt0 = zzdnl.zza(this.zza);
        if(zzdt0 == null) {
            return;
        }
        try {
            zzdt0.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    private static zzdt zza(zzdic zzdic0) {
        zzdq zzdq0 = zzdic0.zzj();
        if(zzdq0 == null) {
            return null;
        }
        try {
            return zzdq0.zzi();
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }
}


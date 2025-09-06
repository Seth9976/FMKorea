package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;

public final class zzbov extends zzdp {
    private final Object zza;
    private volatile zzdt zzb;

    public zzbov() {
        this.zza = new Object();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdt0) {
        synchronized(this.zza) {
            this.zzb = zzdt0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        throw new RemoteException();
    }
}


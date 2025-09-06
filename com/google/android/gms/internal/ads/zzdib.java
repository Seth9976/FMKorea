package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

public final class zzdib extends zzdp {
    private final Object zza;
    private final zzdq zzb;
    private final zzbou zzc;

    public zzdib(zzdq zzdq0, zzbou zzbou0) {
        this.zza = new Object();
        this.zzb = zzdq0;
        this.zzc = zzbou0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        return this.zzc == null ? 0.0f : this.zzc.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        return this.zzc == null ? 0.0f : this.zzc.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        synchronized(this.zza) {
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                return zzdq0.zzi();
            }
        }
        return null;
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
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                zzdq0.zzm(zzdt0);
            }
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


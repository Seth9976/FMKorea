package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzelb implements zza, zzddw {
    private zzbe zza;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zzbe zzbe0 = this.zza;
            if(zzbe0 != null) {
                try {
                    zzbe0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzk("Remote Exception at onAdClicked.", remoteException0);
                }
            }
        }
    }

    public final void zza(zzbe zzbe0) {
        synchronized(this) {
            this.zza = zzbe0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        synchronized(this) {
            zzbe zzbe0 = this.zza;
            if(zzbe0 != null) {
                try {
                    zzbe0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzk("Remote Exception at onPhysicalClick.", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        synchronized(this) {
        }
    }
}


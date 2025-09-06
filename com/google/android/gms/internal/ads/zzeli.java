package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzeli {
    private final zzeln zza;
    private final String zzb;
    private zzdn zzc;

    public zzeli(zzeln zzeln0, String s) {
        this.zza = zzeln0;
        this.zzb = s;
    }

    public final String zza() {
        synchronized(this) {
            String s = null;
            zzdn zzdn0 = this.zzc;
            if(zzdn0 != null) {
                try {
                    s = zzdn0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    public final String zzb() {
        synchronized(this) {
            String s = null;
            zzdn zzdn0 = this.zzc;
            if(zzdn0 != null) {
                try {
                    s = zzdn0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    static void zzc(zzeli zzeli0, zzdn zzdn0) {
        zzeli0.zzc = zzdn0;
    }

    public final void zzd(zzl zzl0, int v) {
        synchronized(this) {
            this.zzc = null;
            zzelo zzelo0 = new zzelo(v);
            zzelh zzelh0 = new zzelh(this);
            this.zza.zzb(zzl0, this.zzb, zzelo0, zzelh0);
        }
    }

    public final boolean zze() {
        synchronized(this) {
            return this.zza.zza();
        }
    }
}


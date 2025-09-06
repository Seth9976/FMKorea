package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

final class zzeir implements zzcxr {
    boolean zza;
    final zzedq zzb;
    final zzcas zzc;
    final zzeis zzd;

    zzeir(zzeis zzeis0, zzedq zzedq0, zzcas zzcas0) {
        this.zzd = zzeis0;
        this.zzb = zzedq0;
        this.zzc = zzcas0;
        super();
        this.zza = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxr
    public final void zza(int v) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            this.zze(new zze(v, "Error from: " + this.zzb.zza + ", code: " + v, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxr
    public final void zzb(zze zze0) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            this.zze(zze0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxr
    public final void zzc(int v, String s) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            if(s == null) {
                s = "Error from: " + this.zzb.zza + ", code: " + v;
            }
            this.zze(new zze(v, s, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxr
    public final void zzd() {
        synchronized(this) {
            this.zzc.zzc(null);
        }
    }

    private final void zze(zze zze0) {
        int v = 1;
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfn)).booleanValue()) {
                v = 3;
            }
            zzedr zzedr0 = new zzedr(v, zze0);
            this.zzc.zzd(zzedr0);
        }
    }
}


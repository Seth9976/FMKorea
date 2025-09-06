package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzdbe implements zzczd {
    private int zza;

    public zzdbe() {
        this.zza = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzbe)));
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbf)).booleanValue()) {
                this.zza = zzfbr0.zzb.zzb.zzc;
            }
        }
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.zza;
    }
}


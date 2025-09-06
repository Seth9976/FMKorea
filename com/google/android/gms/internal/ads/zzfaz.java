package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

final class zzfaz implements zzelm {
    final zzfbb zza;

    zzfaz(zzfbb zzfbb0) {
        this.zza = zzfbb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized(this.zza) {
            zzfbb.zzx(this.zza, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzfbb.zzx(this.zza, ((zzdnq)object0));
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
                zzfbt zzfbt0 = ((zzdnq)object0).zzd();
                zzfbt0.zza = zzfbb.zzw(this.zza);
            }
            zzfbb.zzv(this.zza).zzj();
        }
    }
}


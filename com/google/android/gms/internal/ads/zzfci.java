package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

final class zzfci implements zzfya {
    final zzcfi zza;
    final zzcob zzb;
    final zzfik zzc;
    final zzech zzd;

    zzfci(zzcfi zzcfi0, zzcob zzcob0, zzfik zzfik0, zzech zzech0) {
        this.zza = zzcfi0;
        this.zzb = zzcob0;
        this.zzc = zzfik0;
        this.zzd = zzech0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        if(!this.zza.zzD().zzaj) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
                this.zzb.zzi(((String)object0), this.zzc, zzay.zze());
                return;
            }
            this.zzc.zzc(((String)object0), null);
            return;
        }
        zzecj zzecj0 = new zzecj(zzt.zzB().currentTimeMillis(), this.zza.zzP().zzb, ((String)object0), (zzt.zzo().zzx(this.zza.getContext()) || ((Boolean)zzba.zzc().zzb(zzbbr.zzgg)).booleanValue() && this.zza.zzD().zzT ? 2 : 1));
        this.zzd.zzd(zzecj0);
    }
}


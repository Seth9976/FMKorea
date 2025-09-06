package com.google.android.gms.internal.ads;

final class zzfqc extends zzfpy {
    final zzfqi zza;

    zzfqc(zzfqi zzfqi0) {
        this.zza = zzfqi0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        synchronized(zzfqi.zzg(this.zza)) {
            if(zzfqi.zzi(this.zza).get() > 0 && zzfqi.zzi(this.zza).decrementAndGet() > 0) {
                zzfqi.zzf(this.zza).zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfqi zzfqi0 = this.zza;
            if(zzfqi.zzd(zzfqi0) != null) {
                zzfqi.zzf(zzfqi0).zzc("Unbind from service.", new Object[0]);
                zzfqi.zza(this.zza).unbindService(zzfqi.zzb(this.zza));
                zzfqi.zzl(this.zza, false);
                zzfqi.zzm(this.zza, null);
                zzfqi.zzk(this.zza, null);
            }
            zzfqi.zzo(this.zza);
        }
    }
}


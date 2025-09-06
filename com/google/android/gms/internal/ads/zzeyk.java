package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzeyk implements zzeyv {
    private zzcvp zza;

    public final zzcvp zza() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final d zzb(zzeyw zzeyw0, zzeyu zzeyu0, zzcvp zzcvp0) {
        synchronized(this) {
            this.zza = zzcvp0 == null ? ((zzcvp)zzeyu0.zza(zzeyw0.zzb).zzh()) : zzcvp0;
            zzctl zzctl0 = this.zza.zzb();
            return zzctl0.zzi(zzctl0.zzj());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final d zzc(zzeyw zzeyw0, zzeyu zzeyu0, Object object0) {
        return this.zzb(zzeyw0, zzeyu0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final Object zzd() {
        return this.zza();
    }
}


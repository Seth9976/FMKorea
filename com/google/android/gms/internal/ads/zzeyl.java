package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzeyl implements zzeyv {
    private final zzeyv zza;
    private zzcvp zzb;

    public zzeyl(zzeyv zzeyv0) {
        this.zza = zzeyv0;
    }

    public final zzcvp zza() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final d zzb(zzeyw zzeyw0, zzeyu zzeyu0, zzcvp zzcvp0) {
        synchronized(this) {
            this.zzb = zzcvp0;
            if(zzeyw0.zza != null) {
                zzctl zzctl0 = zzcvp0.zzb();
                return zzctl0.zzi(zzctl0.zzk(zzfye.zzh(zzeyw0.zza)));
            }
            return ((zzeyk)this.zza).zzb(zzeyw0, zzeyu0, zzcvp0);
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


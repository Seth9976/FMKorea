package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;

public final class zzexw implements zzeyv {
    private zzcvp zza;
    private final Executor zzb;

    public zzexw() {
        this.zzb = zzfyu.zzb();
    }

    public final zzcvp zza() {
        return this.zza;
    }

    public final d zzb(zzeyw zzeyw0, zzeyu zzeyu0, zzcvp zzcvp0) {
        zzcvo zzcvo0 = zzeyu0.zza(zzeyw0.zzb);
        zzcvo0.zzb(new zzeyz(true));
        zzcvp zzcvp1 = (zzcvp)zzcvo0.zzh();
        this.zza = zzcvp1;
        zzctl zzctl0 = zzcvp1.zzb();
        zzfdw zzfdw0 = new zzfdw();
        return zzfye.zzm(zzfye.zzn(zzfxv.zzu(zzctl0.zzj()), new zzexu(this, zzfdw0, zzctl0), this.zzb), new zzexv(zzfdw0), this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final d zzc(zzeyw zzeyw0, zzeyu zzeyu0, Object object0) {
        return this.zzb(zzeyw0, zzeyu0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final Object zzd() {
        return this.zza;
    }
}


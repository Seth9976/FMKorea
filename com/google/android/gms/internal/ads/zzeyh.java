package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;

public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfya zzc;

    public zzeyh(zzfdn zzfdn0, Executor executor0) {
        this.zzc = new zzeyf(this);
        this.zza = zzfdn0;
        this.zzb = executor0;
    }

    // 检测为 Lambda 实现
    final d zza(zzcvp zzcvp0, zzeyq zzeyq0) [...]

    public final d zzb(zzeyw zzeyw0, zzeyu zzeyu0, zzcvp zzcvp0) {
        d d0 = zzfye.zzn(zzfxv.zzu(new zzeyr(this.zza, zzcvp0, this.zzb).zzc()), (zzeyq zzeyq0) -> {
            zzfdx zzfdx0 = zzeyq0.zzb;
            zzbun zzbun0 = zzeyq0.zza;
            zzfdw zzfdw0 = this.zza.zzb(zzfdx0);
            if(zzfdw0 != null && zzbun0 != null) {
                zzfye.zzr(zzcvp0.zzb().zzh(zzbun0), this.zzc, this.zzb);
            }
            return zzfye.zzh(new zzeyg(zzfdx0, zzbun0, zzfdw0));
        }, this.zzb);
        zzeye zzeye0 = new zzeye(this);
        return zzfye.zze(d0, Exception.class, zzeye0, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final d zzc(zzeyw zzeyw0, zzeyu zzeyu0, Object object0) {
        return this.zzb(zzeyw0, zzeyu0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final Object zzd() {
        return null;
    }
}


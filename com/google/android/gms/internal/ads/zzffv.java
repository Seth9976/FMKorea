package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzffv {
    final zzffw zza;
    private final Object zzb;
    private final String zzc;
    private final d zzd;
    private final List zze;
    private final d zzf;

    private zzffv(zzffw zzffw0, Object object0, String s, d d0, List list0, d d1) {
        this.zza = zzffw0;
        super();
        this.zzb = object0;
        this.zzc = s;
        this.zzd = d0;
        this.zze = list0;
        this.zzf = d1;
    }

    zzffv(zzffw zzffw0, Object object0, String s, d d0, List list0, d d1, zzffu zzffu0) {
        this(zzffw0, object0, null, d0, list0, d1);
    }

    public final zzffj zza() {
        String s = this.zzc == null ? this.zza.zzf(this.zzb) : this.zzc;
        zzffj zzffj0 = new zzffj(this.zzb, s, this.zzf);
        this.zza.zzd.zza(zzffj0);
        zzffp zzffp0 = new zzffp(this, zzffj0);
        this.zzd.addListener(zzffp0, zzcan.zzf);
        zzfye.zzr(zzffj0, new zzfft(this, zzffj0), zzcan.zzf);
        return zzffj0;
    }

    public final zzffv zzb(Object object0) {
        zzffj zzffj0 = this.zza();
        return this.zza.zzb(object0, zzffj0);
    }

    public final zzffv zzc(Class class0, zzfxl zzfxl0) {
        d d0 = zzfye.zzf(this.zzf, class0, zzfxl0, zzffw.zze(this.zza));
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d0);
    }

    public final zzffv zzd(d d0) {
        return this.zzg(new zzffq(d0), zzcan.zzf);
    }

    public final zzffv zze(zzffh zzffh0) {
        return this.zzf(new zzffs(zzffh0));
    }

    public final zzffv zzf(zzfxl zzfxl0) {
        return this.zzg(zzfxl0, zzffw.zze(this.zza));
    }

    public final zzffv zzg(zzfxl zzfxl0, Executor executor0) {
        d d0 = zzfye.zzn(this.zzf, zzfxl0, executor0);
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d0);
    }

    public final zzffv zzh(String s) {
        return new zzffv(this.zza, this.zzb, s, this.zzd, this.zze, this.zzf);
    }

    public final zzffv zzi(long v, TimeUnit timeUnit0) {
        ScheduledExecutorService scheduledExecutorService0 = zzffw.zzg(this.zza);
        d d0 = zzfye.zzo(this.zzf, v, timeUnit0, scheduledExecutorService0);
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d0);
    }
}


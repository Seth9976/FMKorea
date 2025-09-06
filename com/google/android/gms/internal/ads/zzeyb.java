package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

public final class zzeyb implements zzeyv {
    private final zzeyv zza;
    private final zzeyv zzb;
    private final zzfej zzc;
    private final String zzd;
    private zzcvp zze;
    private final Executor zzf;

    public zzeyb(zzeyv zzeyv0, zzeyv zzeyv1, zzfej zzfej0, String s, Executor executor0) {
        this.zza = zzeyv0;
        this.zzb = zzeyv1;
        this.zzc = zzfej0;
        this.zzd = s;
        this.zzf = executor0;
    }

    public final zzcvp zza() {
        synchronized(this) {
        }
        return this.zze;
    }

    // 检测为 Lambda 实现
    final d zzb(zzeyw zzeyw0, zzeya zzeya0, zzeyu zzeyu0, zzcvp zzcvp0, zzeyg zzeyg0) [...]

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final d zzc(zzeyw zzeyw0, zzeyu zzeyu0, Object object0) {
        return this.zzf(zzeyw0, zzeyu0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeyv
    public final Object zzd() {
        return this.zza();
    }

    // 检测为 Lambda 实现
    final d zze(zzfeg zzfeg0) [...]

    public final d zzf(zzeyw zzeyw0, zzeyu zzeyu0, zzcvp zzcvp0) {
        synchronized(this) {
            zzcvo zzcvo0 = zzeyu0.zza(zzeyw0.zzb);
            zzcvo0.zza(new zzeyc(this.zzd));
            Object object0 = zzcvo0.zzh();
            ((zzcvp)object0).zzg();
            ((zzcvp)object0).zzg();
            zzl zzl0 = ((zzcvp)object0).zzg().zzd;
            if(zzl0.zzs == null && zzl0.zzx == null) {
                zzfca zzfca0 = ((zzcvp)object0).zzg();
                zzeya zzeya0 = new zzeya(zzeyu0, zzeyw0, zzfca0.zzd, zzfca0.zzf, this.zzf, zzfca0.zzj, null);
                return zzfye.zzn(zzfxv.zzu(((zzeyh)this.zzb).zzb(zzeyw0, zzeyu0, ((zzcvp)object0))), (zzeyg zzeyg0) -> {
                    if(zzeyg0 != null) {
                        zzeya zzeya1 = new zzeya(zzeya0.zza, zzeya0.zzb, zzeya0.zzc, zzeya0.zzd, zzeya0.zze, zzeya0.zzf, zzeyg0.zza);
                        if(zzeyg0.zzc != null) {
                            this.zze = null;
                            this.zzc.zze(zzeya1);
                            return this.zzg(zzeyg0.zzc, zzeyw0);
                        }
                        d d0 = this.zzc.zza(zzeya1);
                        if(d0 != null) {
                            this.zze = null;
                            return zzfye.zzn(d0, (zzfeg zzfeg0) -> {
                                if(zzfeg0 != null && zzfeg0.zza != null) {
                                    zzfei zzfei0 = zzfeg0.zzb;
                                    if(zzfei0 != null) {
                                        zzaxt zzaxt0 = zzaxz.zza();
                                        zzaxr zzaxr0 = zzaxs.zza();
                                        zzaxr0.zzd(2);
                                        zzaxr0.zzb(zzaxw.zzd());
                                        zzaxt0.zza(zzaxr0);
                                        zzaxz zzaxz0 = (zzaxz)zzaxt0.zzal();
                                        zzfeg0.zza.zza.zzb().zzc().zzm(zzaxz0);
                                        return this.zzg(zzfeg0.zza, ((zzeya)zzfei0).zzb);
                                    }
                                }
                                throw new zzdve(1, "Empty prefetch");
                            }, this.zzf);
                        }
                        this.zzc.zze(zzeya1);
                        zzeyw0 = new zzeyw(zzeyw0.zzb, zzeyg0.zzb);
                    }
                    d d1 = ((zzeyl)this.zza).zzb(zzeyw0, zzeyu0, ((zzcvp)object0));
                    this.zze = ((zzcvp)object0);
                    return d1;
                }, this.zzf);
            }
            this.zze = (zzcvp)object0;
            return ((zzeyl)this.zza).zzb(zzeyw0, zzeyu0, ((zzcvp)object0));
        }
    }

    private final d zzg(zzfdw zzfdw0, zzeyw zzeyw0) {
        zzcvp zzcvp0 = zzfdw0.zza;
        this.zze = zzcvp0;
        if(zzfdw0.zzc != null) {
            if(zzcvp0.zzf() != null) {
                zzfdw0.zzc.zzo().zzl(zzfdw0.zza.zzf());
            }
            return zzfye.zzh(zzfdw0.zzc);
        }
        zzcvp0.zzb().zzl(zzfdw0.zzb);
        return ((zzeyl)this.zza).zzb(zzeyw0, null, zzfdw0.zza);
    }
}


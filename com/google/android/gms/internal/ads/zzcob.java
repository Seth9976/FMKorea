package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcob {
    private final Context zza;
    private final zzg zzb;
    private final zzedj zzc;
    private final zzdor zzd;
    private final zzfyo zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private zzbth zzh;

    zzcob(Context context0, zzg zzg0, zzedj zzedj0, zzdor zzdor0, zzfyo zzfyo0, zzfyo zzfyo1, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = context0;
        this.zzb = zzg0;
        this.zzc = zzedj0;
        this.zzd = zzdor0;
        this.zze = zzfyo0;
        this.zzf = zzfyo1;
        this.zzg = scheduledExecutorService0;
    }

    static Context zza(zzcob zzcob0) {
        return zzcob0.zza;
    }

    static zzbth zzb(zzcob zzcob0) {
        return zzcob0.zzh;
    }

    public final d zzc(String s, Random random0) {
        d d0 = this.zzj(s, this.zzd.zza(), random0);
        zzcnw zzcnw0 = new zzcnw(s);
        return zzfye.zzf(d0, Throwable.class, zzcnw0, this.zze);
    }

    // 检测为 Lambda 实现
    final d zzd(Uri.Builder uri$Builder0, String s, InputEvent inputEvent0, Integer integer0) [...]

    // 检测为 Lambda 实现
    final d zze(Uri.Builder uri$Builder0, Throwable throwable0) [...]

    static zzfyo zzf(zzcob zzcob0) {
        return zzcob0.zze;
    }

    static void zzg(zzcob zzcob0, zzbth zzbth0) {
        zzcob0.zzh = zzbth0;
    }

    // 检测为 Lambda 实现
    final void zzh(Throwable throwable0) [...]

    public final void zzi(String s, zzfik zzfik0, Random random0) {
        zzfye.zzr(zzfye.zzo(this.zzj(s, this.zzd.zza(), random0), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzjv)))))), TimeUnit.MILLISECONDS, this.zzg), new zzcoa(this, zzfik0, s), this.zze);
    }

    private final d zzj(String s, InputEvent inputEvent0, Random random0) {
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        if(s.contains(((CharSequence)zzba.zzc().zzb(zzbbr.zzjp))) && !this.zzb.zzQ()) {
            String s1 = String.valueOf(random0.nextInt(0x7FFFFFFF));
            uri$Builder0.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjq)), s1);
            if(inputEvent0 == null) {
                uri$Builder0.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjr)), "11");
                return zzfye.zzh(uri$Builder0.toString());
            }
            d d0 = zzfye.zzn(zzfxv.zzu(this.zzc.zza()), (Integer integer0) -> {
                zzedj zzedj0 = this.zzc;
                if(((int)integer0) == 1) {
                    Uri.Builder uri$Builder1 = uri$Builder0.build().buildUpon();
                    uri$Builder1.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjs)), "1");
                    uri$Builder1.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjr)), "12");
                    if(s.contains(((CharSequence)zzba.zzc().zzb(zzbbr.zzjt)))) {
                        uri$Builder1.authority(((String)zzba.zzc().zzb(zzbbr.zzju)));
                    }
                    return zzfye.zzn(zzfxv.zzu(zzedj0.zzb(uri$Builder1.build(), inputEvent0)), new zzcnx(uri$Builder0), this.zzf);
                }
                uri$Builder0.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjr)), "10");
                return zzfye.zzh(uri$Builder0.toString());
            }, this.zzf);
            zzcnv zzcnv0 = (Throwable throwable0) -> {
                zzcnt zzcnt0 = () -> {
                    zzbth zzbth0 = zzbtf.zza(this.zza);
                    this.zzh = zzbth0;
                    zzbth0.zzf(throwable0, "AttributionReporting");
                };
                this.zze.zza(zzcnt0);
                uri$Builder0.appendQueryParameter(((String)zzba.zzc().zzb(zzbbr.zzjr)), "9");
                return zzfye.zzh(uri$Builder0.toString());
            };
            return zzfye.zzf(d0, Throwable.class, zzcnv0, this.zze);
        }
        return zzfye.zzh(s);
    }
}


package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzete implements zzesj {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbza zzg;

    zzete(zzbza zzbza0, Context context0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, int v, boolean z, boolean z1) {
        this.zzg = zzbza0;
        this.zza = context0;
        this.zzb = scheduledExecutorService0;
        this.zzc = executor0;
        this.zzd = v;
        this.zze = z;
        this.zzf = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 40;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaS)).booleanValue()) {
            zzfxv zzfxv0 = (zzfxv)zzfye.zzo(zzfye.zzm(zzfxv.zzu(this.zzg.zza(this.zza, this.zzd)), (Info advertisingIdClient$Info0) -> {
                zzfof zzfof0 = new zzfof();
                if(!this.zze && ((Boolean)zzba.zzc().zzb(zzbbr.zzcN)).booleanValue() || this.zze && ((Boolean)zzba.zzc().zzb(zzbbr.zzcO)).booleanValue()) {
                    try {
                        zzfoi zzfoi0 = zzfoi.zzj(this.zza);
                        advertisingIdClient$Info0.getClass();
                        String s = advertisingIdClient$Info0.getId();
                        s.getClass();
                        return new zzetf(advertisingIdClient$Info0, null, zzfoi0.zzi(s, "com.fmkorea.m.fmk", ((long)(((Long)zzba.zzc().zzb(zzbbr.zzcU)))), this.zzf));
                    }
                    catch(IOException | IllegalArgumentException iOException0) {
                        zzt.zzo().zzu(iOException0, "AdIdInfoSignalSource.getPaidV1");
                        return new zzetf(advertisingIdClient$Info0, null, new zzfof());
                    }
                }
                return new zzetf(advertisingIdClient$Info0, null, zzfof0);
            }, this.zzc), ((long)(((Long)zzba.zzc().zzb(zzbbr.zzaT)))), TimeUnit.MILLISECONDS, this.zzb);
            zzetd zzetd0 = (Throwable throwable0) -> {
                ContentResolver contentResolver0 = this.zza.getContentResolver();
                return contentResolver0 == null ? new zzetf(null, null, new zzfof()) : new zzetf(null, Settings.Secure.getString(contentResolver0, "android_id"), new zzfof());
            };
            return zzfye.zze(zzfxv0, Throwable.class, zzetd0, this.zzc);
        }
        return zzfye.zzg(new Exception("Did not ad Ad ID into query param."));
    }

    // 检测为 Lambda 实现
    final zzetf zzc(Info advertisingIdClient$Info0) [...]

    // 检测为 Lambda 实现
    final zzetf zzd(Throwable throwable0) [...]
}


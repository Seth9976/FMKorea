package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzehh implements zzfxl {
    private final zzfge zza;
    private final zzcwk zzb;
    private final zzfig zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcsh zzg;
    private final zzehc zzh;
    private final zzeds zzi;
    private final Context zzj;
    private final zzfhr zzk;

    zzehh(Context context0, zzfge zzfge0, zzehc zzehc0, zzcwk zzcwk0, zzfig zzfig0, zzfik zzfik0, zzcsh zzcsh0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, zzeds zzeds0, zzfhr zzfhr0) {
        this.zzj = context0;
        this.zza = zzfge0;
        this.zzh = zzehc0;
        this.zzb = zzcwk0;
        this.zzc = zzfig0;
        this.zzd = zzfik0;
        this.zzg = zzcsh0;
        this.zze = executor0;
        this.zzf = scheduledExecutorService0;
        this.zzi = zzeds0;
        this.zzk = zzfhr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        String s = "No fill.";
        String s1 = ((Boolean)zzba.zzc().zzb(zzbbr.zzfp)).booleanValue() ? "No fill." : "No ad config.";
        int v = ((zzfbr)object0).zzb.zzb.zze;
        if(v == 0) {
            s = s1;
        }
        else if(v < 200 || v >= 300) {
            s = v < 300 || v >= 400 ? "Received error HTTP response code: " + v : "No location header to follow redirect or too many redirects.";
        }
        else if(((Boolean)zzba.zzc().zzb(zzbbr.zzfo)).booleanValue()) {
            s = s1;
        }
        zzfbi zzfbi0 = ((zzfbr)object0).zzb.zzb;
        zzfbg zzfbg0 = zzfbi0.zzi;
        if(zzfbg0 != null) {
            s = zzfbg0.zza();
        }
        this.zzi.zzh(zzfbi0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhW)).booleanValue()) {
            int v1 = ((zzfbr)object0).zzb.zzb.zze;
            if(v1 != 0 && (v1 < 200 || v1 >= 300)) {
                return zzfye.zzg(new zzehf(3, s));
            }
        }
        zzffj zzffj0 = zzffo.zzc(zzfye.zzg(new zzehf(3, s)), zzffy.zzn, this.zza).zza();
        String s2 = ((zzfbr)object0).zzb.zzb.zzo;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() || TextUtils.isEmpty(s2)) {
            Iterator iterator0 = ((zzfbr)object0).zzb.zza.iterator();
        label_29:
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzfbe zzfbe0 = (zzfbe)object1;
                this.zzi.zzd(zzfbe0);
                for(Object object2: zzfbe0.zza) {
                    zzedn zzedn0 = this.zzg.zza(zzfbe0.zzb, ((String)object2));
                    if(zzedn0 != null && zzedn0.zzb(((zzfbr)object0), zzfbe0)) {
                        continue label_29;
                    }
                    if(false) {
                        break;
                    }
                }
                zze zze0 = zzfdb.zzd(1, null, null);
                this.zzi.zze(zzfbe0, 0L, zze0);
            }
        }
        else {
            this.zzi.zzg(s2, ((zzfbr)object0).zzb.zza);
        }
        zzcof zzcof0 = new zzcof(((zzfbr)object0), this.zzd, this.zzc);
        this.zzb.zzo(zzcof0, this.zze);
        int v2 = 0;
        for(Object object3: ((zzfbr)object0).zzb.zza) {
            zzfbe zzfbe1 = (zzfbe)object3;
            for(Object object4: zzfbe1.zza) {
                String s3 = (String)object4;
                zzedn zzedn1 = this.zzg.zza(zzfbe1.zzb, s3);
                if(zzedn1 != null && zzedn1.zzb(((zzfbr)object0), zzfbe1)) {
                    zzffv zzffv0 = this.zza.zzb(zzffy.zzo, zzffj0).zzh("render-config-" + v2 + "-" + s3);
                    zzehg zzehg0 = (Throwable throwable0) -> {
                        zzfhg zzfhg0 = zzfhf.zza(this.zzj, 12);
                        zzfhg0.zzd(zzfbe1.zzF);
                        zzfhg0.zzh();
                        d d0 = zzfye.zzo(zzedn1.zza(((zzfbr)object0), zzfbe1), ((long)zzfbe1.zzS), TimeUnit.MILLISECONDS, this.zzf);
                        this.zzh.zze(((zzfbr)object0), zzfbe1, d0, this.zzc);
                        zzfhq.zza(d0, this.zzk, zzfhg0);
                        return d0;
                    };
                    zzffj0 = zzffv0.zzc(Throwable.class, zzehg0).zza();
                    break;
                }
                if(false) {
                    break;
                }
            }
            ++v2;
        }
        return zzffj0;
    }

    // 检测为 Lambda 实现
    final d zzb(zzfbe zzfbe0, zzfbr zzfbr0, zzedn zzedn0, Throwable throwable0) [...]
}


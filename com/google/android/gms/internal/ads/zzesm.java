package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzesm {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhr zzd;
    private final zzdrh zze;
    private long zzf;
    private int zzg;

    public zzesm(Context context0, Executor executor0, Set set0, zzfhr zzfhr0, zzdrh zzdrh0) {
        this.zzf = 0L;
        this.zzg = 0;
        this.zza = context0;
        this.zzc = executor0;
        this.zzb = set0;
        this.zzd = zzfhr0;
        this.zze = zzdrh0;
    }

    public final d zza(Object object0) {
        zzfhg zzfhg0 = zzfhf.zza(this.zza, 8);
        zzfhg0.zzh();
        ArrayList arrayList0 = new ArrayList(this.zzb.size());
        List list0 = new ArrayList();
        zzbbj zzbbj0 = zzbbr.zzkz;
        if(!((String)zzba.zzc().zzb(zzbbj0)).isEmpty()) {
            list0 = Arrays.asList(((String)zzba.zzc().zzb(zzbbj0)).split(","));
        }
        this.zzf = zzt.zzB().elapsedRealtime();
        for(Object object1: this.zzb) {
            zzesj zzesj0 = (zzesj)object1;
            if(!list0.contains(String.valueOf(zzesj0.zza()))) {
                long v = zzt.zzB().elapsedRealtime();
                d d0 = zzesj0.zzb();
                d0.addListener(() -> {
                    long v1 = zzt.zzB().elapsedRealtime() - v;
                    if(((Boolean)zzbdn.zza.zze()).booleanValue()) {
                        zze.zza(("Signal runtime (ms) : " + zzfrx.zzc(zzesj0.getClass().getCanonicalName()) + " = " + v1));
                    }
                    if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbX)).booleanValue()) {
                        return;
                    }
                    zzdrg zzdrg0 = this.zze.zza();
                    zzdrg0.zzb("action", "lat_ms");
                    zzdrg0.zzb("lat_grp", "sig_lat_grp");
                    zzdrg0.zzb("lat_id", String.valueOf(zzesj0.zza()));
                    zzdrg0.zzb("clat_ms", String.valueOf(v1));
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzbY)).booleanValue()) {
                        synchronized(this) {
                            ++this.zzg;
                        }
                        zzdrg0.zzb("seq_num", zzt.zzo().zzg().zzd());
                        synchronized(this) {
                            if(this.zzg == this.zzb.size() && this.zzf != 0L) {
                                this.zzg = 0;
                                String s = String.valueOf(zzt.zzB().elapsedRealtime() - this.zzf);
                                if(zzesj0.zza() <= 39 || zzesj0.zza() >= 52) {
                                    zzdrg0.zzb("lat_clsg", s);
                                }
                                else {
                                    zzdrg0.zzb("lat_gmssg", s);
                                }
                            }
                        }
                    }
                    zzdrg0.zzh();
                }, zzcan.zzf);
                arrayList0.add(d0);
            }
        }
        d d1 = zzfye.zzb(arrayList0).zza(new zzesl(arrayList0, object0), this.zzc);
        if(zzfhu.zza()) {
            zzfhq.zza(d1, this.zzd, zzfhg0);
        }
        return d1;
    }

    // 检测为 Lambda 实现
    public final void zzb(long v, zzesj zzesj0) [...]
}


package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public abstract class zzbyg {
    static zzbyg zza;

    abstract zzbxd zza();

    abstract zzbxh zzb();

    abstract zzbyk zzc();

    public static zzbyg zzd(Context context0) {
        synchronized(zzbyg.class) {
            zzbyg zzbyg0 = zzbyg.zza;
            if(zzbyg0 != null) {
                return zzbyg0;
            }
            Context context1 = context0.getApplicationContext();
            zzbbr.zza(context1);
            zzg zzg0 = zzt.zzo().zzh();
            zzg0.zzr(context1);
            zzbxk zzbxk0 = new zzbxk(null);
            zzbxk0.zzb(context1);
            zzbxk0.zzc(zzt.zzB());
            zzbxk0.zza(zzg0);
            zzbxk0.zzd(zzt.zzn());
            zzbyg zzbyg1 = zzbxk0.zze();
            zzbyg.zza = zzbyg1;
            zzbyg1.zza().zza();
            zzbyg.zza.zzb().zzc();
            zzbyk zzbyk0 = zzbyg.zza.zzc();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
                Map map0 = zzs.zzs(((String)zzba.zzc().zzb(zzbbr.zzat)));
                for(Object object0: map0.keySet()) {
                    zzbyk0.zzc(((String)object0));
                }
                zzbyk0.zzd(new zzbyi(zzbyk0, map0));
            }
            return zzbyg.zza;
        }
    }
}


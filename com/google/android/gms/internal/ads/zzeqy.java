package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;

public final class zzeqy implements zzesj {
    private final Context zza;
    private final zzfyo zzb;
    private final zzfca zzc;
    private final zzcag zzd;

    zzeqy(Context context0, zzfyo zzfyo0, zzfca zzfca0, zzcag zzcag0) {
        this.zza = context0;
        this.zzb = zzfyo0;
        this.zzc = zzfca0;
        this.zzd = zzcag0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 53;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeqx zzeqx0 = () -> {
            boolean z3;
            zzfof zzfof2;
            boolean z2;
            try {
                Context context0 = this.zza;
                boolean z = this.zzc.zzb();
                zzfof zzfof0 = new zzfof();
                zzfof zzfof1 = new zzfof();
                boolean z1 = true;
                if(z && !((Boolean)zzba.zzc().zzb(zzbbr.zzcK)).booleanValue()) {
                    return new zzeqz(true);
                }
                if(!z && ((Boolean)zzba.zzc().zzb(zzbbr.zzcG)).booleanValue() || z && ((Boolean)zzba.zzc().zzb(zzbbr.zzcI)).booleanValue()) {
                    zzfof0 = zzfoi.zzj(context0).zzh(((long)(((Long)zzba.zzc().zzb(zzbbr.zzcU)))), zzt.zzo().zzh().zzQ());
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzcR)).booleanValue() && this.zzd.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzcQ))))) {
                    zzfoj.zzi(context0).zzj();
                }
                if((z || !((Boolean)zzba.zzc().zzb(zzbbr.zzcH)).booleanValue()) && (!z || !((Boolean)zzba.zzc().zzb(zzbbr.zzcJ)).booleanValue())) {
                    zzfof2 = zzfof1;
                    z3 = true;
                    z2 = true;
                }
                else {
                    zzfoj zzfoj0 = zzfoj.zzi(context0);
                    if(this.zzd.zzc >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzcQ))))) {
                        zzfof1 = zzfoj0.zzh(((long)(((Long)zzba.zzc().zzb(zzbbr.zzcV)))), zzt.zzo().zzh().zzQ());
                        z1 = zzfoj0.zzo();
                    }
                    z2 = zzfoj0.zzp();
                    zzfof2 = zzfof1;
                    z3 = z1;
                }
                return new zzeqz(zzfof0, zzfof2, z3, z2, z);
            }
            catch(IOException iOException0) {
            }
            zzt.zzo().zzu(iOException0, "PerAppIdSignal");
            return new zzeqz(this.zzc.zzb());
        };
        return this.zzb.zzb(zzeqx0);
    }

    // 检测为 Lambda 实现
    final zzeqz zzc() [...]
}


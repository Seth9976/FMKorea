package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import jeb.synthetic.FIN;

final class zzbmf implements zzbir {
    final long zza;
    final zzbmt zzb;
    final zzblp zzc;
    final zzbmu zzd;

    zzbmf(zzbmu zzbmu0, long v, zzbmt zzbmt0, zzblp zzblp0) {
        this.zzd = zzbmu0;
        this.zza = v;
        this.zzb = zzbmt0;
        this.zzc = zzblp0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzbmv zzbmv0 = (zzbmv)object0;
        zze.zza(("onGmsg /jsLoaded. JsLoaded latency is " + (zzt.zzB().currentTimeMillis() - this.zza) + " ms."));
        Object object1 = zzbmu.zzf(this.zzd);
        __monitor_enter(object1);
        int v = FIN.finallyOpen$NT();
        switch(this.zzb.zze()) {
            case -1: 
            case 1: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object1);
                FIN.finallyCodeEnd$NT(v);
                return;
            }
            default: {
                zzbmu.zzh(this.zzd, 0);
                this.zzc.zzq("/log", zzbiq.zzg);
                this.zzc.zzq("/result", zzbiq.zzo);
                this.zzb.zzh(this.zzc);
                zzbmu.zzg(this.zzd, this.zzb);
                zze.zza("Successfully loaded JS Engine.");
                FIN.finallyExec$NT(v);
            }
        }
    }
}


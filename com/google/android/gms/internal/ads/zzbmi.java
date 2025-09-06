package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import jeb.synthetic.FIN;

final class zzbmi implements Runnable {
    final zzbmt zza;
    final zzblp zzb;
    final ArrayList zzc;
    final long zzd;
    final zzbmu zze;

    zzbmi(zzbmu zzbmu0, zzbmt zzbmt0, zzblp zzblp0, ArrayList arrayList0, long v) {
        this.zze = zzbmu0;
        this.zza = zzbmt0;
        this.zzb = zzblp0;
        this.zzc = arrayList0;
        this.zzd = v;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.zze.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        switch(this.zza.zze()) {
            case -1: 
            case 1: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                return;
            }
            default: {
                this.zza.zzg();
                zzbmh zzbmh0 = new zzbmh(this.zzb);
                zzcan.zze.execute(zzbmh0);
                zze.zza(("Could not finish the full JS engine loading in " + zzba.zzc().zzb(zzbbr.zzd) + " ms. JS engine session reference status(fullLoadTimeout) is " + this.zza.zze() + ". Update status(fullLoadTimeout) is " + this.zze.zzi + (this.zzc.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + this.zzc.get(0)) + " ms. Total latency(fullLoadTimeout) is " + (zzt.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting."));
                FIN.finallyExec$NT(v);
            }
        }
    }
}


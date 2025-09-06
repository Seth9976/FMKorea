package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import jeb.synthetic.FIN;

public final class zzbmu {
    private final Object zza;
    private final Context zzb;
    private final String zzc;
    private final zzcag zzd;
    private final zzfhu zze;
    private final zzbb zzf;
    private final zzbb zzg;
    private zzbmt zzh;
    private int zzi;

    public zzbmu(Context context0, zzcag zzcag0, String s, zzbb zzbb0, zzbb zzbb1, zzfhu zzfhu0) {
        this.zza = new Object();
        this.zzi = 1;
        this.zzc = s;
        this.zzb = context0.getApplicationContext();
        this.zzd = zzcag0;
        this.zze = zzfhu0;
        this.zzf = zzbb0;
        this.zzg = zzbb1;
    }

    public final zzbmo zzb(zzaqx zzaqx0) {
        synchronized(this.zza) {
            synchronized(this.zza) {
                zzbmt zzbmt0 = this.zzh;
                if(zzbmt0 != null && this.zzi == 0) {
                    zzbmt0.zzi((zzblp zzblp0) -> if(zzblp0.zzi()) {
                        this.zzi = 1;
                    }, zzbma.zza);
                }
            }
            if(this.zzh != null && this.zzh.zze() != -1) {
                int v2 = this.zzi;
                if(v2 == 0) {
                    return this.zzh.zza();
                }
                if(v2 == 1) {
                    this.zzi = 2;
                    this.zzd(null);
                    return this.zzh.zza();
                }
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzbmt zzbmt1 = this.zzd(null);
            this.zzh = zzbmt1;
            return zzbmt1.zza();
        }
    }

    static zzbmt zzc(zzbmu zzbmu0) {
        return zzbmu0.zzh;
    }

    protected final zzbmt zzd(zzaqx zzaqx0) {
        zzfhg zzfhg0 = zzfhf.zza(this.zzb, 6);
        zzfhg0.zzh();
        zzbmt zzbmt0 = new zzbmt(this.zzg);
        zzbmd zzbmd0 = () -> {
            zzblx zzblx0;
            long v = zzt.zzB().currentTimeMillis();
            ArrayList arrayList0 = new ArrayList();
            try {
                zzblx0 = new zzblx(this.zzb, this.zzd, null, null);
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("Error creating webview.", throwable0);
                zzt.zzo().zzu(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbmt0.zzg();
                return;
            }
            zzblx0.zzk(new zzbme(this, arrayList0, v, zzbmt0, zzblx0));
            zzblx0.zzq("/jsLoaded", new zzbmf(this, v, zzbmt0, zzblx0));
            zzca zzca0 = new zzca();
            zzbmg zzbmg0 = new zzbmg(this, null, zzblx0, zzca0);
            zzca0.zzb(zzbmg0);
            zzblx0.zzq("/requestReload", zzbmg0);
            if(this.zzc.endsWith(".js")) {
                zzblx0.zzh(this.zzc);
            }
            else if(this.zzc.startsWith("<html>")) {
                zzblx0.zzf(this.zzc);
            }
            else {
                zzblx0.zzg(this.zzc);
            }
            zzbmi zzbmi0 = new zzbmi(this, zzbmt0, zzblx0, arrayList0, v);
            long v1 = (long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzd)))));
            zzs.zza.postDelayed(zzbmi0, v1);
        };
        zzcan.zze.execute(zzbmd0);
        zzbmt0.zzi(new zzbmj(this, zzbmt0, zzfhg0), new zzbmk(this, zzbmt0, zzfhg0));
        return zzbmt0;
    }

    static zzfhu zze(zzbmu zzbmu0) {
        return zzbmu0.zze;
    }

    static void zzg(zzbmu zzbmu0, zzbmt zzbmt0) {
        zzbmu0.zzh = zzbmt0;
    }

    static void zzh(zzbmu zzbmu0, int v) {
        zzbmu0.zzi = v;
    }

    final void zzi(zzbmt zzbmt0, zzblp zzblp0, ArrayList arrayList0, long v) {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        switch(zzbmt0.zze()) {
            case -1: 
            case 1: {
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v1);
                return;
            }
            default: {
                zzbmt0.zzg();
                zzbmb zzbmb0 = new zzbmb(zzblp0);
                zzcan.zze.execute(zzbmb0);
                zze.zza(("Could not receive /jsLoaded in " + zzba.zzc().zzb(zzbbr.zzc) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbmt0.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + arrayList0.get(0) + " ms. Total latency(onEngLoadedTimeout) is " + (zzt.zzB().currentTimeMillis() - v) + " ms. Rejecting."));
                FIN.finallyExec$NT(v1);
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzj(zzaqx zzaqx0, zzbmt zzbmt0) [...]

    // 检测为 Lambda 实现
    final void zzk(zzblp zzblp0) [...]
}


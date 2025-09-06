package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzees implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private final Executor zzc;

    public zzees(Context context0, zzcqz zzcqz0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzcqz0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        View view0;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() || !zzfbe0.zzah) {
            view0 = ((zzfcw)zzedq0.zzb).zza();
        }
        else {
            zzboo zzboo0 = ((zzfcw)zzedq0.zzb).zzc();
            if(zzboo0 == null) {
                zzcaa.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcf(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                view0 = (View)ObjectWrapper.unwrap(zzboo0.zze());
                boolean z = zzboo0.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfcf(remoteException0);
            }
            if(view0 == null) {
                throw new zzfcf(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                d d0 = zzfye.zzn(zzfye.zzh(null), (Object object0) -> zzfye.zzh(zzcrq.zza(this.zza, view0, zzfbe0)), zzcan.zze);
                try {
                    view0 = (View)d0.get();
                    goto label_19;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfcf(interruptedException0);
                }
                throw new zzfcf(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_19:
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzcqj zzcqj0 = new zzcqj(view0, null, new zzeeq(((zzfcw)zzedq0.zzb)), ((zzfbf)zzfbe0.zzv.get(0)));
        zzcqd zzcqd0 = this.zzb.zza(zzcst0, zzcqj0);
        zzcqd0.zzg().zza(view0);
        zzcqd0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzc);
        zzeiu zzeiu0 = zzcqd0.zzj();
        ((zzefj)zzedq0.zzc).zzc(zzeiu0);
        return zzcqd0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzq zzq1;
        zzq zzq0 = zzfbr0.zza.zza.zze;
        if(zzq0.zzn) {
            AdSize adSize0 = zzb.zzd(zzq0.zze, zzq0.zzb);
            zzq1 = new zzq(this.zza, adSize0);
        }
        else if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() || !zzfbe0.zzah) {
            zzq1 = zzfce.zza(this.zza, zzfbe0.zzv);
        }
        else {
            AdSize adSize1 = zzb.zze(zzq0.zze, zzq0.zzb);
            zzq1 = new zzq(this.zza, adSize1);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbe0.zzah) {
            String s = zzbu.zzl(zzfbe0.zzt);
            ((zzfcw)zzedq0.zzb).zzn(this.zza, zzq1, zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString(), s, ((zzbol)zzedq0.zzc));
            return;
        }
        String s1 = zzbu.zzl(zzfbe0.zzt);
        ((zzfcw)zzedq0.zzb).zzm(this.zza, zzq1, zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString(), s1, ((zzbol)zzedq0.zzc));
    }

    // 检测为 Lambda 实现
    final d zzc(View view0, zzfbe zzfbe0, Object object0) [...]
}


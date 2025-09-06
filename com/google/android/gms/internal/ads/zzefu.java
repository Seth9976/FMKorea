package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

public final class zzefu implements zzedt {
    private final Context zza;
    private final zzdfq zzb;
    private final zzcag zzc;
    private final Executor zzd;

    public zzefu(Context context0, zzcag zzcag0, zzdfq zzdfq0, Executor executor0) {
        this.zza = context0;
        this.zzc = zzcag0;
        this.zzb = zzdfq0;
        this.zzd = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdet zzdet0 = new zzdet((boolean z, Context context0, zzcwv zzcwv0) -> {
            try {
                ((zzfcw)zzedq0.zzb).zzv(z);
                if(this.zzc.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzaF))))) {
                    ((zzfcw)zzedq0.zzb).zzx();
                    return;
                }
                ((zzfcw)zzedq0.zzb).zzy(context0);
                return;
            }
            catch(zzfcf zzfcf0) {
            }
            zzcaa.zzi("Cannot show interstitial.");
            throw new zzdfx(zzfcf0.getCause());
        }, null);
        zzdeq zzdeq0 = this.zzb.zze(zzcst0, zzdet0);
        zzdeq0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzd);
        zzeiu zzeiu0 = zzdeq0.zzj();
        ((zzefj)zzedq0.zzc).zzc(zzeiu0);
        return zzdeq0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        String s = zzbu.zzl(zzfbe0.zzt);
        ((zzfcw)zzedq0.zzb).zzo(this.zza, zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString(), s, ((zzbol)zzedq0.zzc));
    }

    // 检测为 Lambda 实现
    final void zzc(zzedq zzedq0, boolean z, Context context0, zzcwv zzcwv0) [...]
}


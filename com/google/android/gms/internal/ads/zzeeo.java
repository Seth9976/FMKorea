package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

public final class zzeeo implements zzedn {
    private final zzcqz zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzfqw zzf;

    public zzeeo(zzcqz zzcqz0, Context context0, Executor executor0, zzdom zzdom0, zzfca zzfca0, zzfqw zzfqw0) {
        this.zzb = context0;
        this.zza = zzcqz0;
        this.zze = executor0;
        this.zzc = zzdom0;
        this.zzd = zzfca0;
        this.zzf = zzfqw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
            zzdop zzdop0;
            zzq zzq0 = zzfce.zza(this.zzb, zzfbe0.zzv);
            zzcfi zzcfi0 = this.zzc.zza(zzq0, zzfbe0, zzfbr0.zzb.zzb);
            zzcfi0.zzZ(zzfbe0.zzX);
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() || !zzfbe0.zzah) {
                zzas zzas0 = (zzas)this.zzf.apply(zzfbe0);
                zzdop0 = new zzdop(this.zzb, ((View)zzcfi0), zzas0);
            }
            else {
                zzdop0 = zzcrq.zza(this.zzb, ((View)zzcfi0), zzfbe0);
            }
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzcqj zzcqj0 = new zzcqj(zzdop0, zzcfi0, new zzeej(zzcfi0), zzfce.zzb(zzq0));
            zzcqd zzcqd0 = this.zza.zza(zzcst0, zzcqj0);
            zzcqd0.zzh().zzi(zzcfi0, false, null);
            zzcxa zzcxa0 = zzcqd0.zzc();
            zzeek zzeek0 = new zzeek(zzcfi0);
            zzfyo zzfyo0 = zzcan.zzf;
            zzcxa0.zzo(zzeek0, zzfyo0);
            zzcqd0.zzh();
            d d0 = zzdol.zzj(zzcfi0, zzfbe0.zzt.zzb, zzfbe0.zzt.zza);
            if(zzfbe0.zzN) {
                d0.addListener(new zzeel(zzcfi0), this.zze);
            }
            d0.addListener(() -> {
                zzcfi0.zzY();
                zzcge zzcge0 = zzcfi0.zzq();
                zzfl zzfl0 = this.zzd.zza;
                if(zzfl0 != null && zzcge0 != null) {
                    zzcge0.zzs(zzfl0);
                }
            }, this.zze);
            return zzfye.zzm(d0, new zzeen(zzcqd0), zzfyo0);
        }, this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfbe0.zzt != null && zzfbe0.zzt.zza != null;
    }

    // 检测为 Lambda 实现
    final d zzc(zzfbr zzfbr0, zzfbe zzfbe0, Object object0) [...]

    // 检测为 Lambda 实现
    final void zzd(zzcfi zzcfi0) [...]
}


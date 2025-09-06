package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

public final class zzefq implements zzedn {
    private final Context zza;
    private final zzdom zzb;
    private final zzdfq zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh;
    private final zzecs zzi;

    public zzefq(Context context0, zzcag zzcag0, zzfca zzfca0, Executor executor0, zzdfq zzdfq0, zzdom zzdom0, zzbit zzbit0, zzecs zzecs0) {
        this.zza = context0;
        this.zzd = zzfca0;
        this.zzc = zzdfq0;
        this.zze = executor0;
        this.zzf = zzcag0;
        this.zzb = zzdom0;
        this.zzg = zzbit0;
        this.zzh = ((Boolean)zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
        this.zzi = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        zzdoq zzdoq0 = new zzdoq();
        d d0 = zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
            zzcfi zzcfi0 = this.zzb.zza(this.zzd.zze, zzfbe0, zzfbr0.zzb.zzb);
            zzcfi0.zzZ(zzfbe0.zzX);
            zzdoq0.zza(this.zza, ((View)zzcfi0));
            zzcas zzcas0 = new zzcas();
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzdet zzdet0 = new zzdet(new zzefp(this.zza, this.zzf, zzcas0, zzfbe0, zzcfi0, this.zzd, this.zzh, this.zzg, this.zzi), zzcfi0);
            zzdeq zzdeq0 = this.zzc.zze(zzcst0, zzdet0);
            zzcas0.zzc(zzdeq0);
            zzdeq0.zzc().zzo(new zzefn(zzcfi0), zzcan.zzf);
            zzdeq0.zzk().zzi(zzcfi0, true, (this.zzh ? this.zzg : null));
            zzdeq0.zzk();
            return zzfye.zzm(zzdol.zzj(zzcfi0, zzfbe0.zzt.zzb, zzfbe0.zzt.zza), new zzefo(this, zzcfi0, zzfbe0, zzdeq0), this.zze);
        }, this.zze);
        d0.addListener(new zzefm(zzdoq0), this.zze);
        return d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfbe0.zzt != null && zzfbe0.zzt.zza != null;
    }

    // 检测为 Lambda 实现
    final d zzc(zzfbe zzfbe0, zzfbr zzfbr0, zzdoq zzdoq0, Object object0) [...]
}


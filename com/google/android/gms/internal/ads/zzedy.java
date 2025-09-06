package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

public final class zzedy implements zzedn {
    private final zzcpq zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh;
    private final zzecs zzi;

    public zzedy(zzcpq zzcpq0, Context context0, Executor executor0, zzdom zzdom0, zzfca zzfca0, zzcag zzcag0, zzbit zzbit0, zzecs zzecs0) {
        this.zzb = context0;
        this.zza = zzcpq0;
        this.zze = executor0;
        this.zzc = zzdom0;
        this.zzd = zzfca0;
        this.zzf = zzcag0;
        this.zzg = zzbit0;
        this.zzh = ((Boolean)zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
        this.zzi = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        zzdoq zzdoq0 = new zzdoq();
        d d0 = zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
            zzcfi zzcfi0 = this.zzc.zza(this.zzd.zze, zzfbe0, zzfbr0.zzb.zzb);
            zzcfi0.zzZ(zzfbe0.zzX);
            zzdoq0.zza(this.zzb, ((View)zzcfi0));
            zzcas zzcas0 = new zzcas();
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzdet zzdet0 = new zzdet(new zzeea(this.zzf, zzcas0, zzfbe0, zzcfi0, this.zzd, this.zzh, this.zzg, this.zzi), zzcfi0);
            zzcpo zzcpo0 = new zzcpo(zzfbe0.zzab);
            zzcpn zzcpn0 = this.zza.zza(zzcst0, zzdet0, zzcpo0);
            zzcpn0.zzh().zzi(zzcfi0, false, (this.zzh ? this.zzg : null));
            zzcas0.zzc(zzcpn0);
            zzcpn0.zzc().zzo(new zzedu(zzcfi0), zzcan.zzf);
            zzcpn0.zzh();
            return zzfye.zzm(zzdol.zzj(zzcfi0, zzfbe0.zzt.zzb, zzfbe0.zzt.zza), new zzedv(this, zzcfi0, zzfbe0, zzcpn0), this.zze);
        }, this.zze);
        d0.addListener(new zzedx(zzdoq0), this.zze);
        return d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfbe0.zzt != null && zzfbe0.zzt.zza != null;
    }

    // 检测为 Lambda 实现
    final d zzc(zzfbe zzfbe0, zzfbr zzfbr0, zzdoq zzdoq0, Object object0) [...]
}


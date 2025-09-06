package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbxm extends zzbyg {
    private final Clock zzb;
    private final zzbxm zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    zzbxm(Context context0, Clock clock0, zzg zzg0, zzbyf zzbyf0, zzbxl zzbxl0) {
        this.zzc = this;
        this.zzb = clock0;
        zzgyt zzgyt0 = zzgyu.zza(context0);
        this.zzd = zzgyt0;
        zzgyt zzgyt1 = zzgyu.zza(zzg0);
        this.zze = zzgyt1;
        zzgyt zzgyt2 = zzgyu.zza(zzbyf0);
        this.zzf = zzgyt2;
        this.zzg = zzgys.zzc(new zzbxe(zzgyt0, zzgyt1, zzgyt2));
        zzgyt zzgyt3 = zzgyu.zza(clock0);
        this.zzh = zzgyt3;
        zzgzg zzgzg0 = zzgys.zzc(new zzbxg(zzgyt3, zzgyt1, zzgyt2));
        this.zzi = zzgzg0;
        zzbxi zzbxi0 = new zzbxi(zzgyt3, zzgzg0);
        this.zzj = zzbxi0;
        this.zzk = zzgys.zzc(new zzbyl(zzgyt0, zzbxi0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbyg
    final zzbxd zza() {
        return (zzbxd)this.zzg.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyg
    final zzbxh zzb() {
        zzbxf zzbxf0 = (zzbxf)this.zzi.zzb();
        return new zzbxh(this.zzb, zzbxf0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyg
    final zzbyk zzc() {
        return (zzbyk)this.zzk.zzb();
    }
}


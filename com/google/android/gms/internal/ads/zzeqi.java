package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzeqi implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzeqi(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzb.zzb(zzcan.zza);
        zzfca zzfca0 = ((zzcvz)this.zzb).zza();
        PackageInfo packageInfo0 = (PackageInfo)this.zzc.zzb();
        zzg zzg0 = ((zzchh)this.zzd).zza();
        return new zzeqg(zzcan.zza, zzfca0, packageInfo0, zzg0);
    }
}


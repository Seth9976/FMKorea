package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzftp extends zzfts {
    zzftp() {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfts
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzb(int v, int v1) {
        if(v < v1) {
            return zzftp.zzf(-1);
        }
        return v <= v1 ? zzftp.zzf(0) : zzftp.zzf(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzc(Object object0, Object object1, Comparator comparator0) {
        return zzftp.zzf(comparator0.compare(object0, object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzd(boolean z, boolean z1) {
        return zzftp.zzf(zzfwk.zza(z, z1));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzfts
    public final zzfts zze(boolean z, boolean z1) {
        return zzftp.zzf(0);
    }

    static final zzfts zzf(int v) {
        if(v < 0) {
            return zzfts.zzb;
        }
        return v <= 0 ? zzfts.zza : zzfts.zzc;
    }
}


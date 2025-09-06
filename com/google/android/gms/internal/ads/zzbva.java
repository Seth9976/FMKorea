package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzbva extends zzbvc {
    private final String zza;
    private final int zzb;

    public zzbva(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzbva && Objects.equal(this.zza, ((zzbva)object0).zza) && Objects.equal(this.zzb, ((zzbva)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvd
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvd
    public final String zzc() {
        return this.zza;
    }
}


package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcdm extends zzb {
    final zzccj zza;
    final zzcdu zzb;
    private final String zzc;
    private final String[] zzd;

    zzcdm(zzccj zzccj0, zzcdu zzcdu0, String s, String[] arr_s) {
        this.zza = zzccj0;
        this.zzb = zzcdu0;
        this.zzc = s;
        this.zzd = arr_s;
        zzt.zzy().zzb(this);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        }
        finally {
            zzcdl zzcdl0 = new zzcdl(this);
            zzs.zza.post(zzcdl0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbT)).booleanValue() && this.zzb instanceof zzced) {
            zzcdk zzcdk0 = () -> Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
            return zzcan.zze.zzb(zzcdk0);
        }
        return super.zzb();
    }

    // 检测为 Lambda 实现
    final Boolean zzd() [...]

    public final String zze() {
        return this.zzc;
    }
}


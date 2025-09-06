package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeru implements zzesj {
    private final zzbyf zza;
    private final zzfyo zzb;
    private final Context zzc;

    public zzeru(zzbyf zzbyf0, zzfyo zzfyo0, Context context0) {
        this.zza = zzbyf0;
        this.zzb = zzfyo0;
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 34;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzert zzert0 = () -> {
            if(!this.zza.zzu(this.zzc)) {
                return new zzerv(null, null, null, null, null);
            }
            String s = this.zza.zze(this.zzc);
            String s1 = s == null ? "" : s;
            String s2 = this.zza.zzc(this.zzc);
            String s3 = s2 == null ? "" : s2;
            String s4 = this.zza.zza(this.zzc);
            String s5 = s4 == null ? "" : s4;
            String s6 = this.zza.zzb(this.zzc);
            String s7 = s6 == null ? "" : s6;
            return "TIME_OUT".equals(s3) ? new zzerv(s1, s3, s5, s7, ((Long)zzba.zzc().zzb(zzbbr.zzag))) : new zzerv(s1, s3, s5, s7, null);
        };
        return this.zzb.zzb(zzert0);
    }

    // 检测为 Lambda 实现
    final zzerv zzc() [...]
}


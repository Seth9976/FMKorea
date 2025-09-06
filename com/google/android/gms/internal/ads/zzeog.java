package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;

public final class zzeog implements zzesj {
    private final zzeyc zza;

    zzeog(zzeyc zzeyc0) {
        this.zza = zzeyc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 15;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeof zzeof0 = null;
        if(this.zza != null && this.zza.zza() != null && !this.zza.zza().isEmpty()) {
            zzeof0 = (Bundle bundle0) -> bundle0.putString("key_schema", this.zza.zza());
        }
        return zzfye.zzh(zzeof0);
    }

    // 检测为 Lambda 实现
    final void zzc(Bundle bundle0) [...]
}


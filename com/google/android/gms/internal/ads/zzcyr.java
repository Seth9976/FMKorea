package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcyr extends zzdbs implements zzcxc, zzcyh {
    private final zzfbe zzb;
    private final AtomicBoolean zzc;

    public zzcyr(Set set0, zzfbe zzfbe0) {
        super(set0);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbe0;
    }

    // 检测为 Lambda 实现
    final void zza(zzcyt zzcyt0) [...]

    private final void zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhw)).booleanValue() && this.zzc.compareAndSet(false, true)) {
            zzs zzs0 = this.zzb.zzaf;
            if(zzs0 != null && zzs0.zza == 3) {
                this.zzt((zzcyt zzcyt0) -> zzcyt0.zzh(this.zzb.zzaf));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        if(this.zzb.zzb == 1) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(this.zzb.zzb != 2 && this.zzb.zzb != 4 && this.zzb.zzb != 5 && this.zzb.zzb != 6 && this.zzb.zzb != 7) {
            return;
        }
        this.zzb();
    }
}


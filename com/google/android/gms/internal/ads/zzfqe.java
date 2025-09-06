package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class zzfqe extends zzfpy {
    final IBinder zza;
    final zzfqh zzb;

    zzfqe(zzfqh zzfqh0, IBinder iBinder0) {
        this.zzb = zzfqh0;
        this.zza = iBinder0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        zzfpu zzfpu0 = zzfpt.zzb(this.zza);
        zzfqi.zzm(this.zzb.zza, zzfpu0);
        zzfqi.zzq(this.zzb.zza);
        zzfqi.zzl(this.zzb.zza, false);
        for(Object object0: zzfqi.zzh(this.zzb.zza)) {
            ((Runnable)object0).run();
        }
        zzfqi.zzh(this.zzb.zza).clear();
    }
}


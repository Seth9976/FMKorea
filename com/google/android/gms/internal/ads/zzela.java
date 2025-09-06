package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

public final class zzela implements zzcyt {
    private final AtomicReference zza;

    public zzela() {
        this.zza = new AtomicReference();
    }

    public final void zza(zzdg zzdg0) {
        this.zza.set(zzdg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(zzs zzs0) {
        zzekz zzekz0 = new zzekz(zzs0);
        zzeyj.zza(this.zza, zzekz0);
    }
}


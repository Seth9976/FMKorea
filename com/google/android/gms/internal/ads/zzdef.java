package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdef extends zzdbs implements zzbjh {
    public zzdef(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zza(zzbvp zzbvp0) {
        this.zzt(new zzdec(zzbvp0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zzb() {
        this.zzt((zzdee this) -> ((zzbjh)object0).zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zzc() {
        synchronized(this) {
            this.zzt((zzded this) -> ((zzbjh)object0).zzc());
        }
    }
}


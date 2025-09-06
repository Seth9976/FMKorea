package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzcxa extends zzdbs {
    private boolean zzb;

    public zzcxa(Set set0) {
        super(set0);
        this.zzb = false;
    }

    public final void zza() {
        synchronized(this) {
            if(!this.zzb) {
                this.zzt((zzcwz this) -> ((zzcxc)object0).zzq());
                this.zzb = true;
            }
        }
    }
}


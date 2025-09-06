package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;
import java.util.Set;

public final class zzdem extends zzdbs {
    private boolean zzb;

    protected zzdem(Set set0) {
        super(set0);
    }

    public final void zza() {
        this.zzt((zzdei this) -> ((VideoLifecycleCallbacks)object0).onVideoEnd());
    }

    public final void zzb() {
        this.zzt((zzdek this) -> ((VideoLifecycleCallbacks)object0).onVideoPause());
    }

    public final void zzc() {
        synchronized(this) {
            if(!this.zzb) {
                this.zzt((zzdej this) -> ((VideoLifecycleCallbacks)object0).onVideoStart());
                this.zzb = true;
            }
            this.zzt(zzdel.zza);
        }
    }

    public final void zzd() {
        synchronized(this) {
            this.zzt((zzdej this) -> ((VideoLifecycleCallbacks)object0).onVideoStart());
            this.zzb = true;
        }
    }
}


package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

public final class zzejj implements zzf {
    private zzf zza;

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zza(View view0) {
        synchronized(this) {
            zzf zzf0 = this.zza;
            if(zzf0 != null) {
                zzf0.zza(view0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        synchronized(this) {
            zzf zzf0 = this.zza;
            if(zzf0 != null) {
                zzf0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        synchronized(this) {
            zzf zzf0 = this.zza;
            if(zzf0 != null) {
                zzf0.zzc();
            }
        }
    }

    public final void zzd(zzf zzf0) {
        synchronized(this) {
            this.zza = zzf0;
        }
    }
}


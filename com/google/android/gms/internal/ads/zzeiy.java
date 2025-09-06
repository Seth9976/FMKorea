package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzeiy implements zzf {
    final AtomicBoolean zza;
    private final zzcwg zzb;
    private final zzcxa zzc;
    private final zzddy zzd;
    private final zzddq zze;
    private final zzcoy zzf;

    zzeiy(zzcwg zzcwg0, zzcxa zzcxa0, zzddy zzddy0, zzddq zzddq0, zzcoy zzcoy0) {
        this.zza = new AtomicBoolean(false);
        this.zzb = zzcwg0;
        this.zzc = zzcxa0;
        this.zzd = zzddy0;
        this.zze = zzddq0;
        this.zzf = zzcoy0;
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zza(View view0) {
        synchronized(this) {
            if(!this.zza.compareAndSet(false, true)) {
                return;
            }
            this.zzf.zzq();
            this.zze.zza(view0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if(this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if(this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}


package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;

final class zzebx extends zzect {
    private Activity zza;
    private zzl zzb;
    private String zzc;
    private String zzd;

    @Override  // com.google.android.gms.internal.ads.zzect
    public final zzect zza(Activity activity0) {
        if(activity0 == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzect
    public final zzect zzb(zzl zzl0) {
        this.zzb = zzl0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzect
    public final zzect zzc(String s) {
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzect
    public final zzect zzd(String s) {
        this.zzd = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzect
    public final zzecu zze() {
        Activity activity0 = this.zza;
        if(activity0 == null) {
            throw new IllegalStateException("Missing required properties: activity");
        }
        return new zzebz(activity0, this.zzb, this.zzc, this.zzd, null);
    }
}


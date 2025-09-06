package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzckp implements zzezj {
    private final zzciz zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    zzckp(zzciz zzciz0, zzcko zzcko0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzezj
    public final zzezj zza(zzq zzq0) {
        zzq0.getClass();
        this.zzd = zzq0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezj
    public final zzezj zzb(String s) {
        s.getClass();
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezj
    public final zzezj zzc(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezj
    public final zzezk zzd() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, String.class);
        zzgzb.zzc(this.zzd, zzq.class);
        return new zzckr(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}


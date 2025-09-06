package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcjr implements zzexs {
    private final zzciz zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    zzcjr(zzciz zzciz0, zzcjq zzcjq0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzexs
    public final zzexs zza(zzq zzq0) {
        zzq0.getClass();
        this.zzd = zzq0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzexs
    public final zzexs zzb(String s) {
        s.getClass();
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzexs
    public final zzexs zzc(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzexs
    public final zzext zzd() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, String.class);
        zzgzb.zzc(this.zzd, zzq.class);
        return new zzcjt(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}


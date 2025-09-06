package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbxk {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzbyf zzd;

    private zzbxk() {
    }

    zzbxk(zzbxj zzbxj0) {
    }

    public final zzbxk zza(zzg zzg0) {
        this.zzc = zzg0;
        return this;
    }

    public final zzbxk zzb(Context context0) {
        context0.getClass();
        this.zza = context0;
        return this;
    }

    public final zzbxk zzc(Clock clock0) {
        clock0.getClass();
        this.zzb = clock0;
        return this;
    }

    public final zzbxk zzd(zzbyf zzbyf0) {
        this.zzd = zzbyf0;
        return this;
    }

    public final zzbyg zze() {
        zzgzb.zzc(this.zza, Context.class);
        zzgzb.zzc(this.zzb, Clock.class);
        zzgzb.zzc(this.zzc, zzg.class);
        zzgzb.zzc(this.zzd, zzbyf.class);
        return new zzbxm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}


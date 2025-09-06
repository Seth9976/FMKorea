package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdhk implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdhk(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzaub zzaub0 = (zzaub)this.zza.zzb();
        Executor executor0 = (Executor)this.zzb.zzb();
        Context context0 = (Context)this.zzc.zzb();
        Clock clock0 = (Clock)this.zzd.zzb();
        return new zzcpi(executor0, new zzcou(context0, zzaub0), clock0);
    }
}


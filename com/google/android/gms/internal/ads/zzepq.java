package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

public final class zzepq implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzepq(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzb.zzb(zzcan.zza);
        ViewGroup viewGroup0 = ((zzcqa)this.zzb).zza();
        Context context0 = (Context)this.zzc.zzb();
        Set set0 = ((zzgze)this.zzd).zzc();
        return new zzepo(zzcan.zza, viewGroup0, context0, set0);
    }
}


package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.List;

public final class zzcof implements zzcwl {
    private final zzfbi zza;
    private final zzfbr zzb;
    private final zzfig zzc;
    private final zzfik zzd;

    public zzcof(zzfbr zzfbr0, zzfik zzfik0, zzfig zzfig0) {
        this.zzb = zzfbr0;
        this.zzd = zzfik0;
        this.zzc = zzfig0;
        this.zza = zzfbr0.zzb.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        List list0 = this.zzc.zzc(this.zzb, null, this.zza.zza);
        this.zzd.zzd(list0);
    }
}


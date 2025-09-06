package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzdwd;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import java.util.concurrent.Executor;

public final class zzak implements zzfxl {
    private final Executor zza;
    private final zzdwd zzb;

    public zzak(Executor executor0, zzdwd zzdwd0) {
        this.zza = executor0;
        this.zzb = zzdwd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return zzfye.zzn(this.zzb.zzb(((zzbun)object0)), new zzaj(((zzbun)object0)), this.zza);
    }
}


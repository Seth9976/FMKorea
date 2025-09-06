package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

public final class zzbxh {
    private final Clock zza;
    private final zzbxf zzb;

    zzbxh(Clock clock0, zzbxf zzbxf0) {
        this.zza = clock0;
        this.zzb = zzbxf0;
    }

    public static zzbxh zza(Context context0) {
        return zzbyg.zzd(context0).zzb();
    }

    public final void zzb(int v, long v1) {
        this.zzb.zzb(v, v1);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(zzff zzff0) {
        long v = this.zza.currentTimeMillis();
        this.zzb.zzb(-1, v);
    }

    public final void zze() {
        long v = this.zza.currentTimeMillis();
        this.zzb.zzb(-1, v);
    }
}


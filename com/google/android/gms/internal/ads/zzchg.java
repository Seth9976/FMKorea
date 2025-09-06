package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

public final class zzchg {
    private final zzcag zza;
    private final Context zzb;
    private final WeakReference zzc;

    zzchg(zzche zzche0, zzchf zzchf0) {
        this.zza = zzche0.zza;
        this.zzb = zzche0.zzb;
        this.zzc = zzche0.zzc;
    }

    final Context zza() {
        return this.zzb;
    }

    public final zzaqx zzb() {
        return new zzaqx(new zzi(this.zzb, this.zza));
    }

    final zzbed zzc() {
        return new zzbed(this.zzb);
    }

    final zzcag zzd() {
        return this.zza;
    }

    final String zze() {
        return zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    final WeakReference zzf() {
        return this.zzc;
    }
}


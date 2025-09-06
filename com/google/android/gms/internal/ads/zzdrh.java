package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class zzdrh {
    private final zzdrm zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrh(zzdrm zzdrm0, Executor executor0) {
        this.zza = zzdrm0;
        this.zzc = zzdrm0.zza();
        this.zzb = executor0;
    }

    public final zzdrg zza() {
        zzdrg zzdrg0 = new zzdrg(this);
        zzdrg.zza(zzdrg0);
        return zzdrg0;
    }

    static Map zzc(zzdrh zzdrh0) {
        return zzdrh0.zzc;
    }

    static Executor zzd(zzdrh zzdrh0) {
        return zzdrh0.zzb;
    }

    public final void zze() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzkt)).booleanValue()) {
            return;
        }
        zzdrg zzdrg0 = this.zza();
        zzdrg0.zzb("action", "pecr");
        zzdrg0.zzg();
    }
}


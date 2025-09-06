package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class zzb {
    private final zzdw zza;
    private String zzb;

    public zzb() {
        this.zza = new zzdw();
    }

    static zzdw zza(zzb zzb0) {
        return zzb0.zza;
    }

    public final zzb zzb(Class class0, Bundle bundle0) {
        this.zza.zzq(class0, bundle0);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras0) {
        this.zza.zzu(networkExtras0);
        return this;
    }

    public final zzb zzd(Class class0, Bundle bundle0) {
        this.zza.zzt(class0, bundle0);
        return this;
    }

    public final zzb zze(String s) {
        this.zzb = s;
        return this;
    }

    static String zzf(zzb zzb0) {
        return zzb0.zzb;
    }
}


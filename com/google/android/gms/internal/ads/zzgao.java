package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public final class zzgao {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzgak zzc;
    private final Class zzd;
    private final zzgjt zze;

    zzgao(ConcurrentMap concurrentMap0, List list0, zzgak zzgak0, zzgjt zzgjt0, Class class0, zzgan zzgan0) {
        this.zza = concurrentMap0;
        this.zzb = list0;
        this.zzc = zzgak0;
        this.zzd = class0;
        this.zze = zzgjt0;
    }

    public final zzgak zza() {
        return this.zzc;
    }

    public final zzgjt zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] arr_b) {
        zzgam zzgam0 = new zzgam(arr_b, null);
        List list0 = (List)this.zza.get(zzgam0);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}


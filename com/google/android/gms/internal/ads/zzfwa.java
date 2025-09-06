package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfwa extends zzfui {
    final transient Object zza;

    zzfwa(Object object0) {
        object0.getClass();
        this.zza = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean contains(Object object0) {
        return this.zza.equals(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final Iterator iterator() {
        return new zzful(this.zza);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zza(Object[] arr_object, int v) {
        arr_object[v] = this.zza;
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfud zzd() {
        return zzfud.zzm(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfwd zze() {
        return new zzful(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        throw null;
    }
}


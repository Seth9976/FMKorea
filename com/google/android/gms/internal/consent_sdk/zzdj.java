package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

final class zzdj extends zzdf {
    final transient Object zza;

    zzdj(Object object0) {
        object0.getClass();
        this.zza = object0;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.zza.equals(object0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdf
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdf
    public final Iterator iterator() {
        return new zzdg(this.zza);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final int zza(Object[] arr_object, int v) {
        arr_object[0] = this.zza;
        return 1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdf
    public final zzdk zzd() {
        return new zzdg(this.zza);
    }
}


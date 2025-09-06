package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfrs implements Iterable {
    final CharSequence zza;
    final zzfrv zzb;

    zzfrs(zzfrv zzfrv0, CharSequence charSequence0) {
        this.zzb = zzfrv0;
        this.zza = charSequence0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return zzfrv.zze(this.zzb, this.zza);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        zzfqx.zzb(stringBuilder0, this, ", ");
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}


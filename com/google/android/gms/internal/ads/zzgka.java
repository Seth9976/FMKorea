package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

public final class zzgka {
    private final zzgjt zza;
    private final List zzb;
    private final Integer zzc;

    zzgka(zzgjt zzgjt0, List list0, Integer integer0, zzgjz zzgjz0) {
        this.zza = zzgjt0;
        this.zzb = list0;
        this.zzc = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzgka)) {
            return false;
        }
        if(this.zza.equals(((zzgka)object0).zza) && this.zzb.equals(((zzgka)object0).zzb)) {
            Integer integer0 = ((zzgka)object0).zzc;
            return this.zzc == integer0 || this.zzc != null && this.zzc.equals(integer0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}


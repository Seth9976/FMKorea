package com.google.android.gms.internal.measurement;

import X1.k;
import android.content.Context;

final class zzfv extends zzgu {
    private final Context zza;
    private final k zzb;

    zzfv(Context context0, k k0) {
        if(context0 == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context0;
        this.zzb = k0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzgu) {
            Context context0 = ((zzgu)object0).zza();
            if(this.zza.equals(context0)) {
                return this.zzb == null ? ((zzgu)object0).zzb() == null : this.zzb.equals(((zzgu)object0).zzb());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        return this.zzb == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "FlagsContext{context=" + this.zza + ", hermeticFileOverrides=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.measurement.zzgu
    final Context zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzgu
    final k zzb() {
        return this.zzb;
    }
}


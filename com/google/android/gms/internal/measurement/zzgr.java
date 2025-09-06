package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzgr extends zzgn {
    zzgr(zzgv zzgv0, String s, Long long0, boolean z) {
        super(zzgv0, s, long0, true, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzgn
    final Object zza(Object object0) {
        return this.zzb(object0);
    }

    private final Long zzb(Object object0) {
        if(object0 instanceof Long) {
            return (Long)object0;
        }
        if(object0 instanceof String) {
            try {
                return Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.zzb() + ": " + object0);
        return null;
    }
}


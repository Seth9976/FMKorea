package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzgq extends zzgn {
    zzgq(zzgv zzgv0, String s, Boolean boolean0, boolean z) {
        super(zzgv0, s, boolean0, true, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzgn
    final Object zza(Object object0) {
        if(object0 instanceof Boolean) {
            return (Boolean)object0;
        }
        if(object0 instanceof String) {
            if(zzfr.zzb.matcher(((String)object0)).matches()) {
                return true;
            }
            if(zzfr.zzc.matcher(((String)object0)).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + object0);
        return null;
    }
}


package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzgt extends zzgn {
    zzgt(zzgv zzgv0, String s, Double double0, boolean z) {
        super(zzgv0, s, double0, true, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzgn
    final Object zza(Object object0) {
        return this.zzb(object0);
    }

    private final Double zzb(Object object0) {
        if(object0 instanceof Double) {
            return (Double)object0;
        }
        if(object0 instanceof Float) {
            return ((Float)object0).doubleValue();
        }
        if(object0 instanceof String) {
            try {
                return Double.parseDouble(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.zzb() + ": " + object0);
        return null;
    }
}


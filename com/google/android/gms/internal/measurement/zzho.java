package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zzho implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        zzhs zzhs0 = (zzhs)((zzhm)object0).iterator();
        zzhs zzhs1 = (zzhs)((zzhm)object1).iterator();
        while(zzhs0.hasNext() && zzhs1.hasNext()) {
            int v = zzhm.zza(zzhs0.zza()).compareTo(zzhm.zza(zzhs1.zza()));
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return ((zzhm)object0).zzb().compareTo(((zzhm)object1).zzb());
    }
}


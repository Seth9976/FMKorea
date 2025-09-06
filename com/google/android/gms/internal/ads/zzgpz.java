package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzgpz implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        zzgqc zzgqc0 = ((zzgqi)object0).zzs();
        zzgqc zzgqc1 = ((zzgqi)object1).zzs();
        while(zzgqc0.hasNext() && zzgqc1.hasNext()) {
            int v = ((int)(zzgqc0.zza() & 0xFF)).compareTo(((int)(zzgqc1.zza() & 0xFF)));
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return ((zzgqi)object0).zzd().compareTo(((zzgqi)object1).zzd());
    }
}


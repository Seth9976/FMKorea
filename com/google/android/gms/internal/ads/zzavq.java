package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzavq implements Comparator {
    public zzavq(zzavr zzavr0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(Float.compare(((zzavf)object0).zzd(), ((zzavf)object1).zzd()) >= 0) {
            if(Float.compare(((zzavf)object0).zzd(), ((zzavf)object1).zzd()) > 0) {
                return 1;
            }
            if(((zzavf)object0).zzb() >= ((zzavf)object1).zzb()) {
                if(((zzavf)object0).zzb() > ((zzavf)object1).zzb()) {
                    return 1;
                }
                float f = (((zzavf)object0).zza() - ((zzavf)object0).zzd()) * (((zzavf)object0).zzc() - ((zzavf)object0).zzb());
                float f1 = (((zzavf)object1).zza() - ((zzavf)object1).zzd()) * (((zzavf)object1).zzc() - ((zzavf)object1).zzb());
                if(f <= f1) {
                    return f < f1 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}


package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzcdn implements Iterable {
    private final List zza;

    public zzcdn() {
        this.zza = new ArrayList();
    }

    @Override
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    final zzcdm zza(zzccj zzccj0) {
        for(Object object0: this) {
            zzcdm zzcdm0 = (zzcdm)object0;
            if(zzcdm0.zza == zzccj0) {
                return zzcdm0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void zzb(zzcdm zzcdm0) {
        this.zza.add(zzcdm0);
    }

    public final void zzc(zzcdm zzcdm0) {
        this.zza.remove(zzcdm0);
    }

    public final boolean zzd(zzccj zzccj0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this) {
            zzcdm zzcdm0 = (zzcdm)object0;
            if(zzcdm0.zza == zzccj0) {
                arrayList0.add(zzcdm0);
            }
        }
        if(arrayList0.isEmpty()) {
            return false;
        }
        for(Object object1: arrayList0) {
            ((zzcdm)object1).zzb.zzf();
        }
        return true;
    }
}


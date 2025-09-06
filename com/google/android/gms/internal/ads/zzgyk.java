package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzgyk extends AbstractList {
    final List zza;
    final Iterator zzb;
    private static final zzgyl zzc;

    static {
        zzgyk.zzc = zzgyl.zzb(zzgyk.class);
    }

    public zzgyk(List list0, Iterator iterator0) {
        this.zza = list0;
        this.zzb = iterator0;
    }

    @Override
    public final Object get(int v) {
        if(this.zza.size() > v) {
            return this.zza.get(v);
        }
        if(!this.zzb.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.zzb.next();
        this.zza.add(object0);
        return this.get(v);
    }

    @Override
    public final Iterator iterator() {
        return new zzgyj(this);
    }

    @Override
    public final int size() {
        zzgyk.zzc.zza("potentially expensive size() call");
        zzgyk.zzc.zza("blowup running");
        while(this.zzb.hasNext()) {
            Object object0 = this.zzb.next();
            this.zza.add(object0);
        }
        return this.zza.size();
    }
}


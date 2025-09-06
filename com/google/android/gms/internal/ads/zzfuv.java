package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

class zzfuv extends zzfvy {
    final Map zzd;

    zzfuv(Map map0) {
        map0.getClass();
        this.zzd = map0;
    }

    @Override
    public void clear() {
        this.zzd.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.zzd.containsKey(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.zzd.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new zzfus(this.zzd.entrySet().iterator());
    }

    @Override
    public boolean remove(Object object0) {
        if(this.contains(object0)) {
            this.zzd.remove(object0);
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.zzd.size();
    }
}


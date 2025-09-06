package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class zzftt extends zzftu implements Map {
    @Override
    public final void clear() {
        this.zzb().clear();
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.zzb().containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.zzb().containsValue(object0);
    }

    @Override
    public Set entrySet() {
        return this.zzb().entrySet();
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this || this.zzb().equals(object0);
    }

    @Override
    public Object get(Object object0) {
        return this.zzb().get(object0);
    }

    @Override
    public int hashCode() {
        return this.zzb().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.zzb().isEmpty();
    }

    @Override
    public Set keySet() {
        return this.zzb().keySet();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.zzb().put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.zzb().putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        return this.zzb().remove(object0);
    }

    @Override
    public int size() {
        return this.zzb().size();
    }

    @Override
    public final Collection values() {
        return this.zzb().values();
    }

    @Override  // com.google.android.gms.internal.ads.zzftu
    protected Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    protected final int zzc() {
        return zzfvz.zza(this.entrySet());
    }

    protected final boolean zzd(Object object0) {
        zzfut zzfut0 = new zzfut(this.entrySet().iterator());
        if(object0 == null) {
            while(zzfut0.hasNext()) {
                Object object1 = zzfut0.next();
                if(object1 != null) {
                    continue;
                }
                return true;
            }
        }
        else {
            while(zzfut0.hasNext()) {
                Object object2 = zzfut0.next();
                if(object0.equals(object2)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    protected final boolean zze(Object object0) {
        return zzfuy.zzb(this, object0);
    }
}


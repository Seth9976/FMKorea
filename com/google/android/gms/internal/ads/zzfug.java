package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public abstract class zzfug implements Serializable, Map {
    private transient zzfui zza;
    private transient zzfui zzb;
    private transient zzfty zzc;

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.zzb().contains(object0);
    }

    @Override
    public final Set entrySet() {
        return this.zzh();
    }

    @Override
    public final boolean equals(Object object0) {
        return zzfuy.zzb(this, object0);
    }

    @Override
    public abstract Object get(Object arg1);

    @Override
    public final Object getOrDefault(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public final int hashCode() {
        return zzfvz.zza(this.zzh());
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        return this.zzi();
    }

    @Override
    @Deprecated
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(Map map0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        int v = this.size();
        zzfta.zza(v, "size");
        StringBuilder stringBuilder0 = new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
        stringBuilder0.append('{');
        boolean z = true;
        for(Object object0: this.entrySet()) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('=');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = false;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @Override
    public final Collection values() {
        return this.zzb();
    }

    abstract zzfty zza();

    public final zzfty zzb() {
        zzfty zzfty0 = this.zzc;
        if(zzfty0 == null) {
            zzfty0 = this.zza();
            this.zzc = zzfty0;
        }
        return zzfty0;
    }

    public static zzfug zzc(Map map0) {
        Set set0 = map0.entrySet();
        zzfuf zzfuf0 = new zzfuf((set0 instanceof Collection ? set0.size() : 4));
        zzfuf0.zzb(set0);
        return zzfuf0.zzc();
    }

    public static zzfug zzd() {
        return zzfvs.zza;
    }

    public static zzfug zze(Object object0, Object object1) {
        zzfta.zzb("dialog_not_shown_reason", object1);
        return zzfvs.zzj(1, new Object[]{"dialog_not_shown_reason", object1}, null);
    }

    abstract zzfui zzf();

    abstract zzfui zzg();

    public final zzfui zzh() {
        zzfui zzfui0 = this.zza;
        if(zzfui0 == null) {
            zzfui0 = this.zzf();
            this.zza = zzfui0;
        }
        return zzfui0;
    }

    public final zzfui zzi() {
        zzfui zzfui0 = this.zzb;
        if(zzfui0 == null) {
            zzfui0 = this.zzg();
            this.zzb = zzfui0;
        }
        return zzfui0;
    }
}


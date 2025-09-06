package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzkd extends LinkedHashMap {
    private static final zzkd zza;
    private boolean zzb;

    static {
        zzkd zzkd0 = new zzkd();
        zzkd.zza = zzkd0;
        zzkd0.zzb = false;
    }

    private zzkd() {
        this.zzb = true;
    }

    private zzkd(Map map0) {
        super(map0);
        this.zzb = true;
    }

    @Override
    public final void clear() {
        this.zze();
        super.clear();
    }

    // 去混淆评级： 低(20)
    @Override
    public final Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map) {
            if(this != ((Map)object0)) {
                if(this.size() == ((Map)object0).size()) {
                    Iterator iterator0 = this.entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        Object object1 = iterator0.next();
                        if(!((Map)object0).containsKey(((Map.Entry)object1).getKey())) {
                            break;
                        }
                        Object object2 = ((Map.Entry)object1).getValue();
                        Object object3 = ((Map)object0).get(((Map.Entry)object1).getKey());
                        if((!(object2 instanceof byte[]) || !(object3 instanceof byte[]) ? object2.equals(object3) : Arrays.equals(((byte[])object2), ((byte[])object3)))) {
                            continue;
                        }
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.entrySet()) {
            int v1 = zzkd.zza(((Map.Entry)object0).getKey());
            v += zzkd.zza(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.zze();
        zziz.zza(object0);
        zziz.zza(object1);
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.zze();
        for(Object object0: map0.keySet()) {
            zziz.zza(object0);
            zziz.zza(map0.get(object0));
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.zze();
        return super.remove(object0);
    }

    private static int zza(Object object0) {
        if(object0 instanceof byte[]) {
            return zziz.zza(((byte[])object0));
        }
        if(object0 instanceof zzjc) {
            throw new UnsupportedOperationException();
        }
        return object0.hashCode();
    }

    public static zzkd zza() {
        return zzkd.zza;
    }

    public final void zza(zzkd zzkd0) {
        this.zze();
        if(!zzkd0.isEmpty()) {
            this.putAll(zzkd0);
        }
    }

    // 去混淆评级： 低(20)
    public final zzkd zzb() {
        return this.isEmpty() ? new zzkd() : new zzkd(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private final void zze() {
        if(!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }
}


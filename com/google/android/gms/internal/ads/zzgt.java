package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class zzgt extends zzftt {
    private final Map zza;

    public zzgt(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean containsKey(Object object0) {
        return object0 != null && super.containsKey(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean containsValue(Object object0) {
        return super.zzd(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final Set entrySet() {
        return zzfvz.zzb(this.zza.entrySet(), (Object object0) -> ((Map.Entry)object0).getKey() != null);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean equals(Object object0) {
        return object0 != null && super.zze(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final Object get(Object object0) {
        return object0 == null ? null : ((List)this.zza.get(object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final int hashCode() {
        return super.zzc();
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean isEmpty() {
        return this.zza.isEmpty() || super.size() == 1 && super.containsKey(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final Set keySet() {
        return zzfvz.zzb(this.zza.keySet(), (Object object0) -> ((String)object0) != null);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final int size() {
        int v = super.containsKey(null);
        return super.size() - v;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    protected final Object zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    protected final Map zzb() {
        return this.zza;
    }
}


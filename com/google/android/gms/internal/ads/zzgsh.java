package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzgsh extends zzgps implements zzgsi, RandomAccess {
    @Deprecated
    public static final zzgsi zza;
    private static final zzgsh zzb;
    private final List zzc;

    static {
        zzgsh zzgsh0 = new zzgsh(false);
        zzgsh.zzb = zzgsh0;
        zzgsh.zza = zzgsh0;
    }

    public zzgsh() {
        this(10);
    }

    public zzgsh(int v) {
        ArrayList arrayList0 = new ArrayList(v);
        super(true);
        this.zzc = arrayList0;
    }

    private zzgsh(ArrayList arrayList0) {
        super(true);
        this.zzc = arrayList0;
    }

    private zzgsh(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final void add(int v, Object object0) {
        this.zzbM();
        this.zzc.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final boolean addAll(int v, Collection collection0) {
        this.zzbM();
        if(collection0 instanceof zzgsi) {
            collection0 = ((zzgsi)collection0).zzh();
        }
        boolean z = this.zzc.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final void clear() {
        this.zzbM();
        this.zzc.clear();
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final Object remove(int v) {
        this.zzbM();
        Object object0 = this.zzc.remove(v);
        ++this.modCount;
        return zzgsh.zzj(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final Object set(int v, Object object0) {
        this.zzbM();
        return zzgsh.zzj(this.zzc.set(v, ((String)object0)));
    }

    @Override
    public final int size() {
        return this.zzc.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrz
    public final zzgrz zzd(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.zzc);
        return new zzgsh(arrayList0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final zzgsi zze() {
        return this.zzc() ? new zzgup(this) : this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final Object zzf(int v) {
        return this.zzc.get(v);
    }

    public final String zzg(int v) {
        Object object0 = this.zzc.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzgqi) {
            String s = ((zzgqi)object0).zzx(zzgsa.zzb);
            if(((zzgqi)object0).zzp()) {
                this.zzc.set(v, s);
            }
            return s;
        }
        String s1 = zzgsa.zzd(((byte[])object0));
        if(zzguz.zzi(((byte[])object0))) {
            this.zzc.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final void zzi(zzgqi zzgqi0) {
        this.zzbM();
        this.zzc.add(zzgqi0);
        ++this.modCount;
    }

    private static String zzj(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzgqi ? ((zzgqi)object0).zzx(zzgsa.zzb) : zzgsa.zzd(((byte[])object0));
    }
}


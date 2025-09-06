package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfvt extends zzfui {
    static final zzfvt zza;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private static final Object[] zzd;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] arr_object = new Object[0];
        zzfvt.zzd = arr_object;
        zzfvt.zza = new zzfvt(arr_object, 0, arr_object, 0, 0);
    }

    zzfvt(Object[] arr_object, int v, Object[] arr_object1, int v1, int v2) {
        this.zzb = arr_object;
        this.zze = v;
        this.zzc = arr_object1;
        this.zzf = v1;
        this.zzg = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean contains(Object object0) {
        Object[] arr_object = this.zzc;
        if(object0 != null && arr_object.length != 0) {
            for(int v = zzftv.zzb(object0); true; v = v1 + 1) {
                int v1 = v & this.zzf;
                Object object1 = arr_object[v1];
                if(object1 == null) {
                    return false;
                }
                if(object1.equals(object0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final int hashCode() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final Iterator iterator() {
        return this.zzd().zzr(0);
    }

    @Override
    public final int size() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzg);
        return v + this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzb() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfwd zze() {
        return this.zzd().zzr(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final Object[] zzg() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    final zzfud zzi() {
        return zzfud.zzi(this.zzb, this.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    final boolean zzr() {
        return true;
    }
}


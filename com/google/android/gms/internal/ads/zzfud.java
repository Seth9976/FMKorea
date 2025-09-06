package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzfud extends zzfty implements List, RandomAccess {
    private static final zzfwe zza;
    public static final int zzd;

    static {
        zzfud.zza = new zzfub(zzfvn.zza, 0);
    }

    @Override
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != this) {
            if(object0 instanceof List) {
                int v = this.size();
                if(v == ((List)object0).size()) {
                    if(((List)object0) instanceof RandomAccess) {
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!zzfrd.zza(this.get(v1), ((List)object0).get(v1))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    else {
                        Iterator iterator0 = this.iterator();
                        Iterator iterator1 = ((List)object0).iterator();
                        while(iterator0.hasNext()) {
                            if(!iterator1.hasNext()) {
                                return false;
                            }
                            Object object1 = iterator0.next();
                            Object object2 = iterator1.next();
                            if(zzfrd.zza(object1, object2)) {
                                continue;
                            }
                            return false;
                        }
                        return !iterator1.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v = this.size();
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 * 0x1F + this.get(v1).hashCode();
        }
        return v2;
    }

    @Override
    public final int indexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(object0.equals(this.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final Iterator iterator() {
        return this.zzr(0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        for(int v = this.size() - 1; v >= 0; --v) {
            if(object0.equals(this.get(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.zzr(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzr(v);
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    @Deprecated
    public final zzfud zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final zzfwd zze() {
        return this.zzr(0);
    }

    public zzfud zzh(int v, int v1) {
        zzfri.zzh(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzfvn.zza : new zzfuc(this, v, v2);
    }

    static zzfud zzi(Object[] arr_object, int v) {
        return v == 0 ? zzfvn.zza : new zzfvn(arr_object, v);
    }

    public static zzfud zzj(Collection collection0) {
        if(collection0 instanceof zzfty) {
            zzfud zzfud0 = ((zzfty)collection0).zzd();
            if(zzfud0.zzf()) {
                Object[] arr_object = zzfud0.toArray();
                return zzfud.zzi(arr_object, arr_object.length);
            }
            return zzfud0;
        }
        Object[] arr_object1 = collection0.toArray();
        zzfvl.zzb(arr_object1, arr_object1.length);
        return zzfud.zzi(arr_object1, arr_object1.length);
    }

    public static zzfud zzk(Object[] arr_object) {
        if(arr_object.length == 0) {
            return zzfvn.zza;
        }
        Object[] arr_object1 = (Object[])arr_object.clone();
        zzfvl.zzb(arr_object1, arr_object1.length);
        return zzfud.zzi(arr_object1, arr_object1.length);
    }

    public static zzfud zzl() {
        return zzfvn.zza;
    }

    public static zzfud zzm(Object object0) {
        Object[] arr_object = {object0};
        zzfvl.zzb(arr_object, 1);
        return zzfud.zzi(arr_object, 1);
    }

    public static zzfud zzn(Object object0, Object object1) {
        Object[] arr_object = {object0, object1};
        zzfvl.zzb(arr_object, 2);
        return zzfud.zzi(arr_object, 2);
    }

    public static zzfud zzo(Object object0, Object object1, Object object2) {
        Object[] arr_object = {object0, object1, object2};
        zzfvl.zzb(arr_object, 3);
        return zzfud.zzi(arr_object, 3);
    }

    public static zzfud zzp(Object object0, Object object1, Object object2, Object object3, Object object4) {
        Object[] arr_object = {object0, object1, object2, object3, object4};
        zzfvl.zzb(arr_object, 5);
        return zzfud.zzi(arr_object, 5);
    }

    public static zzfud zzq(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        Object[] arr_object = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfvl.zzb(arr_object, 6);
        return zzfud.zzi(arr_object, 6);
    }

    public final zzfwe zzr(int v) {
        zzfri.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzfud.zza : new zzfub(this, v);
    }
}


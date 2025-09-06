package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class zzftm extends AbstractMap implements Serializable {
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private static final Object zzd;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    static {
        zzftm.zzd = new Object();
    }

    zzftm() {
        this.zzm(3);
    }

    zzftm(int v) {
        this.zzm(8);
    }

    @Override
    public final void clear() {
        if(this.zzo()) {
            return;
        }
        this.zzl();
        Map map0 = this.zzj();
        if(map0 == null) {
            Object[] arr_object = this.zzb;
            arr_object.getClass();
            Arrays.fill(arr_object, 0, this.zzg, null);
            Object[] arr_object1 = this.zzc;
            arr_object1.getClass();
            Arrays.fill(arr_object1, 0, this.zzg, null);
            Object object0 = this.zze;
            object0.getClass();
            if(object0 instanceof byte[]) {
                Arrays.fill(((byte[])object0), 0);
            }
            else if(object0 instanceof short[]) {
                Arrays.fill(((short[])object0), 0);
            }
            else {
                Arrays.fill(((int[])object0), 0);
            }
            int[] arr_v = this.zza;
            arr_v.getClass();
            Arrays.fill(arr_v, 0, this.zzg, 0);
            this.zzg = 0;
            return;
        }
        this.zzf = zzfwl.zzb(this.size(), 3, 0x3FFFFFFF);
        map0.clear();
        this.zze = null;
        this.zzg = 0;
    }

    @Override
    public final boolean containsKey(Object object0) {
        Map map0 = this.zzj();
        return map0 == null ? this.zzq(object0) != -1 : map0.containsKey(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        Map map0 = this.zzj();
        if(map0 == null) {
            for(int v = 0; v < this.zzg; ++v) {
                Object[] arr_object = this.zzc;
                arr_object.getClass();
                if(zzfrd.zza(object0, arr_object[v])) {
                    return true;
                }
            }
            return false;
        }
        return map0.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        Set set0 = this.zzi;
        if(set0 == null) {
            set0 = new zzftg(this);
            this.zzi = set0;
        }
        return set0;
    }

    @Override
    public final Object get(Object object0) {
        Map map0 = this.zzj();
        if(map0 != null) {
            return map0.get(object0);
        }
        int v = this.zzq(object0);
        if(v == -1) {
            return null;
        }
        Object[] arr_object = this.zzc;
        arr_object.getClass();
        return arr_object[v];
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        Set set0 = this.zzh;
        if(set0 == null) {
            set0 = new zzftj(this);
            this.zzh = set0;
        }
        return set0;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(this.zzo()) {
            zzfri.zzj(this.zzo(), "Arrays already allocated");
            int v = this.zzf;
            int v1 = Math.max(v + 1, 2);
            int v2 = Integer.highestOneBit(v1);
            if(v1 > ((int)(((double)v2)))) {
                v2 += v2;
                if(v2 <= 0) {
                    v2 = 0x40000000;
                }
            }
            int v3 = Math.max(4, v2);
            this.zze = zzftn.zzd(v3);
            this.zzt(v3 - 1);
            this.zza = new int[v];
            this.zzb = new Object[v];
            this.zzc = new Object[v];
        }
        Map map0 = this.zzj();
        if(map0 == null) {
            int[] arr_v = this.zza;
            arr_v.getClass();
            Object[] arr_object = this.zzb;
            arr_object.getClass();
            Object[] arr_object1 = this.zzc;
            arr_object1.getClass();
            int v4 = this.zzg;
            int v5 = zzftv.zzb(object0);
            int v6 = this.zzp();
            int v7 = v5 & v6;
            Object object2 = this.zze;
            object2.getClass();
            int v8 = zzftn.zzc(object2, v7);
            if(v8 == 0) {
                if(v4 + 1 > v6) {
                    v6 = this.zzr(v6, zzftn.zza(v6), v5, v4);
                    goto label_71;
                }
                Object object3 = this.zze;
                object3.getClass();
                zzftn.zze(object3, v7, v4 + 1);
                goto label_71;
            }
            int v9 = ~v6;
            int v10 = 0;
            while(true) {
                int v11 = arr_v[v8 - 1];
                int v12 = v11 & v9;
                if(v12 == (v5 & v9) && zzfrd.zza(object0, arr_object[v8 - 1])) {
                    Object object4 = arr_object1[v8 - 1];
                    arr_object1[v8 - 1] = object1;
                    return object4;
                }
                int v13 = v11 & v6;
                ++v10;
                if(v13 == 0) {
                    if(v10 >= 9) {
                        LinkedHashMap linkedHashMap0 = new LinkedHashMap(this.zzp() + 1, 1.0f);
                        for(int v14 = this.zze(); v14 >= 0; v14 = this.zzf(v14)) {
                            Object[] arr_object2 = this.zzb;
                            arr_object2.getClass();
                            Object object5 = arr_object2[v14];
                            Object[] arr_object3 = this.zzc;
                            arr_object3.getClass();
                            linkedHashMap0.put(object5, arr_object3[v14]);
                        }
                        this.zze = linkedHashMap0;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        this.zzl();
                        return linkedHashMap0.put(object0, object1);
                    }
                    if(v4 + 1 > v6) {
                        v6 = this.zzr(v6, zzftn.zza(v6), v5, v4);
                    }
                    else {
                        arr_v[v8 - 1] = v4 + 1 & v6 | v12;
                    }
                label_71:
                    int[] arr_v1 = this.zza;
                    arr_v1.getClass();
                    if(v4 + 1 > arr_v1.length) {
                        int v15 = Math.min(0x3FFFFFFF, Math.max(1, arr_v1.length >>> 1) + arr_v1.length | 1);
                        if(v15 != arr_v1.length) {
                            int[] arr_v2 = this.zza;
                            arr_v2.getClass();
                            this.zza = Arrays.copyOf(arr_v2, v15);
                            Object[] arr_object4 = this.zzb;
                            arr_object4.getClass();
                            this.zzb = Arrays.copyOf(arr_object4, v15);
                            Object[] arr_object5 = this.zzc;
                            arr_object5.getClass();
                            this.zzc = Arrays.copyOf(arr_object5, v15);
                        }
                    }
                    int[] arr_v3 = this.zza;
                    arr_v3.getClass();
                    arr_v3[v4] = ~v6 & v5;
                    Object[] arr_object6 = this.zzb;
                    arr_object6.getClass();
                    arr_object6[v4] = object0;
                    Object[] arr_object7 = this.zzc;
                    arr_object7.getClass();
                    arr_object7[v4] = object1;
                    this.zzg = v4 + 1;
                    this.zzl();
                    return null;
                }
                v8 = v13;
            }
        }
        return map0.put(object0, object1);
    }

    @Override
    public final Object remove(Object object0) {
        Map map0 = this.zzj();
        if(map0 != null) {
            return map0.remove(object0);
        }
        Object object1 = this.zzs(object0);
        return object1 == zzftm.zzd ? null : object1;
    }

    @Override
    public final int size() {
        Map map0 = this.zzj();
        return map0 == null ? this.zzg : map0.size();
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.zzj;
        if(collection0 == null) {
            collection0 = new zzftl(this);
            this.zzj = collection0;
        }
        return collection0;
    }

    static int zza(zzftm zzftm0) {
        return zzftm0.zzf;
    }

    static int zzb(zzftm zzftm0) {
        return zzftm0.zzg;
    }

    static int zzc(zzftm zzftm0) {
        return zzftm0.zzp();
    }

    // 去混淆评级： 低(20)
    final int zze() {
        return this.isEmpty() ? -1 : 0;
    }

    final int zzf(int v) {
        return v + 1 >= this.zzg ? -1 : v + 1;
    }

    static Object zzg(zzftm zzftm0, Object object0) {
        return zzftm0.zzs(object0);
    }

    static Object zzh(zzftm zzftm0) {
        Object object0 = zzftm0.zze;
        object0.getClass();
        return object0;
    }

    static Object zzi() {
        return zzftm.zzd;
    }

    // 去混淆评级： 低(20)
    final Map zzj() {
        return this.zze instanceof Map ? ((Map)this.zze) : null;
    }

    static void zzk(zzftm zzftm0, int v) {
        zzftm0.zzg = v;
    }

    final void zzl() {
        this.zzf += 0x20;
    }

    final void zzm(int v) {
        this.zzf = 8;
    }

    final void zzn(int v, int v1) {
        int v5;
        Object object0 = this.zze;
        object0.getClass();
        int[] arr_v = this.zza;
        arr_v.getClass();
        Object[] arr_object = this.zzb;
        arr_object.getClass();
        Object[] arr_object1 = this.zzc;
        arr_object1.getClass();
        int v2 = this.size();
        if(v < v2 - 1) {
            Object object1 = arr_object[v2 - 1];
            arr_object[v] = object1;
            arr_object1[v] = arr_object1[v2 - 1];
            arr_object[v2 - 1] = null;
            arr_object1[v2 - 1] = null;
            arr_v[v] = arr_v[v2 - 1];
            arr_v[v2 - 1] = 0;
            int v3 = zzftv.zzb(object1) & v1;
            int v4 = zzftn.zzc(object0, v3);
            if(v4 != v2) {
                while(true) {
                    v5 = arr_v[v4 - 1];
                    int v6 = v5 & v1;
                    if(v6 == v2) {
                        break;
                    }
                    v4 = v6;
                }
                arr_v[v4 - 1] = v + 1 & v1 | v5 & ~v1;
                return;
            }
            zzftn.zze(object0, v3, v + 1);
            return;
        }
        arr_object[v] = null;
        arr_object1[v] = null;
        arr_v[v] = 0;
    }

    final boolean zzo() {
        return this.zze == null;
    }

    private final int zzp() {
        return (1 << (this.zzf & 0x1F)) - 1;
    }

    private final int zzq(Object object0) {
        if(this.zzo()) {
            return -1;
        }
        int v = zzftv.zzb(object0);
        int v1 = this.zzp();
        Object object1 = this.zze;
        object1.getClass();
        int v2 = zzftn.zzc(object1, v & v1);
        if(v2 != 0) {
            while(true) {
                int[] arr_v = this.zza;
                arr_v.getClass();
                int v3 = arr_v[v2 - 1];
                if((v3 & ~v1) == (v & ~v1)) {
                    Object[] arr_object = this.zzb;
                    arr_object.getClass();
                    if(zzfrd.zza(object0, arr_object[v2 - 1])) {
                        return v2 - 1;
                    }
                }
                v2 = v3 & v1;
                if(v2 == 0) {
                    break;
                }
            }
        }
        return -1;
    }

    private final int zzr(int v, int v1, int v2, int v3) {
        Object object0 = zzftn.zzd(v1);
        if(v3 != 0) {
            zzftn.zze(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.zze;
        object1.getClass();
        int[] arr_v = this.zza;
        arr_v.getClass();
        for(int v4 = 0; v4 <= v; ++v4) {
            for(int v5 = zzftn.zzc(object1, v4); v5 != 0; v5 = v6 & v) {
                int v6 = arr_v[v5 - 1];
                int v7 = ~v & v6 | v4;
                int v8 = v7 & v1 - 1;
                int v9 = zzftn.zzc(object0, v8);
                zzftn.zze(object0, v8, v5);
                arr_v[v5 - 1] = ~(v1 - 1) & v7 | v9 & v1 - 1;
            }
        }
        this.zze = object0;
        this.zzt(v1 - 1);
        return v1 - 1;
    }

    private final Object zzs(Object object0) {
        if(this.zzo()) {
            return zzftm.zzd;
        }
        int v = this.zzp();
        Object object1 = this.zze;
        object1.getClass();
        int[] arr_v = this.zza;
        arr_v.getClass();
        Object[] arr_object = this.zzb;
        arr_object.getClass();
        int v1 = zzftn.zzb(object0, null, v, object1, arr_v, arr_object, null);
        if(v1 == -1) {
            return zzftm.zzd;
        }
        Object[] arr_object1 = this.zzc;
        arr_object1.getClass();
        Object object2 = arr_object1[v1];
        this.zzn(v1, v);
        --this.zzg;
        this.zzl();
        return object2;
    }

    private final void zzt(int v) {
        this.zzf = 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F | this.zzf & 0xFFFFFFE0;
    }
}


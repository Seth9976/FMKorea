package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class zzfuj {
    public static boolean zza(Iterable iterable0, zzfrj zzfrj0) {
        if(iterable0 instanceof RandomAccess && iterable0 instanceof List) {
            zzfrj0.getClass();
            return zzfuj.zzc(((List)iterable0), zzfrj0);
        }
        Iterator iterator0 = iterable0.iterator();
        zzfrj0.getClass();
        boolean z = false;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(zzfrj0.zza(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list0, zzfrj zzfrj0, int v, int v1) {
        int v2 = list0.size();
        while(true) {
            --v2;
            if(v2 <= v1) {
                break;
            }
            if(zzfrj0.zza(list0.get(v2))) {
                list0.remove(v2);
            }
        }
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            list0.remove(v1);
        }
    }

    private static boolean zzc(List list0, zzfrj zzfrj0) {
        int v = 0;
        int v1 = 0;
        while(v < list0.size()) {
            Object object0 = list0.get(v);
            if(!zzfrj0.zza(object0)) {
                if(v > v1) {
                    try {
                        list0.set(v1, object0);
                    }
                    catch(UnsupportedOperationException unused_ex) {
                        zzfuj.zzb(list0, zzfrj0, v1, v);
                        return true;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        zzfuj.zzb(list0, zzfrj0, v1, v);
                        return true;
                    }
                }
                ++v1;
            }
            ++v;
        }
        list0.subList(v1, list0.size()).clear();
        return v != v1;
    }
}


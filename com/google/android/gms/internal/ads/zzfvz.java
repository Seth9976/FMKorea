package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public final class zzfvz {
    static int zza(Set set0) {
        int v = 0;
        for(Object object0: set0) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    public static Set zzb(Set set0, zzfrj zzfrj0) {
        if(set0 instanceof SortedSet) {
            if(((SortedSet)set0) instanceof zzfvw) {
                zzfrj zzfrj1 = zzfrm.zza(((zzfvw)(((SortedSet)set0))).zzb, zzfrj0);
                return new zzfvx(((SortedSet)((zzfvw)(((SortedSet)set0))).zza), zzfrj1);
            }
            ((SortedSet)set0).getClass();
            return new zzfvx(((SortedSet)set0), zzfrj0);
        }
        if(set0 instanceof zzfvw) {
            zzfrj zzfrj2 = zzfrm.zza(((zzfvw)set0).zzb, zzfrj0);
            return new zzfvw(((Set)((zzfvw)set0).zza), zzfrj2);
        }
        set0.getClass();
        return new zzfvw(set0, zzfrj0);
    }

    static boolean zzc(Set set0, Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    static boolean zzd(Set set0, Collection collection0) {
        collection0.getClass();
        if(collection0 instanceof zzfvj) {
            collection0 = ((zzfvj)collection0).zza();
        }
        if(collection0 instanceof Set && collection0.size() > set0.size()) {
            Iterator iterator0 = set0.iterator();
            collection0.getClass();
            boolean z = false;
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }
        return zzfvz.zze(set0, collection0.iterator());
    }

    static boolean zze(Set set0, Iterator iterator0) {
        boolean z;
        for(z = false; iterator0.hasNext(); z |= set0.remove(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }
}


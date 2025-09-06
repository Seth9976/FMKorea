package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzld {
    private static final Class zza;
    private static final zzma zzb;
    private static final zzma zzc;

    static {
        zzld.zza = zzld.zzd();
        zzld.zzb = zzld.zzc();
        zzld.zzc = new zzmc();
    }

    // 去混淆评级： 低(20)
    static int zza(int v, Object object0, zzlb zzlb0) {
        return object0 instanceof zzjn ? zzig.zzb(v, ((zzjn)object0)) : zzig.zzc(v, ((zzkj)object0), zzlb0);
    }

    static int zza(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * zzig.zzi(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzig.zzb(((zzhm)list0.get(v2)));
        }
        return v3;
    }

    static int zza(int v, List list0, zzlb zzlb0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += zzig.zzb(v, ((zzkj)list0.get(v2)), zzlb0);
        }
        return v3;
    }

    static int zza(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzig.zzb(v, true);
    }

    static int zza(List list0) {
        return list0.size();
    }

    public static zzma zza() {
        return zzld.zzb;
    }

    static Object zza(Object object0, int v, int v1, Object object1, zzma zzma0) {
        if(object1 == null) {
            object1 = zzma0.zzc(object0);
        }
        zzma0.zzb(object1, v, ((long)v1));
        return object1;
    }

    static Object zza(Object object0, int v, List list0, zzje zzje0, Object object1, zzma zzma0) {
        if(zzje0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(zzje0.zza(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = zzld.zza(object0, v, v4, object1, zzma0);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(!zzje0.zza(v5)) {
                    object1 = zzld.zza(object0, v, v5, object1, zzma0);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    public static void zza(int v, List list0, zzmw zzmw0) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zza(v, list0);
        }
    }

    public static void zza(int v, List list0, zzmw zzmw0, zzlb zzlb0) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zza(v, list0, zzlb0);
        }
    }

    public static void zza(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zza(v, list0, z);
        }
    }

    static void zza(zzim zzim0, Object object0, Object object1) {
        zziq zziq0 = zzim0.zza(object1);
        if(!zziq0.zza.isEmpty()) {
            zzim0.zzb(object0).zza(zziq0);
        }
    }

    static void zza(zzkg zzkg0, Object object0, Object object1, long v) {
        zzmg.zza(object0, v, zzkg0.zza(zzmg.zze(object0, v), zzmg.zze(object1, v)));
    }

    static void zza(zzma zzma0, Object object0, Object object1) {
        zzma0.zzc(object0, zzma0.zza(zzma0.zzd(object0), zzma0.zzd(object1)));
    }

    public static void zza(Class class0) {
        if(!zzix.class.isAssignableFrom(class0) && (zzld.zza != null && !zzld.zza.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean zza(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    static int zzb(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzig.zzi(v) * v1;
        if(list0 instanceof zzjp) {
            while(v2 < v1) {
                Object object0 = ((zzjp)list0).zzb(v2);
                v3 += (object0 instanceof zzhm ? zzig.zzb(((zzhm)object0)) : zzig.zzb(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof zzhm ? zzig.zzb(((zzhm)object1)) : zzig.zzb(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int zzb(int v, List list0, zzlb zzlb0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzig.zzi(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof zzjn ? zzig.zza(((zzjn)object0)) : zzig.zza(((zzkj)object0), zzlb0));
        }
        return v3;
    }

    static int zzb(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zzb(list0) + v1 * zzig.zzi(v);
    }

    static int zzb(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzja) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzd(((zzja)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzd(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static zzma zzb() {
        return zzld.zzc;
    }

    public static void zzb(int v, List list0, zzmw zzmw0) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzb(v, list0);
        }
    }

    public static void zzb(int v, List list0, zzmw zzmw0, zzlb zzlb0) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzb(v, list0, zzlb0);
        }
    }

    public static void zzb(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzb(v, list0, z);
        }
    }

    static int zzc(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzig.zzf(v, 0);
    }

    static int zzc(List list0) {
        return list0.size() << 2;
    }

    private static zzma zzc() {
        try {
            Class class0 = zzld.zze();
            return class0 == null ? null : ((zzma)class0.getConstructor(null).newInstance(null));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zzc(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzc(v, list0, z);
        }
    }

    static int zzd(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzig.zzc(v, 0L);
    }

    static int zzd(List list0) {
        return list0.size() << 3;
    }

    private static Class zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zzd(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzd(v, list0, z);
        }
    }

    static int zze(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zze(list0) + v1 * zzig.zzi(v);
    }

    static int zze(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzja) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzf(((zzja)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzf(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static Class zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zze(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zze(v, list0, z);
        }
    }

    static int zzf(int v, List list0, boolean z) {
        return list0.size() == 0 ? 0 : zzld.zzf(list0) + list0.size() * zzig.zzi(v);
    }

    static int zzf(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzd(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzd(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzf(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzf(v, list0, z);
        }
    }

    static int zzg(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zzg(list0) + v1 * zzig.zzi(v);
    }

    static int zzg(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzja) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzh(((zzja)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzh(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzg(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzg(v, list0, z);
        }
    }

    static int zzh(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zzh(list0) + v1 * zzig.zzi(v);
    }

    static int zzh(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzf(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzf(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzh(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzh(v, list0, z);
        }
    }

    static int zzi(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zzi(list0) + v1 * zzig.zzi(v);
    }

    static int zzi(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzja) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzj(((zzja)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzj(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzi(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzi(v, list0, z);
        }
    }

    static int zzj(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzld.zzj(list0) + v1 * zzig.zzi(v);
    }

    static int zzj(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzig.zzg(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzig.zzg(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzj(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzj(v, list0, z);
        }
    }

    public static void zzk(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzk(v, list0, z);
        }
    }

    public static void zzl(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzl(v, list0, z);
        }
    }

    public static void zzm(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzm(v, list0, z);
        }
    }

    public static void zzn(int v, List list0, zzmw zzmw0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzmw0.zzn(v, list0, z);
        }
    }
}


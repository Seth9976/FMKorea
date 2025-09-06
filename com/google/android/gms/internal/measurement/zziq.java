package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zziq {
    final zzlg zza;
    private static final zziq zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zziq.zzb = new zziq(true);
    }

    private zziq() {
        this.zza = zzlg.zza(16);
    }

    private zziq(zzlg zzlg0) {
        this.zza = zzlg0;
        this.zze();
    }

    private zziq(boolean z) {
        this(zzlg.zza(0));
        this.zze();
    }

    @Override
    public final Object clone() {
        zziq zziq0 = new zziq();
        for(int v = 0; v < this.zza.zzb(); ++v) {
            Map.Entry map$Entry0 = this.zza.zzb(v);
            zziq0.zzb(((zzis)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zza.zzc()) {
            zziq0.zzb(((zzis)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zziq0.zzd = this.zzd;
        return zziq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zziq ? this.zza.equals(((zziq)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static int zza(zzis zzis0, Object object0) {
        int v = 0;
        zzmn zzmn0 = zzis0.zzb();
        int v1 = zzis0.zza();
        if(zzis0.zze()) {
            if(zzis0.zzd()) {
                if(((List)object0).isEmpty()) {
                    return 0;
                }
                for(Object object1: ((List)object0)) {
                    v += zziq.zza(zzmn0, object1);
                }
                return zzig.zzi(v1) + v + zzig.zzj(v);
            }
            for(Object object2: ((List)object0)) {
                v += zziq.zza(zzmn0, v1, object2);
            }
            return v;
        }
        return zziq.zza(zzmn0, v1, object0);
    }

    static int zza(zzmn zzmn0, int v, Object object0) {
        return (zzmn0 == zzmn.zzj ? zzig.zzi(v) << 1 : zzig.zzi(v)) + zziq.zza(zzmn0, object0);
    }

    private static int zza(zzmn zzmn0, Object object0) {
        switch(zzip.zzb[zzmn0.ordinal()]) {
            case 1: {
                return zzig.zza(((double)(((Double)object0))));
            }
            case 2: {
                return zzig.zza(((float)(((Float)object0))));
            }
            case 3: {
                return zzig.zzd(((long)(((Long)object0))));
            }
            case 4: {
                return zzig.zzg(((long)(((Long)object0))));
            }
            case 5: {
                return zzig.zzf(((int)(((Integer)object0))));
            }
            case 6: {
                return zzig.zzc(((long)(((Long)object0))));
            }
            case 7: {
                return zzig.zze(((int)(((Integer)object0))));
            }
            case 8: {
                return zzig.zza(((Boolean)object0).booleanValue());
            }
            case 9: {
                return zzig.zzb(((zzkj)object0));
            }
            case 10: {
                return object0 instanceof zzjj ? zzig.zza(((zzjj)object0)) : zzig.zzc(((zzkj)object0));
            }
            case 11: {
                return object0 instanceof zzhm ? zzig.zzb(((zzhm)object0)) : zzig.zzb(((String)object0));
            }
            case 12: {
                return object0 instanceof zzhm ? zzig.zzb(((zzhm)object0)) : zzig.zza(((byte[])object0));
            }
            case 13: {
                return zzig.zzj(((int)(((Integer)object0))));
            }
            case 14: {
                return zzig.zzg(((int)(((Integer)object0))));
            }
            case 15: {
                return zzig.zze(((long)(((Long)object0))));
            }
            case 16: {
                return zzig.zzh(((int)(((Integer)object0))));
            }
            case 17: {
                return zzig.zzf(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof zzjc ? zzig.zzd(((zzjc)object0).zza()) : zzig.zzd(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    private static int zza(Map.Entry map$Entry0) {
        zzis zzis0 = (zzis)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzis0.zzc() == zzmx.zzi && !zzis0.zze() && !zzis0.zzd()) {
            return object0 instanceof zzjj ? zzig.zza(((zzis)map$Entry0.getKey()).zza(), ((zzjj)object0)) : zzig.zzb(((zzis)map$Entry0.getKey()).zza(), ((zzkj)object0));
        }
        return zziq.zza(zzis0, object0);
    }

    private final Object zza(zzis zzis0) {
        zzkj zzkj0 = this.zza.get(zzis0);
        return zzkj0 instanceof zzjj ? zzjj.zza() : zzkj0;
    }

    private static Object zza(Object object0) {
        if(object0 instanceof zzks) {
            return ((zzks)object0).zza();
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    static void zza(zzig zzig0, zzmn zzmn0, int v, Object object0) {
        if(zzmn0 == zzmn.zzj) {
            zzig0.zzc(v, 3);
            ((zzkj)object0).zza(zzig0);
            zzig0.zzc(v, 4);
            return;
        }
        zzig0.zzc(v, zzmn0.zza());
        switch(zzip.zzb[zzmn0.ordinal()]) {
            case 1: {
                zzig0.zzb(((double)(((Double)object0))));
                return;
            }
            case 2: {
                zzig0.zzb(((float)(((Float)object0))));
                return;
            }
            case 3: {
                zzig0.zzb(((long)(((Long)object0))));
                return;
            }
            case 4: {
                zzig0.zzb(((long)(((Long)object0))));
                return;
            }
            case 5: {
                zzig0.zzb(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                zzig0.zza(((long)(((Long)object0))));
                return;
            }
            case 7: {
                zzig0.zza(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                zzig0.zzb(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                ((zzkj)object0).zza(zzig0);
                return;
            }
            case 10: {
                zzig0.zza(((zzkj)object0));
                return;
            }
            case 11: {
                if(object0 instanceof zzhm) {
                    zzig0.zza(((zzhm)object0));
                    return;
                }
                zzig0.zza(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof zzhm) {
                    zzig0.zza(((zzhm)object0));
                    return;
                }
                zzig0.zzb(((byte[])object0), 0, ((byte[])object0).length);
                return;
            }
            case 13: {
                zzig0.zzc(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                zzig0.zza(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                zzig0.zza(((long)(((Long)object0))));
                return;
            }
            case 16: {
                zzig0.zzk(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                zzig0.zzh(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof zzjc) {
                    zzig0.zzb(((zzjc)object0).zza());
                    return;
                }
                zzig0.zzb(((int)(((Integer)object0))));
            }
        }
    }

    public final int zza() {
        int v1 = 0;
        for(int v = 0; v < this.zza.zzb(); ++v) {
            v1 += zziq.zza(this.zza.zzb(v));
        }
        for(Object object0: this.zza.zzc()) {
            v1 += zziq.zza(((Map.Entry)object0));
        }
        return v1;
    }

    public final void zza(zziq zziq0) {
        for(int v = 0; v < zziq0.zza.zzb(); ++v) {
            this.zzb(zziq0.zza.zzb(v));
        }
        for(Object object0: zziq0.zza.zzc()) {
            this.zzb(((Map.Entry)object0));
        }
    }

    public static zziq zzb() {
        return zziq.zzb;
    }

    private final void zzb(zzis zzis0, Object object0) {
        if(zzis0.zze()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object1 = arrayList0.get(v1);
                ++v1;
                zziq.zzc(zzis0, object1);
            }
            object0 = arrayList0;
        }
        else {
            zziq.zzc(zzis0, object0);
        }
        if(object0 instanceof zzjj) {
            this.zzd = true;
        }
        this.zza.zza(zzis0, object0);
    }

    private final void zzb(Map.Entry map$Entry0) {
        zzis zzis0 = (zzis)map$Entry0.getKey();
        zzkj zzkj0 = map$Entry0.getValue();
        if(zzkj0 instanceof zzjj) {
            zzkj0 = zzjj.zza();
        }
        if(zzis0.zze()) {
            ArrayList arrayList0 = this.zza(zzis0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(Object object0: ((List)zzkj0)) {
                arrayList0.add(zziq.zza(object0));
            }
            this.zza.zza(zzis0, arrayList0);
            return;
        }
        if(zzis0.zzc() == zzmx.zzi) {
            Object object1 = this.zza(zzis0);
            if(object1 == null) {
                Object object2 = zziq.zza(zzkj0);
                this.zza.zza(zzis0, object2);
                return;
            }
            zzkj zzkj1 = object1 instanceof zzks ? zzis0.zza(((zzks)object1), ((zzks)zzkj0)) : zzis0.zza(((zzkj)object1).zzce(), zzkj0).zzab();
            this.zza.zza(zzis0, zzkj1);
            return;
        }
        Object object3 = zziq.zza(zzkj0);
        this.zza.zza(zzis0, object3);
    }

    private static boolean zzb(Object object0) {
        if(object0 instanceof zzkl) {
            return ((zzkl)object0).zzci();
        }
        if(!(object0 instanceof zzjj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static void zzc(zzis zzis0, Object object0) {
        boolean z;
        zzmn zzmn0 = zzis0.zzb();
        zziz.zza(object0);
        switch(zzip.zza[zzmn0.zzb().ordinal()]) {
            case 1: {
                z = object0 instanceof Integer;
                break;
            }
            case 2: {
                z = object0 instanceof Long;
                break;
            }
            case 3: {
                z = object0 instanceof Float;
                break;
            }
            case 4: {
                z = object0 instanceof Double;
                break;
            }
            case 5: {
                z = object0 instanceof Boolean;
                break;
            }
            case 6: {
                z = object0 instanceof String;
                break;
            }
            case 7: {
                z = !(object0 instanceof zzhm) && !(object0 instanceof byte[]) ? false : true;
                break;
            }
            case 8: {
                z = !(object0 instanceof Integer) && !(object0 instanceof zzjc) ? false : true;
                break;
            }
            case 9: {
                z = object0 instanceof zzkj || object0 instanceof zzjj;
                break;
            }
            default: {
                z = false;
            }
        }
        if(!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzis0.zza(), zzis0.zzb().zzb(), object0.getClass().getName()));
        }
    }

    private static boolean zzc(Map.Entry map$Entry0) {
        zzis zzis0 = (zzis)map$Entry0.getKey();
        if(zzis0.zzc() == zzmx.zzi) {
            if(zzis0.zze()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(zziq.zzb(object0)) {
                        continue;
                    }
                    return false;
                }
            }
            return zziq.zzb(map$Entry0.getValue());
        }
        return true;
    }

    final Iterator zzc() {
        return this.zzd ? new zzjo(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator zzd() {
        return this.zzd ? new zzjo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if(this.zzc) {
            return;
        }
        for(int v = 0; v < this.zza.zzb(); ++v) {
            Map.Entry map$Entry0 = this.zza.zzb(v);
            if(map$Entry0.getValue() instanceof zzix) {
                ((zzix)map$Entry0.getValue()).zzcg();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for(int v = 0; v < this.zza.zzb(); ++v) {
            if(!zziq.zzc(this.zza.zzb(v))) {
                return false;
            }
        }
        for(Object object0: this.zza.zzc()) {
            if(!zziq.zzc(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }
}


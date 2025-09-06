package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzhd implements zzkj {
    protected int zza;

    public zzhd() {
        this.zza = 0;
    }

    protected static void zza(Iterable iterable0, List list0) {
        zziz.zza(iterable0);
        if(iterable0 instanceof zzjp) {
            List list1 = ((zzjp)iterable0).zzb();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzjp)list0).size() - v) + " is null.";
                    for(int v1 = ((zzjp)list0).size() - 1; v1 >= v; --v1) {
                        ((zzjp)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzhm) {
                    ((zzjp)list0).zza(((zzhm)object0));
                }
                else {
                    ((zzjp)list0).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof zzkv) {
            list0.addAll(((Collection)iterable0));
            return;
        }
        if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
            ((ArrayList)list0).ensureCapacity(list0.size() + ((Collection)iterable0).size());
        }
        int v2 = list0.size();
        for(Object object1: iterable0) {
            if(object1 == null) {
                String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                for(int v3 = list0.size() - 1; v3 >= v2; --v3) {
                    list0.remove(v3);
                }
                throw new NullPointerException(s1);
            }
            list0.add(object1);
        }
    }

    int zza(zzlb zzlb0) {
        int v = this.zzbt();
        if(v == -1) {
            v = zzlb0.zza(this);
            this.zzc(v);
        }
        return v;
    }

    int zzbt() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final zzhm zzbu() {
        try {
            zzhv zzhv0 = zzhm.zzc(this.zzbw());
            this.zza(zzhv0.zzb());
            return zzhv0.zza();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "ByteString" + " threw an IOException (should never happen).", iOException0);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] arr_b = new byte[this.zzbw()];
            zzig zzig0 = zzig.zzb(arr_b);
            this.zza(zzig0);
            zzig0.zzb();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "byte array" + " threw an IOException (should never happen).", iOException0);
        }
    }

    void zzc(int v) {
        throw new UnsupportedOperationException();
    }
}


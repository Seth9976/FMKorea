package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzgpr implements zzgta {
    protected int zza;

    public zzgpr() {
        this.zza = 0;
    }

    int zzat(zzgtt zzgtt0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgta
    public final zzgqi zzau() {
        try {
            int v = this.zzaz();
            byte[] arr_b = new byte[v];
            zzgqx zzgqx0 = zzgqx.zzC(arr_b, 0, v);
            this.zzaW(zzgqx0);
            zzgqx0.zzD();
            return new zzgqe(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    protected static void zzav(Iterable iterable0, List list0) {
        iterable0.getClass();
        if(iterable0 instanceof zzgsi) {
            List list1 = ((zzgsi)iterable0).zzh();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzgsi)list0).size() - v) + " is null.";
                    int v1 = ((zzgsi)list0).size();
                    while(true) {
                        --v1;
                        if(v1 < v) {
                            break;
                        }
                        ((zzgsi)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzgqi) {
                    ((zzgsi)list0).zzi(((zzgqi)object0));
                }
                else {
                    ((zzgsi)list0).add(((String)object0));
                }
            }
            return;
        }
        if(!(iterable0 instanceof zzgth)) {
            if(list0 instanceof ArrayList) {
                ((ArrayList)list0).ensureCapacity(list0.size() + ((Collection)iterable0).size());
            }
            int v2 = list0.size();
            for(Object object1: iterable0) {
                if(object1 == null) {
                    String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                    int v3 = list0.size();
                    while(true) {
                        --v3;
                        if(v3 < v2) {
                            break;
                        }
                        list0.remove(v3);
                    }
                    throw new NullPointerException(s1);
                }
                list0.add(object1);
            }
            return;
        }
        list0.addAll(((Collection)iterable0));
    }

    public final void zzaw(OutputStream outputStream0) {
        int v = this.zzaz();
        if(v > 0x1000) {
            v = 0x1000;
        }
        zzgqv zzgqv0 = new zzgqv(outputStream0, v);
        this.zzaW(zzgqv0);
        zzgqv0.zzI();
    }

    @Override  // com.google.android.gms.internal.ads.zzgta
    public final byte[] zzax() {
        try {
            int v = this.zzaz();
            byte[] arr_b = new byte[v];
            zzgqx zzgqx0 = zzgqx.zzC(arr_b, 0, v);
            this.zzaW(zzgqx0);
            zzgqx0.zzD();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a byte array threw an IOException (should never happen).", iOException0);
        }
    }
}


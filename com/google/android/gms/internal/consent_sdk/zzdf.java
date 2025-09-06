package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class zzdf extends zzdb implements Set {
    private transient zzde zza;

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzdf && this.zzk() && ((zzdf)object0).zzk() && this.hashCode() != object0.hashCode()) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            try {
                return this.size() == set0.size() && this.containsAll(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    public Iterator iterator() {
        return this.zzd();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    public abstract zzdk zzd();

    static int zzf(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        if(v1 >= 0x40000000) {
            throw new IllegalArgumentException("collection too large");
        }
        return 0x40000000;
    }

    public final zzde zzg() {
        zzde zzde0 = this.zza;
        if(zzde0 == null) {
            zzde0 = this.zzh();
            this.zza = zzde0;
        }
        return zzde0;
    }

    zzde zzh() {
        Object[] arr_object = this.toArray();
        return zzde.zzg(arr_object, arr_object.length);
    }

    public static zzdf zzi() {
        return zzdi.zza;
    }

    public static zzdf zzj(Object object0, Object object1, Object object2, Object object3) {
        return zzdf.zzl(4, new Object[]{"IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String"});
    }

    boolean zzk() {
        return false;
    }

    private static zzdf zzl(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return zzdi.zza;
            }
            case 1: {
                Object object3 = arr_object[0];
                object3.getClass();
                return new zzdj(object3);
            }
            default: {
                int v1 = zzdf.zzf(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 == null) {
                        throw new NullPointerException("at index " + v2);
                    }
                    int v5 = object0.hashCode();
                    for(int v6 = zzda.zza(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    Object object2 = arr_object[0];
                    object2.getClass();
                    return new zzdj(object2);
                }
                if(zzdf.zzf(v4) >= v1 / 2) {
                    if(v4 < 3) {
                        arr_object = Arrays.copyOf(arr_object, v4);
                    }
                    return new zzdi(arr_object, v3, arr_object1, v1 - 1, v4);
                }
                return zzdf.zzl(v4, arr_object);
            }
        }
    }
}


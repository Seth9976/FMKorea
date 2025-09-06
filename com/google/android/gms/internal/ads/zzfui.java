package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class zzfui extends zzfty implements Set {
    private transient zzfud zza;

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof zzfui) || !this.zzr() || !((zzfui)object0).zzr() || this.hashCode() == object0.hashCode() ? zzfvz.zzc(this, object0) : false;
    }

    @Override
    public int hashCode() {
        return zzfvz.zza(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public Iterator iterator() {
        return this.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public zzfud zzd() {
        zzfud zzfud0 = this.zza;
        if(zzfud0 == null) {
            zzfud0 = this.zzi();
            this.zza = zzfud0;
        }
        return zzfud0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public abstract zzfwd zze();

    static int zzh(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        zzfri.zzf(v1 < 0x40000000, "collection too large");
        return 0x40000000;
    }

    zzfud zzi() {
        Object[] arr_object = this.toArray();
        return zzfud.zzi(arr_object, arr_object.length);
    }

    public static zzfuh zzj(int v) {
        return new zzfuh(v);
    }

    static zzfui zzk(int v, Object[] arr_object) {
        return zzfui.zzs(v, arr_object);
    }

    public static zzfui zzl(Collection collection0) {
        Object[] arr_object = collection0.toArray();
        return zzfui.zzs(arr_object.length, arr_object);
    }

    public static zzfui zzm() {
        return zzfvt.zza;
    }

    public static zzfui zzn(Object object0) {
        return new zzfwa(object0);
    }

    public static zzfui zzo(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return zzfui.zzs(5, new Object[]{object0, object1, object2, object3, object4});
    }

    @SafeVarargs
    public static zzfui zzp(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        Object[] arr_object1 = {object0, object1, object2, object3, object4, object5, null, null, null, null, null, null};
        System.arraycopy(arr_object, 0, arr_object1, 6, 6);
        return zzfui.zzs(12, arr_object1);
    }

    static boolean zzq(int v, int v1) {
        return zzfui.zzt(v, v1);
    }

    boolean zzr() {
        return false;
    }

    private static zzfui zzs(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return zzfvt.zza;
            }
            case 1: {
                Object object3 = arr_object[0];
                object3.getClass();
                return new zzfwa(object3);
            }
            default: {
                int v1 = zzfui.zzh(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    zzfvl.zza(object0, v2);
                    int v5 = object0.hashCode();
                    for(int v6 = zzftv.zza(v5); true; ++v6) {
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
                    return new zzfwa(object2);
                }
                if(zzfui.zzh(v4) < v1 / 2) {
                    return zzfui.zzs(v4, arr_object);
                }
                if(zzfui.zzt(v4, arr_object.length)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new zzfvt(arr_object, v3, arr_object1, v1 - 1, v4);
            }
        }
    }

    private static boolean zzt(int v, int v1) {
        return v < (v1 >> 1) + (v1 >> 2);
    }
}


package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzfvs extends zzfug {
    static final zzfug zza;
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    static {
        zzfvs.zza = new zzfvs(null, new Object[0], 0);
    }

    private zzfvs(Object object0, Object[] arr_object, int v) {
        this.zzc = object0;
        this.zzb = arr_object;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfug
    public final Object get(Object object0) {
        Object object3;
        Object object1 = this.zzc;
        Object[] arr_object = this.zzb;
        int v = this.zzd;
        if(object0 != null) {
            if(v == 1) {
                Object object2 = arr_object[0];
                object2.getClass();
                if(object2.equals(object0)) {
                    object3 = arr_object[1];
                    object3.getClass();
                    return object3 == null ? null : object3;
                }
            }
            else if(object1 != null) {
                if(object1 instanceof byte[]) {
                    int v1 = ((byte[])object1).length - 1;
                    for(int v2 = zzftv.zza(object0.hashCode()); true; v2 = v3 + 1) {
                        int v3 = v2 & v1;
                        int v4 = ((byte[])object1)[v3] & 0xFF;
                        if(v4 == 0xFF) {
                            break;
                        }
                        if(object0.equals(arr_object[v4])) {
                            object3 = arr_object[v4 ^ 1];
                            return object3 == null ? null : object3;
                        }
                    }
                }
                else if(object1 instanceof short[]) {
                    int v5 = ((short[])object1).length - 1;
                    for(int v6 = zzftv.zza(object0.hashCode()); true; v6 = v7 + 1) {
                        int v7 = v6 & v5;
                        int v8 = (char)((short[])object1)[v7];
                        if(v8 == 0xFFFF) {
                            break;
                        }
                        if(object0.equals(arr_object[v8])) {
                            object3 = arr_object[v8 ^ 1];
                            return object3 == null ? null : object3;
                        }
                    }
                }
                else {
                    int v9 = ((int[])object1).length - 1;
                    for(int v10 = zzftv.zza(object0.hashCode()); true; v10 = v11 + 1) {
                        int v11 = v10 & v9;
                        int v12 = ((int[])object1)[v11];
                        if(v12 == -1) {
                            break;
                        }
                        if(object0.equals(arr_object[v12])) {
                            object3 = arr_object[v12 ^ 1];
                            return object3 == null ? null : object3;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzfug
    final zzfty zza() {
        return new zzfvr(this.zzb, 1, this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzfug
    final zzfui zzf() {
        return new zzfvp(this, this.zzb, 0, this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzfug
    final zzfui zzg() {
        return new zzfvq(this, new zzfvr(this.zzb, 0, this.zzd));
    }

    static zzfvs zzj(int v, Object[] arr_object, zzfuf zzfuf0) {
        short[] arr_v;
        byte[] arr_b = null;
        if(v == 0) {
            return (zzfvs)zzfvs.zza;
        }
        if(v == 1) {
            Object object0 = arr_object[0];
            object0.getClass();
            Object object1 = arr_object[1];
            object1.getClass();
            zzfta.zzb(object0, object1);
            return new zzfvs(null, arr_object, 1);
        }
        zzfri.zzb(v, arr_object.length >> 1, "index");
        int v1 = zzfui.zzh(v);
        if(v1 <= 0x80) {
            byte[] arr_b1 = new byte[v1];
            Arrays.fill(arr_b1, -1);
            int v3 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                int v4 = v3 + v3;
                int v5 = v2 + v2;
                Object object2 = arr_object[v5];
                object2.getClass();
                Object object3 = arr_object[v5 ^ 1];
                object3.getClass();
                zzfta.zzb(object2, object3);
                for(int v6 = zzftv.zza(object2.hashCode()); true; v6 = v7 + 1) {
                    int v7 = v6 & v1 - 1;
                    int v8 = arr_b1[v7] & 0xFF;
                    if(v8 == 0xFF) {
                        arr_b1[v7] = (byte)v4;
                        if(v3 < v2) {
                            arr_object[v4] = object2;
                            arr_object[v4 ^ 1] = object3;
                        }
                        ++v3;
                        break;
                    }
                    if(object2.equals(arr_object[v8])) {
                        Object object4 = arr_object[v8 ^ 1];
                        object4.getClass();
                        zzfue zzfue0 = new zzfue(object2, object3, object4);
                        arr_object[v8 ^ 1] = object3;
                        arr_b = zzfue0;
                        break;
                    }
                }
            }
            arr_b = v3 == v ? arr_b1 : new Object[]{arr_b1, v3, arr_b};
        }
        else if(v1 <= 0x8000) {
            arr_v = new short[v1];
            Arrays.fill(arr_v, -1);
            int v10 = 0;
            for(int v9 = 0; v9 < v; ++v9) {
                int v11 = v10 + v10;
                int v12 = v9 + v9;
                Object object5 = arr_object[v12];
                object5.getClass();
                Object object6 = arr_object[v12 ^ 1];
                object6.getClass();
                zzfta.zzb(object5, object6);
                for(int v13 = zzftv.zza(object5.hashCode()); true; v13 = v14 + 1) {
                    int v14 = v13 & v1 - 1;
                    int v15 = (char)arr_v[v14];
                    if(v15 == 0xFFFF) {
                        arr_v[v14] = (short)v11;
                        if(v10 < v9) {
                            arr_object[v11] = object5;
                            arr_object[v11 ^ 1] = object6;
                        }
                        ++v10;
                        break;
                    }
                    if(object5.equals(arr_object[v15])) {
                        Object object7 = arr_object[v15 ^ 1];
                        object7.getClass();
                        zzfue zzfue1 = new zzfue(object5, object6, object7);
                        arr_object[v15 ^ 1] = object6;
                        arr_b = zzfue1;
                        break;
                    }
                }
            }
            arr_b = v10 == v ? arr_v : new Object[]{arr_v, v10, arr_b};
        }
        else {
            arr_v = new int[v1];
            Arrays.fill(((int[])arr_v), -1);
            int v17 = 0;
            for(int v16 = 0; v16 < v; ++v16) {
                short v18 = v17 + v17;
                int v19 = v16 + v16;
                Object object8 = arr_object[v19];
                object8.getClass();
                Object object9 = arr_object[v19 ^ 1];
                object9.getClass();
                zzfta.zzb(object8, object9);
                for(int v20 = zzftv.zza(object8.hashCode()); true; v20 = v21 + 1) {
                    int v21 = v20 & v1 - 1;
                    int v22 = arr_v[v21];
                    if(v22 == -1) {
                        arr_v[v21] = v18;
                        if(v17 < v16) {
                            arr_object[v18] = object8;
                            arr_object[v18 ^ 1] = object9;
                        }
                        ++v17;
                        break;
                    }
                    if(object8.equals(arr_object[v22])) {
                        Object object10 = arr_object[v22 ^ 1];
                        object10.getClass();
                        zzfue zzfue2 = new zzfue(object8, object9, object10);
                        arr_object[v22 ^ 1] = object9;
                        arr_b = zzfue2;
                        break;
                    }
                }
            }
            arr_b = v17 == v ? arr_v : new Object[]{arr_v, v17, arr_b};
        }
        if(arr_b instanceof Object[]) {
            zzfue zzfue3 = (zzfue)((Object[])arr_b)[2];
            if(zzfuf0 == null) {
                throw zzfue3.zza();
            }
            zzfuf0.zzc = zzfue3;
            Object object11 = ((Object[])arr_b)[0];
            int v23 = (int)(((Integer)((Object[])arr_b)[1]));
            return new zzfvs(object11, Arrays.copyOf(arr_object, v23 + v23), v23);
        }
        return new zzfvs(arr_b, arr_object, v);
    }
}


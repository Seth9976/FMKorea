package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class zzgtd implements zzgtt {
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgta zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgso zzm;
    private final zzguk zzn;
    private final zzgrd zzo;
    private final zzgtf zzp;
    private final zzgsv zzq;

    static {
        zzgtd.zza = new int[0];
        zzgtd.zzb = zzguu.zzi();
    }

    private zzgtd(int[] arr_v, Object[] arr_object, int v, int v1, zzgta zzgta0, int v2, boolean z, int[] arr_v1, int v3, int v4, zzgtf zzgtf0, zzgso zzgso0, zzguk zzguk0, zzgrd zzgrd0, zzgsv zzgsv0) {
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zze = v;
        this.zzf = v1;
        this.zzi = zzgta0 instanceof zzgrq;
        this.zzh = zzgrd0 != null && zzgrd0.zzh(zzgta0);
        this.zzj = arr_v1;
        this.zzk = v3;
        this.zzl = v4;
        this.zzp = zzgtf0;
        this.zzm = zzgso0;
        this.zzn = zzguk0;
        this.zzo = zzgrd0;
        this.zzg = zzgta0;
        this.zzq = zzgsv0;
    }

    private final Object zzA(Object object0, int v) {
        zzgtt zzgtt0 = this.zzx(v);
        int v1 = this.zzu(v);
        if(!this.zzN(object0, v)) {
            return zzgtt0.zze();
        }
        Object object1 = zzgtd.zzb.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(zzgtd.zzQ(object1)) {
            return object1;
        }
        Object object2 = zzgtt0.zze();
        if(object1 != null) {
            zzgtt0.zzg(object2, object1);
        }
        return object2;
    }

    private final Object zzB(Object object0, int v, int v1) {
        zzgtt zzgtt0 = this.zzx(v1);
        if(!this.zzR(object0, v, v1)) {
            return zzgtt0.zze();
        }
        int v2 = this.zzu(v1);
        Object object1 = zzgtd.zzb.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(zzgtd.zzQ(object1)) {
            return object1;
        }
        Object object2 = zzgtt0.zze();
        if(object1 != null) {
            zzgtt0.zzg(object2, object1);
        }
        return object2;
    }

    private static Field zzC(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            throw new RuntimeException("Field " + s + " for " + class0.getName() + " not found. Known fields are " + Arrays.toString(arr_field));
        }
    }

    private static void zzD(Object object0) {
        if(!zzgtd.zzQ(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    private final void zzE(Object object0, Object object1, int v) {
        if(!this.zzN(object1, v)) {
            return;
        }
        int v1 = this.zzu(v);
        Unsafe unsafe0 = zzgtd.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1.toString());
        }
        zzgtt zzgtt0 = this.zzx(v);
        if(!this.zzN(object0, v)) {
            if(zzgtd.zzQ(object2)) {
                Object object3 = zzgtt0.zze();
                zzgtt0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.zzH(object0, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!zzgtd.zzQ(object4)) {
            Object object5 = zzgtt0.zze();
            zzgtt0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzgtt0.zzg(object4, object2);
    }

    private final void zzF(Object object0, Object object1, int v) {
        int v1 = this.zzc[v];
        if(!this.zzR(object1, v1, v)) {
            return;
        }
        int v2 = this.zzu(v);
        Unsafe unsafe0 = zzgtd.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1.toString());
        }
        zzgtt zzgtt0 = this.zzx(v);
        if(!this.zzR(object0, v1, v)) {
            if(zzgtd.zzQ(object2)) {
                Object object3 = zzgtt0.zze();
                zzgtt0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            this.zzI(object0, v1, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!zzgtd.zzQ(object4)) {
            Object object5 = zzgtt0.zze();
            zzgtt0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzgtt0.zzg(object4, object2);
    }

    private final void zzG(Object object0, int v, zzgtl zzgtl0) {
        if(zzgtd.zzM(v)) {
            zzguu.zzv(object0, ((long)(v & 0xFFFFF)), zzgtl0.zzs());
            return;
        }
        if(this.zzi) {
            zzguu.zzv(object0, ((long)(v & 0xFFFFF)), zzgtl0.zzr());
            return;
        }
        zzguu.zzv(object0, ((long)(v & 0xFFFFF)), zzgtl0.zzp());
    }

    private final void zzH(Object object0, int v) {
        int v1 = this.zzr(v);
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        zzguu.zzt(object0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | zzguu.zzd(object0, ((long)(0xFFFFF & v1))));
    }

    private final void zzI(Object object0, int v, int v1) {
        zzguu.zzt(object0, ((long)(this.zzr(v1) & 0xFFFFF)), v);
    }

    private final void zzJ(Object object0, int v, Object object1) {
        int v1 = this.zzu(v);
        zzgtd.zzb.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.zzH(object0, v);
    }

    private final void zzK(Object object0, int v, int v1, Object object1) {
        int v2 = this.zzu(v1);
        zzgtd.zzb.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        this.zzI(object0, v, v1);
    }

    private final boolean zzL(Object object0, Object object1, int v) {
        return this.zzN(object0, v) == this.zzN(object1, v);
    }

    private static boolean zzM(int v) {
        return (v & 0x20000000) != 0;
    }

    private final boolean zzN(Object object0, int v) {
        int v1 = this.zzr(v);
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.zzu(v);
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    return Double.doubleToRawLongBits(zzguu.zzb(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(zzguu.zzc(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return zzguu.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzguu.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzguu.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzguu.zzz(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzguu.zzh(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzgqi)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzgqi.zzb.equals(object1);
                }
                case 9: {
                    return zzguu.zzh(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzguu.zzh(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzgqi.zzb.equals(object2);
                }
                case 11: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzguu.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzguu.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzguu.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzguu.zzh(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (zzguu.zzd(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    private final boolean zzO(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.zzN(object0, v) : (v2 & v3) != 0;
    }

    private static boolean zzP(Object object0, int v, zzgtt zzgtt0) {
        return zzgtt0.zzk(zzguu.zzh(object0, ((long)(v & 0xFFFFF))));
    }

    private static boolean zzQ(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof zzgrq ? ((zzgrq)object0).zzaY() : true;
    }

    private final boolean zzR(Object object0, int v, int v1) {
        return zzguu.zzd(object0, ((long)(this.zzr(v1) & 0xFFFFF))) == v;
    }

    private static boolean zzS(Object object0, long v) {
        return ((Boolean)zzguu.zzh(object0, v)).booleanValue();
    }

    private static final void zzT(int v, Object object0, zzgqy zzgqy0) {
        if(object0 instanceof String) {
            zzgqy0.zzF(v, ((String)object0));
            return;
        }
        zzgqy0.zzd(v, ((zzgqi)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object object0) {
        int v13;
        int v51;
        int v50;
        int v47;
        int v46;
        int v45;
        int v44;
        int v43;
        int v42;
        int v41;
        int v38;
        int v34;
        int v25;
        int v24;
        int v23;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = zzgtd.zzb;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v2 < this.zzc.length) {
            int v4 = this.zzu(v2);
            int v5 = v4 >>> 20 & 0xFF;
            int v6 = this.zzc[v2];
            int v7 = this.zzc[v2 + 2];
            int v8 = v7 & 0xFFFFF;
            if(v5 <= 17) {
                if(v8 != v) {
                    v1 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
                v9 = 1 << (v7 >>> 20);
                v10 = v;
                v11 = v1;
            }
            else {
                v10 = v;
                v11 = v1;
                v9 = 0;
            }
            boolean z = v5 < zzgri.zzJ.zza();
            long v12 = (long)(v4 & 0xFFFFF);
            switch(v5) {
                case 0: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v14 = zzgqx.zzA(v6 << 3);
                        v18 = v14 + 8;
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_31;
                }
                case 1: {
                label_31:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v15 = zzgqx.zzA(v6 << 3);
                        v18 = v15 + 4;
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_35;
                }
                case 2: {
                label_35:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v16 = zzgqx.zzB(unsafe0.getLong(object0, v12));
                        v17 = zzgqx.zzA(v6 << 3);
                        goto label_92;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_40;
                }
                case 3: {
                label_40:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v16 = zzgqx.zzB(unsafe0.getLong(object0, v12));
                        v17 = zzgqx.zzA(v6 << 3);
                        goto label_92;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_45;
                }
                case 4: {
                label_45:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v16 = zzgqx.zzx(unsafe0.getInt(object0, v12));
                        v17 = zzgqx.zzA(v6 << 3);
                        goto label_92;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_50;
                }
                case 5: {
                label_50:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v14 = zzgqx.zzA(v6 << 3);
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    v18 = v14 + 8;
                    goto label_101;
                }
                case 6: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v15 = zzgqx.zzA(v6 << 3);
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    v18 = v15 + 4;
                    goto label_101;
                }
                case 7: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v18 = zzgqx.zzA(v6 << 3) + 1;
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_64;
                }
                case 8: {
                label_64:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        Object object1 = unsafe0.getObject(object0, v12);
                        if(object1 instanceof zzgqi) {
                            int v19 = ((zzgqi)object1).zzd();
                            v18 = zzgqx.zzA(v6 << 3) + (zzgqx.zzA(v19) + v19);
                            goto label_101;
                        }
                        else {
                            v16 = zzgqx.zzz(((String)object1));
                            v17 = zzgqx.zzA(v6 << 3);
                            goto label_92;
                        }
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_74;
                }
                case 9: {
                label_74:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v18 = zzgtv.zzh(v6, unsafe0.getObject(object0, v12), this.zzx(v2));
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_78;
                }
                case 10: {
                label_78:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        int v20 = ((zzgqi)unsafe0.getObject(object0, v12)).zzd();
                        v18 = zzgqx.zzA(v6 << 3) + (zzgqx.zzA(v20) + v20);
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_83;
                }
                case 11: {
                label_83:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v16 = zzgqx.zzA(unsafe0.getInt(object0, v12));
                        v17 = zzgqx.zzA(v6 << 3);
                        goto label_92;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_88;
                }
                case 12: {
                label_88:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v16 = zzgqx.zzx(unsafe0.getInt(object0, v12));
                        v17 = zzgqx.zzA(v6 << 3);
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                label_92:
                    v3 = v13 + (v17 + v16);
                    break;
                }
                case 13: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v18 = zzgqx.zzA(v6 << 3) + 4;
                        goto label_101;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                    goto label_98;
                }
                case 14: {
                label_98:
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        v18 = zzgqx.zzA(v6 << 3) + 8;
                    }
                    else {
                        v3 = v13;
                        break;
                    }
                label_101:
                    v3 = v13 + v18;
                    break;
                }
                case 15: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        int v21 = unsafe0.getInt(object0, v12);
                        v3 = v13 + (zzgqx.zzA(v6 << 3) + zzgqx.zzA(v21 >> 0x1F ^ v21 + v21));
                    }
                    else {
                        v3 = v13;
                    }
                    break;
                }
                case 16: {
                    v13 = v3;
                    if(this.zzO(object0, v2, v10, v11, v9)) {
                        long v22 = unsafe0.getLong(object0, v12);
                        v3 = v13 + (zzgqx.zzA(v6 << 3) + zzgqx.zzB(v22 >> 0x3F ^ v22 + v22));
                    }
                    else {
                        v3 = v13;
                    }
                    break;
                }
                case 17: {
                    v13 = v3;
                    v3 = this.zzO(object0, v2, v10, v11, v9) ? v13 + zzgqx.zzw(v6, ((zzgta)unsafe0.getObject(object0, v12)), this.zzx(v2)) : v13;
                    break;
                }
                case 18: {
                    v3 += zzgtv.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    break;
                }
                case 19: {
                    v3 += zzgtv.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    break;
                }
                case 20: {
                    List list0 = (List)unsafe0.getObject(object0, v12);
                    if(list0.size() != 0) {
                        v23 = zzgtv.zzg(list0) + list0.size() * zzgqx.zzA(v6 << 3);
                        v3 += v23;
                        break;
                    }
                    break;
                }
                case 21: {
                    List list1 = (List)unsafe0.getObject(object0, v12);
                    v24 = list1.size();
                    if(v24 != 0) {
                        v3 += zzgtv.zzl(list1) + v24 * zzgqx.zzA(v6 << 3);
                    }
                    break;
                }
                case 22: {
                    List list2 = (List)unsafe0.getObject(object0, v12);
                    v24 = list2.size();
                    if(v24 != 0) {
                        v23 = zzgtv.zzf(list2) + v24 * zzgqx.zzA(v6 << 3);
                        v3 += v23;
                        break;
                    }
                    break;
                }
                case 23: {
                    v25 = zzgtv.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v25;
                    break;
                }
                case 24: {
                    v3 += zzgtv.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    break;
                }
                case 25: {
                    int v26 = ((List)unsafe0.getObject(object0, v12)).size();
                    if(v26 != 0) {
                        v25 = v26 * (zzgqx.zzA(v6 << 3) + 1);
                        v3 += v25;
                        break;
                    }
                    v25 = 0;
                    v3 += v25;
                    break;
                }
                case 26: {
                    List list3 = (List)unsafe0.getObject(object0, v12);
                    int v27 = list3.size();
                    if(v27 == 0) {
                        v23 = 0;
                    }
                    else {
                        int v28 = zzgqx.zzA(v6 << 3) * v27;
                        if(list3 instanceof zzgsi) {
                            zzgsi zzgsi0 = (zzgsi)list3;
                            v23 = v28;
                            for(int v29 = 0; v29 < v27; ++v29) {
                                Object object2 = zzgsi0.zzf(v29);
                                if(object2 instanceof zzgqi) {
                                    int v30 = ((zzgqi)object2).zzd();
                                    v23 += zzgqx.zzA(v30) + v30;
                                }
                                else {
                                    v23 += zzgqx.zzz(((String)object2));
                                }
                            }
                        }
                        else {
                            v23 = v28;
                            for(int v31 = 0; v31 < v27; ++v31) {
                                Object object3 = list3.get(v31);
                                if(object3 instanceof zzgqi) {
                                    int v32 = ((zzgqi)object3).zzd();
                                    v23 += zzgqx.zzA(v32) + v32;
                                }
                                else {
                                    v23 += zzgqx.zzz(((String)object3));
                                }
                            }
                        }
                    }
                    v3 += v23;
                    break;
                }
                case 27: {
                    List list4 = (List)unsafe0.getObject(object0, v12);
                    zzgtt zzgtt0 = this.zzx(v2);
                    int v33 = list4.size();
                    if(v33 == 0) {
                        v34 = 0;
                    }
                    else {
                        v34 = zzgqx.zzA(v6 << 3) * v33;
                        for(int v35 = 0; v35 < v33; ++v35) {
                            Object object4 = list4.get(v35);
                            if(object4 instanceof zzgsg) {
                                int v36 = ((zzgsg)object4).zza();
                                v34 += zzgqx.zzA(v36) + v36;
                            }
                            else {
                                v34 += zzgqx.zzy(((zzgta)object4), zzgtt0);
                            }
                        }
                    }
                    v3 += v34;
                    break;
                }
                case 28: {
                    List list5 = (List)unsafe0.getObject(object0, v12);
                    int v37 = list5.size();
                    if(v37 == 0) {
                        v38 = 0;
                    }
                    else {
                        v38 = v37 * zzgqx.zzA(v6 << 3);
                        for(int v39 = 0; v39 < list5.size(); ++v39) {
                            int v40 = ((zzgqi)list5.get(v39)).zzd();
                            v38 += zzgqx.zzA(v40) + v40;
                        }
                    }
                    v3 += v38;
                    break;
                }
                case 29: {
                    List list6 = (List)unsafe0.getObject(object0, v12);
                    v41 = list6.size();
                    if(v41 != 0) {
                        v42 = zzgtv.zzk(list6);
                        v43 = zzgqx.zzA(v6 << 3);
                        v25 = v42 + v41 * v43;
                        v3 += v25;
                        break;
                    }
                    v25 = 0;
                    v3 += v25;
                    break;
                }
                case 30: {
                    List list7 = (List)unsafe0.getObject(object0, v12);
                    v41 = list7.size();
                    if(v41 != 0) {
                        v42 = zzgtv.zza(list7);
                        v43 = zzgqx.zzA(v6 << 3);
                        v25 = v42 + v41 * v43;
                        v3 += v25;
                        break;
                    }
                    v25 = 0;
                    v3 += v25;
                    break;
                }
                case 0x1F: {
                    v25 = zzgtv.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v25;
                    break;
                }
                case 0x20: {
                    v3 += zzgtv.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    break;
                }
                case 33: {
                    List list8 = (List)unsafe0.getObject(object0, v12);
                    v41 = list8.size();
                    if(v41 != 0) {
                        v42 = zzgtv.zzi(list8);
                        v43 = zzgqx.zzA(v6 << 3);
                        v25 = v42 + v41 * v43;
                        v3 += v25;
                        break;
                    }
                    v25 = 0;
                    v3 += v25;
                    break;
                }
                case 34: {
                    List list9 = (List)unsafe0.getObject(object0, v12);
                    v41 = list9.size();
                    v25 = v41 == 0 ? 0 : zzgtv.zzj(list9) + v41 * zzgqx.zzA(v6 << 3);
                    v3 += v25;
                    break;
                }
                case 35: {
                    v44 = zzgtv.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 36: {
                    v44 = zzgtv.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 37: {
                    v44 = zzgtv.zzg(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 38: {
                    v44 = zzgtv.zzl(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 39: {
                    v44 = zzgtv.zzf(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 40: {
                    v44 = zzgtv.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 41: {
                    v44 = zzgtv.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 42: {
                    v44 = ((List)unsafe0.getObject(object0, v12)).size();
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 43: {
                    v44 = zzgtv.zzk(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 44: {
                    v44 = zzgtv.zza(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 45: {
                    v44 = zzgtv.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 46: {
                    v44 = zzgtv.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 0x2F: {
                    v44 = zzgtv.zzi(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v45 = zzgqx.zzA(v44);
                        v46 = zzgqx.zzA(v6 << 3);
                        v47 = v46 + v45;
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 0x30: {
                    v44 = zzgtv.zzj(((List)unsafe0.getObject(object0, v12)));
                    if(v44 > 0) {
                        v47 = zzgqx.zzA(v6 << 3) + zzgqx.zzA(v44);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 49: {
                    List list10 = (List)unsafe0.getObject(object0, v12);
                    zzgtt zzgtt1 = this.zzx(v2);
                    int v48 = list10.size();
                    if(v48 == 0) {
                        v34 = 0;
                    }
                    else {
                        v34 = 0;
                        for(int v49 = 0; v49 < v48; ++v49) {
                            v34 += zzgqx.zzw(v6, ((zzgta)list10.get(v49)), zzgtt1);
                        }
                    }
                    v3 += v34;
                    break;
                }
                case 50: {
                    Object object5 = unsafe0.getObject(object0, v12);
                    Object object6 = this.zzz(v2);
                    zzgsu zzgsu0 = (zzgsu)object5;
                    zzgst zzgst0 = (zzgst)object6;
                    if(!zzgsu0.isEmpty()) {
                        Iterator iterator0 = zzgsu0.entrySet().iterator();
                        if(iterator0.hasNext()) {
                            Object object7 = iterator0.next();
                            ((Map.Entry)object7).getKey();
                            ((Map.Entry)object7).getValue();
                            throw null;
                        }
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 51: {
                    if(this.zzR(object0, v6, v2)) {
                        v50 = zzgqx.zzA(v6 << 3);
                        v25 = v50 + 8;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 52: {
                    if(this.zzR(object0, v6, v2)) {
                        v51 = zzgqx.zzA(v6 << 3);
                        v25 = v51 + 4;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 53: {
                    if(this.zzR(object0, v6, v2)) {
                        v44 = zzgqx.zzB(zzgtd.zzv(object0, v12));
                        v47 = zzgqx.zzA(v6 << 3);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 54: {
                    if(this.zzR(object0, v6, v2)) {
                        v44 = zzgqx.zzB(zzgtd.zzv(object0, v12));
                        v47 = zzgqx.zzA(v6 << 3);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 55: {
                    if(this.zzR(object0, v6, v2)) {
                        v44 = zzgqx.zzx(zzgtd.zzp(object0, v12));
                        v47 = zzgqx.zzA(v6 << 3);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 56: {
                    if(this.zzR(object0, v6, v2)) {
                        v50 = zzgqx.zzA(v6 << 3);
                        v25 = v50 + 8;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 57: {
                    if(this.zzR(object0, v6, v2)) {
                        v51 = zzgqx.zzA(v6 << 3);
                        v25 = v51 + 4;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 58: {
                    if(this.zzR(object0, v6, v2)) {
                        v25 = zzgqx.zzA(v6 << 3) + 1;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 59: {
                    if(this.zzR(object0, v6, v2)) {
                        Object object8 = unsafe0.getObject(object0, v12);
                        if(object8 instanceof zzgqi) {
                            int v52 = ((zzgqi)object8).zzd();
                            v25 = zzgqx.zzA(v6 << 3) + (zzgqx.zzA(v52) + v52);
                            v3 += v25;
                        }
                        else {
                            v44 = zzgqx.zzz(((String)object8));
                            v47 = zzgqx.zzA(v6 << 3);
                            v3 += v47 + v44;
                        }
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 60: {
                    if(this.zzR(object0, v6, v2)) {
                        v25 = zzgtv.zzh(v6, unsafe0.getObject(object0, v12), this.zzx(v2));
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 61: {
                    if(this.zzR(object0, v6, v2)) {
                        int v53 = ((zzgqi)unsafe0.getObject(object0, v12)).zzd();
                        v25 = zzgqx.zzA(v6 << 3) + (zzgqx.zzA(v53) + v53);
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 62: {
                    if(this.zzR(object0, v6, v2)) {
                        v44 = zzgqx.zzA(zzgtd.zzp(object0, v12));
                        v47 = zzgqx.zzA(v6 << 3);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 0x3F: {
                    if(this.zzR(object0, v6, v2)) {
                        v44 = zzgqx.zzx(zzgtd.zzp(object0, v12));
                        v47 = zzgqx.zzA(v6 << 3);
                        v3 += v47 + v44;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 0x40: {
                    if(this.zzR(object0, v6, v2)) {
                        v25 = zzgqx.zzA(v6 << 3) + 4;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 65: {
                    if(this.zzR(object0, v6, v2)) {
                        v25 = zzgqx.zzA(v6 << 3) + 8;
                        v3 += v25;
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 66: {
                    if(this.zzR(object0, v6, v2)) {
                        int v54 = zzgtd.zzp(object0, v12);
                        v3 += zzgqx.zzA(v6 << 3) + zzgqx.zzA(v54 >> 0x1F ^ v54 + v54);
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 67: {
                    if(this.zzR(object0, v6, v2)) {
                        long v55 = zzgtd.zzv(object0, v12);
                        v3 += zzgqx.zzA(v6 << 3) + zzgqx.zzB(v55 >> 0x3F ^ v55 + v55);
                        break;
                    }
                    v13 = v3;
                    v3 = v13;
                    break;
                }
                case 68: {
                    if(this.zzR(object0, v6, v2)) {
                        v3 += zzgqx.zzw(v6, ((zzgta)unsafe0.getObject(object0, v12)), this.zzx(v2));
                        break;
                    }
                    else {
                        v13 = v3;
                    }
                    v3 = v13;
                    break;
                }
                default: {
                    v13 = v3;
                    v3 = v13;
                    break;
                }
            }
            v2 += 3;
            v = v10;
            v1 = v11;
        }
        Object object9 = this.zzn.zzd(object0);
        int v56 = this.zzn.zza(object9);
        if(!this.zzh) {
            return v3 + v56;
        }
        this.zzo.zza(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object object0) {
        int v8;
        long v7;
        int v6;
        int v1 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v2 = this.zzu(v);
            int v3 = this.zzc[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = Double.doubleToLongBits(zzguu.zzb(object0, v4));
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v8 = Float.floatToIntBits(zzguu.zzc(object0, v4));
                    v1 = v6 + v8;
                    break;
                }
                case 2: {
                    v6 = v1 * 53;
                    v7 = zzguu.zzf(object0, v4);
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 3: {
                    v6 = v1 * 53;
                    v7 = zzguu.zzf(object0, v4);
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 4: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 5: {
                    v6 = v1 * 53;
                    v7 = zzguu.zzf(object0, v4);
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 6: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 7: {
                    v6 = v1 * 53;
                    v8 = zzgsa.zza(zzguu.zzz(object0, v4));
                    v1 = v6 + v8;
                    break;
                }
                case 8: {
                    v6 = v1 * 53;
                    v8 = ((String)zzguu.zzh(object0, v4)).hashCode();
                    v1 = v6 + v8;
                    break;
                }
                case 9: {
                    Object object1 = zzguu.zzh(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzh(object0, v4).hashCode();
                    v1 = v6 + v8;
                    break;
                }
                case 11: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 12: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 13: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 14: {
                    v6 = v1 * 53;
                    v7 = zzguu.zzf(object0, v4);
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 15: {
                    v6 = v1 * 53;
                    v8 = zzguu.zzd(object0, v4);
                    v1 = v6 + v8;
                    break;
                }
                case 16: {
                    v6 = v1 * 53;
                    v7 = zzguu.zzf(object0, v4);
                    v8 = (int)(v7 ^ v7 >>> 0x20);
                    v1 = v6 + v8;
                    break;
                }
                case 17: {
                    Object object2 = zzguu.zzh(object0, v4);
                    if(object2 != null) {
                        v5 = object2.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = v1 * 53 + zzguu.zzh(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + zzguu.zzh(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = Double.doubleToLongBits(zzgtd.zzn(object0, v4));
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 52: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzgtd.zzo(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = zzgtd.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 54: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = zzgtd.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 55: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = zzgtd.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 57: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgsa.zza(zzgtd.zzS(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzguu.zzh(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzguu.zzh(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzguu.zzh(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = zzgtd.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 66: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgtd.zzp(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zzR(object0, v3, v)) {
                        v7 = zzgtd.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v7 ^ v7 >>> 0x20));
                    }
                    break;
                }
                case 68: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzguu.zzh(object0, v4).hashCode();
                    }
                }
            }
        }
        int v9 = this.zzn.zzd(object0).hashCode();
        if(!this.zzh) {
            return v1 * 53 + v9;
        }
        this.zzo.zza(object0);
        throw null;
    }

    final int zzc(Object object0, byte[] arr_b, int v, int v1, int v2, zzgpu zzgpu0) {
        int v94;
        int v93;
        int v95;
        int v90;
        int v89;
        int v88;
        int v84;
        int v83;
        int v82;
        int v76;
        int v59;
        zzgpu zzgpu4;
        int v58;
        int v57;
        int v56;
        int v55;
        int v48;
        int v47;
        int v46;
        int v67;
        long v43;
        int v41;
        int v40;
        int v39;
        zzgpu zzgpu3;
        int v38;
        int v30;
        int v29;
        zzgpu zzgpu2;
        Unsafe unsafe4;
        int v33;
        int v32;
        Unsafe unsafe3;
        int v27;
        int v26;
        Unsafe unsafe2;
        int v17;
        int v16;
        int v15;
        int v14;
        Unsafe unsafe1;
        int v13;
        int v11;
        int v3 = v1;
        zzgpu zzgpu1 = zzgpu0;
        zzgtd.zzD(object0);
        Unsafe unsafe0 = zzgtd.zzb;
        int v4 = v;
        int v5 = 0xFFFFF;
        int v6 = -1;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(true) {
            if(v4 >= v3) {
                goto label_924;
            }
            int v10 = arr_b[v4];
            if(v10 < 0) {
                v11 = zzgpv.zzi(v10, arr_b, v4 + 1, zzgpu1);
                v10 = zzgpu1.zza;
            }
            else {
                v11 = v4 + 1;
            }
            int v12 = v10 >>> 3;
            if(v12 <= v6) {
                v13 = this.zzq(v12);
            }
            else if(v12 < this.zze || v12 > this.zzf) {
                v13 = -1;
            }
            else {
                v13 = this.zzs(v12, v7 / 3);
            }
            if(v13 == -1) {
                v8 = v10;
                unsafe1 = unsafe0;
                v14 = v12;
                v15 = v11;
                v16 = v9;
                v7 = 0;
                v17 = v3;
            }
            else {
                int v18 = v10 & 7;
                int[] arr_v = this.zzc;
                int v19 = arr_v[v13 + 1];
                int v20 = v10;
                int v21 = v19 >>> 20 & 0xFF;
                long v22 = (long)(v19 & 0xFFFFF);
                if(v21 <= 17) {
                    int v23 = arr_v[v13 + 2];
                    int v24 = 1 << (v23 >>> 20);
                    int v25 = v23 & 0xFFFFF;
                    if(v25 == v5) {
                        unsafe3 = unsafe0;
                        v16 = v9;
                        v27 = v5;
                    }
                    else {
                        if(v5 == 0xFFFFF) {
                            unsafe2 = unsafe0;
                        }
                        else {
                            unsafe2 = unsafe0;
                            unsafe2.putInt(object0, ((long)v5), v9);
                        }
                        v26 = v25;
                        v27 = v26;
                        v16 = v26 == 0xFFFFF ? 0 : unsafe2.getInt(object0, ((long)v26));
                        unsafe3 = unsafe2;
                    }
                    switch(v21) {
                        case 0: {
                        label_78:
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 1) {
                                zzguu.zzr(object0, v22, Double.longBitsToDouble(zzgpv.zzn(arr_b, v11)));
                                v4 = v11 + 8;
                                goto label_232;
                            }
                            break;
                        }
                        case 1: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 5) {
                                zzguu.zzs(object0, v22, Float.intBitsToFloat(zzgpv.zzb(arr_b, v11)));
                                v4 = v11 + 4;
                                goto label_232;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 0) {
                                int v31 = zzgpv.zzk(arr_b, v11, zzgpu2);
                                unsafe4.putLong(object0, v22, zzgpu2.zzb);
                                v3 = v1;
                                zzgpu1 = zzgpu2;
                                unsafe0 = unsafe4;
                                v8 = v20;
                                v5 = v27;
                                v9 = v16 | v24;
                                v4 = v31;
                                v6 = v30;
                                v7 = v29;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 0) {
                                v4 = zzgpv.zzk(arr_b, v11, zzgpu2);
                                zzguu.zzp(object0, v22, zzgpu2.zzb != 0L);
                                goto label_232;
                            }
                            break;
                        }
                        case 8: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 2) {
                                if(zzgtd.zzM(v19)) {
                                    v4 = zzgpv.zzh(arr_b, v11, zzgpu2);
                                    v32 = zzgpu2.zza;
                                    if(v32 >= 0) {
                                        if(v32 == 0) {
                                            zzgpu2.zzc = "";
                                        }
                                        else {
                                            zzgpu2.zzc = zzguz.zzh(arr_b, v4, v32);
                                            v4 += v32;
                                        }
                                        unsafe4.putObject(object0, v22, zzgpu2.zzc);
                                        goto label_232;
                                    }
                                }
                                else {
                                    v4 = zzgpv.zzh(arr_b, v11, zzgpu2);
                                    v32 = zzgpu2.zza;
                                    if(v32 >= 0) {
                                        if(v32 == 0) {
                                            zzgpu2.zzc = "";
                                        }
                                        else {
                                            zzgpu2.zzc = new String(arr_b, v4, v32, zzgsa.zzb);
                                            v4 += v32;
                                        }
                                        unsafe4.putObject(object0, v22, zzgpu2.zzc);
                                        goto label_232;
                                    }
                                }
                                throw zzgsc.zzf();
                            }
                            break;
                        }
                        case 9: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v8 = v20;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 2) {
                                Object object2 = this.zzA(object0, v29);
                                v3 = v1;
                                v4 = zzgpv.zzm(object2, this.zzx(v29), arr_b, v11, v3, zzgpu0);
                                this.zzJ(object0, v29, object2);
                                v33 = v16 | v24;
                                goto label_210;
                            }
                            else {
                                v20 = v8;
                                break;
                            }
                            goto label_184;
                        }
                        case 10: {
                        label_184:
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v8 = v20;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 2) {
                                v4 = zzgpv.zza(arr_b, v11, zzgpu2);
                                unsafe4.putObject(object0, v22, zzgpu2.zzc);
                                v33 = v16 | v24;
                                v3 = v1;
                                goto label_210;
                            }
                            else {
                                v20 = v8;
                                break;
                            }
                            goto label_197;
                        }
                        case 4: 
                        case 11: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 0) {
                                v4 = zzgpv.zzh(arr_b, v11, zzgpu2);
                                unsafe4.putInt(object0, v22, zzgpu2.zza);
                                goto label_232;
                            }
                            break;
                        }
                        case 12: {
                        label_197:
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 0) {
                                v4 = zzgpv.zzh(arr_b, v11, zzgpu2);
                                int v34 = zzgpu2.zza;
                                zzgru zzgru0 = this.zzw(v29);
                                if((0x80000000 & v19) != 0 && zzgru0 != null && !zzgru0.zza(v34)) {
                                    v8 = v20;
                                    zzgtd.zzd(object0).zzj(v8, ((long)v34));
                                    v3 = v1;
                                    v6 = v30;
                                    v7 = v29;
                                    zzgpu1 = zzgpu2;
                                    unsafe0 = unsafe4;
                                    v9 = v16;
                                    v5 = v27;
                                }
                                else {
                                    v8 = v20;
                                    unsafe4.putInt(object0, v22, v34);
                                    v33 = v16 | v24;
                                    v3 = v1;
                                label_210:
                                    v6 = v30;
                                    v7 = v29;
                                    zzgpu1 = zzgpu2;
                                    unsafe0 = unsafe4;
                                    v5 = v27;
                                    v9 = v33;
                                }
                                continue;
                            }
                            break;
                        }
                        case 6: 
                        case 13: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 5) {
                                unsafe4.putInt(object0, v22, zzgpv.zzb(arr_b, v11));
                                v4 = v11 + 4;
                                goto label_232;
                            }
                            break;
                        }
                        case 5: 
                        case 14: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 1) {
                                unsafe4.putLong(object0, v22, zzgpv.zzn(arr_b, v11));
                                v4 = v11 + 8;
                                goto label_232;
                            }
                            break;
                        }
                        case 15: {
                            unsafe4 = unsafe3;
                            zzgpu2 = zzgpu1;
                            v29 = v13;
                            v30 = v12;
                            if(v18 == 0) {
                                v4 = zzgpv.zzh(arr_b, v11, zzgpu2);
                                unsafe4.putInt(object0, v22, zzgpu2.zza >>> 1 ^ -(zzgpu2.zza & 1));
                            label_232:
                                v33 = v16 | v24;
                                v3 = v1;
                                v6 = v30;
                                v7 = v29;
                                zzgpu1 = zzgpu2;
                                unsafe0 = unsafe4;
                                v8 = v20;
                                v5 = v27;
                                v9 = v33;
                                continue;
                            }
                            break;
                        }
                        case 16: {
                            if(v18 == 0) {
                                int v35 = zzgpv.zzk(arr_b, v11, zzgpu1);
                                unsafe3.putLong(object0, v22, zzgpu1.zzb >>> 1 ^ -(1L & zzgpu1.zzb));
                                v3 = v1;
                                v7 = v13;
                                unsafe0 = unsafe3;
                                v8 = v20;
                                v5 = v27;
                                v9 = v16 | v24;
                                v4 = v35;
                                v6 = v12;
                                continue;
                            }
                            else {
                                v30 = v12;
                                unsafe4 = unsafe3;
                                v29 = v13;
                                zzgpu2 = zzgpu1;
                            }
                            break;
                        }
                        default: {
                            if(v18 == 3) {
                                Object object1 = this.zzA(object0, v13);
                                int v28 = zzgpv.zzl(object1, this.zzx(v13), arr_b, v11, v1, v12 << 3 | 4, zzgpu0);
                                this.zzJ(object0, v13, object1);
                                v9 = v16 | v24;
                                v4 = v28;
                                v6 = v12;
                                unsafe0 = unsafe3;
                                v7 = v13;
                                v8 = v20;
                                v5 = v27;
                                v3 = v1;
                                continue;
                            }
                            else {
                                unsafe4 = unsafe3;
                                zzgpu2 = zzgpu1;
                                v29 = v13;
                                v30 = v12;
                                break;
                            }
                            goto label_78;
                        }
                    }
                    v14 = v30;
                    v7 = v29;
                    v15 = v11;
                    zzgpu1 = zzgpu2;
                    unsafe1 = unsafe4;
                    v8 = v20;
                    v5 = v27;
                    v17 = v1;
                }
                else {
                    v16 = v9;
                    int v36 = 10;
                    if(v21 == 27) {
                        if(v18 == 2) {
                            zzgrz zzgrz0 = (zzgrz)unsafe0.getObject(object0, v22);
                            if(!zzgrz0.zzc()) {
                                int v37 = zzgrz0.size();
                                if(v37 != 0) {
                                    v36 = v37 + v37;
                                }
                                zzgrz0 = zzgrz0.zzd(v36);
                                unsafe0.putObject(object0, v22, zzgrz0);
                            }
                            v4 = zzgpv.zze(this.zzx(v13), v20, arr_b, v11, v1, zzgrz0, zzgpu0);
                            zzgpu1 = zzgpu0;
                            v6 = v12;
                            v8 = v20;
                            v7 = v13;
                            v9 = v16;
                            v3 = v1;
                            continue;
                        }
                        else {
                            v38 = v5;
                            zzgpu3 = zzgpu0;
                            unsafe1 = unsafe0;
                            v39 = v13;
                            v40 = v20;
                            v41 = v12;
                            goto label_704;
                        }
                        goto label_293;
                    }
                    else {
                    label_293:
                        v38 = v5;
                        zzgpu3 = zzgpu1;
                        v40 = v20;
                        if(v21 <= 49) {
                            Unsafe unsafe5 = zzgtd.zzb;
                            zzgrz zzgrz1 = (zzgrz)unsafe5.getObject(object0, v22);
                            if(zzgrz1.zzc()) {
                                v43 = (long)v19;
                            }
                            else {
                                int v42 = zzgrz1.size();
                                if(v42 != 0) {
                                    v36 = v42 + v42;
                                }
                                v43 = (long)v19;
                                zzgrz zzgrz2 = zzgrz1.zzd(v36);
                                unsafe5.putObject(object0, v22, zzgrz2);
                                zzgrz1 = zzgrz2;
                            }
                            switch(v21) {
                                case 26: {
                                    v55 = v13;
                                    zzgrz zzgrz3 = zzgrz1;
                                    v56 = v12;
                                    v57 = v11;
                                    v58 = v40;
                                    zzgpu4 = zzgpu3;
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        if((v43 & 0x20000000L) == 0L) {
                                            v67 = zzgpv.zzh(arr_b, v57, zzgpu4);
                                            int v68 = zzgpu4.zza;
                                            if(v68 >= 0) {
                                                if(v68 == 0) {
                                                    zzgrz3.add("");
                                                    goto label_525;
                                                }
                                                else {
                                                    zzgrz3.add(new String(arr_b, v67, v68, zzgsa.zzb));
                                                }
                                            alab1:
                                                while(true) {
                                                    v67 += v68;
                                                    while(true) {
                                                    label_525:
                                                        if(v67 >= v1) {
                                                            goto label_563;
                                                        }
                                                        int v69 = zzgpv.zzh(arr_b, v67, zzgpu4);
                                                        if(v58 != zzgpu4.zza) {
                                                            goto label_563;
                                                        }
                                                        v67 = zzgpv.zzh(arr_b, v69, zzgpu4);
                                                        v68 = zzgpu4.zza;
                                                        if(v68 < 0) {
                                                            break alab1;
                                                        }
                                                        if(v68 != 0) {
                                                            zzgrz3.add(new String(arr_b, v67, v68, zzgsa.zzb));
                                                            break;
                                                        }
                                                        zzgrz3.add("");
                                                    }
                                                }
                                                throw zzgsc.zzf();
                                            }
                                        }
                                        else {
                                            v67 = zzgpv.zzh(arr_b, v57, zzgpu4);
                                            int v70 = zzgpu4.zza;
                                            if(v70 >= 0) {
                                                if(v70 == 0) {
                                                    zzgrz3.add("");
                                                    goto label_548;
                                                }
                                                else {
                                                    int v71 = v67 + v70;
                                                    if(!zzguz.zzj(arr_b, v67, v71)) {
                                                        throw zzgsc.zzd();
                                                    }
                                                    zzgrz3.add(new String(arr_b, v67, v70, zzgsa.zzb));
                                                alab2:
                                                    while(true) {
                                                        v67 = v71;
                                                        while(true) {
                                                        label_548:
                                                            if(v67 >= v1) {
                                                                goto label_563;
                                                            }
                                                            int v72 = zzgpv.zzh(arr_b, v67, zzgpu4);
                                                            if(v58 != zzgpu4.zza) {
                                                                goto label_563;
                                                            }
                                                            v67 = zzgpv.zzh(arr_b, v72, zzgpu4);
                                                            int v73 = zzgpu4.zza;
                                                            if(v73 < 0) {
                                                                throw zzgsc.zzf();
                                                            }
                                                            if(v73 != 0) {
                                                                v71 = v67 + v73;
                                                                if(!zzguz.zzj(arr_b, v67, v71)) {
                                                                    break alab2;
                                                                }
                                                                zzgrz3.add(new String(arr_b, v67, v73, zzgsa.zzb));
                                                                break;
                                                            }
                                                            zzgrz3.add("");
                                                        }
                                                    }
                                                    throw zzgsc.zzd();
                                                label_563:
                                                    zzgpu3 = zzgpu4;
                                                    v40 = v58;
                                                    v11 = v57;
                                                    v47 = v56;
                                                    v46 = v55;
                                                    v4 = v67;
                                                    break;
                                                }
                                            }
                                        }
                                        throw zzgsc.zzf();
                                    }
                                label_572:
                                    zzgpu3 = zzgpu4;
                                    v40 = v58;
                                    v11 = v57;
                                    v47 = v56;
                                    v46 = v55;
                                    v4 = v11;
                                    break;
                                }
                                case 28: {
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        v4 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v74 = zzgpu3.zza;
                                        if(v74 < 0) {
                                            throw zzgsc.zzf();
                                        }
                                        if(v74 > arr_b.length - v4) {
                                            throw zzgsc.zzj();
                                        }
                                        if(v74 == 0) {
                                            zzgrz1.add(zzgqi.zzb);
                                            goto label_589;
                                        }
                                        else {
                                            zzgrz1.add(zzgqi.zzv(arr_b, v4, v74));
                                        }
                                    alab3:
                                        while(true) {
                                            v4 += v74;
                                            while(true) {
                                            label_589:
                                                if(v4 >= v1) {
                                                    goto label_653;
                                                }
                                                int v75 = zzgpv.zzh(arr_b, v4, zzgpu3);
                                                if(v40 != zzgpu3.zza) {
                                                    goto label_653;
                                                }
                                                v4 = zzgpv.zzh(arr_b, v75, zzgpu3);
                                                v74 = zzgpu3.zza;
                                                if(v74 < 0) {
                                                    throw zzgsc.zzf();
                                                }
                                                if(v74 > arr_b.length - v4) {
                                                    break alab3;
                                                }
                                                if(v74 != 0) {
                                                    zzgrz1.add(zzgqi.zzv(arr_b, v4, v74));
                                                    break;
                                                }
                                                zzgrz1.add(zzgqi.zzb);
                                            }
                                        }
                                        throw zzgsc.zzj();
                                    }
                                    v46 = v13;
                                    v47 = v12;
                                    v4 = v11;
                                    break;
                                }
                                case 18: 
                                case 35: {
                                label_325:
                                    unsafe1 = unsafe0;
                                    v46 = v13;
                                    v47 = v12;
                                    if(v18 == 2) {
                                        zzgqz zzgqz0 = (zzgqz)zzgrz1;
                                        v48 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v49 = zzgpu3.zza + v48;
                                        while(v48 < v49) {
                                            zzgqz0.zze(Double.longBitsToDouble(zzgpv.zzn(arr_b, v48)));
                                            v48 += 8;
                                        }
                                        if(v48 != v49) {
                                            throw zzgsc.zzj();
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    else if(v18 == 1) {
                                        zzgqz zzgqz1 = (zzgqz)zzgrz1;
                                        zzgqz1.zze(Double.longBitsToDouble(zzgpv.zzn(arr_b, v11)));
                                        for(v48 = v11 + 8; v48 < v1; v48 = v50 + 8) {
                                            int v50 = zzgpv.zzh(arr_b, v48, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            zzgqz1.zze(Double.longBitsToDouble(zzgpv.zzn(arr_b, v50)));
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    v4 = v11;
                                    break;
                                }
                                case 19: 
                                case 36: {
                                    unsafe1 = unsafe0;
                                    v46 = v13;
                                    v47 = v12;
                                    if(v18 == 2) {
                                        zzgrj zzgrj0 = (zzgrj)zzgrz1;
                                        v48 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v51 = zzgpu3.zza + v48;
                                        while(v48 < v51) {
                                            zzgrj0.zze(Float.intBitsToFloat(zzgpv.zzb(arr_b, v48)));
                                            v48 += 4;
                                        }
                                        if(v48 != v51) {
                                            throw zzgsc.zzj();
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    else if(v18 == 5) {
                                        zzgrj zzgrj1 = (zzgrj)zzgrz1;
                                        zzgrj1.zze(Float.intBitsToFloat(zzgpv.zzb(arr_b, v11)));
                                        for(v48 = v11 + 4; v48 < v1; v48 = v52 + 4) {
                                            int v52 = zzgpv.zzh(arr_b, v48, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            zzgrj1.zze(Float.intBitsToFloat(zzgpv.zzb(arr_b, v52)));
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    v4 = v11;
                                    break;
                                }
                                case 20: 
                                case 21: 
                                case 37: 
                                case 38: {
                                    unsafe1 = unsafe0;
                                    v46 = v13;
                                    v47 = v12;
                                    if(v18 == 2) {
                                        zzgsp zzgsp0 = (zzgsp)zzgrz1;
                                        v48 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v53 = zzgpu3.zza + v48;
                                        while(v48 < v53) {
                                            v48 = zzgpv.zzk(arr_b, v48, zzgpu3);
                                            zzgsp0.zzg(zzgpu3.zzb);
                                        }
                                        if(v48 != v53) {
                                            throw zzgsc.zzj();
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    else if(v18 == 0) {
                                        zzgsp zzgsp1 = (zzgsp)zzgrz1;
                                        v48 = zzgpv.zzk(arr_b, v11, zzgpu3);
                                        zzgsp1.zzg(zzgpu3.zzb);
                                        while(v48 < v1) {
                                            int v54 = zzgpv.zzh(arr_b, v48, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            v48 = zzgpv.zzk(arr_b, v54, zzgpu3);
                                            zzgsp1.zzg(zzgpu3.zzb);
                                        }
                                        v4 = v48;
                                        break;
                                    }
                                    v4 = v11;
                                    break;
                                }
                                case 25: 
                                case 42: {
                                    v55 = v13;
                                    v56 = v12;
                                    v57 = v11;
                                    v58 = v40;
                                    zzgpu4 = zzgpu3;
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        zzgpw zzgpw0 = (zzgpw)zzgrz1;
                                        v59 = zzgpv.zzh(arr_b, v57, zzgpu4);
                                        int v65 = zzgpu4.zza + v59;
                                        while(v59 < v65) {
                                            v59 = zzgpv.zzk(arr_b, v59, zzgpu4);
                                            zzgpw0.zze(zzgpu4.zzb != 0L);
                                        }
                                        if(v59 != v65) {
                                            throw zzgsc.zzj();
                                        }
                                        goto label_501;
                                    }
                                    else if(v18 == 0) {
                                        zzgpw zzgpw1 = (zzgpw)zzgrz1;
                                        v59 = zzgpv.zzk(arr_b, v57, zzgpu4);
                                        zzgpw1.zze(zzgpu4.zzb != 0L);
                                        while(v59 < v1) {
                                            int v66 = zzgpv.zzh(arr_b, v59, zzgpu4);
                                            if(v58 != zzgpu4.zza) {
                                                break;
                                            }
                                            v59 = zzgpv.zzk(arr_b, v66, zzgpu4);
                                            zzgpw1.zze(zzgpu4.zzb != 0L);
                                        }
                                    label_501:
                                        zzgpu3 = zzgpu4;
                                        v40 = v58;
                                        v11 = v57;
                                        v47 = v56;
                                        v4 = v59;
                                        v46 = v55;
                                        break;
                                    }
                                    goto label_572;
                                }
                                case 22: 
                                case 29: 
                                case 39: 
                                case 43: {
                                    v55 = v13;
                                    v56 = v12;
                                    v57 = v11;
                                    v58 = v40;
                                    zzgpu4 = zzgpu3;
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        v59 = zzgpv.zzf(arr_b, v57, zzgrz1, zzgpu4);
                                        goto label_501;
                                    }
                                    else if(v18 == 0) {
                                        zzgpu3 = zzgpu4;
                                        v40 = v58;
                                        v11 = v57;
                                        v47 = v56;
                                        v46 = v55;
                                        v4 = zzgpv.zzj(v58, arr_b, v57, v1, zzgrz1, zzgpu0);
                                        break;
                                    }
                                    goto label_572;
                                }
                                case 30: 
                                case 44: {
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        v76 = zzgpv.zzf(arr_b, v11, zzgrz1, zzgpu3);
                                        zzgtv.zzo(object0, v12, zzgrz1, this.zzw(v13), null, this.zzn);
                                        v4 = v76;
                                        goto label_653;
                                    }
                                    else if(v18 == 0) {
                                        v76 = zzgpv.zzj(v40, arr_b, v11, v1, zzgrz1, zzgpu0);
                                        zzgtv.zzo(object0, v12, zzgrz1, this.zzw(v13), null, this.zzn);
                                        v4 = v76;
                                        goto label_653;
                                    }
                                    v46 = v13;
                                    v47 = v12;
                                    v4 = v11;
                                    break;
                                }
                                case 24: 
                                case 0x1F: 
                                case 41: 
                                case 45: {
                                    v55 = v13;
                                    v56 = v12;
                                    v57 = v11;
                                    v58 = v40;
                                    zzgpu4 = zzgpu3;
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        zzgrr zzgrr0 = (zzgrr)zzgrz1;
                                        v59 = zzgpv.zzh(arr_b, v57, zzgpu4);
                                        int v63 = zzgpu4.zza + v59;
                                        while(v59 < v63) {
                                            zzgrr0.zzh(zzgpv.zzb(arr_b, v59));
                                            v59 += 4;
                                        }
                                        if(v59 != v63) {
                                            throw zzgsc.zzj();
                                        }
                                        goto label_501;
                                    }
                                    else if(v18 == 5) {
                                        zzgrr zzgrr1 = (zzgrr)zzgrz1;
                                        zzgrr1.zzh(zzgpv.zzb(arr_b, v57));
                                        for(v61 = v57 + 4; v61 < v1; v61 = v64 + 4) {
                                            int v64 = zzgpv.zzh(arr_b, v61, zzgpu4);
                                            if(v58 != zzgpu4.zza) {
                                                break;
                                            }
                                            zzgrr1.zzh(zzgpv.zzb(arr_b, v64));
                                        }
                                    label_468:
                                        zzgpu3 = zzgpu4;
                                        v40 = v58;
                                        v47 = v56;
                                        v46 = v55;
                                        v4 = v61;
                                        v11 = v57;
                                        break;
                                    }
                                    goto label_572;
                                }
                                case 23: 
                                case 0x20: 
                                case 40: 
                                case 46: {
                                    v55 = v13;
                                    v56 = v12;
                                    v57 = v11;
                                    v58 = v40;
                                    zzgpu4 = zzgpu3;
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        zzgsp zzgsp2 = (zzgsp)zzgrz1;
                                        v59 = zzgpv.zzh(arr_b, v57, zzgpu4);
                                        int v60 = zzgpu4.zza + v59;
                                        while(v59 < v60) {
                                            zzgsp2.zzg(zzgpv.zzn(arr_b, v59));
                                            v59 += 8;
                                        }
                                        if(v59 != v60) {
                                            throw zzgsc.zzj();
                                        }
                                        goto label_501;
                                    }
                                    else if(v18 == 1) {
                                        zzgsp zzgsp3 = (zzgsp)zzgrz1;
                                        zzgsp3.zzg(zzgpv.zzn(arr_b, v57));
                                        int v61;
                                        for(v61 = v57 + 8; v61 < v1; v61 = v62 + 8) {
                                            int v62 = zzgpv.zzh(arr_b, v61, zzgpu4);
                                            if(v58 != zzgpu4.zza) {
                                                break;
                                            }
                                            zzgsp3.zzg(zzgpv.zzn(arr_b, v62));
                                        }
                                        goto label_468;
                                    }
                                    goto label_572;
                                }
                                case 33: 
                                case 0x2F: {
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        zzgrr zzgrr2 = (zzgrr)zzgrz1;
                                        v4 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v77 = zzgpu3.zza + v4;
                                        while(v4 < v77) {
                                            v4 = zzgpv.zzh(arr_b, v4, zzgpu3);
                                            zzgrr2.zzh(zzgpu3.zza >>> 1 ^ -(zzgpu3.zza & 1));
                                        }
                                        if(v4 != v77) {
                                            throw zzgsc.zzj();
                                        }
                                        goto label_653;
                                    }
                                    else if(v18 == 0) {
                                        zzgrr zzgrr3 = (zzgrr)zzgrz1;
                                        v4 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        zzgrr3.zzh(zzgpu3.zza >>> 1 ^ -(zzgpu3.zza & 1));
                                        while(v4 < v1) {
                                            int v78 = zzgpv.zzh(arr_b, v4, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            v4 = zzgpv.zzh(arr_b, v78, zzgpu3);
                                            zzgrr3.zzh(zzgpu3.zza >>> 1 ^ -(zzgpu3.zza & 1));
                                        }
                                        goto label_653;
                                    }
                                    v46 = v13;
                                    v47 = v12;
                                    v4 = v11;
                                    break;
                                }
                                case 34: 
                                case 0x30: {
                                    unsafe1 = unsafe0;
                                    if(v18 == 2) {
                                        zzgsp zzgsp4 = (zzgsp)zzgrz1;
                                        v4 = zzgpv.zzh(arr_b, v11, zzgpu3);
                                        int v79 = zzgpu3.zza + v4;
                                        while(v4 < v79) {
                                            v4 = zzgpv.zzk(arr_b, v4, zzgpu3);
                                            zzgsp4.zzg(zzgpu3.zzb >>> 1 ^ -(1L & zzgpu3.zzb));
                                        }
                                        if(v4 != v79) {
                                            throw zzgsc.zzj();
                                        }
                                    label_653:
                                        v46 = v13;
                                        v47 = v12;
                                    }
                                    else if(v18 == 0) {
                                        zzgsp zzgsp5 = (zzgsp)zzgrz1;
                                        v4 = zzgpv.zzk(arr_b, v11, zzgpu3);
                                        zzgsp5.zzg(zzgpu3.zzb >>> 1 ^ -(1L & zzgpu3.zzb));
                                        while(v4 < v1) {
                                            int v80 = zzgpv.zzh(arr_b, v4, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            v4 = zzgpv.zzk(arr_b, v80, zzgpu3);
                                            zzgsp5.zzg(zzgpu3.zzb >>> 1 ^ -(1L & zzgpu3.zzb));
                                        }
                                        v46 = v13;
                                        v47 = v12;
                                    }
                                    else {
                                        v46 = v13;
                                        v47 = v12;
                                        v4 = v11;
                                    }
                                    break;
                                }
                                default: {
                                    if(v18 == 3) {
                                        zzgtt zzgtt0 = this.zzx(v13);
                                        int v44 = v40 & -8 | 4;
                                        unsafe1 = unsafe0;
                                        v4 = zzgpv.zzc(zzgtt0, arr_b, v11, v1, v44, zzgpu0);
                                        zzgrz1.add(zzgpu3.zzc);
                                        while(v4 < v1) {
                                            int v45 = zzgpv.zzh(arr_b, v4, zzgpu3);
                                            if(v40 != zzgpu3.zza) {
                                                break;
                                            }
                                            v4 = zzgpv.zzc(zzgtt0, arr_b, v45, v1, v44, zzgpu0);
                                            zzgrz1.add(zzgpu3.zzc);
                                        }
                                        goto label_653;
                                    }
                                    else {
                                        unsafe1 = unsafe0;
                                        v46 = v13;
                                        v47 = v12;
                                        v4 = v11;
                                        break;
                                    }
                                    goto label_325;
                                }
                            }
                            if(v4 == v11) {
                                v15 = v4;
                                v14 = v47;
                                v7 = v46;
                                v8 = v40;
                                zzgpu1 = zzgpu3;
                                v5 = v38;
                                v17 = v1;
                                goto label_903;
                            }
                            else {
                                v3 = v1;
                                v6 = v47;
                                v7 = v46;
                                v8 = v40;
                                zzgpu1 = zzgpu3;
                                v9 = v16;
                                v5 = v38;
                                unsafe0 = unsafe1;
                                continue;
                            }
                            goto label_690;
                        }
                        else {
                        label_690:
                            unsafe1 = unsafe0;
                            v39 = v13;
                            v41 = v12;
                            if(v21 == 50) {
                                if(v18 == 2) {
                                    Unsafe unsafe6 = zzgtd.zzb;
                                    Object object3 = this.zzz(v39);
                                    Object object4 = unsafe6.getObject(object0, v22);
                                    if(zzgsv.zza(object4)) {
                                        zzgsu zzgsu0 = zzgsu.zza().zzb();
                                        zzgsv.zzb(zzgsu0, object4);
                                        unsafe6.putObject(object0, v22, zzgsu0);
                                    }
                                    zzgst zzgst0 = (zzgst)object3;
                                    throw null;
                                }
                            label_704:
                                v14 = v41;
                                v8 = v40;
                                zzgpu1 = zzgpu3;
                                v5 = v38;
                                v17 = v1;
                                v7 = v39;
                                v15 = v11;
                            }
                            else {
                                Unsafe unsafe7 = zzgtd.zzb;
                                long v81 = (long)(arr_v[v39 + 2] & 0xFFFFF);
                                switch(v21) {
                                    case 51: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 1) {
                                            unsafe7.putObject(object0, v22, Double.longBitsToDouble(zzgpv.zzn(arr_b, v11)));
                                            v15 = v11 + 8;
                                            unsafe7.putInt(object0, v81, v14);
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 52: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 5) {
                                            unsafe7.putObject(object0, v22, Float.intBitsToFloat(zzgpv.zzb(arr_b, v11)));
                                            v15 = v11 + 4;
                                            unsafe7.putInt(object0, v81, v14);
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 53: 
                                    case 54: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 0) {
                                            v84 = zzgpv.zzk(arr_b, v11, zzgpu1);
                                            unsafe7.putObject(object0, v22, zzgpu1.zzb);
                                            unsafe7.putInt(object0, v81, v14);
                                            v15 = v84;
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 58: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v17 = v1;
                                        if(v18 == 0) {
                                            v84 = zzgpv.zzk(arr_b, v11, zzgpu1);
                                            v83 = v40;
                                            unsafe7.putObject(object0, v22, Boolean.valueOf(zzgpu1.zzb != 0L));
                                            unsafe7.putInt(object0, v81, v14);
                                            v15 = v84;
                                        }
                                        else {
                                            v83 = v40;
                                            v15 = v11;
                                        }
                                        break;
                                    }
                                    case 59: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v17 = v1;
                                        if(v18 == 2) {
                                            int v85 = zzgpv.zzh(arr_b, v11, zzgpu1);
                                            int v86 = zzgpu1.zza;
                                            if(v86 == 0) {
                                                unsafe7.putObject(object0, v22, "");
                                            }
                                            else {
                                                if((v19 & 0x20000000) != 0 && !zzguz.zzj(arr_b, v85, v85 + v86)) {
                                                    throw zzgsc.zzd();
                                                }
                                                unsafe7.putObject(object0, v22, new String(arr_b, v85, v86, zzgsa.zzb));
                                                v85 += v86;
                                            }
                                            unsafe7.putInt(object0, v81, v14);
                                            v15 = v85;
                                            v83 = v40;
                                        }
                                        else {
                                            v83 = v40;
                                            v15 = v11;
                                        }
                                        break;
                                    }
                                    case 60: {
                                        if(v18 == 2) {
                                            Object object5 = this.zzB(object0, v41, v39);
                                            v17 = v1;
                                            zzgpu1 = zzgpu0;
                                            int v87 = zzgpv.zzm(object5, this.zzx(v39), arr_b, v11, v1, zzgpu1);
                                            this.zzK(object0, v41, v39, object5);
                                            v15 = v87;
                                            v83 = v40;
                                            v82 = v39;
                                            v14 = v41;
                                        }
                                        else {
                                            v17 = v1;
                                            v82 = v39;
                                            v14 = v41;
                                            v83 = v40;
                                            zzgpu1 = zzgpu0;
                                            v15 = v11;
                                        }
                                        break;
                                    }
                                    case 61: {
                                        v88 = v41;
                                        v89 = v40;
                                        if(v18 == 2) {
                                            v90 = zzgpv.zza(arr_b, v11, zzgpu0);
                                            unsafe7.putObject(object0, v22, zzgpu0.zzc);
                                            unsafe7.putInt(object0, v81, v88);
                                            goto label_860;
                                        }
                                        goto label_867;
                                    }
                                    case 55: 
                                    case 62: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 0) {
                                            v84 = zzgpv.zzh(arr_b, v11, zzgpu1);
                                            unsafe7.putObject(object0, v22, zzgpu1.zza);
                                            unsafe7.putInt(object0, v81, v14);
                                            v15 = v84;
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 0x3F: {
                                        v88 = v41;
                                        v89 = v40;
                                        if(v18 == 0) {
                                            v90 = zzgpv.zzh(arr_b, v11, zzgpu0);
                                            int v91 = zzgpu0.zza;
                                            zzgru zzgru1 = this.zzw(v39);
                                            if(zzgru1 == null || zzgru1.zza(v91)) {
                                                unsafe7.putObject(object0, v22, v91);
                                                unsafe7.putInt(object0, v81, v88);
                                            }
                                            else {
                                                zzgtd.zzd(object0).zzj(v89, ((long)v91));
                                            }
                                            goto label_860;
                                        }
                                        goto label_867;
                                    }
                                    case 57: 
                                    case 0x40: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 5) {
                                            unsafe7.putObject(object0, v22, zzgpv.zzb(arr_b, v11));
                                            v15 = v11 + 4;
                                            unsafe7.putInt(object0, v81, v14);
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 56: 
                                    case 65: {
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        if(v18 == 1) {
                                            unsafe7.putObject(object0, v22, zzgpv.zzn(arr_b, v11));
                                            v15 = v11 + 8;
                                            unsafe7.putInt(object0, v81, v14);
                                            break;
                                        }
                                        v15 = v11;
                                        break;
                                    }
                                    case 66: {
                                        v88 = v41;
                                        v89 = v40;
                                        if(v18 == 0) {
                                            v90 = zzgpv.zzh(arr_b, v11, zzgpu0);
                                            unsafe7.putObject(object0, v22, ((int)(zzgpu0.zza >>> 1 ^ -(zzgpu0.zza & 1))));
                                            unsafe7.putInt(object0, v81, v88);
                                            goto label_860;
                                        }
                                        goto label_867;
                                    }
                                    case 67: {
                                        v88 = v41;
                                        v89 = v40;
                                        if(v18 == 0) {
                                            v90 = zzgpv.zzk(arr_b, v11, zzgpu0);
                                            unsafe7.putObject(object0, v22, ((long)(zzgpu0.zzb >>> 1 ^ -(1L & zzgpu0.zzb))));
                                            unsafe7.putInt(object0, v81, v88);
                                        label_860:
                                            v17 = v1;
                                            v83 = v89;
                                            v15 = v90;
                                            v82 = v39;
                                            zzgpu1 = zzgpu0;
                                            v14 = v88;
                                            break;
                                        }
                                    label_867:
                                        v17 = v1;
                                        v82 = v39;
                                        v83 = v89;
                                        zzgpu1 = zzgpu0;
                                        v14 = v88;
                                        v15 = v11;
                                        break;
                                    }
                                    case 68: {
                                        if(v18 == 3) {
                                            Object object6 = this.zzB(object0, v41, v39);
                                            int v92 = zzgpv.zzl(object6, this.zzx(v39), arr_b, v11, v1, v40 & -8 | 4, zzgpu0);
                                            this.zzK(object0, v41, v39, object6);
                                            v17 = v1;
                                            v82 = v39;
                                            v83 = v40;
                                            v15 = v92;
                                            zzgpu1 = zzgpu0;
                                            v14 = v41;
                                            break;
                                        }
                                    label_884:
                                        zzgpu1 = zzgpu0;
                                        v82 = v39;
                                        v14 = v41;
                                        v83 = v40;
                                        v17 = v1;
                                        v15 = v11;
                                        break;
                                    }
                                    default: {
                                        goto label_884;
                                    }
                                }
                                if(v15 == v11) {
                                    v7 = v82;
                                    v8 = v83;
                                    v5 = v38;
                                }
                                else {
                                    v7 = v82;
                                    v6 = v14;
                                    v4 = v15;
                                    v3 = v17;
                                    v8 = v83;
                                    v9 = v16;
                                    v5 = v38;
                                    unsafe0 = unsafe1;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        label_903:
            if(v8 != v2 || v2 == 0) {
                if(this.zzh) {
                    zzgrc zzgrc0 = zzgpu1.zzd;
                    if(zzgrc0 != zzgrc.zza) {
                        if(zzgrc0.zzc(this.zzg, v14) == null) {
                            v95 = v14;
                            v4 = zzgpv.zzg(v8, arr_b, v15, v1, zzgtd.zzd(object0), zzgpu0);
                            goto label_918;
                        }
                        zzgrn zzgrn0 = (zzgrn)object0;
                        throw null;
                    }
                }
                v95 = v14;
                v4 = zzgpv.zzg(v8, arr_b, v15, v1, zzgtd.zzd(object0), zzgpu0);
            label_918:
                zzgpu1 = zzgpu0;
                v6 = v95;
                v3 = v17;
                v9 = v16;
                unsafe0 = unsafe1;
                continue;
            label_924:
                unsafe1 = unsafe0;
                v17 = v3;
                v93 = v4;
                v94 = v9;
            }
            else {
                v93 = v15;
                v94 = v16;
            }
            break;
        }
        if(v5 != 0xFFFFF) {
            unsafe1.putInt(object0, ((long)v5), v94);
        }
        for(int v96 = this.zzk; v96 < this.zzl; ++v96) {
            this.zzy(object0, this.zzj[v96], null, this.zzn, object0);
        }
        if(v2 == 0) {
            if(v93 != v17) {
                throw zzgsc.zzg();
            }
            return v93;
        }
        if(v93 > v17 || v8 != v2) {
            throw zzgsc.zzg();
        }
        return v93;
    }

    static zzgul zzd(Object object0) {
        zzgul zzgul0 = ((zzgrq)object0).zzc;
        if(zzgul0 == zzgul.zzc()) {
            zzgul0 = zzgul.zzf();
            ((zzgrq)object0).zzc = zzgul0;
        }
        return zzgul0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        return ((zzgrq)this.zzg).zzaD();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object object0) {
        if(!zzgtd.zzQ(object0)) {
            return;
        }
        if(object0 instanceof zzgrq) {
            ((zzgrq)object0).zzaV(0x7FFFFFFF);
            ((zzgrq)object0).zza = 0;
            ((zzgrq)object0).zzaT();
        }
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzu(v);
            long v2 = (long)(0xFFFFF & v1);
            switch(v1 >>> 20 & 0xFF) {
                case 9: 
                case 17: {
                    if(this.zzN(object0, v)) {
                        this.zzx(v).zzf(zzgtd.zzb.getObject(object0, v2));
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.zzm.zzb(object0, v2);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = zzgtd.zzb;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        ((zzgsu)object1).zzc();
                        unsafe0.putObject(object0, v2, object1);
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzR(object0, this.zzc[v], v)) {
                        this.zzx(v).zzf(zzgtd.zzb.getObject(object0, v2));
                    }
                }
            }
        }
        this.zzn.zzm(object0);
        if(this.zzh) {
            this.zzo.zze(object0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object object0, Object object1) {
        zzgtd.zzD(object0);
        object1.getClass();
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzu(v);
            int v2 = this.zzc[v];
            long v3 = (long)(0xFFFFF & v1);
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzr(object0, v3, zzguu.zzb(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzs(object0, v3, zzguu.zzc(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzu(object0, v3, zzguu.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzu(object0, v3, zzguu.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzu(object0, v3, zzguu.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzp(object0, v3, zzguu.zzz(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzv(object0, v3, zzguu.zzh(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 9: {
                    this.zzE(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzv(object0, v3, zzguu.zzh(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzu(object0, v3, zzguu.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzt(object0, v3, zzguu.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zzN(object1, v)) {
                        zzguu.zzu(object0, v3, zzguu.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 17: {
                    this.zzE(object0, object1, v);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.zzm.zzc(object0, object1, v3);
                    break;
                }
                case 50: {
                    zzguu.zzv(object0, v3, zzgsv.zzb(zzguu.zzh(object0, v3), zzguu.zzh(object1, v3)));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.zzR(object1, v2, v)) {
                        zzguu.zzv(object0, v3, zzguu.zzh(object1, v3));
                        this.zzI(object0, v2, v);
                    }
                    break;
                }
                case 60: {
                    this.zzF(object0, object1, v);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.zzR(object1, v2, v)) {
                        zzguu.zzv(object0, v3, zzguu.zzh(object1, v3));
                        this.zzI(object0, v2, v);
                    }
                    break;
                }
                case 68: {
                    this.zzF(object0, object1, v);
                }
            }
        }
        zzgtv.zzq(this.zzn, object0, object1);
        if(!this.zzh) {
            return;
        }
        this.zzo.zza(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzh(Object object0, zzgtl zzgtl0, zzgrc zzgrc0) {
        zzgrc zzgrc2;
        zzgru zzgru1;
        List list1;
        int v4;
        Object object6;
        zzguk zzguk2;
        Object object5;
        zzgrh zzgrh1;
        Object object4;
        zzguk zzguk1;
        Object object3;
        int v1;
        int v;
        Object object1 = object0;
        zzgrc zzgrc1 = zzgrc0;
        zzgrc0.getClass();
        zzgtd.zzD(object0);
        zzguk zzguk0 = this.zzn;
        zzgrd zzgrd0 = this.zzo;
        Object object2 = null;
        zzgrh zzgrh0 = null;
        while(true) {
            try {
            label_8:
                v = zzgtl0.zzc();
                v1 = this.zzq(v);
                if(v1 < 0) {
                    goto label_11;
                }
                goto label_63;
            }
            catch(Throwable throwable0) {
                object5 = object2;
                zzguk1 = zzguk0;
                object4 = object1;
                goto label_417;
            }
        label_11:
            if(v == 0x7FFFFFFF) {
                for(int v2 = this.zzk; v2 < this.zzl; ++v2) {
                    object2 = this.zzy(object0, this.zzj[v2], object2, zzguk0, object0);
                }
                if(object2 == null) {
                    return;
                }
                zzguk0.zzn(object1, object2);
                return;
            }
            try {
                object3 = this.zzh ? zzgrd0.zzc(zzgrc1, this.zzg, v) : null;
            }
            catch(Throwable throwable0) {
                zzguk1 = zzguk0;
                object4 = object1;
                object5 = object2;
                goto label_417;
            }
            if(object3 == null) {
                goto label_41;
                try {
                label_46:
                    if(!zzguk2.zzp(object2, zzgtl0)) {
                        goto label_52;
                    }
                    object1 = object6;
                    zzguk0 = zzguk2;
                    goto label_8;
                }
                catch(Throwable throwable0) {
                    object4 = object6;
                    zzguk1 = zzguk2;
                    goto label_418;
                }
            label_52:
                for(int v3 = this.zzk; v3 < this.zzl; ++v3) {
                    object2 = this.zzy(object0, this.zzj[v3], object2, zzguk2, object0);
                }
                if(object2 == null) {
                    return;
                }
                zzguk2.zzn(object6, object2);
                return;
            }
            else {
                if(zzgrh0 == null) {
                    try {
                        zzgrh1 = zzgrd0.zzb(object1);
                    }
                    catch(Throwable throwable0) {
                        object5 = object2;
                        zzguk1 = zzguk0;
                        object4 = object1;
                        goto label_417;
                    }
                }
                else {
                    zzgrh1 = zzgrh0;
                }
                try {
                    zzguk2 = zzguk0;
                    object6 = object1;
                    object2 = zzgrd0.zzd(object0, zzgtl0, object3, zzgrc0, zzgrh1, object2, zzguk2);
                    zzgrh0 = zzgrh1;
                    object1 = object6;
                    zzguk0 = zzguk2;
                    goto label_8;
                label_41:
                    zzguk2 = zzguk0;
                    object6 = object1;
                    zzguk2.zzq(zzgtl0);
                    if(object2 == null) {
                        object2 = zzguk2.zzc(object6);
                    }
                    goto label_46;
                }
                catch(Throwable throwable0) {
                    goto label_390;
                }
            }
            try {
                object1 = object6;
                zzguk0 = zzguk2;
                goto label_8;
            }
            catch(Throwable throwable0) {
                goto label_390;
            }
            try {
            label_63:
                zzguk1 = zzguk0;
                object4 = object1;
                v4 = this.zzu(v1);
                try {
                    switch(v4 >>> 20 & 0xFF) {
                        case 0: {
                            goto label_94;
                        }
                        case 1: {
                            goto label_99;
                        }
                        case 2: {
                            goto label_104;
                        }
                        case 3: {
                            goto label_109;
                        }
                        case 4: {
                            goto label_114;
                        }
                        case 5: {
                            goto label_119;
                        }
                        case 6: {
                            goto label_124;
                        }
                        case 7: {
                            goto label_129;
                        }
                        case 8: {
                            goto label_134;
                        }
                        case 9: {
                            goto label_139;
                        }
                        case 10: {
                            goto label_145;
                        }
                        case 11: {
                            goto label_150;
                        }
                        case 12: {
                            goto label_155;
                        }
                        case 13: {
                            goto label_165;
                        }
                        case 14: {
                            goto label_170;
                        }
                        case 15: {
                            goto label_175;
                        }
                        case 16: {
                            goto label_180;
                        }
                        case 17: {
                            goto label_185;
                        }
                        case 18: {
                            goto label_191;
                        }
                        case 19: {
                            goto label_195;
                        }
                        case 20: {
                            goto label_199;
                        }
                        case 21: {
                            goto label_203;
                        }
                        case 22: {
                            goto label_207;
                        }
                        case 23: {
                            goto label_211;
                        }
                        case 24: {
                            goto label_215;
                        }
                        case 25: {
                            goto label_219;
                        }
                        case 26: {
                            goto label_223;
                        }
                        case 27: {
                            goto label_230;
                        }
                        case 28: {
                            goto label_235;
                        }
                        case 29: {
                            goto label_239;
                        }
                        case 30: {
                            goto label_243;
                        }
                        case 0x1F: {
                            goto label_249;
                        }
                        case 0x20: {
                            goto label_253;
                        }
                        case 33: {
                            goto label_257;
                        }
                        case 34: {
                            goto label_261;
                        }
                        case 35: {
                            goto label_265;
                        }
                        case 36: {
                            goto label_269;
                        }
                        case 37: {
                            goto label_273;
                        }
                        case 38: {
                            goto label_277;
                        }
                        case 39: {
                            goto label_281;
                        }
                        case 40: {
                            goto label_285;
                        }
                        case 41: {
                            goto label_289;
                        }
                        case 42: {
                            goto label_293;
                        }
                        case 43: {
                            goto label_297;
                        }
                        case 44: {
                            goto label_301;
                        }
                        case 45: {
                            goto label_308;
                        }
                        case 46: {
                            goto label_310;
                        }
                        case 0x2F: {
                            goto label_312;
                        }
                        case 0x30: {
                            goto label_314;
                        }
                        case 49: {
                            goto label_316;
                        }
                        case 50: {
                            goto label_68;
                        }
                        case 51: {
                            goto label_319;
                        }
                        case 52: {
                            goto label_322;
                        }
                        case 53: {
                            goto label_325;
                        }
                        case 54: {
                            goto label_328;
                        }
                        case 55: {
                            goto label_331;
                        }
                        case 56: {
                            goto label_334;
                        }
                        case 57: {
                            goto label_337;
                        }
                        case 58: {
                            goto label_340;
                        }
                        case 59: {
                            goto label_343;
                        }
                        case 60: {
                            goto label_346;
                        }
                        case 61: {
                            goto label_350;
                        }
                        case 62: {
                            goto label_353;
                        }
                        case 0x3F: {
                            goto label_356;
                        }
                        case 0x40: {
                            goto label_365;
                        }
                        case 65: {
                            goto label_368;
                        }
                        case 66: {
                            goto label_371;
                        }
                        case 67: {
                            goto label_374;
                        }
                        case 68: {
                            goto label_377;
                        }
                    }
                }
                catch(zzgsb unused_ex) {
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_399;
                }
            }
            catch(Throwable throwable0) {
                object5 = object2;
                goto label_417;
            }
            goto label_80;
            try {
            label_68:
                Object object7 = this.zzz(v1);
                long v5 = (long)(this.zzu(v1) & 0xFFFFF);
                zzgsu zzgsu0 = zzguu.zzh(object4, v5);
                if(zzgsu0 == null) {
                    zzguu.zzv(object4, v5, zzgsu.zza().zzb());
                }
                else if(zzgsv.zza(zzgsu0)) {
                    zzgsu zzgsu1 = zzgsu.zza().zzb();
                    zzgsv.zzb(zzgsu1, zzgsu0);
                    zzguu.zzv(object4, v5, zzgsu1);
                }
                zzgst zzgst0 = (zzgst)object7;
                throw null;
            label_80:
                if(object2 == null) {
                    object2 = zzguk1.zzc(object4);
                }
            }
            catch(zzgsb unused_ex) {
                object5 = object2;
                zzgrc2 = zzgrc1;
                goto label_399;
            }
            catch(Throwable throwable0) {
                object5 = object2;
                goto label_417;
            }
            try {
                if(!zzguk1.zzp(object2, zzgtl0)) {
                    goto label_86;
                }
                object1 = object4;
                goto label_426;
            }
            catch(zzgsb unused_ex) {
                zzgrc2 = zzgrc1;
                goto label_400;
            label_86:
                for(int v6 = this.zzk; v6 < this.zzl; ++v6) {
                    object2 = this.zzy(object0, this.zzj[v6], object2, zzguk1, object0);
                }
                if(object2 == null) {
                    return;
                }
                zzguk1.zzn(object4, object2);
                return;
                try {
                label_94:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzr(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zza());
                    this.zzH(object4, v1);
                    goto label_393;
                label_99:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzs(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzb());
                    this.zzH(object4, v1);
                    goto label_393;
                label_104:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzu(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzl());
                    this.zzH(object4, v1);
                    goto label_393;
                label_109:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzu(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzo());
                    this.zzH(object4, v1);
                    goto label_393;
                label_114:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzg());
                    this.zzH(object4, v1);
                    goto label_393;
                label_119:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzu(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzk());
                    this.zzH(object4, v1);
                    goto label_393;
                label_124:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzf());
                    this.zzH(object4, v1);
                    goto label_393;
                label_129:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzp(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzN());
                    this.zzH(object4, v1);
                    goto label_393;
                label_134:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    this.zzG(object4, v4, zzgtl0);
                    this.zzH(object4, v1);
                    goto label_393;
                label_139:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgta zzgta0 = (zzgta)this.zzA(object4, v1);
                    zzgtl0.zzu(zzgta0, this.zzx(v1), zzgrc2);
                    this.zzJ(object4, v1, zzgta0);
                    goto label_393;
                label_145:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzp());
                    this.zzH(object4, v1);
                    goto label_393;
                label_150:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzj());
                    this.zzH(object4, v1);
                    goto label_393;
                label_155:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    int v7 = zzgtl0.zze();
                    zzgru zzgru0 = this.zzw(v1);
                    if(zzgru0 == null || zzgru0.zza(v7)) {
                        zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), v7);
                        this.zzH(object4, v1);
                        goto label_393;
                    }
                    else {
                        object2 = zzgtv.zzp(object4, v, v7, object5, zzguk1);
                        object1 = object4;
                        zzgrc1 = zzgrc2;
                        goto label_426;
                    }
                label_165:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzh());
                    this.zzH(object4, v1);
                    goto label_393;
                label_170:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzu(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzm());
                    this.zzH(object4, v1);
                    goto label_393;
                label_175:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzt(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzi());
                    this.zzH(object4, v1);
                    goto label_393;
                label_180:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzguu.zzu(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzn());
                    this.zzH(object4, v1);
                    goto label_393;
                label_185:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgta zzgta1 = (zzgta)this.zzA(object4, v1);
                    zzgtl0.zzt(zzgta1, this.zzx(v1), zzgrc2);
                    this.zzJ(object4, v1, zzgta1);
                    goto label_393;
                label_191:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzx(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_195:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzB(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_199:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzE(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_203:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzM(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_207:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzD(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_211:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzA(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_215:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzz(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_219:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzv(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_223:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    if(zzgtd.zzM(v4)) {
                        ((zzgqr)zzgtl0).zzK(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))), true);
                    }
                    else {
                        ((zzgqr)zzgtl0).zzK(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))), false);
                    }
                    goto label_393;
                label_230:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtt zzgtt0 = this.zzx(v1);
                    zzgtl0.zzF(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))), zzgtt0, zzgrc2);
                    goto label_393;
                label_235:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzw(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_239:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzL(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_243:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    List list0 = this.zzm.zza(object4, ((long)(v4 & 0xFFFFF)));
                    zzgtl0.zzy(list0);
                    object2 = zzgtv.zzo(object0, v, list0, this.zzw(v1), object5, zzguk1);
                    object1 = object4;
                    zzgrc1 = zzgrc2;
                    goto label_426;
                label_249:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzG(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_253:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzH(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_257:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzI(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_261:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzJ(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_265:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzx(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_269:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzB(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_273:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzE(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_277:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzM(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_281:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzD(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_285:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzA(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_289:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzz(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_293:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzv(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                label_297:
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    zzgtl0.zzL(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    goto label_393;
                }
                catch(zzgsb unused_ex) {
                    goto label_399;
                }
                catch(Throwable throwable0) {
                    goto label_417;
                }
                try {
                label_301:
                    list1 = this.zzm.zza(object4, ((long)(v4 & 0xFFFFF)));
                    zzgtl0.zzy(list1);
                    zzgru1 = this.zzw(v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                }
                catch(zzgsb unused_ex) {
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_399;
                }
                catch(Throwable throwable0) {
                    object5 = object2;
                    goto label_417;
                }
                try {
                    object2 = zzgtv.zzo(object0, v, list1, zzgru1, object5, zzguk1);
                    object1 = object4;
                    zzgrc1 = zzgrc2;
                    goto label_426;
                }
                catch(zzgsb unused_ex) {
                    goto label_399;
                }
                catch(Throwable throwable0) {
                    goto label_417;
                }
                try {
                label_308:
                    zzgtl0.zzG(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_310:
                    zzgtl0.zzH(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_312:
                    zzgtl0.zzI(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_314:
                    zzgtl0.zzJ(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))));
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_316:
                    zzgtt zzgtt1 = this.zzx(v1);
                    zzgtl0.zzC(this.zzm.zza(object4, ((long)(v4 & 0xFFFFF))), zzgtt1, zzgrc1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_319:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zza());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_322:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzb());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_325:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzl());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_328:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzo());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_331:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzg());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_334:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzk());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_337:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzf());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_340:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(zzgtl0.zzN()));
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_343:
                    this.zzG(object4, v4, zzgtl0);
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_346:
                    zzgta zzgta2 = (zzgta)this.zzB(object4, v, v1);
                    zzgtl0.zzu(zzgta2, this.zzx(v1), zzgrc1);
                    this.zzK(object4, v, v1, zzgta2);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_350:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzp());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_353:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzj());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_356:
                    int v8 = zzgtl0.zze();
                    zzgru zzgru2 = this.zzw(v1);
                    if(zzgru2 == null || zzgru2.zza(v8)) {
                        zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), v8);
                        this.zzI(object4, v, v1);
                        object5 = object2;
                        zzgrc2 = zzgrc1;
                        goto label_393;
                    }
                    else {
                        object2 = zzgtv.zzp(object4, v, v8, object2, zzguk1);
                    }
                    object1 = object4;
                    goto label_426;
                label_365:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzh());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_368:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzm());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_371:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzi());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_374:
                    zzguu.zzv(object4, ((long)(v4 & 0xFFFFF)), zzgtl0.zzn());
                    this.zzI(object4, v, v1);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                label_377:
                    zzgta zzgta3 = (zzgta)this.zzB(object4, v, v1);
                    zzgtl0.zzt(zzgta3, this.zzx(v1), zzgrc1);
                    this.zzK(object4, v, v1, zzgta3);
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_393;
                }
                catch(zzgsb unused_ex) {
                    object5 = object2;
                    zzgrc2 = zzgrc1;
                    goto label_399;
                }
                catch(Throwable throwable0) {
                }
                while(true) {
                    try {
                        object5 = object2;
                        goto label_417;
                    }
                    catch(Throwable throwable0) {
                    label_390:
                        object4 = object6;
                        zzguk1 = zzguk2;
                    }
                }
            label_393:
                object1 = object4;
                object2 = object5;
                while(true) {
                    try {
                        zzgrc1 = zzgrc2;
                        goto label_426;
                    }
                    catch(zzgsb unused_ex) {
                    }
                    catch(Throwable throwable0) {
                        goto label_417;
                    }
                label_399:
                    object2 = object5;
                    try {
                    label_400:
                        zzguk1.zzq(zzgtl0);
                        if(object2 == null) {
                            object2 = zzguk1.zzc(object4);
                        }
                        if(zzguk1.zzp(object2, zzgtl0)) {
                            object1 = object4;
                            zzgrc1 = zzgrc2;
                            goto label_426;
                        }
                        else {
                            break;
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                        goto label_418;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_418;
            }
            for(int v9 = this.zzk; v9 < this.zzl; ++v9) {
                object2 = this.zzy(object0, this.zzj[v9], object2, zzguk1, object0);
            }
            if(object2 != null) {
                zzguk1.zzn(object4, object2);
            }
            return;
            try {
                object1 = object4;
                zzgrc1 = zzgrc2;
                goto label_426;
            }
            catch(zzgsb unused_ex) {
                goto label_399;
            }
            catch(Throwable throwable0) {
            }
        label_417:
            object2 = object5;
        label_418:
            for(int v10 = this.zzk; v10 < this.zzl; ++v10) {
                object2 = this.zzy(object0, this.zzj[v10], object2, zzguk1, object0);
            }
            if(object2 != null) {
                zzguk1.zzn(object4, object2);
            }
            throw throwable0;
        label_426:
            zzguk0 = zzguk1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object object0, byte[] arr_b, int v, int v1, zzgpu zzgpu0) {
        this.zzc(object0, arr_b, v, v1, 0, zzgpu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object object0, Object object1) {
        boolean z;
        int v = 0;
        while(v < this.zzc.length) {
            int v1 = this.zzu(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.zzL(object0, object1, v) && Double.doubleToLongBits(zzguu.zzb(object0, v2)) == Double.doubleToLongBits(zzguu.zzb(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if(this.zzL(object0, object1, v) && Float.floatToIntBits(zzguu.zzc(object0, v2)) == Float.floatToIntBits(zzguu.zzc(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 2: {
                    if(this.zzL(object0, object1, v) && zzguu.zzf(object0, v2) == zzguu.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 3: {
                    if(this.zzL(object0, object1, v) && zzguu.zzf(object0, v2) == zzguu.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 5: {
                    if(this.zzL(object0, object1, v) && zzguu.zzf(object0, v2) == zzguu.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 6: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 7: {
                    if(this.zzL(object0, object1, v) && zzguu.zzz(object0, v2) == zzguu.zzz(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 8: {
                    if(this.zzL(object0, object1, v) && zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 9: {
                    if(this.zzL(object0, object1, v) && zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if(this.zzL(object0, object1, v) && zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 11: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 12: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 14: {
                    if(this.zzL(object0, object1, v) && zzguu.zzf(object0, v2) == zzguu.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 15: {
                    if(this.zzL(object0, object1, v) && zzguu.zzd(object0, v2) == zzguu.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 16: {
                    if(this.zzL(object0, object1, v) && zzguu.zzf(object0, v2) == zzguu.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 17: {
                    if(this.zzL(object0, object1, v) && zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    z = zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2));
                    goto label_45;
                }
                case 50: {
                    z = zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2));
                label_45:
                    if(!z) {
                        return false;
                    }
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    int v3 = this.zzr(v);
                    if(zzguu.zzd(object0, ((long)(v3 & 0xFFFFF))) != zzguu.zzd(object1, ((long)(v3 & 0xFFFFF))) || !zzgtv.zzs(zzguu.zzh(object0, v2), zzguu.zzh(object1, v2))) {
                        return false;
                    }
                }
            }
            v += 3;
        }
        if(!this.zzn.zzd(object0).equals(this.zzn.zzd(object1))) {
            return false;
        }
        if(!this.zzh) {
            return true;
        }
        this.zzo.zza(object0);
        this.zzo.zza(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object object0) {
        int v10;
        int v9;
        int v1 = 0;
        int v2 = 0xFFFFF;
        for(int v = 0; v1 < this.zzk; v = v9) {
            int v3 = this.zzj[v1];
            int v4 = this.zzc[v3];
            int v5 = this.zzu(v3);
            int v6 = this.zzc[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v2) {
                v10 = v2;
                v9 = v;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v = zzgtd.zzb.getInt(object0, ((long)v7));
                }
                v9 = v;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.zzO(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch(v5 >>> 20 & 0xFF) {
                case 9: 
                case 17: {
                    if(this.zzO(object0, v3, v10, v9, v8) && !zzgtd.zzP(object0, v5, this.zzx(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)zzguu.zzh(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzgtt zzgtt0 = this.zzx(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!zzgtt0.zzk(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    if(!((zzgsu)zzguu.zzh(object0, ((long)(v5 & 0xFFFFF)))).isEmpty()) {
                        zzgst zzgst0 = (zzgst)this.zzz(v3);
                        throw null;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzR(object0, v4, v3) && !zzgtd.zzP(object0, v5, this.zzx(v3))) {
                        return false;
                    }
                }
            }
            ++v1;
            v2 = v10;
        }
        if(!this.zzh) {
            return true;
        }
        this.zzo.zza(object0);
        throw null;
    }

    static zzgtd zzl(Class class0, zzgsx zzgsx0, zzgtf zzgtf0, zzgso zzgso0, zzguk zzguk0, zzgrd zzgrd0, zzgsv zzgsv0) {
        Field field3;
        int v91;
        int v83;
        int v82;
        int v81;
        int v80;
        int v79;
        String s1;
        Field field1;
        int v78;
        int v77;
        Field field0;
        int v72;
        int v69;
        int v63;
        int v14;
        int[] arr_v;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        if(zzgsx0 instanceof zzgtk) {
            String s = ((zzgtk)zzgsx0).zzd();
            int v = s.length();
            if(s.charAt(0) >= 0xD800) {
                for(int v1 = 1; true; v1 = v2) {
                    v2 = v1 + 1;
                    if(s.charAt(v1) < 0xD800) {
                        break;
                    }
                }
            }
            else {
                v2 = 1;
            }
            int v3 = v2 + 1;
            int v4 = s.charAt(v2);
            if(v4 >= 0xD800) {
                int v5 = v4 & 0x1FFF;
                int v6 = 13;
                int v7;
                while((v7 = s.charAt(v3)) >= 0xD800) {
                    v5 |= (v7 & 0x1FFF) << v6;
                    v6 += 13;
                    ++v3;
                }
                v4 = v5 | v7 << v6;
                ++v3;
            }
            if(v4 == 0) {
                v8 = 0;
                v9 = 0;
                v10 = 0;
                v11 = 0;
                v12 = 0;
                v13 = 0;
                arr_v = zzgtd.zza;
                v14 = 0;
            }
            else {
                int v15 = v3 + 1;
                int v16 = s.charAt(v3);
                if(v16 >= 0xD800) {
                    int v17 = v16 & 0x1FFF;
                    int v18 = 13;
                    int v19;
                    while((v19 = s.charAt(v15)) >= 0xD800) {
                        v17 |= (v19 & 0x1FFF) << v18;
                        v18 += 13;
                        ++v15;
                    }
                    v16 = v17 | v19 << v18;
                    ++v15;
                }
                int v20 = v15 + 1;
                int v21 = s.charAt(v15);
                if(v21 >= 0xD800) {
                    int v22 = v21 & 0x1FFF;
                    int v23 = 13;
                    int v24;
                    while((v24 = s.charAt(v20)) >= 0xD800) {
                        v22 |= (v24 & 0x1FFF) << v23;
                        v23 += 13;
                        ++v20;
                    }
                    v21 = v22 | v24 << v23;
                    ++v20;
                }
                int v25 = v20 + 1;
                int v26 = s.charAt(v20);
                if(v26 >= 0xD800) {
                    int v27 = v26 & 0x1FFF;
                    int v28 = 13;
                    int v29;
                    while((v29 = s.charAt(v25)) >= 0xD800) {
                        v27 |= (v29 & 0x1FFF) << v28;
                        v28 += 13;
                        ++v25;
                    }
                    v26 = v27 | v29 << v28;
                    ++v25;
                }
                int v30 = v25 + 1;
                int v31 = s.charAt(v25);
                if(v31 >= 0xD800) {
                    int v32 = v31 & 0x1FFF;
                    int v33 = 13;
                    int v34;
                    while((v34 = s.charAt(v30)) >= 0xD800) {
                        v32 |= (v34 & 0x1FFF) << v33;
                        v33 += 13;
                        ++v30;
                    }
                    v31 = v32 | v34 << v33;
                    ++v30;
                }
                int v35 = v30 + 1;
                v8 = s.charAt(v30);
                if(v8 >= 0xD800) {
                    int v36 = v8 & 0x1FFF;
                    int v37 = 13;
                    int v38;
                    while((v38 = s.charAt(v35)) >= 0xD800) {
                        v36 |= (v38 & 0x1FFF) << v37;
                        v37 += 13;
                        ++v35;
                    }
                    v8 = v36 | v38 << v37;
                    ++v35;
                }
                int v39 = v35 + 1;
                v9 = s.charAt(v35);
                if(v9 >= 0xD800) {
                    int v40 = v9 & 0x1FFF;
                    int v41 = 13;
                    int v42;
                    while((v42 = s.charAt(v39)) >= 0xD800) {
                        v40 |= (v42 & 0x1FFF) << v41;
                        v41 += 13;
                        ++v39;
                    }
                    v9 = v40 | v42 << v41;
                    ++v39;
                }
                int v43 = v39 + 1;
                int v44 = s.charAt(v39);
                if(v44 >= 0xD800) {
                    int v45 = v44 & 0x1FFF;
                    int v46 = 13;
                    int v47;
                    while((v47 = s.charAt(v43)) >= 0xD800) {
                        v45 |= (v47 & 0x1FFF) << v46;
                        v46 += 13;
                        ++v43;
                    }
                    v44 = v45 | v47 << v46;
                    ++v43;
                }
                int v48 = v43 + 1;
                int v49 = s.charAt(v43);
                if(v49 >= 0xD800) {
                    int v50 = v49 & 0x1FFF;
                    int v51 = 13;
                    int v52;
                    while((v52 = s.charAt(v48)) >= 0xD800) {
                        v50 |= (v52 & 0x1FFF) << v51;
                        v51 += 13;
                        ++v48;
                    }
                    v49 = v50 | v52 << v51;
                    ++v48;
                }
                v12 = v16 * 2 + v21;
                arr_v = new int[v49 + v9 + v44];
                v10 = v26;
                v13 = v49;
                v14 = v16;
                v11 = v31;
                v3 = v48;
            }
            Unsafe unsafe0 = zzgtd.zzb;
            Object[] arr_object = ((zzgtk)zzgsx0).zze();
            Class class1 = ((zzgtk)zzgsx0).zza().getClass();
            int v53 = v13 + v9;
            int[] arr_v1 = new int[v8 * 3];
            Object[] arr_object1 = new Object[v8 + v8];
            int v54 = 0;
            int v55 = 0;
            int v56 = v13;
            int v57 = v53;
            while(v3 < v) {
                int v58 = s.charAt(v3);
                if(v58 >= 0xD800) {
                    int v59 = v58 & 0x1FFF;
                    int v60 = v3 + 1;
                    int v61 = 13;
                    int v62;
                    while((v62 = s.charAt(v60)) >= 0xD800) {
                        v59 |= (v62 & 0x1FFF) << v61;
                        v61 += 13;
                        ++v60;
                    }
                    v58 = v59 | v62 << v61;
                    v63 = v60 + 1;
                }
                else {
                    v63 = v3 + 1;
                }
                int v64 = s.charAt(v63);
                if(v64 >= 0xD800) {
                    int v65 = v64 & 0x1FFF;
                    int v66 = v63 + 1;
                    int v67 = 13;
                    int v68;
                    while((v68 = s.charAt(v66)) >= 0xD800) {
                        v65 |= (v68 & 0x1FFF) << v67;
                        v67 += 13;
                        ++v66;
                    }
                    v64 = v65 | v68 << v67;
                    v69 = v66 + 1;
                }
                else {
                    v69 = v63 + 1;
                }
                if((v64 & 0x400) != 0) {
                    arr_v[v54] = v55;
                    ++v54;
                }
                if((v64 & 0xFF) >= 51) {
                    int v70 = v69 + 1;
                    int v71 = s.charAt(v69);
                    v72 = v;
                    if(v71 >= 0xD800) {
                        int v73 = v71 & 0x1FFF;
                        int v74 = 13;
                        int v75;
                        while((v75 = s.charAt(v70)) >= 0xD800) {
                            v73 |= (v75 & 0x1FFF) << v74;
                            v74 += 13;
                            ++v70;
                        }
                        v71 = v73 | v75 << v74;
                        ++v70;
                    }
                    switch((v64 & 0xFF) - 51) {
                        case 12: {
                            if(((zzgtk)zzgsx0).zzc() == 1 || (v64 & 0x800) != 0) {
                                arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v12];
                                ++v12;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v12];
                            ++v12;
                        }
                    }
                    int v76 = v71 + v71;
                    Object object0 = arr_object[v76];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = zzgtd.zzC(class1, ((String)object0));
                        arr_object[v76] = field0;
                    }
                    v77 = v11;
                    v78 = (int)unsafe0.objectFieldOffset(field0);
                    Object object1 = arr_object[v76 + 1];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = zzgtd.zzC(class1, ((String)object1));
                        arr_object[v76 + 1] = field1;
                    }
                    s1 = s;
                    v79 = v10;
                    v80 = v12;
                    v81 = v70;
                    v82 = (int)unsafe0.objectFieldOffset(field1);
                    v83 = 0;
                }
                else {
                    v72 = v;
                    v77 = v11;
                    int v84 = v12 + 1;
                    Field field2 = zzgtd.zzC(class1, ((String)arr_object[v12]));
                    switch(v64 & 0xFF) {
                        case 9: 
                        case 17: {
                            v79 = v10;
                            arr_object1[v55 / 3 + v55 / 3 + 1] = field2.getType();
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            v79 = v10;
                            if(((zzgtk)zzgsx0).zzc() == 1 || (v64 & 0x800) != 0) {
                                arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v84];
                                v84 = v12 + 2;
                            }
                            break;
                        }
                        case 27: 
                        case 49: {
                            v79 = v10;
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v84];
                            v84 = v12 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v56] = v55;
                            int v85 = v55 / 3 + v55 / 3;
                            arr_object1[v85] = arr_object[v84];
                            if((v64 & 0x800) == 0) {
                                ++v56;
                                v84 = v12 + 2;
                                v79 = v10;
                            }
                            else {
                                v84 = v12 + 3;
                                arr_object1[v85 + 1] = arr_object[v12 + 2];
                                v79 = v10;
                                ++v56;
                            }
                            break;
                        }
                        default: {
                            v79 = v10;
                        }
                    }
                    int v86 = (int)unsafe0.objectFieldOffset(field2);
                    v82 = 0xFFFFF;
                    if((v64 & 0x1000) == 0 || (v64 & 0xFF) > 17) {
                        s1 = s;
                        v80 = v84;
                        v81 = v69;
                        v83 = 0;
                    }
                    else {
                        int v87 = v69 + 1;
                        int v88 = s.charAt(v69);
                        if(v88 >= 0xD800) {
                            int v89 = v88 & 0x1FFF;
                            int v90 = 13;
                            while(true) {
                                v81 = v87 + 1;
                                v91 = s.charAt(v87);
                                if(v91 < 0xD800) {
                                    break;
                                }
                                v89 |= (v91 & 0x1FFF) << v90;
                                v90 += 13;
                                v87 = v81;
                            }
                            v88 = v89 | v91 << v90;
                        }
                        else {
                            v81 = v87;
                        }
                        int v92 = v88 / 0x20 + v14 * 2;
                        Object object2 = arr_object[v92];
                        s1 = s;
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = zzgtd.zzC(class1, ((String)object2));
                            arr_object[v92] = field3;
                        }
                        v80 = v84;
                        v83 = v88 % 0x20;
                        v82 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v64 & 0xFF) >= 18 && (v64 & 0xFF) <= 49) {
                        arr_v[v57] = v86;
                        ++v57;
                    }
                    v78 = v86;
                }
                arr_v1[v55] = v58;
                int v93 = v55 + 2;
                arr_v1[v55 + 1] = v78 | (((v64 & 0x800) == 0 ? 0 : 0x80000000) | (((v64 & 0x200) == 0 ? 0 : 0x20000000) | ((v64 & 0x100) == 0 ? 0 : 0x10000000)) | (v64 & 0xFF) << 20);
                v55 += 3;
                arr_v1[v93] = v83 << 20 | v82;
                v12 = v80;
                v3 = v81;
                v = v72;
                v10 = v79;
                s = s1;
                v11 = v77;
            }
            return new zzgtd(arr_v1, arr_object1, v10, v11, ((zzgtk)zzgsx0).zza(), ((zzgtk)zzgsx0).zzc(), false, arr_v, v13, v53, zzgtf0, zzgso0, zzguk0, zzgrd0, zzgsv0);
        }
        zzguh zzguh0 = (zzguh)zzgsx0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object object0, zzgqy zzgqy0) {
        int v10;
        int v9;
        int v8;
        if(!this.zzh) {
            Unsafe unsafe0 = zzgtd.zzb;
            int v = 0xFFFFF;
            int v2 = 0;
            for(int v1 = 0; v2 < this.zzc.length; v1 = v9) {
                int v3 = this.zzu(v2);
                int[] arr_v = this.zzc;
                int v4 = arr_v[v2];
                int v5 = v3 >>> 20 & 0xFF;
                if(v5 <= 17) {
                    int v6 = arr_v[v2 + 2];
                    int v7 = v6 & 0xFFFFF;
                    if(v7 != v) {
                        v1 = v7 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v7));
                        v = v7;
                    }
                    v8 = v;
                    v9 = v1;
                    v10 = 1 << (v6 >>> 20);
                }
                else {
                    v8 = v;
                    v9 = v1;
                    v10 = 0;
                }
                long v11 = (long)(v3 & 0xFFFFF);
                switch(v5) {
                    case 0: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzf(v4, zzguu.zzb(object0, v11));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzo(v4, zzguu.zzc(object0, v11));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzt(v4, unsafe0.getLong(object0, v11));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzJ(v4, unsafe0.getLong(object0, v11));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzr(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzm(v4, unsafe0.getLong(object0, v11));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzk(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzb(v4, zzguu.zzz(object0, v11));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgtd.zzT(v4, unsafe0.getObject(object0, v11), zzgqy0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzv(v4, unsafe0.getObject(object0, v11), this.zzx(v2));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzd(v4, ((zzgqi)unsafe0.getObject(object0, v11)));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzH(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzi(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzw(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzy(v4, unsafe0.getLong(object0, v11));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzA(v4, unsafe0.getInt(object0, v11));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzC(v4, unsafe0.getLong(object0, v11));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zzO(object0, v2, v8, v9, v10)) {
                            zzgqy0.zzq(v4, unsafe0.getObject(object0, v11), this.zzx(v2));
                        }
                        break;
                    }
                    case 18: {
                        zzgtv.zzu(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 19: {
                        zzgtv.zzy(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 20: {
                        zzgtv.zzA(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 21: {
                        zzgtv.zzG(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 22: {
                        zzgtv.zzz(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 23: {
                        zzgtv.zzx(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 24: {
                        zzgtv.zzw(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 25: {
                        zzgtv.zzt(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 26: {
                        int v12 = this.zzc[v2];
                        List list0 = (List)unsafe0.getObject(object0, v11);
                        if(list0 != null && !list0.isEmpty()) {
                            zzgqy0.zzG(v12, list0);
                        }
                        break;
                    }
                    case 27: {
                        int v13 = this.zzc[v2];
                        List list1 = (List)unsafe0.getObject(object0, v11);
                        zzgtt zzgtt0 = this.zzx(v2);
                        if(list1 != null && !list1.isEmpty()) {
                            for(int v14 = 0; v14 < list1.size(); ++v14) {
                                zzgqy0.zzv(v13, list1.get(v14), zzgtt0);
                            }
                        }
                        break;
                    }
                    case 28: {
                        int v15 = this.zzc[v2];
                        List list2 = (List)unsafe0.getObject(object0, v11);
                        if(list2 != null && !list2.isEmpty()) {
                            zzgqy0.zze(v15, list2);
                        }
                        break;
                    }
                    case 29: {
                        zzgtv.zzF(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 30: {
                        zzgtv.zzv(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 0x1F: {
                        zzgtv.zzB(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 0x20: {
                        zzgtv.zzC(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 33: {
                        zzgtv.zzD(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 34: {
                        zzgtv.zzE(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, false);
                        break;
                    }
                    case 35: {
                        zzgtv.zzu(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 36: {
                        zzgtv.zzy(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 37: {
                        zzgtv.zzA(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 38: {
                        zzgtv.zzG(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 39: {
                        zzgtv.zzz(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 40: {
                        zzgtv.zzx(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 41: {
                        zzgtv.zzw(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 42: {
                        zzgtv.zzt(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 43: {
                        zzgtv.zzF(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 44: {
                        zzgtv.zzv(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 45: {
                        zzgtv.zzB(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 46: {
                        zzgtv.zzC(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 0x2F: {
                        zzgtv.zzD(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 0x30: {
                        zzgtv.zzE(this.zzc[v2], ((List)unsafe0.getObject(object0, v11)), zzgqy0, true);
                        break;
                    }
                    case 49: {
                        int v16 = this.zzc[v2];
                        List list3 = (List)unsafe0.getObject(object0, v11);
                        zzgtt zzgtt1 = this.zzx(v2);
                        if(list3 != null && !list3.isEmpty()) {
                            for(int v17 = 0; v17 < list3.size(); ++v17) {
                                zzgqy0.zzq(v16, list3.get(v17), zzgtt1);
                            }
                        }
                        break;
                    }
                    case 50: {
                        if(unsafe0.getObject(object0, v11) != null) {
                            zzgst zzgst0 = (zzgst)this.zzz(v2);
                            throw null;
                        }
                        break;
                    }
                    case 51: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzf(v4, zzgtd.zzn(object0, v11));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzo(v4, zzgtd.zzo(object0, v11));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzt(v4, zzgtd.zzv(object0, v11));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzJ(v4, zzgtd.zzv(object0, v11));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzr(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzm(v4, zzgtd.zzv(object0, v11));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzk(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzb(v4, zzgtd.zzS(object0, v11));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgtd.zzT(v4, unsafe0.getObject(object0, v11), zzgqy0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzv(v4, unsafe0.getObject(object0, v11), this.zzx(v2));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzd(v4, ((zzgqi)unsafe0.getObject(object0, v11)));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzH(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzi(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzw(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzy(v4, zzgtd.zzv(object0, v11));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzA(v4, zzgtd.zzp(object0, v11));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzC(v4, zzgtd.zzv(object0, v11));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zzR(object0, v4, v2)) {
                            zzgqy0.zzq(v4, unsafe0.getObject(object0, v11), this.zzx(v2));
                        }
                    }
                }
                v2 += 3;
                v = v8;
            }
            Object object1 = this.zzn.zzd(object0);
            this.zzn.zzr(object1, zzgqy0);
            return;
        }
        this.zzo.zza(object0);
        throw null;
    }

    private static double zzn(Object object0, long v) {
        return (double)(((Double)zzguu.zzh(object0, v)));
    }

    private static float zzo(Object object0, long v) {
        return (float)(((Float)zzguu.zzh(object0, v)));
    }

    private static int zzp(Object object0, long v) {
        return (int)(((Integer)zzguu.zzh(object0, v)));
    }

    private final int zzq(int v) {
        return v < this.zze || v > this.zzf ? -1 : this.zzs(v, 0);
    }

    private final int zzr(int v) {
        return this.zzc[v + 2];
    }

    private final int zzs(int v, int v1) {
        int v2 = this.zzc.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = this.zzc[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int v) [...] // Inlined contents

    private final int zzu(int v) {
        return this.zzc[v + 1];
    }

    private static long zzv(Object object0, long v) {
        return (long)(((Long)zzguu.zzh(object0, v)));
    }

    private final zzgru zzw(int v) {
        return (zzgru)this.zzd[v / 3 * 2 + 1];
    }

    private final zzgtt zzx(int v) {
        int v1 = v / 3 + v / 3;
        zzgtt zzgtt0 = (zzgtt)this.zzd[v1];
        if(zzgtt0 != null) {
            return zzgtt0;
        }
        zzgtt zzgtt1 = zzgti.zza().zzb(((Class)this.zzd[v1 + 1]));
        this.zzd[v1] = zzgtt1;
        return zzgtt1;
    }

    private final Object zzy(Object object0, int v, Object object1, zzguk zzguk0, Object object2) {
        int v1 = this.zzc[v];
        Object object3 = zzguu.zzh(object0, ((long)(this.zzu(v) & 0xFFFFF)));
        if(object3 == null) {
            return object1;
        }
        if(this.zzw(v) == null) {
            return object1;
        }
        zzgsu zzgsu0 = (zzgsu)object3;
        zzgst zzgst0 = (zzgst)this.zzz(v);
        throw null;
    }

    private final Object zzz(int v) {
        return this.zzd[v / 3 + v / 3];
    }
}


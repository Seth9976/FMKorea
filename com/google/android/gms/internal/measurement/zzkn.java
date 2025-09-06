package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

final class zzkn implements zzlb {
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzky zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzkr zzo;
    private final zzjs zzp;
    private final zzma zzq;
    private final zzim zzr;
    private final zzkg zzs;

    static {
        zzkn.zza = new int[0];
        zzkn.zzb = zzmg.zzb();
    }

    private zzkn(int[] arr_v, Object[] arr_object, int v, int v1, zzkj zzkj0, zzky zzky0, boolean z, int[] arr_v1, int v2, int v3, zzkr zzkr0, zzjs zzjs0, zzma zzma0, zzim zzim0, zzkg zzkg0) {
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zze = v;
        this.zzf = v1;
        this.zzi = zzkj0 instanceof zzix;
        this.zzj = zzky0;
        this.zzh = zzim0 != null && zzim0.zza(zzkj0);
        this.zzk = false;
        this.zzl = arr_v1;
        this.zzm = v2;
        this.zzn = v3;
        this.zzo = zzkr0;
        this.zzp = zzjs0;
        this.zzq = zzma0;
        this.zzr = zzim0;
        this.zzg = zzkj0;
        this.zzs = zzkg0;
    }

    private static double zza(Object object0, long v) {
        return (double)(((Double)zzmg.zze(object0, v)));
    }

    private final int zza(int v) {
        return v < this.zze || v > this.zzf ? -1 : this.zza(v, 0);
    }

    private final int zza(int v, int v1) {
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

    private static int zza(byte[] arr_b, int v, int v1, zzmn zzmn0, Class class0, zzhl zzhl0) {
        int v2;
        switch(zzkq.zza[zzmn0.ordinal()]) {
            case 1: {
                v2 = zzhi.zzd(arr_b, v, zzhl0);
                zzhl0.zzc = Boolean.valueOf(zzhl0.zzb != 0L);
                return v2;
            }
            case 2: {
                return zzhi.zza(arr_b, v, zzhl0);
            }
            case 3: {
                zzhl0.zzc = zzhi.zza(arr_b, v);
                return v + 8;
            }
            case 4: 
            case 5: {
                zzhl0.zzc = zzhi.zzc(arr_b, v);
                return v + 4;
            }
            case 6: 
            case 7: {
                zzhl0.zzc = zzhi.zzd(arr_b, v);
                return v + 8;
            }
            case 8: {
                zzhl0.zzc = zzhi.zzb(arr_b, v);
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = zzhi.zzc(arr_b, v, zzhl0);
                zzhl0.zzc = zzhl0.zza;
                return v2;
            }
            case 12: 
            case 13: {
                v2 = zzhi.zzd(arr_b, v, zzhl0);
                zzhl0.zzc = zzhl0.zzb;
                return v2;
            }
            case 14: {
                return zzhi.zza(zzkx.zza().zza(class0), arr_b, v, v1, zzhl0);
            }
            case 15: {
                v2 = zzhi.zzc(arr_b, v, zzhl0);
                zzhl0.zzc = (int)(-(zzhl0.zza & 1) ^ zzhl0.zza >>> 1);
                return v2;
            }
            case 16: {
                v2 = zzhi.zzd(arr_b, v, zzhl0);
                zzhl0.zzc = (long)(-(zzhl0.zzb & 1L) ^ zzhl0.zzb >>> 1);
                return v2;
            }
            case 17: {
                return zzhi.zzb(arr_b, v, zzhl0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    static zzkn zza(Class class0, zzkh zzkh0, zzkr zzkr0, zzjs zzjs0, zzma zzma0, zzim zzim0, zzkg zzkg0) {
        int v90;
        Field field3;
        int v81;
        int v80;
        int v79;
        String s1;
        zzkz zzkz1;
        int v78;
        Field field1;
        int v76;
        int v75;
        Field field0;
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
        if(zzkh0 instanceof zzkz) {
            zzkz zzkz0 = (zzkz)zzkh0;
            String s = zzkz0.zzd();
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
                arr_v = zzkn.zza;
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
                v12 = (v16 << 1) + v21;
                v14 = v16;
                arr_v = new int[v49 + v9 + v44];
                v13 = v49;
                v3 = v48;
                v10 = v26;
                v11 = v31;
            }
            Unsafe unsafe0 = zzkn.zzb;
            Object[] arr_object = zzkz0.zze();
            Class class1 = zzkz0.zza().getClass();
            int[] arr_v1 = new int[v8 * 3];
            Object[] arr_object1 = new Object[v8 << 1];
            int v53 = v13 + v9;
            int v54 = v13;
            int v55 = v53;
            int v56 = 0;
            int v57 = 0;
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
                    arr_v[v57] = v56;
                    ++v57;
                }
                if((v64 & 0xFF) >= 51) {
                    int v70 = v69 + 1;
                    int v71 = s.charAt(v69);
                    if(v71 >= 0xD800) {
                        int v72 = v71 & 0x1FFF;
                        int v73 = 13;
                        int v74;
                        while((v74 = s.charAt(v70)) >= 0xD800) {
                            v72 |= (v74 & 0x1FFF) << v73;
                            v73 += 13;
                            ++v70;
                        }
                        v71 = v72 | v74 << v73;
                        ++v70;
                    }
                    switch((v64 & 0xFF) - 51) {
                        case 12: {
                            if(zzkz0.zzb().equals(zzky.zza) || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v12];
                                ++v12;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v12];
                            ++v12;
                        }
                    }
                    Object object0 = arr_object[v71 << 1];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = zzkn.zza(class1, ((String)object0));
                        arr_object[v71 << 1] = field0;
                    }
                    v75 = v10;
                    v76 = (int)unsafe0.objectFieldOffset(field0);
                    int v77 = (v71 << 1) + 1;
                    Object object1 = arr_object[v77];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = zzkn.zza(class1, ((String)object1));
                        arr_object[v77] = field1;
                    }
                    v78 = (int)unsafe0.objectFieldOffset(field1);
                    zzkz1 = zzkz0;
                    s1 = s;
                    v79 = v12;
                    v80 = v70;
                    v81 = 0;
                }
                else {
                    v75 = v10;
                    int v82 = v12 + 1;
                    Field field2 = zzkn.zza(class1, ((String)arr_object[v12]));
                    switch(v64 & 0xFF) {
                        case 9: 
                        case 17: {
                            zzkz1 = zzkz0;
                            arr_object1[(v56 / 3 << 1) + 1] = field2.getType();
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            zzkz1 = zzkz0;
                            if(zzkz0.zzb() == zzky.zza || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v82];
                                v82 = v12 + 2;
                            }
                            break;
                        }
                        case 27: 
                        case 49: {
                            zzkz1 = zzkz0;
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v82];
                            v82 = v12 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v54] = v56;
                            int v83 = v56 / 3 << 1;
                            arr_object1[v83] = arr_object[v82];
                            if((v64 & 0x800) == 0) {
                                ++v54;
                                v82 = v12 + 2;
                                zzkz1 = zzkz0;
                            }
                            else {
                                v82 = v12 + 3;
                                arr_object1[v83 + 1] = arr_object[v12 + 2];
                                zzkz1 = zzkz0;
                                ++v54;
                            }
                            break;
                        }
                        default: {
                            zzkz1 = zzkz0;
                        }
                    }
                    int v84 = (int)unsafe0.objectFieldOffset(field2);
                    if((v64 & 0x1000) == 0 || (v64 & 0xFF) > 17) {
                        s1 = s;
                        v79 = v82;
                        v78 = 0xFFFFF;
                        v80 = v69;
                        v90 = 0;
                    }
                    else {
                        v80 = v69 + 1;
                        int v85 = s.charAt(v69);
                        if(v85 >= 0xD800) {
                            int v86 = v85 & 0x1FFF;
                            int v87 = 13;
                            int v88;
                            while((v88 = s.charAt(v80)) >= 0xD800) {
                                v86 |= (v88 & 0x1FFF) << v87;
                                v87 += 13;
                                ++v80;
                            }
                            v85 = v86 | v88 << v87;
                            ++v80;
                        }
                        int v89 = (v14 << 1) + v85 / 0x20;
                        Object object2 = arr_object[v89];
                        s1 = s;
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = zzkn.zza(class1, ((String)object2));
                            arr_object[v89] = field3;
                        }
                        v79 = v82;
                        v90 = v85 % 0x20;
                        v78 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v64 & 0xFF) >= 18 && (v64 & 0xFF) <= 49) {
                        arr_v[v55] = v84;
                        ++v55;
                    }
                    v76 = v84;
                    v81 = v90;
                }
                arr_v1[v56] = v58;
                int v91 = v56 + 2;
                arr_v1[v56 + 1] = (v64 & 0xFF) << 20 | (((v64 & 0x100) == 0 ? 0 : 0x10000000) | ((v64 & 0x200) == 0 ? 0 : 0x20000000) | ((v64 & 0x800) == 0 ? 0 : 0x80000000)) | v76;
                v56 += 3;
                arr_v1[v91] = v81 << 20 | v78;
                v3 = v80;
                v12 = v79;
                zzkz0 = zzkz1;
                s = s1;
                v10 = v75;
            }
            return new zzkn(arr_v1, arr_object1, v10, v11, zzkz0.zza(), zzkz0.zzb(), false, arr_v, v13, v53, zzkr0, zzjs0, zzma0, zzim0, zzkg0);
        }
        zzlt zzlt0 = (zzlt)zzkh0;
        throw new NoSuchMethodError();
    }

    private final Object zza(int v, int v1, Map map0, zzje zzje0, Object object0, zzma zzma0, Object object1) {
        Object object2 = this.zzf(v);
        zzke zzke0 = this.zzs.zza(object2);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object3;
            if(!zzje0.zza(((int)(((Integer)map$Entry0.getValue()))))) {
                if(object0 == null) {
                    object0 = zzma0.zzc(object1);
                }
                zzhv zzhv0 = zzhm.zzc(zzkb.zza(zzke0, map$Entry0.getKey(), map$Entry0.getValue()));
                zzig zzig0 = zzhv0.zzb();
                try {
                    zzkb.zza(zzig0, zzke0, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                zzma0.zza(object0, v1, zzhv0.zza());
                iterator0.remove();
            }
        }
        return object0;
    }

    private final Object zza(Object object0, int v) {
        zzlb zzlb0 = this.zze(v);
        int v1 = this.zzc(v);
        if(!this.zzc(object0, v)) {
            return zzlb0.zza();
        }
        Object object1 = zzkn.zzb.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(zzkn.zzg(object1)) {
            return object1;
        }
        Object object2 = zzlb0.zza();
        if(object1 != null) {
            zzlb0.zza(object2, object1);
        }
        return object2;
    }

    private final Object zza(Object object0, int v, int v1) {
        zzlb zzlb0 = this.zze(v1);
        if(!this.zzc(object0, v, v1)) {
            return zzlb0.zza();
        }
        int v2 = this.zzc(v1);
        Object object1 = zzkn.zzb.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(zzkn.zzg(object1)) {
            return object1;
        }
        Object object2 = zzlb0.zza();
        if(object1 != null) {
            zzlb0.zza(object2, object1);
        }
        return object2;
    }

    private final Object zza(Object object0, int v, Object object1, zzma zzma0, Object object2) {
        int v1 = this.zzc[v];
        Object object3 = zzmg.zze(object0, ((long)(this.zzc(v) & 0xFFFFF)));
        if(object3 == null) {
            return object1;
        }
        zzje zzje0 = this.zzd(v);
        return zzje0 == null ? object1 : this.zza(v, v1, this.zzs.zze(object3), zzje0, object1, zzma0, object2);
    }

    private static Field zza(Class class0, String s) {
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

    private static void zza(int v, Object object0, zzmw zzmw0) {
        if(object0 instanceof String) {
            zzmw0.zza(v, ((String)object0));
            return;
        }
        zzmw0.zza(v, ((zzhm)object0));
    }

    private static void zza(zzma zzma0, Object object0, zzmw zzmw0) {
        zzma0.zzb(zzma0.zzd(object0), zzmw0);
    }

    private final void zza(zzmw zzmw0, int v, Object object0, int v1) {
        if(object0 != null) {
            Object object1 = this.zzf(v1);
            zzmw0.zza(v, this.zzs.zza(object1), this.zzs.zzd(object0));
        }
    }

    private final void zza(Object object0, int v, int v1, Object object1) {
        int v2 = this.zzc(v1);
        zzkn.zzb.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        this.zzb(object0, v, v1);
    }

    private final void zza(Object object0, int v, zzlc zzlc0) {
        if(zzkn.zzg(v)) {
            zzmg.zza(object0, ((long)(v & 0xFFFFF)), zzlc0.zzr());
            return;
        }
        if(this.zzi) {
            zzmg.zza(object0, ((long)(v & 0xFFFFF)), zzlc0.zzq());
            return;
        }
        zzmg.zza(object0, ((long)(v & 0xFFFFF)), zzlc0.zzp());
    }

    private final void zza(Object object0, int v, Object object1) {
        int v1 = this.zzc(v);
        zzkn.zzb.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.zzb(object0, v);
    }

    private final void zza(Object object0, Object object1, int v) {
        if(!this.zzc(object1, v)) {
            return;
        }
        int v1 = this.zzc(v);
        Unsafe unsafe0 = zzkn.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1);
        }
        zzlb zzlb0 = this.zze(v);
        if(!this.zzc(object0, v)) {
            if(zzkn.zzg(object2)) {
                Object object3 = zzlb0.zza();
                zzlb0.zza(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.zzb(object0, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!zzkn.zzg(object4)) {
            Object object5 = zzlb0.zza();
            zzlb0.zza(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlb0.zza(object4, object2);
    }

    private final boolean zza(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.zzc(object0, v) : (v2 & v3) != 0;
    }

    private static boolean zza(Object object0, int v, zzlb zzlb0) {
        return zzlb0.zzd(zzmg.zze(object0, ((long)(v & 0xFFFFF))));
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final int zza(Object object0) {
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = zzkn.zzb;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v2 < this.zzc.length; v1 = v10) {
            int v4 = this.zzc(v2);
            int v5 = (0xFF00000 & v4) >>> 20;
            int v6 = this.zzc[v2];
            int v7 = this.zzc[v2 + 2];
            int v8 = v7 & 0xFFFFF;
            if(v5 <= 17) {
                if(v8 != v) {
                    v1 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
                v9 = v;
                v10 = v1;
                v11 = 1 << (v7 >>> 20);
            }
            else {
                v9 = v;
                v10 = v1;
                v11 = 0;
            }
            long v12 = (long)(v4 & 0xFFFFF);
            boolean z = v5 < zzir.zza.zza();
            switch(v5) {
                case 0: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zza(v6, 0.0);
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 1: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zza(v6, 0.0f);
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 2: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zzd(v6, unsafe0.getLong(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 3: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zzg(v6, unsafe0.getLong(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 4: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zzg(v6, unsafe0.getInt(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 5: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzig.zzc(v6, 0L);
                        v3 += v13;
                    }
                    break;
                }
                case 6: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v3 += zzig.zzf(v6, 0);
                    }
                    break;
                }
                case 7: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzb(v6, true);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 8: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        Object object1 = unsafe0.getObject(object0, v12);
                        v14 = object1 instanceof zzhm ? zzig.zzc(v6, ((zzhm)object1)) : zzig.zzb(v6, ((String)object1));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzld.zza(v6, unsafe0.getObject(object0, v12), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzc(v6, ((zzhm)unsafe0.getObject(object0, v12)));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 11: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzj(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 12: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zze(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 13: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v15 = zzig.zzh(v6, 0);
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 14: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zze(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 15: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzi(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 16: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzf(v6, unsafe0.getLong(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 17: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzig.zzb(v6, ((zzkj)unsafe0.getObject(object0, v12)), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 18: {
                    v14 = zzld.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 19: {
                    v16 = zzld.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 20: {
                    v16 = zzld.zzf(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 21: {
                    v16 = zzld.zzj(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 22: {
                    v16 = zzld.zze(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 23: {
                    v16 = zzld.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 24: {
                    v16 = zzld.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 25: {
                    v16 = zzld.zza(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 26: {
                    v14 = zzld.zzb(v6, ((List)unsafe0.getObject(object0, v12)));
                    v3 += v14;
                    break;
                }
                case 27: {
                    v14 = zzld.zzb(v6, ((List)unsafe0.getObject(object0, v12)), this.zze(v2));
                    v3 += v14;
                    break;
                }
                case 28: {
                    v14 = zzld.zza(v6, ((List)unsafe0.getObject(object0, v12)));
                    v3 += v14;
                    break;
                }
                case 29: {
                    v14 = zzld.zzi(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 30: {
                    v16 = zzld.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 0x1F: {
                    v16 = zzld.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 0x20: {
                    v16 = zzld.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 33: {
                    v16 = zzld.zzg(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v16;
                    break;
                }
                case 34: {
                    v3 += zzld.zzh(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    break;
                }
                case 35: {
                    v17 = zzld.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 36: {
                    v17 = zzld.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 37: {
                    v17 = zzld.zzf(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 38: {
                    v17 = zzld.zzj(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 39: {
                    v17 = zzld.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 40: {
                    v17 = zzld.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 41: {
                    v17 = zzld.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 42: {
                    v17 = zzld.zza(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 43: {
                    v17 = zzld.zzi(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 44: {
                    v17 = zzld.zzb(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 45: {
                    v17 = zzld.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 46: {
                    v17 = zzld.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v17 = zzld.zzg(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v18 = zzig.zzi(v6);
                        v19 = zzig.zzj(v17);
                        v15 = v18 + v19 + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v17 = zzld.zzh(((List)unsafe0.getObject(object0, v12)));
                    if(v17 > 0) {
                        v15 = zzig.zzi(v6) + zzig.zzj(v17) + v17;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 49: {
                    v14 = zzld.zza(v6, ((List)unsafe0.getObject(object0, v12)), this.zze(v2));
                    v3 += v14;
                    break;
                }
                case 50: {
                    Object object2 = unsafe0.getObject(object0, v12);
                    Object object3 = this.zzf(v2);
                    v14 = this.zzs.zza(v6, object2, object3);
                    v3 += v14;
                    break;
                }
                case 51: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zza(v6, 0.0);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zza(v6, 0.0f);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzd(v6, zzkn.zzd(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzg(v6, zzkn.zzd(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzg(v6, zzkn.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzc(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.zzc(object0, v6, v2)) {
                        v15 = zzig.zzf(v6, 0);
                        v3 += v15;
                    }
                    break;
                }
                case 58: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzb(v6, true);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.zzc(object0, v6, v2)) {
                        Object object4 = unsafe0.getObject(object0, v12);
                        v14 = object4 instanceof zzhm ? zzig.zzc(v6, ((zzhm)object4)) : zzig.zzb(v6, ((String)object4));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzld.zza(v6, unsafe0.getObject(object0, v12), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzc(v6, ((zzhm)unsafe0.getObject(object0, v12)));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzj(v6, zzkn.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zze(v6, zzkn.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzc(object0, v6, v2)) {
                        v3 += zzig.zzh(v6, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zze(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzi(v6, zzkn.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzig.zzf(v6, zzkn.zzd(object0, v12));
                        v3 += v14;
                    }
                    break;
                }
                case 68: {
                    if(this.zzc(object0, v6, v2)) {
                        v3 += zzig.zzb(v6, ((zzkj)unsafe0.getObject(object0, v12)), this.zze(v2));
                    }
                }
            }
            v2 += 3;
            v = v9;
        }
        int v20 = 0;
        Object object5 = this.zzq.zzd(object0);
        int v21 = v3 + this.zzq.zza(object5);
        if(this.zzh) {
            zziq zziq0 = this.zzr.zza(object0);
            for(int v22 = 0; v22 < zziq0.zza.zzb(); ++v22) {
                Map.Entry map$Entry0 = zziq0.zza.zzb(v22);
                v20 += zziq.zza(((zzis)map$Entry0.getKey()), map$Entry0.getValue());
            }
            for(Object object6: zziq0.zza.zzc()) {
                v20 += zziq.zza(((zzis)((Map.Entry)object6).getKey()), ((Map.Entry)object6).getValue());
            }
            return v21 + v20;
        }
        return v21;
    }

    final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, zzhl zzhl0) {
        zzkn zzkn2;
        int v99;
        int v95;
        int v94;
        int v93;
        int v92;
        int v89;
        int v88;
        int v87;
        int v86;
        int v84;
        int v83;
        Object object8;
        int v42;
        int v41;
        int v40;
        int v70;
        int v52;
        int v51;
        int v50;
        int v49;
        int v67;
        int v60;
        Unsafe unsafe4;
        int v38;
        int v37;
        int v36;
        int v35;
        int v34;
        int v28;
        int v25;
        int v24;
        Unsafe unsafe2;
        int v23;
        int v22;
        zzhl zzhl2;
        int v14;
        zzkn zzkn1;
        Unsafe unsafe1;
        int v13;
        int v10;
        zzkn zzkn0 = this;
        zzhl zzhl1 = zzhl0;
        zzkn.zzf(object0);
        Unsafe unsafe0 = zzkn.zzb;
        int v3 = v;
        int v4 = -1;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0xFFFFF;
        while(true) {
            if(v3 >= v1) {
                unsafe1 = unsafe0;
                zzkn2 = zzkn0;
                v99 = v3;
                break;
            }
            int v9 = arr_b[v3];
            if(v9 < 0) {
                v10 = zzhi.zza(v9, arr_b, v3 + 1, zzhl1);
                v9 = zzhl1.zza;
            }
            else {
                v10 = v3 + 1;
            }
            int v11 = v9 >>> 3;
            int v12 = v9 & 7;
            if(v11 > v4) {
                v13 = v11 < zzkn0.zze || v11 > zzkn0.zzf ? -1 : zzkn0.zza(v11, v5 / 3);
            }
            else {
                v13 = zzkn0.zza(v11);
            }
            v5 = v13;
            if(v5 == -1) {
                unsafe1 = unsafe0;
                zzkn1 = zzkn0;
                v5 = 0;
                v14 = v9;
                zzhl2 = zzhl1;
            }
            else {
                int[] arr_v = zzkn0.zzc;
                int v15 = arr_v[v5 + 1];
                int v16 = (v15 & 0xFF00000) >>> 20;
                int v17 = v15;
                long v18 = (long)(v15 & 0xFFFFF);
                if(v16 <= 17) {
                    int v19 = arr_v[v5 + 2];
                    int v20 = 1 << (v19 >>> 20);
                    int v21 = v19 & 0xFFFFF;
                    if(v21 == v8) {
                        v23 = v7;
                        v22 = v8;
                    }
                    else {
                        if(v8 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v8), v7);
                        }
                        v22 = v21;
                        v23 = v21 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v21));
                    }
                    switch(v16) {
                        case 0: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 1) {
                                zzmg.zza(object0, v18, zzhi.zza(arr_b, v10));
                                v3 = v10 + 8;
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 1: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 5) {
                                zzmg.zza(object0, v18, zzhi.zzb(arr_b, v10));
                                v3 = v10 + 4;
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 0) {
                                int v26 = zzhi.zzd(arr_b, v10, zzhl0);
                                unsafe2.putLong(object0, v18, zzhl0.zzb);
                                zzhl1 = zzhl0;
                                unsafe0 = unsafe2;
                                v4 = v24;
                                v8 = v22;
                                v7 = v23 | v20;
                                v3 = v26;
                                v6 = v25;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 0) {
                                v3 = zzhi.zzd(arr_b, v10, zzhl0);
                                zzmg.zzc(object0, v18, zzhl0.zzb != 0L);
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 8: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 2) {
                                if(zzkn.zzg(v17)) {
                                    v3 = zzhi.zzb(arr_b, v10, zzhl0);
                                }
                                else {
                                    v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                    int v27 = zzhl0.zza;
                                    if(v27 < 0) {
                                        throw zzji.zzf();
                                    }
                                    if(v27 == 0) {
                                        zzhl0.zzc = "";
                                    }
                                    else {
                                        zzhl0.zzc = new String(arr_b, v3, v27, zziz.zza);
                                        v3 += v27;
                                    }
                                }
                                unsafe2.putObject(object0, v18, zzhl0.zzc);
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 9: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 2) {
                                Object object1 = zzkn0.zza(object0, v5);
                                v3 = zzhi.zza(object1, zzkn0.zze(v5), arr_b, v10, v1, zzhl0);
                                zzkn0.zza(object0, v5, object1);
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 10: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 2) {
                                v3 = zzhi.zza(arr_b, v10, zzhl0);
                                unsafe2.putObject(object0, v18, zzhl0.zzc);
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 4: 
                        case 11: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 0) {
                                v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                unsafe2.putInt(object0, v18, zzhl0.zza);
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 12: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 0) {
                                v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                int v29 = zzhl0.zza;
                                zzje zzje0 = zzkn0.zzd(v5);
                                if((v17 & 0x80000000) == 0 || zzje0 == null || zzje0.zza(v29)) {
                                    unsafe2.putInt(object0, v18, v29);
                                }
                                else {
                                    zzkn.zze(object0).zza(v25, ((long)v29));
                                    zzhl1 = zzhl0;
                                    v6 = v25;
                                    unsafe0 = unsafe2;
                                    v4 = v24;
                                    v7 = v23;
                                    v8 = v22;
                                    continue;
                                }
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 6: 
                        case 13: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 5) {
                                unsafe2.putInt(object0, v18, zzhi.zzc(arr_b, v10));
                                v3 = v10 + 4;
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 5: 
                        case 14: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 1) {
                                unsafe2.putLong(object0, v18, zzhi.zzd(arr_b, v10));
                                v3 = v10 + 8;
                                v28 = v23 | v20;
                                goto label_164;
                            }
                            break;
                        }
                        case 15: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            if(v12 == 0) {
                                v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                unsafe2.putInt(object0, v18, -(zzhl0.zza & 1) ^ zzhl0.zza >>> 1);
                                v28 = v23 | v20;
                            label_164:
                                zzhl1 = zzhl0;
                                v6 = v25;
                                unsafe0 = unsafe2;
                                v4 = v24;
                                v8 = v22;
                                v7 = v28;
                                continue;
                            }
                            break;
                        }
                        case 16: {
                            if(v12 == 0) {
                                int v30 = zzhi.zzd(arr_b, v10, zzhl0);
                                unsafe0.putLong(object0, v18, -(zzhl0.zzb & 1L) ^ zzhl0.zzb >>> 1);
                                zzhl1 = zzhl0;
                                v6 = v9;
                                v4 = v11;
                                v8 = v22;
                                v7 = v23 | v20;
                                v3 = v30;
                                continue;
                            }
                            else {
                                unsafe2 = unsafe0;
                                v24 = v11;
                                v25 = v9;
                                break;
                            }
                            goto label_185;
                        }
                        case 17: {
                        label_185:
                            if(v12 == 3) {
                                Object object2 = zzkn0.zza(object0, v5);
                                int v31 = zzhi.zza(object2, zzkn0.zze(v5), arr_b, v10, v1, v11 << 3 | 4, zzhl0);
                                zzkn0.zza(object0, v5, object2);
                                v7 = v23 | v20;
                                v3 = v31;
                                v4 = v11;
                                v6 = v9;
                                v8 = v22;
                                zzhl1 = zzhl0;
                                continue;
                            }
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            break;
                        }
                        default: {
                            unsafe2 = unsafe0;
                            v24 = v11;
                            v25 = v9;
                            break;
                        }
                    }
                    zzkn1 = zzkn0;
                    zzhl2 = zzhl0;
                    v14 = v25;
                    unsafe1 = unsafe2;
                    v11 = v24;
                    v7 = v23;
                    v8 = v22;
                }
                else {
                    v24 = v11;
                    int v32 = 10;
                    if(v16 == 27) {
                        if(v12 == 2) {
                            zzjf zzjf0 = (zzjf)unsafe0.getObject(object0, v18);
                            if(!zzjf0.zzc()) {
                                int v33 = zzjf0.size();
                                if(v33 != 0) {
                                    v32 = v33 << 1;
                                }
                                zzjf0 = zzjf0.zza(v32);
                                unsafe0.putObject(object0, v18, zzjf0);
                            }
                            v23 = v7;
                            v22 = v8;
                            zzhl1 = zzhl0;
                            v6 = v9;
                            v3 = zzhi.zza(zzkn0.zze(v5), v9, arr_b, v10, v1, zzjf0, zzhl0);
                            v4 = v24;
                            v7 = v23;
                            v8 = v22;
                            continue;
                        }
                        else {
                            v34 = v7;
                            v35 = v8;
                            v36 = v9;
                            unsafe1 = unsafe0;
                            v37 = v10;
                            v38 = v5;
                            goto label_697;
                        }
                        goto label_234;
                    }
                    else {
                    label_234:
                        v34 = v7;
                        v35 = v8;
                        if(v16 <= 49) {
                            Unsafe unsafe3 = zzkn.zzb;
                            zzjf zzjf1 = (zzjf)unsafe3.getObject(object0, v18);
                            if(zzjf1.zzc()) {
                                unsafe4 = unsafe0;
                            }
                            else {
                                int v39 = zzjf1.size();
                                if(v39 != 0) {
                                    v32 = v39 << 1;
                                }
                                unsafe4 = unsafe0;
                                zzjf zzjf2 = zzjf1.zza(v32);
                                unsafe3.putObject(object0, v18, zzjf2);
                                zzjf1 = zzjf2;
                            }
                            switch(v16) {
                                case 26: {
                                    v49 = v9;
                                    v50 = v10;
                                    v51 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        if((((long)v17) & 0x20000000L) == 0L) {
                                            v60 = zzhi.zzc(arr_b, v50, zzhl0);
                                            int v61 = zzhl0.zza;
                                            if(v61 >= 0) {
                                                if(v61 == 0) {
                                                    zzjf1.add("");
                                                    goto label_442;
                                                }
                                                else {
                                                    zzjf1.add(new String(arr_b, v60, v61, zziz.zza));
                                                }
                                            alab1:
                                                while(true) {
                                                    v60 += v61;
                                                    while(true) {
                                                    label_442:
                                                        if(v60 >= v1) {
                                                            goto label_480;
                                                        }
                                                        int v62 = zzhi.zzc(arr_b, v60, zzhl0);
                                                        if(v49 != zzhl0.zza) {
                                                            goto label_480;
                                                        }
                                                        v60 = zzhi.zzc(arr_b, v62, zzhl0);
                                                        v61 = zzhl0.zza;
                                                        if(v61 < 0) {
                                                            break alab1;
                                                        }
                                                        if(v61 != 0) {
                                                            zzjf1.add(new String(arr_b, v60, v61, zziz.zza));
                                                            break;
                                                        }
                                                        zzjf1.add("");
                                                    }
                                                }
                                                throw zzji.zzf();
                                            }
                                        }
                                        else {
                                            v60 = zzhi.zzc(arr_b, v50, zzhl0);
                                            int v63 = zzhl0.zza;
                                            if(v63 >= 0) {
                                                if(v63 == 0) {
                                                    zzjf1.add("");
                                                    goto label_465;
                                                }
                                                else {
                                                    int v64 = v60 + v63;
                                                    if(!zzmh.zzc(arr_b, v60, v64)) {
                                                        throw zzji.zzd();
                                                    }
                                                    zzjf1.add(new String(arr_b, v60, v63, zziz.zza));
                                                alab2:
                                                    while(true) {
                                                        v60 = v64;
                                                        while(true) {
                                                        label_465:
                                                            if(v60 >= v1) {
                                                                goto label_480;
                                                            }
                                                            int v65 = zzhi.zzc(arr_b, v60, zzhl0);
                                                            if(v49 != zzhl0.zza) {
                                                                goto label_480;
                                                            }
                                                            v60 = zzhi.zzc(arr_b, v65, zzhl0);
                                                            int v66 = zzhl0.zza;
                                                            if(v66 < 0) {
                                                                throw zzji.zzf();
                                                            }
                                                            if(v66 != 0) {
                                                                v64 = v60 + v66;
                                                                if(!zzmh.zzc(arr_b, v60, v64)) {
                                                                    break alab2;
                                                                }
                                                                zzjf1.add(new String(arr_b, v60, v66, zziz.zza));
                                                                break;
                                                            }
                                                            zzjf1.add("");
                                                        }
                                                    }
                                                    throw zzji.zzd();
                                                label_480:
                                                    v42 = v51;
                                                    v41 = v50;
                                                    v3 = v60;
                                                    v40 = v49;
                                                    break;
                                                }
                                            }
                                        }
                                        throw zzji.zzf();
                                    }
                                label_487:
                                    v42 = v51;
                                    v41 = v50;
                                    v40 = v49;
                                    v3 = v41;
                                    break;
                                }
                                case 28: {
                                    v67 = v9;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                        int v68 = zzhl0.zza;
                                        if(v68 < 0) {
                                            throw zzji.zzf();
                                        }
                                        if(v68 > arr_b.length - v3) {
                                            throw zzji.zzh();
                                        }
                                        if(v68 == 0) {
                                            zzjf1.add(zzhm.zza);
                                            goto label_503;
                                        }
                                        else {
                                            zzjf1.add(zzhm.zza(arr_b, v3, v68));
                                        }
                                    alab3:
                                        while(true) {
                                            v3 += v68;
                                            while(true) {
                                            label_503:
                                                if(v3 >= v1) {
                                                    goto label_592;
                                                }
                                                int v69 = zzhi.zzc(arr_b, v3, zzhl0);
                                                if(v67 != zzhl0.zza) {
                                                    goto label_592;
                                                }
                                                v3 = zzhi.zzc(arr_b, v69, zzhl0);
                                                v68 = zzhl0.zza;
                                                if(v68 < 0) {
                                                    throw zzji.zzf();
                                                }
                                                if(v68 > arr_b.length - v3) {
                                                    break alab3;
                                                }
                                                if(v68 != 0) {
                                                    zzjf1.add(zzhm.zza(arr_b, v3, v68));
                                                    break;
                                                }
                                                zzjf1.add(zzhm.zza);
                                            }
                                        }
                                        throw zzji.zzh();
                                    }
                                    v40 = v67;
                                    v41 = v10;
                                    v42 = v5;
                                    v3 = v41;
                                    break;
                                }
                                case 18: 
                                case 35: {
                                    v40 = v9;
                                    v41 = v10;
                                    v42 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzii zzii0 = (zzii)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v41, zzhl0);
                                        int v43 = zzhl0.zza + v3;
                                        while(v3 < v43) {
                                            zzii0.zza(zzhi.zza(arr_b, v3));
                                            v3 += 8;
                                        }
                                        if(v3 != v43) {
                                            throw zzji.zzh();
                                        }
                                    }
                                    else {
                                        if(v12 == 1) {
                                            zzii zzii1 = (zzii)zzjf1;
                                            zzii1.zza(zzhi.zza(arr_b, v41));
                                            for(v3 = v41 + 8; v3 < v1; v3 = v44 + 8) {
                                                int v44 = zzhi.zzc(arr_b, v3, zzhl0);
                                                if(v40 != zzhl0.zza) {
                                                    break;
                                                }
                                                zzii1.zza(zzhi.zza(arr_b, v44));
                                            }
                                            break;
                                        }
                                        else {
                                            goto label_305;
                                        }
                                        goto label_280;
                                    }
                                    break;
                                }
                                case 19: 
                                case 36: {
                                label_280:
                                    v40 = v9;
                                    v41 = v10;
                                    v42 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zziw zziw0 = (zziw)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v41, zzhl0);
                                        int v45 = zzhl0.zza + v3;
                                        while(v3 < v45) {
                                            zziw0.zza(zzhi.zzb(arr_b, v3));
                                            v3 += 4;
                                        }
                                        if(v3 != v45) {
                                            throw zzji.zzh();
                                        }
                                    }
                                    else {
                                        if(v12 == 5) {
                                            zziw zziw1 = (zziw)zzjf1;
                                            zziw1.zza(zzhi.zzb(arr_b, v41));
                                            for(v3 = v41 + 4; v3 < v1; v3 = v46 + 4) {
                                                int v46 = zzhi.zzc(arr_b, v3, zzhl0);
                                                if(v40 != zzhl0.zza) {
                                                    break;
                                                }
                                                zziw1.zza(zzhi.zzb(arr_b, v46));
                                            }
                                            break;
                                        }
                                    label_305:
                                        v3 = v41;
                                    }
                                    break;
                                }
                                case 20: 
                                case 21: 
                                case 37: 
                                case 38: {
                                    v40 = v9;
                                    v41 = v10;
                                    v42 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzjy zzjy0 = (zzjy)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v41, zzhl0);
                                        int v47 = zzhl0.zza + v3;
                                        while(v3 < v47) {
                                            v3 = zzhi.zzd(arr_b, v3, zzhl0);
                                            zzjy0.zza(zzhl0.zzb);
                                        }
                                        if(v3 != v47) {
                                            throw zzji.zzh();
                                        }
                                    }
                                    else {
                                        if(v12 == 0) {
                                            zzjy zzjy1 = (zzjy)zzjf1;
                                            v3 = zzhi.zzd(arr_b, v41, zzhl0);
                                            zzjy1.zza(zzhl0.zzb);
                                            while(v3 < v1) {
                                                int v48 = zzhi.zzc(arr_b, v3, zzhl0);
                                                if(v40 != zzhl0.zza) {
                                                    break;
                                                }
                                                v3 = zzhi.zzd(arr_b, v48, zzhl0);
                                                zzjy1.zza(zzhl0.zzb);
                                            }
                                            break;
                                        }
                                        v3 = v41;
                                        break;
                                    }
                                    break;
                                }
                                case 25: 
                                case 42: {
                                    v49 = v9;
                                    v50 = v10;
                                    v51 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzhk zzhk0 = (zzhk)zzjf1;
                                        v52 = zzhi.zzc(arr_b, v50, zzhl0);
                                        int v58 = zzhl0.zza + v52;
                                        while(v52 < v58) {
                                            v52 = zzhi.zzd(arr_b, v52, zzhl0);
                                            zzhk0.zza(zzhl0.zzb != 0L);
                                        }
                                        if(v52 != v58) {
                                            throw zzji.zzh();
                                        }
                                        goto label_423;
                                    }
                                    else if(v12 == 0) {
                                        zzhk zzhk1 = (zzhk)zzjf1;
                                        v52 = zzhi.zzd(arr_b, v50, zzhl0);
                                        zzhk1.zza(zzhl0.zzb != 0L);
                                        while(v52 < v1) {
                                            int v59 = zzhi.zzc(arr_b, v52, zzhl0);
                                            if(v49 != zzhl0.zza) {
                                                break;
                                            }
                                            v52 = zzhi.zzd(arr_b, v59, zzhl0);
                                            zzhk1.zza(zzhl0.zzb != 0L);
                                        }
                                    label_423:
                                        v3 = v52;
                                        v42 = v51;
                                        v41 = v50;
                                        v40 = v49;
                                        break;
                                    }
                                    goto label_487;
                                }
                                case 22: 
                                case 29: 
                                case 39: 
                                case 43: {
                                    v49 = v9;
                                    v50 = v10;
                                    v51 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        v52 = zzhi.zza(arr_b, v50, zzjf1, zzhl0);
                                        goto label_423;
                                    }
                                    else if(v12 == 0) {
                                        v42 = v51;
                                        v41 = v50;
                                        v40 = v49;
                                        v3 = zzhi.zza(v49, arr_b, v50, v1, zzjf1, zzhl0);
                                        break;
                                    }
                                    goto label_487;
                                }
                                case 30: 
                                case 44: {
                                    v67 = v9;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        v70 = zzhi.zza(arr_b, v10, zzjf1, zzhl0);
                                        zzld.zza(object0, v24, zzjf1, zzkn0.zzd(v5), null, zzkn0.zzq);
                                        v3 = v70;
                                        goto label_592;
                                    }
                                    else if(v12 == 0) {
                                        v70 = zzhi.zza(v67, arr_b, v10, v1, zzjf1, zzhl0);
                                        zzld.zza(object0, v24, zzjf1, zzkn0.zzd(v5), null, zzkn0.zzq);
                                        v3 = v70;
                                        goto label_592;
                                    }
                                    v40 = v67;
                                    v41 = v10;
                                    v42 = v5;
                                    v3 = v41;
                                    break;
                                }
                                case 24: 
                                case 0x1F: 
                                case 41: 
                                case 45: {
                                    v49 = v9;
                                    v50 = v10;
                                    v51 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzja zzja0 = (zzja)zzjf1;
                                        v52 = zzhi.zzc(arr_b, v50, zzhl0);
                                        int v56 = zzhl0.zza + v52;
                                        while(v52 < v56) {
                                            zzja0.zzd(zzhi.zzc(arr_b, v52));
                                            v52 += 4;
                                        }
                                        if(v52 != v56) {
                                            throw zzji.zzh();
                                        }
                                        goto label_423;
                                    }
                                    else if(v12 == 5) {
                                        zzja zzja1 = (zzja)zzjf1;
                                        zzja1.zzd(zzhi.zzc(arr_b, v50));
                                        for(v54 = v50 + 4; v54 < v1; v54 = v57 + 4) {
                                            int v57 = zzhi.zzc(arr_b, v54, zzhl0);
                                            if(v49 != zzhl0.zza) {
                                                break;
                                            }
                                            zzja1.zzd(zzhi.zzc(arr_b, v57));
                                        }
                                    label_394:
                                        v41 = v50;
                                        v40 = v49;
                                        v3 = v54;
                                        v42 = v51;
                                        break;
                                    }
                                    goto label_487;
                                }
                                case 23: 
                                case 0x20: 
                                case 40: 
                                case 46: {
                                    v49 = v9;
                                    v50 = v10;
                                    v51 = v5;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzjy zzjy2 = (zzjy)zzjf1;
                                        v52 = zzhi.zzc(arr_b, v50, zzhl0);
                                        int v53 = zzhl0.zza + v52;
                                        while(v52 < v53) {
                                            zzjy2.zza(zzhi.zzd(arr_b, v52));
                                            v52 += 8;
                                        }
                                        if(v52 != v53) {
                                            throw zzji.zzh();
                                        }
                                        goto label_423;
                                    }
                                    else if(v12 == 1) {
                                        zzjy zzjy3 = (zzjy)zzjf1;
                                        zzjy3.zza(zzhi.zzd(arr_b, v50));
                                        int v54;
                                        for(v54 = v50 + 8; v54 < v1; v54 = v55 + 8) {
                                            int v55 = zzhi.zzc(arr_b, v54, zzhl0);
                                            if(v49 != zzhl0.zza) {
                                                break;
                                            }
                                            zzjy3.zza(zzhi.zzd(arr_b, v55));
                                        }
                                        goto label_394;
                                    }
                                    goto label_487;
                                }
                                case 33: 
                                case 0x2F: {
                                    v67 = v9;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzja zzja2 = (zzja)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                        int v71 = zzhl0.zza + v3;
                                        while(v3 < v71) {
                                            v3 = zzhi.zzc(arr_b, v3, zzhl0);
                                            zzja2.zzd(-(zzhl0.zza & 1) ^ zzhl0.zza >>> 1);
                                        }
                                        if(v3 != v71) {
                                            throw zzji.zzh();
                                        }
                                        goto label_592;
                                    }
                                    else if(v12 == 0) {
                                        zzja zzja3 = (zzja)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                        zzja3.zzd(-(zzhl0.zza & 1) ^ zzhl0.zza >>> 1);
                                        while(v3 < v1) {
                                            int v72 = zzhi.zzc(arr_b, v3, zzhl0);
                                            if(v67 != zzhl0.zza) {
                                                break;
                                            }
                                            v3 = zzhi.zzc(arr_b, v72, zzhl0);
                                            zzja3.zzd(-(zzhl0.zza & 1) ^ zzhl0.zza >>> 1);
                                        }
                                        goto label_592;
                                    }
                                    v40 = v67;
                                    v41 = v10;
                                    v42 = v5;
                                    v3 = v41;
                                    break;
                                }
                                case 34: 
                                case 0x30: {
                                    v67 = v9;
                                    unsafe1 = unsafe4;
                                    if(v12 == 2) {
                                        zzjy zzjy4 = (zzjy)zzjf1;
                                        v3 = zzhi.zzc(arr_b, v10, zzhl0);
                                        int v73 = zzhl0.zza + v3;
                                        while(v3 < v73) {
                                            v3 = zzhi.zzd(arr_b, v3, zzhl0);
                                            zzjy4.zza(-(zzhl0.zzb & 1L) ^ zzhl0.zzb >>> 1);
                                        }
                                        if(v3 != v73) {
                                            throw zzji.zzh();
                                        }
                                        goto label_592;
                                    }
                                    else if(v12 == 0) {
                                        zzjy zzjy5 = (zzjy)zzjf1;
                                        v3 = zzhi.zzd(arr_b, v10, zzhl0);
                                        zzjy5.zza(-(zzhl0.zzb & 1L) ^ zzhl0.zzb >>> 1);
                                        while(v3 < v1) {
                                            int v74 = zzhi.zzc(arr_b, v3, zzhl0);
                                            if(v67 != zzhl0.zza) {
                                                break;
                                            }
                                            v3 = zzhi.zzd(arr_b, v74, zzhl0);
                                            zzjy5.zza(-(zzhl0.zzb & 1L) ^ zzhl0.zzb >>> 1);
                                        }
                                        goto label_592;
                                    }
                                    v40 = v67;
                                    v41 = v10;
                                    v42 = v5;
                                    v3 = v41;
                                    break;
                                }
                                case 49: {
                                    if(v12 == 3) {
                                        zzlb zzlb0 = zzkn0.zze(v5);
                                        int v75 = v9 & -8 | 4;
                                        v67 = v9;
                                        unsafe1 = unsafe4;
                                        v3 = zzhi.zza(zzlb0, arr_b, v10, v1, v75, zzhl0);
                                        zzjf1.add(zzhl0.zzc);
                                        while(v3 < v1) {
                                            int v76 = zzhi.zzc(arr_b, v3, zzhl0);
                                            if(v67 != zzhl0.zza) {
                                                break;
                                            }
                                            v3 = zzhi.zza(zzlb0, arr_b, v76, v1, v75, zzhl0);
                                            zzjf1.add(zzhl0.zzc);
                                        }
                                    label_592:
                                        v40 = v67;
                                        v41 = v10;
                                        v42 = v5;
                                        break;
                                    }
                                    else {
                                        unsafe1 = unsafe4;
                                        v40 = v9;
                                    }
                                    v41 = v10;
                                    v42 = v5;
                                    v3 = v41;
                                    break;
                                }
                                default: {
                                    v40 = v9;
                                    v41 = v10;
                                    v42 = v5;
                                    unsafe1 = unsafe4;
                                    goto label_305;
                                }
                            }
                            if(v3 == v41) {
                                zzkn1 = zzkn0;
                                zzhl2 = zzhl0;
                                v14 = v40;
                                v5 = v42;
                                v11 = v24;
                                v7 = v34;
                                v8 = v35;
                                v10 = v3;
                                goto label_892;
                            }
                            else {
                                zzhl1 = zzhl0;
                                v6 = v40;
                                v5 = v42;
                                v4 = v24;
                                v7 = v34;
                                v8 = v35;
                                unsafe0 = unsafe1;
                                continue;
                            }
                            goto label_619;
                        }
                        else {
                        label_619:
                            unsafe1 = unsafe0;
                            v37 = v10;
                            v38 = v5;
                            int v77 = v9;
                            if(v16 == 50) {
                                if(v12 == 2) {
                                    Unsafe unsafe5 = zzkn.zzb;
                                    Object object3 = zzkn0.zzf(v38);
                                    Object object4 = unsafe5.getObject(object0, v18);
                                    if(zzkn0.zzs.zzf(object4)) {
                                        Object object5 = zzkn0.zzs.zzb(object3);
                                        zzkn0.zzs.zza(object5, object4);
                                        unsafe5.putObject(object0, v18, object5);
                                        object4 = object5;
                                    }
                                    zzke zzke0 = zzkn0.zzs.zza(object3);
                                    Map map0 = zzkn0.zzs.zze(object4);
                                    int v78 = zzhi.zzc(arr_b, v37, zzhl0);
                                    int v79 = zzhl0.zza;
                                    if(v79 < 0 || v79 > v1 - v78) {
                                        throw zzji.zzh();
                                    }
                                    int v80 = v78 + v79;
                                    Object object6 = zzke0.zzd;
                                    Object object7 = zzke0.zzb;
                                    while(v78 < v80) {
                                        int v81 = v78 + 1;
                                        int v82 = arr_b[v78];
                                        if(v82 < 0) {
                                            v81 = zzhi.zza(v82, arr_b, v81, zzhl0);
                                            v82 = zzhl0.zza;
                                        }
                                        switch(v82 >>> 3) {
                                            case 1: {
                                                object8 = object7;
                                                v83 = v80;
                                                v84 = v77;
                                                if((v82 & 7) == zzke0.zza.zza()) {
                                                    v78 = zzkn.zza(arr_b, v81, v1, zzke0.zza, null, zzhl0);
                                                    object7 = zzhl0.zzc;
                                                    goto label_669;
                                                }
                                                break;
                                            }
                                            case 2: {
                                                if((v82 & 7) == zzke0.zzc.zza()) {
                                                    Class class0 = zzke0.zzd.getClass();
                                                    v84 = v77;
                                                    object8 = object7;
                                                    v83 = v80;
                                                    v78 = zzkn.zza(arr_b, v81, v1, zzke0.zzc, class0, zzhl0);
                                                    object6 = zzhl0.zzc;
                                                    goto label_668;
                                                }
                                                object8 = object7;
                                                v83 = v80;
                                                v84 = v77;
                                                break;
                                            }
                                            default: {
                                                object8 = object7;
                                                v83 = v80;
                                                v84 = v77;
                                                break;
                                            }
                                        }
                                        v78 = zzhi.zza(v82, arr_b, v81, v1, zzhl0);
                                    label_668:
                                        object7 = object8;
                                    label_669:
                                        v80 = v83;
                                        v77 = v84;
                                    }
                                    if(v78 == v80) {
                                        map0.put(object7, object6);
                                        if(v80 == v37) {
                                            zzkn1 = this;
                                            zzhl2 = zzhl0;
                                            v5 = v38;
                                            v10 = v80;
                                            v11 = v24;
                                            v7 = v34;
                                            v8 = v35;
                                            v14 = v77;
                                            goto label_892;
                                        }
                                        else {
                                            zzkn0 = this;
                                            zzhl1 = zzhl0;
                                            v5 = v38;
                                            v3 = v80;
                                            v4 = v24;
                                            v7 = v34;
                                            v8 = v35;
                                            unsafe0 = unsafe1;
                                            v6 = v77;
                                            continue;
                                        }
                                    }
                                    throw zzji.zzg();
                                }
                                else {
                                    v36 = v77;
                                }
                            label_697:
                                zzkn1 = this;
                                zzhl2 = zzhl0;
                                v5 = v38;
                                v7 = v34;
                                v8 = v35;
                                v14 = v36;
                                v10 = v37;
                                v11 = v24;
                            }
                            else {
                                zzhl2 = zzhl0;
                                Unsafe unsafe6 = zzkn.zzb;
                                long v85 = (long)(arr_v[v38 + 2] & 0xFFFFF);
                                switch(v16) {
                                    case 51: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 1) {
                                            unsafe6.putObject(object0, v18, zzhi.zza(arr_b, v86));
                                            v88 = v86 + 8;
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v88;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 52: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 5) {
                                            unsafe6.putObject(object0, v18, zzhi.zzb(arr_b, v86));
                                            v88 = v86 + 4;
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v88;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 53: 
                                    case 54: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 0) {
                                            v89 = zzhi.zzd(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, zzhl2.zzb);
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v89;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 58: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 0) {
                                            v89 = zzhi.zzd(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, Boolean.valueOf(zzhl2.zzb != 0L));
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v89;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 59: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 2) {
                                            int v90 = zzhi.zzc(arr_b, v86, zzhl2);
                                            int v91 = zzhl2.zza;
                                            if(v91 == 0) {
                                                unsafe6.putObject(object0, v18, "");
                                            }
                                            else {
                                                if((0x20000000 & v17) != 0 && !zzmh.zzc(arr_b, v90, v90 + v91)) {
                                                    throw zzji.zzd();
                                                }
                                                unsafe6.putObject(object0, v18, new String(arr_b, v90, v91, zziz.zza));
                                                v90 += v91;
                                            }
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v90;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 60: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v92 = v38;
                                        v93 = v24;
                                        v94 = v77;
                                        if(v12 == 2) {
                                            Object object9 = zzkn1.zza(object0, v93, v92);
                                            v3 = zzhi.zza(object9, zzkn1.zze(v92), arr_b, v86, v1, zzhl0);
                                            zzkn1.zza(object0, v93, v92, object9);
                                            v14 = v94;
                                            v87 = v92;
                                            v11 = v93;
                                            goto label_887;
                                        }
                                        v87 = v92;
                                        v11 = v93;
                                        v14 = v94;
                                        break;
                                    }
                                    case 61: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v92 = v38;
                                        v93 = v24;
                                        v94 = v77;
                                        if(v12 == 2) {
                                            v95 = zzhi.zza(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, zzhl2.zzc);
                                            unsafe6.putInt(object0, v85, v93);
                                            v3 = v95;
                                            v87 = v92;
                                            v11 = v93;
                                            v14 = v94;
                                            goto label_887;
                                        }
                                        v87 = v92;
                                        v11 = v93;
                                        v14 = v94;
                                        break;
                                    }
                                    case 55: 
                                    case 62: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 0) {
                                            v89 = zzhi.zzc(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, zzhl2.zza);
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v89;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 0x3F: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v92 = v38;
                                        v93 = v24;
                                        v94 = v77;
                                        if(v12 == 0) {
                                            v95 = zzhi.zzc(arr_b, v86, zzhl2);
                                            int v96 = zzhl2.zza;
                                            zzje zzje1 = zzkn1.zzd(v92);
                                            if(zzje1 == null || zzje1.zza(v96)) {
                                                unsafe6.putObject(object0, v18, v96);
                                                unsafe6.putInt(object0, v85, v93);
                                            }
                                            else {
                                                zzkn.zze(object0).zza(v94, ((long)v96));
                                            }
                                            v3 = v95;
                                            v87 = v92;
                                            v11 = v93;
                                            v14 = v94;
                                            goto label_887;
                                        }
                                        v87 = v92;
                                        v11 = v93;
                                        v14 = v94;
                                        break;
                                    }
                                    case 57: 
                                    case 0x40: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 5) {
                                            unsafe6.putObject(object0, v18, zzhi.zzc(arr_b, v86));
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v86 + 4;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 56: 
                                    case 65: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        if(v12 == 1) {
                                            unsafe6.putObject(object0, v18, zzhi.zzd(arr_b, v86));
                                            v88 = v86 + 8;
                                            unsafe6.putInt(object0, v85, v11);
                                            v3 = v88;
                                            goto label_887;
                                        }
                                        break;
                                    }
                                    case 66: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v92 = v38;
                                        v93 = v24;
                                        v94 = v77;
                                        if(v12 == 0) {
                                            v95 = zzhi.zzc(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, ((int)(-(zzhl2.zza & 1) ^ zzhl2.zza >>> 1)));
                                            unsafe6.putInt(object0, v85, v93);
                                            v3 = v95;
                                            v87 = v92;
                                            v11 = v93;
                                            v14 = v94;
                                            goto label_887;
                                        }
                                        v87 = v92;
                                        v11 = v93;
                                        v14 = v94;
                                        break;
                                    }
                                    case 67: {
                                        zzkn1 = this;
                                        v86 = v37;
                                        v92 = v38;
                                        v93 = v24;
                                        v94 = v77;
                                        if(v12 == 0) {
                                            int v97 = zzhi.zzd(arr_b, v86, zzhl2);
                                            unsafe6.putObject(object0, v18, ((long)(-(zzhl2.zzb & 1L) ^ zzhl2.zzb >>> 1)));
                                            unsafe6.putInt(object0, v85, v93);
                                            v3 = v97;
                                            v87 = v92;
                                            v11 = v93;
                                            v14 = v94;
                                            goto label_887;
                                        }
                                        v87 = v92;
                                        v11 = v93;
                                        v14 = v94;
                                        break;
                                    }
                                    case 68: {
                                        if(v12 == 3) {
                                            zzkn1 = this;
                                            Object object10 = zzkn1.zza(object0, v24, v38);
                                            int v98 = zzhi.zza(object10, zzkn1.zze(v38), arr_b, v37, v1, v77 & -8 | 4, zzhl0);
                                            zzkn1.zza(object0, v24, v38, object10);
                                            v11 = v24;
                                            v87 = v38;
                                            v3 = v98;
                                            v14 = v77;
                                            v86 = v37;
                                            goto label_887;
                                        }
                                    label_881:
                                        zzkn1 = this;
                                        v86 = v37;
                                        v87 = v38;
                                        v11 = v24;
                                        v14 = v77;
                                        break;
                                    }
                                    default: {
                                        goto label_881;
                                    }
                                }
                                v3 = v86;
                            label_887:
                                if(v3 == v86) {
                                    v10 = v3;
                                    v5 = v87;
                                    v7 = v34;
                                    v8 = v35;
                                }
                                else {
                                    goto label_917;
                                }
                            }
                        }
                    }
                }
            }
        label_892:
            if(v14 != v2 || v2 == 0) {
                if(zzkn1.zzh) {
                    zzik zzik0 = zzhl2.zzd;
                    if(zzik0 != zzik.zza) {
                        if(zzik0.zza(zzkn1.zzg, v11) == null) {
                            v6 = v14;
                            v3 = zzhi.zza(v14, arr_b, v10, v1, zzkn.zze(object0), zzhl0);
                            zzhl1 = zzhl2;
                            v4 = v11;
                            unsafe0 = unsafe1;
                            zzkn0 = this;
                            continue;
                        }
                        ((zzd)object0).zza();
                        throw new NoSuchMethodError();
                    }
                }
                v6 = v14;
                v3 = zzhi.zza(v6, arr_b, v10, v1, zzkn.zze(object0), zzhl0);
                zzhl1 = zzhl2;
                v4 = v11;
                zzkn0 = this;
                unsafe0 = unsafe1;
                continue;
            label_917:
                v6 = v14;
                zzhl1 = zzhl2;
                v4 = v11;
                v5 = v87;
                v7 = v34;
                v8 = v35;
                unsafe0 = unsafe1;
                zzkn0 = zzkn1;
                continue;
            }
            else {
                v6 = v14;
                v99 = v10;
                zzkn2 = zzkn1;
            }
            break;
        }
        if(v8 != 0xFFFFF) {
            unsafe1.putInt(object0, ((long)v8), v7);
        }
        int v100 = zzkn2.zzm;
        zzlz zzlz0 = null;
        while(v100 < zzkn2.zzn) {
            zzlz0 = (zzlz)this.zza(object0, zzkn2.zzl[v100], zzlz0, zzkn2.zzq, object0);
            ++v100;
        }
        if(zzlz0 != null) {
            zzkn2.zzq.zzb(object0, zzlz0);
        }
        if(v2 == 0) {
            if(v99 != v1) {
                throw zzji.zzg();
            }
            return v99;
        }
        if(v99 > v1 || v6 != v2) {
            throw zzji.zzg();
        }
        return v99;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final Object zza() {
        return this.zzo.zza(this.zzg);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, zzlc zzlc0, zzik zzik0) {
        zzik zzik2;
        zzje zzje1;
        List list1;
        Object object6;
        int v4;
        int v3;
        Object object5;
        Object object4;
        zziq zziq1;
        Object object3;
        int v1;
        int v;
        Object object1 = object0;
        zzik zzik1 = zzik0;
        zzik0.getClass();
        zzkn.zzf(object0);
        zzma zzma0 = this.zzq;
        zzim zzim0 = this.zzr;
        Object object2 = null;
        zziq zziq0 = null;
        while(true) {
            try {
            label_8:
                v = zzlc0.zzc();
                v1 = this.zza(v);
                if(v1 < 0) {
                    goto label_11;
                }
                goto label_53;
            }
            catch(Throwable throwable0) {
                object4 = object1;
                goto label_403;
            }
        label_11:
            if(v == 0x7FFFFFFF) {
                for(int v2 = this.zzm; v2 < this.zzn; ++v2) {
                    object2 = this.zza(object0, this.zzl[v2], object2, zzma0, object0);
                }
                if(object2 != null) {
                    zzma0.zzb(object1, object2);
                }
                return;
            }
            try {
                object3 = this.zzh ? zzim0.zza(zzik1, this.zzg, v) : null;
                if(object3 == null) {
                    goto label_34;
                }
                else {
                    zziq1 = zziq0 == null ? zzim0.zzb(object1) : zziq0;
                    object5 = object1;
                    object2 = zzim0.zza(object0, zzlc0, object3, zzik0, zziq1, object2, zzma0);
                    zziq0 = zziq1;
                    object1 = object5;
                    goto label_8;
                }
                goto label_53;
            }
            catch(Throwable throwable0) {
                object4 = object1;
                goto label_403;
            }
            try {
                object5 = object1;
                object2 = zzim0.zza(object0, zzlc0, object3, zzik0, zziq1, object2, zzma0);
                zziq0 = zziq1;
                object1 = object5;
                goto label_8;
            label_34:
                object5 = object1;
                zzma0.zza(zzlc0);
                if(object2 == null) {
                    object2 = zzma0.zzc(object5);
                }
                if(zzma0.zza(object2, zzlc0)) {
                    object1 = object5;
                    goto label_8;
                }
                v3 = this.zzm;
            }
            catch(Throwable throwable0) {
                object4 = object5;
                goto label_403;
            }
            while(v3 < this.zzn) {
                object2 = this.zza(object0, this.zzl[v3], object2, zzma0, object0);
                ++v3;
            }
            if(object2 != null) {
                zzma0.zzb(object5, object2);
            }
            return;
            try {
            label_53:
                object4 = object1;
                v4 = this.zzc(v1);
                switch((0xFF00000 & v4) >>> 20) {
                    case 0: {
                        goto label_70;
                    }
                    case 1: {
                        goto label_75;
                    }
                    case 2: {
                        goto label_80;
                    }
                    case 3: {
                        goto label_85;
                    }
                    case 4: {
                        goto label_90;
                    }
                    case 5: {
                        goto label_95;
                    }
                    case 6: {
                        goto label_100;
                    }
                    case 7: {
                        goto label_105;
                    }
                    case 8: {
                        goto label_110;
                    }
                    case 9: {
                        goto label_115;
                    }
                    case 10: {
                        goto label_121;
                    }
                    case 11: {
                        goto label_126;
                    }
                    case 12: {
                        goto label_131;
                    }
                    case 13: {
                        goto label_141;
                    }
                    case 14: {
                        goto label_146;
                    }
                    case 15: {
                        goto label_151;
                    }
                    case 16: {
                        goto label_156;
                    }
                    case 17: {
                        goto label_161;
                    }
                    case 18: {
                        goto label_167;
                    }
                    case 19: {
                        goto label_171;
                    }
                    case 20: {
                        goto label_175;
                    }
                    case 21: {
                        goto label_179;
                    }
                    case 22: {
                        goto label_183;
                    }
                    case 23: {
                        goto label_187;
                    }
                    case 24: {
                        goto label_191;
                    }
                    case 25: {
                        goto label_195;
                    }
                    case 26: {
                        goto label_199;
                    }
                    case 27: {
                        goto label_206;
                    }
                    case 28: {
                        goto label_211;
                    }
                    case 29: {
                        goto label_215;
                    }
                    case 30: {
                        goto label_219;
                    }
                    case 0x1F: {
                        goto label_225;
                    }
                    case 0x20: {
                        goto label_229;
                    }
                    case 33: {
                        goto label_233;
                    }
                    case 34: {
                        goto label_237;
                    }
                    case 35: {
                        goto label_241;
                    }
                    case 36: {
                        goto label_245;
                    }
                    case 37: {
                        goto label_249;
                    }
                    case 38: {
                        goto label_253;
                    }
                    case 39: {
                        goto label_257;
                    }
                    case 40: {
                        goto label_261;
                    }
                    case 41: {
                        goto label_265;
                    }
                    case 42: {
                        goto label_269;
                    }
                    case 43: {
                        goto label_273;
                    }
                    case 44: {
                        goto label_277;
                    }
                    case 45: {
                        goto label_284;
                    }
                    case 46: {
                        goto label_286;
                    }
                    case 0x2F: {
                        goto label_288;
                    }
                    case 0x30: {
                        goto label_290;
                    }
                    case 49: {
                        goto label_292;
                    }
                    case 50: {
                        goto label_295;
                    }
                    case 51: {
                        goto label_309;
                    }
                    case 52: {
                        goto label_312;
                    }
                    case 53: {
                        goto label_315;
                    }
                    case 54: {
                        goto label_318;
                    }
                    case 55: {
                        goto label_321;
                    }
                    case 56: {
                        goto label_324;
                    }
                    case 57: {
                        goto label_327;
                    }
                    case 58: {
                        goto label_330;
                    }
                    case 59: {
                        goto label_333;
                    }
                    case 60: {
                        goto label_336;
                    }
                    case 61: {
                        goto label_340;
                    }
                    case 62: {
                        goto label_343;
                    }
                    case 0x3F: {
                        goto label_346;
                    }
                    case 0x40: {
                        goto label_355;
                    }
                    case 65: {
                        goto label_358;
                    }
                    case 66: {
                        goto label_361;
                    }
                    case 67: {
                        goto label_364;
                    }
                    case 68: {
                        goto label_371;
                    }
                    default: {
                        if(object2 == null) {
                            try {
                                object2 = zzma0.zzc(object4);
                            }
                            catch(zzjh unused_ex) {
                                goto label_376;
                            }
                        }
                        try {
                            if(!zzma0.zza(object2, zzlc0)) {
                                goto label_62;
                            }
                            object1 = object4;
                            goto label_8;
                        }
                        catch(zzjh unused_ex) {
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_403;
            }
            zzik2 = zzik1;
            goto label_386;
        label_62:
            for(int v5 = this.zzm; v5 < this.zzn; ++v5) {
                object2 = this.zza(object0, this.zzl[v5], object2, zzma0, object0);
            }
            if(object2 != null) {
                zzma0.zzb(object4, object2);
            }
            return;
            try {
            label_70:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zza());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_75:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzb());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_80:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzl());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_85:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzo());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_90:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzg());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_95:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzk());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_100:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzf());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_105:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zzc(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzs());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_110:
                object6 = object2;
                zzik2 = zzik1;
                this.zza(object4, v4, zzlc0);
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_115:
                object6 = object2;
                zzik2 = zzik1;
                zzkj zzkj0 = (zzkj)this.zza(object4, v1);
                zzlc0.zzb(zzkj0, this.zze(v1), zzik2);
                this.zza(object4, v1, zzkj0);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_121:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzp());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_126:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzj());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_131:
                object6 = object2;
                zzik2 = zzik1;
                int v6 = zzlc0.zze();
                zzje zzje0 = this.zzd(v1);
                if(zzje0 == null || zzje0.zza(v6)) {
                    zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), v6);
                    this.zzb(object4, v1);
                    object1 = object4;
                    object2 = object6;
                }
                else {
                    object2 = zzld.zza(object4, v, v6, object6, zzma0);
                    object1 = object4;
                }
                zzik1 = zzik2;
                goto label_8;
            label_141:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzh());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_146:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzm());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_151:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzi());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_156:
                object6 = object2;
                zzik2 = zzik1;
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzn());
                this.zzb(object4, v1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_161:
                object6 = object2;
                zzik2 = zzik1;
                zzkj zzkj1 = (zzkj)this.zza(object4, v1);
                zzlc0.zza(zzkj1, this.zze(v1), zzik2);
                this.zza(object4, v1, zzkj1);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_167:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzc(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_171:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzg(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_175:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzi(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_179:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzq(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_183:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzh(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_187:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzf(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_191:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zze(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_195:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zza(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_199:
                object6 = object2;
                zzik2 = zzik1;
                if(zzkn.zzg(v4)) {
                    zzlc0.zzo(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                }
                else {
                    zzlc0.zzn(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                }
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_206:
                object6 = object2;
                zzik2 = zzik1;
                zzlb zzlb0 = this.zze(v1);
                zzlc0.zzb(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))), zzlb0, zzik2);
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_211:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzb(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_215:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzp(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_219:
                object6 = object2;
                zzik2 = zzik1;
                List list0 = this.zzp.zza(object4, ((long)(v4 & 0xFFFFF)));
                zzlc0.zzd(list0);
                object2 = zzld.zza(object0, v, list0, this.zzd(v1), object6, zzma0);
                object1 = object4;
                zzik1 = zzik2;
                goto label_8;
            label_225:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzj(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_229:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzk(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_233:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzl(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_237:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzm(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_241:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzc(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_245:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzg(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_249:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzi(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_253:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzq(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_257:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzh(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_261:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzf(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_265:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zze(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_269:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zza(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_273:
                object6 = object2;
                zzik2 = zzik1;
                zzlc0.zzp(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            }
            catch(zzjh unused_ex) {
                break;
            }
            catch(Throwable throwable0) {
                object2 = object6;
                goto label_403;
            }
            try {
            label_277:
                list1 = this.zzp.zza(object4, ((long)(v4 & 0xFFFFF)));
                zzlc0.zzd(list1);
                zzje1 = this.zzd(v1);
                object6 = object2;
                zzik2 = zzik1;
            }
            catch(zzjh unused_ex) {
                goto label_376;
            }
            catch(Throwable throwable0) {
                goto label_403;
            }
            try {
                object2 = zzld.zza(object0, v, list1, zzje1, object6, zzma0);
                object1 = object4;
                zzik1 = zzik2;
                goto label_8;
            }
            catch(zzjh unused_ex) {
                break;
            }
            catch(Throwable throwable0) {
                object2 = object6;
                goto label_403;
            }
            try {
            label_284:
                zzlc0.zzj(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_366;
            label_286:
                zzlc0.zzk(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_366;
            label_288:
                zzlc0.zzl(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_366;
            label_290:
                zzlc0.zzm(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_366;
            label_292:
                zzlb zzlb1 = this.zze(v1);
                zzlc0.zza(this.zzp.zza(object4, ((long)(v4 & 0xFFFFF))), zzlb1, zzik1);
                goto label_366;
            label_295:
                Object object7 = this.zzf(v1);
                long v7 = (long)(this.zzc(v1) & 0xFFFFF);
                Object object8 = zzmg.zze(object4, v7);
                if(object8 == null) {
                    object8 = this.zzs.zzb(object7);
                    zzmg.zza(object4, v7, object8);
                }
                else if(this.zzs.zzf(object8)) {
                    Object object9 = this.zzs.zzb(object7);
                    this.zzs.zza(object9, object8);
                    zzmg.zza(object4, v7, object9);
                    object8 = object9;
                }
                zzlc0.zza(this.zzs.zze(object8), this.zzs.zza(object7), zzik1);
                goto label_366;
            label_309:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zza());
                this.zzb(object4, v, v1);
                goto label_366;
            label_312:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzb());
                this.zzb(object4, v, v1);
                goto label_366;
            label_315:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzl());
                this.zzb(object4, v, v1);
                goto label_366;
            label_318:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzo());
                this.zzb(object4, v, v1);
                goto label_366;
            label_321:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzg());
                this.zzb(object4, v, v1);
                goto label_366;
            label_324:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzk());
                this.zzb(object4, v, v1);
                goto label_366;
            label_327:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzf());
                this.zzb(object4, v, v1);
                goto label_366;
            label_330:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(zzlc0.zzs()));
                this.zzb(object4, v, v1);
                goto label_366;
            label_333:
                this.zza(object4, v4, zzlc0);
                this.zzb(object4, v, v1);
                goto label_366;
            label_336:
                zzkj zzkj2 = (zzkj)this.zza(object4, v, v1);
                zzlc0.zzb(zzkj2, this.zze(v1), zzik1);
                this.zza(object4, v, v1, zzkj2);
                goto label_366;
            label_340:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzp());
                this.zzb(object4, v, v1);
                goto label_366;
            label_343:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzj());
                this.zzb(object4, v, v1);
                goto label_366;
            label_346:
                int v8 = zzlc0.zze();
                zzje zzje2 = this.zzd(v1);
                if(zzje2 == null || zzje2.zza(v8)) {
                    zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), v8);
                    this.zzb(object4, v, v1);
                    goto label_366;
                }
                else {
                    object2 = zzld.zza(object4, v, v8, object2, zzma0);
                }
                object1 = object4;
                goto label_8;
            label_355:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzh());
                this.zzb(object4, v, v1);
                goto label_366;
            label_358:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzm());
                this.zzb(object4, v, v1);
                goto label_366;
            label_361:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzi());
                this.zzb(object4, v, v1);
                goto label_366;
            label_364:
                zzmg.zza(object4, ((long)(v4 & 0xFFFFF)), zzlc0.zzn());
                this.zzb(object4, v, v1);
            label_366:
                object6 = object2;
                zzik2 = zzik1;
                object1 = object4;
                object2 = object6;
                zzik1 = zzik2;
                goto label_8;
            label_371:
                zzkj zzkj3 = (zzkj)this.zza(object4, v, v1);
                zzlc0.zza(zzkj3, this.zze(v1), zzik1);
                this.zza(object4, v, v1, zzkj3);
                zzik2 = zzik1;
                goto label_379;
            }
            catch(zzjh unused_ex) {
            }
            catch(Throwable throwable0) {
                goto label_403;
            }
        label_376:
            object6 = object2;
            zzik2 = zzik1;
            break;
        label_379:
            object1 = object4;
            try {
                zzik1 = zzik2;
            }
            catch(zzjh unused_ex) {
                break;
            }
            catch(Throwable throwable0) {
                object2 = object6;
                goto label_403;
            }
        }
    label_385:
        object2 = object6;
        try {
        label_386:
            zzma0.zza(zzlc0);
            if(object2 == null) {
                object2 = zzma0.zzc(object4);
            }
            if(!zzma0.zza(object2, zzlc0)) {
                goto label_393;
            }
            object1 = object4;
            zzik1 = zzik2;
            goto label_8;
        }
        catch(Throwable throwable0) {
            goto label_403;
        }
    label_393:
        for(int v9 = this.zzm; v9 < this.zzn; ++v9) {
            object2 = this.zza(object0, this.zzl[v9], object2, zzma0, object0);
        }
        if(object2 != null) {
            zzma0.zzb(object4, object2);
        }
        return;
        try {
            object1 = object4;
            zzik1 = zzik2;
            goto label_8;
        }
        catch(zzjh unused_ex) {
            goto label_385;
        }
        catch(Throwable throwable0) {
            object2 = object6;
        }
    label_403:
        for(int v10 = this.zzm; v10 < this.zzn; ++v10) {
            object2 = this.zza(object0, this.zzl[v10], object2, zzma0, object0);
        }
        if(object2 != null) {
            zzma0.zzb(object4, object2);
        }
        throw throwable0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, zzmw zzmw0) {
        Unsafe unsafe1;
        int v18;
        int v17;
        Map.Entry map$Entry3;
        int v16;
        int v14;
        int v13;
        int v12;
        Map.Entry map$Entry2;
        Iterator iterator3;
        Iterator iterator2;
        Map.Entry map$Entry1;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(zzmw0.zza() == zzmz.zzb) {
            zzkn.zza(this.zzq, object0, zzmw0);
            if(this.zzh) {
                zziq zziq0 = this.zzr.zza(object0);
                if(zziq0.zza.isEmpty()) {
                    iterator0 = null;
                    map$Entry0 = null;
                }
                else {
                    iterator0 = zziq0.zzc();
                    Object object1 = iterator0.next();
                    map$Entry0 = (Map.Entry)object1;
                }
            }
            else {
                iterator0 = null;
                map$Entry0 = null;
            }
            for(int v = this.zzc.length - 3; v >= 0; v -= 3) {
                int v1 = this.zzc(v);
                int v2 = this.zzc[v];
                while(map$Entry0 != null && this.zzr.zza(map$Entry0) > v2) {
                    this.zzr.zza(zzmw0, map$Entry0);
                    if(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        map$Entry0 = (Map.Entry)object2;
                    }
                    else {
                        map$Entry0 = null;
                    }
                }
                switch((v1 & 0xFF00000) >>> 20) {
                    case 0: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzb(v2, zzmg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zze(v2, zzmg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzc(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzb(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zzc(object0, v)) {
                            zzkn.zza(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), zzmw0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzb(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, ((zzhm)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzf(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzd(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzc(v2, zzmg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zze(v2, zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zzd(v2, zzmg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zzc(object0, v)) {
                            zzmw0.zza(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 18: {
                        zzld.zzb(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 19: {
                        zzld.zzf(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 20: {
                        zzld.zzh(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 21: {
                        zzld.zzn(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 22: {
                        zzld.zzg(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 23: {
                        zzld.zze(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 24: {
                        zzld.zzd(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 25: {
                        zzld.zza(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 26: {
                        zzld.zzb(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0);
                        break;
                    }
                    case 27: {
                        zzld.zzb(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, this.zze(v));
                        break;
                    }
                    case 28: {
                        zzld.zza(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0);
                        break;
                    }
                    case 29: {
                        zzld.zzm(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 30: {
                        zzld.zzc(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 0x1F: {
                        zzld.zzi(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 0x20: {
                        zzld.zzj(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 33: {
                        zzld.zzk(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 34: {
                        zzld.zzl(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, false);
                        break;
                    }
                    case 35: {
                        zzld.zzb(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 36: {
                        zzld.zzf(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 37: {
                        zzld.zzh(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 38: {
                        zzld.zzn(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 39: {
                        zzld.zzg(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 40: {
                        zzld.zze(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 41: {
                        zzld.zzd(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 42: {
                        zzld.zza(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 43: {
                        zzld.zzm(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 44: {
                        zzld.zzc(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 45: {
                        zzld.zzi(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 46: {
                        zzld.zzj(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 0x2F: {
                        zzld.zzk(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 0x30: {
                        zzld.zzl(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, true);
                        break;
                    }
                    case 49: {
                        zzld.zza(this.zzc[v], ((List)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))), zzmw0, this.zze(v));
                        break;
                    }
                    case 50: {
                        this.zza(zzmw0, v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), v);
                        break;
                    }
                    case 51: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzkn.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzkn.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzb(v2, zzkn.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zze(v2, zzkn.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzc(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzkn.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzb(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzkn.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zzc(object0, v2, v)) {
                            zzkn.zza(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), zzmw0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzb(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, ((zzhm)zzmg.zze(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzf(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzd(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzc(v2, zzkn.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zze(v2, zzkn.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zzd(v2, zzkn.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zzc(object0, v2, v)) {
                            zzmw0.zza(v2, zzmg.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                    }
                }
            }
            while(map$Entry0 != null) {
                this.zzr.zza(zzmw0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    map$Entry0 = (Map.Entry)object3;
                }
                else {
                    map$Entry0 = null;
                }
            }
            return;
        }
        if(this.zzh) {
            zziq zziq1 = this.zzr.zza(object0);
            if(zziq1.zza.isEmpty()) {
                map$Entry1 = null;
                iterator2 = null;
            }
            else {
                Iterator iterator1 = zziq1.zzd();
                Object object4 = iterator1.next();
                map$Entry1 = (Map.Entry)object4;
                iterator2 = iterator1;
            }
        }
        else {
            map$Entry1 = null;
            iterator2 = null;
        }
        int v3 = this.zzc.length;
        Unsafe unsafe0 = zzkn.zzb;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0xFFFFF;
        while(v5 < v3) {
            int v7 = this.zzc(v5);
            int[] arr_v = this.zzc;
            int v8 = arr_v[v5];
            int v9 = (v7 & 0xFF00000) >>> 20;
            if(v9 <= 17) {
                int v10 = arr_v[v5 + 2];
                int v11 = v10 & 0xFFFFF;
                if(v11 == v6) {
                    iterator3 = iterator2;
                }
                else {
                    if(v11 == 0xFFFFF) {
                        iterator3 = iterator2;
                        v4 = 0;
                    }
                    else {
                        iterator3 = iterator2;
                        v4 = unsafe0.getInt(object0, ((long)v11));
                    }
                    v6 = v11;
                }
                map$Entry2 = map$Entry1;
                v12 = v4;
                v13 = 1 << (v10 >>> 20);
                v14 = v6;
            }
            else {
                iterator3 = iterator2;
                v14 = v6;
                map$Entry2 = map$Entry1;
                v12 = v4;
                v13 = 0;
            }
            while(map$Entry2 != null && this.zzr.zza(map$Entry2) <= v8) {
                this.zzr.zza(zzmw0, map$Entry2);
                if(iterator3.hasNext()) {
                    Object object5 = iterator3.next();
                    map$Entry2 = (Map.Entry)object5;
                }
                else {
                    map$Entry2 = null;
                }
            }
            long v15 = (long)(v7 & 0xFFFFF);
            switch(v9) {
                case 0: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, zzmg.zza(object0, v15));
                    }
                    break;
                }
                case 1: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, zzmg.zzb(object0, v15));
                    }
                    break;
                }
                case 2: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzb(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 3: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zze(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 4: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzc(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 5: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 6: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzb(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 7: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, zzmg.zzh(object0, v15));
                    }
                    break;
                }
                case 8: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzkn.zza(v8, unsafe1.getObject(object0, v15), zzmw0);
                    }
                    break;
                }
                case 9: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzb(v8, unsafe1.getObject(object0, v15), this.zze(v18));
                    }
                    break;
                }
                case 10: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, ((zzhm)unsafe1.getObject(object0, v15)));
                    }
                    break;
                }
                case 11: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzf(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 12: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zza(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 13: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzd(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 14: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zzc(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 15: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzmw0.zze(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 16: {
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    v16 = v14;
                    if(this.zza(object0, v18, v14, v12, v13)) {
                        zzmw0.zzd(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 17: {
                    map$Entry3 = map$Entry2;
                    v18 = v5;
                    v17 = v3;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v5, v14, v12, v13)) {
                        zzmw0.zza(v8, unsafe1.getObject(object0, v15), this.zze(v18));
                    }
                    v16 = v14;
                    break;
                }
                case 18: {
                    zzld.zzb(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 19: {
                    zzld.zzf(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 20: {
                    zzld.zzh(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 21: {
                    zzld.zzn(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 22: {
                    zzld.zzg(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 23: {
                    zzld.zze(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 24: {
                    zzld.zzd(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 25: {
                    zzld.zza(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 26: {
                    zzld.zzb(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0);
                    goto label_532;
                }
                case 27: {
                    zzld.zzb(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, this.zze(v5));
                    goto label_532;
                }
                case 28: {
                    zzld.zza(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0);
                    goto label_532;
                }
                case 29: {
                    zzld.zzm(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 30: {
                    zzld.zzc(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 0x1F: {
                    zzld.zzi(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 0x20: {
                    zzld.zzj(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 33: {
                    zzld.zzk(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 34: {
                    zzld.zzl(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, false);
                    goto label_532;
                }
                case 35: {
                    zzld.zzb(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 36: {
                    zzld.zzf(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 37: {
                    zzld.zzh(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 38: {
                    zzld.zzn(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 39: {
                    zzld.zzg(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 40: {
                    zzld.zze(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 41: {
                    zzld.zzd(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 42: {
                    zzld.zza(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 43: {
                    zzld.zzm(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 44: {
                    zzld.zzc(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 45: {
                    zzld.zzi(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 46: {
                    zzld.zzj(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 0x2F: {
                    zzld.zzk(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 0x30: {
                    zzld.zzl(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, true);
                    goto label_532;
                }
                case 49: {
                    zzld.zza(this.zzc[v5], ((List)unsafe0.getObject(object0, v15)), zzmw0, this.zze(v5));
                    goto label_532;
                }
                case 50: {
                    this.zza(zzmw0, v8, unsafe0.getObject(object0, v15), v5);
                    goto label_532;
                }
                case 51: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, zzkn.zza(object0, v15));
                    }
                    goto label_532;
                }
                case 52: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, zzkn.zzb(object0, v15));
                    }
                    goto label_532;
                }
                case 53: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzb(v8, zzkn.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 54: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zze(v8, zzkn.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 55: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzc(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 56: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, zzkn.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 57: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzb(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 58: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, zzkn.zze(object0, v15));
                    }
                    goto label_532;
                }
                case 59: {
                    if(this.zzc(object0, v8, v5)) {
                        zzkn.zza(v8, unsafe0.getObject(object0, v15), zzmw0);
                    }
                    goto label_532;
                }
                case 60: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzb(v8, unsafe0.getObject(object0, v15), this.zze(v5));
                    }
                    goto label_532;
                }
                case 61: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, ((zzhm)unsafe0.getObject(object0, v15)));
                    }
                    goto label_532;
                }
                case 62: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzf(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 0x3F: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 0x40: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzd(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 65: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzc(v8, zzkn.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 66: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zze(v8, zzkn.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 67: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zzd(v8, zzkn.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 68: {
                    if(this.zzc(object0, v8, v5)) {
                        zzmw0.zza(v8, unsafe0.getObject(object0, v15), this.zze(v5));
                    }
                label_532:
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v5;
                    unsafe1 = unsafe0;
                    break;
                }
                default: {
                    goto label_532;
                }
            }
            v5 = v18 + 3;
            v4 = v12;
            unsafe0 = unsafe1;
            iterator2 = iterator3;
            map$Entry1 = map$Entry3;
            v3 = v17;
            v6 = v16;
        }
        while(map$Entry1 != null) {
            this.zzr.zza(zzmw0, map$Entry1);
            if(iterator2.hasNext()) {
                Object object6 = iterator2.next();
                map$Entry1 = (Map.Entry)object6;
            }
            else {
                map$Entry1 = null;
            }
        }
        zzkn.zza(this.zzq, object0, zzmw0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, Object object1) {
        zzkn.zzf(object0);
        object1.getClass();
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzc(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = this.zzc[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zzc(object1, v)) {
                        zzmg.zzc(object0, v2, zzmg.zzh(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zze(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 9: {
                    this.zza(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zze(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zzc(object1, v)) {
                        zzmg.zza(object0, v2, zzmg.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 17: {
                    this.zza(object0, object1, v);
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
                    this.zzp.zza(object0, object1, v2);
                    break;
                }
                case 50: {
                    zzld.zza(this.zzs, object0, object1, v2);
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
                    if(this.zzc(object1, v3, v)) {
                        zzmg.zza(object0, v2, zzmg.zze(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 60: {
                    this.zzb(object0, object1, v);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.zzc(object1, v3, v)) {
                        zzmg.zza(object0, v2, zzmg.zze(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 68: {
                    this.zzb(object0, object1, v);
                }
            }
        }
        zzld.zza(this.zzq, object0, object1);
        if(this.zzh) {
            zzld.zza(this.zzr, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzhl zzhl0) {
        this.zza(object0, arr_b, v, v1, 0, zzhl0);
    }

    private static float zzb(Object object0, long v) {
        return (float)(((Float)zzmg.zze(object0, v)));
    }

    private final int zzb(int v) {
        return this.zzc[v + 2];
    }

    private final void zzb(Object object0, int v) {
        int v1 = this.zzb(v);
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        zzmg.zza(object0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | zzmg.zzc(object0, ((long)(0xFFFFF & v1))));
    }

    private final void zzb(Object object0, int v, int v1) {
        zzmg.zza(object0, ((long)(this.zzb(v1) & 0xFFFFF)), v);
    }

    private final void zzb(Object object0, Object object1, int v) {
        int v1 = this.zzc[v];
        if(!this.zzc(object1, v1, v)) {
            return;
        }
        int v2 = this.zzc(v);
        Unsafe unsafe0 = zzkn.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1);
        }
        zzlb zzlb0 = this.zze(v);
        if(!this.zzc(object0, v1, v)) {
            if(zzkn.zzg(object2)) {
                Object object3 = zzlb0.zza();
                zzlb0.zza(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            this.zzb(object0, v1, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!zzkn.zzg(object4)) {
            Object object5 = zzlb0.zza();
            zzlb0.zza(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlb0.zza(object4, object2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final int zzb(Object object0) {
        int v7;
        int v6;
        int v1 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v2 = this.zzc(v);
            int v3 = this.zzc[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = zziz.zza(Double.doubleToLongBits(zzmg.zza(object0, v4)));
                    v1 = v6 + v7;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(zzmg.zzb(object0, v4));
                    v1 = v6 + v7;
                    break;
                }
                case 2: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzd(object0, v4));
                    break;
                }
                case 3: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzd(object0, v4));
                    break;
                }
                case 4: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 5: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzd(object0, v4));
                    break;
                }
                case 6: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzh(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)zzmg.zze(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    Object object1 = zzmg.zze(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    break;
                }
                case 11: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 12: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 13: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 14: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzd(object0, v4));
                    break;
                }
                case 15: {
                    v1 = v1 * 53 + zzmg.zzc(object0, v4);
                    break;
                }
                case 16: {
                    v1 = v1 * 53 + zziz.zza(zzmg.zzd(object0, v4));
                    break;
                }
                case 17: {
                    Object object2 = zzmg.zze(object0, v4);
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
                    v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(Double.doubleToLongBits(zzkn.zza(object0, v4)));
                    }
                    break;
                }
                case 52: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzkn.zzb(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zzd(object0, v4));
                    }
                    break;
                }
                case 54: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zzd(object0, v4));
                    }
                    break;
                }
                case 55: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zzd(object0, v4));
                    }
                    break;
                }
                case 57: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zze(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzmg.zze(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zzd(object0, v4));
                    }
                    break;
                }
                case 66: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzkn.zzc(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zziz.zza(zzkn.zzd(object0, v4));
                    }
                    break;
                }
                case 68: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzmg.zze(object0, v4).hashCode();
                    }
                }
            }
        }
        int v8 = v1 * 53 + this.zzq.zzd(object0).hashCode();
        return this.zzh ? v8 * 53 + this.zzr.zza(object0).hashCode() : v8;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzb(Object object0, Object object1) {
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= this.zzc.length) {
                break;
            }
            int v1 = this.zzc(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.zzc(object0, object1, v) || Double.doubleToLongBits(zzmg.zza(object0, v2)) != Double.doubleToLongBits(zzmg.zza(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.zzc(object0, object1, v) || Float.floatToIntBits(zzmg.zzb(object0, v2)) != Float.floatToIntBits(zzmg.zzb(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzd(object0, v2) != zzmg.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzd(object0, v2) != zzmg.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzd(object0, v2) != zzmg.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzh(object0, v2) != zzmg.zzh(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.zzc(object0, object1, v) || !zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.zzc(object0, object1, v) || !zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.zzc(object0, object1, v) || !zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzd(object0, v2) != zzmg.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzc(object0, v2) != zzmg.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.zzc(object0, object1, v) || zzmg.zzd(object0, v2) != zzmg.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.zzc(object0, object1, v) || !zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2))) {
                        z = false;
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
                    z = zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2));
                    break;
                }
                case 50: {
                    z = zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2));
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
                    int v3 = this.zzb(v);
                    if(zzmg.zzc(object0, ((long)(v3 & 0xFFFFF))) != zzmg.zzc(object1, ((long)(v3 & 0xFFFFF))) || !zzld.zza(zzmg.zze(object0, v2), zzmg.zze(object1, v2))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        if(!this.zzq.zzd(object0).equals(this.zzq.zzd(object1))) {
            return false;
        }
        return this.zzh ? this.zzr.zza(object0).equals(this.zzr.zza(object1)) : true;
    }

    private final int zzc(int v) {
        return this.zzc[v + 1];
    }

    private static int zzc(Object object0, long v) {
        return (int)(((Integer)zzmg.zze(object0, v)));
    }

    private final boolean zzc(Object object0, int v) {
        int v1 = this.zzb(v);
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.zzc(v);
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    return Double.doubleToRawLongBits(zzmg.zza(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(zzmg.zzb(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return zzmg.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzmg.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzmg.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzmg.zzh(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzmg.zze(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzhm)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzhm.zza.equals(object1);
                }
                case 9: {
                    return zzmg.zze(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzmg.zze(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzhm.zza.equals(object2);
                }
                case 11: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzmg.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzmg.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzmg.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzmg.zze(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (zzmg.zzc(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    private final boolean zzc(Object object0, int v, int v1) {
        return zzmg.zzc(object0, ((long)(this.zzb(v1) & 0xFFFFF))) == v;
    }

    private final boolean zzc(Object object0, Object object1, int v) {
        return this.zzc(object0, v) == this.zzc(object1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zzc(Object object0) {
        if(!zzkn.zzg(object0)) {
            return;
        }
        if(object0 instanceof zzix) {
            ((zzix)object0).zzc(0x7FFFFFFF);
            ((zzix)object0).zza = 0;
            ((zzix)object0).zzch();
        }
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzc(v);
            long v2 = (long)(0xFFFFF & v1);
            switch((v1 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(this.zzc(object0, v)) {
                        this.zze(v).zzc(zzkn.zzb.getObject(object0, v2));
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
                    this.zzp.zzb(object0, v2);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = zzkn.zzb;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        unsafe0.putObject(object0, v2, this.zzs.zzc(object1));
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzc(object0, this.zzc[v], v)) {
                        this.zze(v).zzc(zzkn.zzb.getObject(object0, v2));
                    }
                }
            }
        }
        this.zzq.zzf(object0);
        if(this.zzh) {
            this.zzr.zzc(object0);
        }
    }

    private static long zzd(Object object0, long v) {
        return (long)(((Long)zzmg.zze(object0, v)));
    }

    private final zzje zzd(int v) {
        return (zzje)this.zzd[(v / 3 << 1) + 1];
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzd(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        while(v2 < this.zzm) {
            int v3 = this.zzl[v2];
            int v4 = this.zzc[v3];
            int v5 = this.zzc(v3);
            int v6 = this.zzc[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = zzkn.zzb.getInt(object0, ((long)v7));
                }
                v9 = v1;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.zza(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch((0xFF00000 & v5) >>> 20) {
                case 9: 
                case 17: {
                    if(this.zza(object0, v3, v10, v9, v8) && !zzkn.zza(object0, v5, this.zze(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)zzmg.zze(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzlb zzlb1 = this.zze(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!zzlb1.zzd(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    Object object1 = zzmg.zze(object0, ((long)(v5 & 0xFFFFF)));
                    Map map0 = this.zzs.zzd(object1);
                    if(!map0.isEmpty()) {
                        Object object2 = this.zzf(v3);
                        if(this.zzs.zza(object2).zzc.zzb() == zzmx.zzi) {
                            zzlb zzlb0 = null;
                            Iterator iterator0 = map0.values().iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object3 = iterator0.next();
                                if(zzlb0 == null) {
                                    zzlb0 = zzkx.zza().zza(object3.getClass());
                                }
                                if(zzlb0.zzd(object3)) {
                                    continue;
                                }
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzc(object0, v4, v3) && !zzkn.zza(object0, v5, this.zze(v3))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
            v1 = v9;
        }
        return !this.zzh || this.zzr.zza(object0).zzg();
    }

    private final zzlb zze(int v) {
        int v1 = v / 3 << 1;
        zzlb zzlb0 = (zzlb)this.zzd[v1];
        if(zzlb0 != null) {
            return zzlb0;
        }
        zzlb zzlb1 = zzkx.zza().zza(((Class)this.zzd[v1 + 1]));
        this.zzd[v1] = zzlb1;
        return zzlb1;
    }

    private static zzlz zze(Object object0) {
        zzlz zzlz0 = ((zzix)object0).zzb;
        if(zzlz0 == zzlz.zzc()) {
            zzlz0 = zzlz.zzd();
            ((zzix)object0).zzb = zzlz0;
        }
        return zzlz0;
    }

    private static boolean zze(Object object0, long v) {
        return ((Boolean)zzmg.zze(object0, v)).booleanValue();
    }

    private final Object zzf(int v) {
        return this.zzd[v / 3 << 1];
    }

    private static void zzf(Object object0) {
        if(!zzkn.zzg(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    private static boolean zzg(int v) {
        return (v & 0x20000000) != 0;
    }

    private static boolean zzg(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof zzix ? ((zzix)object0).zzcj() : true;
    }
}


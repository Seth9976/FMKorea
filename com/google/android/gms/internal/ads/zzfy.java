package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfy {
    public static final byte[] zza;
    public static final float[] zzb;
    private static final Object zzc;
    private static int[] zzd;

    static {
        zzfy.zza = new byte[]{0, 0, 0, 1};
        zzfy.zzb = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 2.181818f, 1.818182f, 2.909091f, 2.424242f, 1.636364f, 1.363636f, 1.939394f, 1.616162f, 1.333333f, 1.5f, 2.0f};
        zzfy.zzc = new Object();
        zzfy.zzd = new int[10];
    }

    public static int zza(byte[] arr_b, int v, int v1, boolean[] arr_z) {
        boolean z2;
        boolean z1;
        int v2 = v1 - v;
        boolean z = false;
        zzdy.zzf(v2 >= 0);
        if(v2 == 0) {
            return v1;
        }
        if(arr_z[0]) {
            zzfy.zzf(arr_z);
            return v - 3;
        }
        if(v2 > 1 && arr_z[1] && arr_b[v] == 1) {
            zzfy.zzf(arr_z);
            return v - 2;
        }
        if(v2 > 2 && arr_z[2] && arr_b[v] == 0 && arr_b[v + 1] == 1) {
            zzfy.zzf(arr_z);
            return v - 1;
        }
        for(int v3 = v + 2; v3 < v1 - 1; v3 += 3) {
            int v4 = arr_b[v3];
            if((v4 & 0xFE) == 0) {
                if(arr_b[v3 - 2] == 0 && arr_b[v3 - 1] == 0 && v4 == 1) {
                    zzfy.zzf(arr_z);
                    return v3 - 2;
                }
                v3 -= 2;
            }
        }
        if(v2 <= 2) {
            if(v2 != 2) {
                z1 = arr_z[1] && arr_b[v1 - 1] == 1;
            }
            else if(arr_z[2] && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        else if(arr_b[v1 - 3] == 0 && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        arr_z[0] = z1;
        if(v2 <= 1) {
            z2 = arr_z[2] && arr_b[v1 - 1] == 0;
        }
        else if(arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 0) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        arr_z[1] = z2;
        if(arr_b[v1 - 1] == 0) {
            z = true;
        }
        arr_z[2] = z;
        return v1;
    }

    public static int zzb(byte[] arr_b, int v) {
        Object object0 = zzfy.zzc;
        __monitor_enter(object0);
        int v1 = 0;
        int v2 = 0;
        try {
            while(v1 < v) {
                while(true) {
                    if(v1 < v - 2) {
                        if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 3) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = v;
                    break;
                }
                if(v1 < v) {
                    int[] arr_v = zzfy.zzd;
                    int v4 = arr_v.length;
                    if(v4 <= v2) {
                        zzfy.zzd = Arrays.copyOf(arr_v, v4 + v4);
                    }
                    zzfy.zzd[v2] = v1;
                    v1 += 3;
                    ++v2;
                }
            }
            int v5 = v - v2;
            int v7 = 0;
            int v8 = 0;
            for(int v6 = 0; v6 < v2; ++v6) {
                int v9 = zzfy.zzd[v6] - v7;
                System.arraycopy(arr_b, v7, arr_b, v8, v9);
                int v10 = v8 + v9;
                arr_b[v10] = 0;
                v8 = v10 + 2;
                arr_b[v10 + 1] = 0;
                v7 += v9 + 3;
            }
            System.arraycopy(arr_b, v7, arr_b, v8, v5 - v8);
            return v5;
        }
        finally {
            __monitor_exit(object0);
        }
    }

    public static zzfv zzc(byte[] arr_b, int v, int v1) {
        int v67;
        int v66;
        int v45;
        int v44;
        int v42;
        int[] arr_v3;
        int v38;
        int v19;
        zzfz zzfz0 = new zzfz(arr_b, v, v1);
        zzfz0.zze(4);
        int v2 = zzfz0.zza(3);
        zzfz0.zzd();
        int v3 = zzfz0.zza(2);
        boolean z = zzfz0.zzf();
        int v4 = zzfz0.zza(5);
        int v5 = 0;
        for(int v6 = 0; v6 < 0x20; ++v6) {
            if(zzfz0.zzf()) {
                v5 |= 1 << v6;
            }
        }
        int[] arr_v = new int[6];
        for(int v7 = 0; v7 < 6; ++v7) {
            arr_v[v7] = zzfz0.zza(8);
        }
        int v8 = zzfz0.zza(8);
        int v9 = 0;
        for(int v10 = 0; v10 < v2; ++v10) {
            if(zzfz0.zzf()) {
                v9 += 89;
            }
            if(zzfz0.zzf()) {
                v9 += 8;
            }
        }
        zzfz0.zze(v9);
        if(v2 > 0) {
            zzfz0.zze(v2 * -2 + 16);
        }
        int v11 = zzfz0.zzc();
        int v12 = zzfz0.zzc();
        if(v12 == 3) {
            zzfz0.zzd();
            v12 = 3;
        }
        int v13 = zzfz0.zzc();
        int v14 = zzfz0.zzc();
        if(zzfz0.zzf()) {
            int v15 = zzfz0.zzc();
            int v16 = zzfz0.zzc();
            int v17 = zzfz0.zzc();
            int v18 = zzfz0.zzc();
            switch(v12) {
                case 1: {
                    v19 = 2;
                    break;
                }
                case 2: {
                    v12 = 2;
                    v19 = 2;
                    break;
                }
                default: {
                    v19 = 1;
                }
            }
            v13 -= v19 * (v15 + v16);
            v14 -= (v12 == 1 ? 2 : 1) * (v17 + v18);
        }
        int v20 = v12;
        int v21 = v14;
        int v22 = zzfz0.zzc();
        int v23 = zzfz0.zzc();
        int v24 = zzfz0.zzc();
        for(int v25 = zzfz0.zzf() ? 0 : v2; v25 <= v2; ++v25) {
            zzfz0.zzc();
            zzfz0.zzc();
            zzfz0.zzc();
        }
        zzfz0.zzc();
        zzfz0.zzc();
        zzfz0.zzc();
        zzfz0.zzc();
        zzfz0.zzc();
        zzfz0.zzc();
        if(zzfz0.zzf() && zzfz0.zzf()) {
            for(int v26 = 0; v26 < 4; ++v26) {
                for(int v27 = 0; v27 < 6; v27 += (v26 == 3 ? 3 : 1)) {
                    if(zzfz0.zzf()) {
                        int v28 = Math.min(0x40, 1 << v26 * 2 + 4);
                        if(v26 > 1) {
                            zzfz0.zzb();
                        }
                        for(int v29 = 0; v29 < v28; ++v29) {
                            zzfz0.zzb();
                        }
                    }
                    else {
                        zzfz0.zzc();
                    }
                }
            }
        }
        zzfz0.zze(2);
        if(zzfz0.zzf()) {
            zzfz0.zze(8);
            zzfz0.zzc();
            zzfz0.zzc();
            zzfz0.zzd();
        }
        int v30 = zzfz0.zzc();
        int v31 = 0;
        int[] arr_v1 = new int[0];
        int[] arr_v2 = new int[0];
        int v32 = -1;
        int v33 = -1;
        int v34 = -1;
        while(v31 < v30) {
            if(v31 == 0 || !zzfz0.zzf()) {
                v38 = v30;
                v44 = v5;
                v45 = v20;
                arr_v3 = arr_v;
                int v55 = zzfz0.zzc();
                int v56 = zzfz0.zzc();
                int[] arr_v7 = new int[v55];
                for(int v57 = 0; v57 < v55; ++v57) {
                    arr_v7[v57] = zzfz0.zzc() + 1;
                    zzfz0.zzd();
                }
                int[] arr_v8 = new int[v56];
                for(int v58 = 0; v58 < v56; ++v58) {
                    arr_v8[v58] = zzfz0.zzc() + 1;
                    zzfz0.zzd();
                }
                v34 = v56;
                arr_v2 = arr_v8;
                v33 = v55;
                arr_v1 = arr_v7;
            }
            else {
                int v35 = v33 + v34;
                int v36 = zzfz0.zzf();
                int v37 = zzfz0.zzc();
                v38 = v30;
                boolean[] arr_z = new boolean[v35 + 1];
                arr_v3 = arr_v;
                for(int v39 = 0; v39 <= v35; ++v39) {
                    arr_z[v39] = zzfz0.zzf() ? true : zzfz0.zzf();
                }
                int v40 = v34 - 1;
                int[] arr_v4 = new int[v35 + 1];
                int[] arr_v5 = new int[v35 + 1];
                int v41 = 0;
                while(true) {
                    v42 = (v36 * -2 + 1) * (v37 + 1);
                    if(v40 < 0) {
                        break;
                    }
                    int v43 = arr_v2[v40] + v42;
                    if(v43 < 0 && arr_z[v33 + v40]) {
                        arr_v4[v41] = v43;
                        ++v41;
                    }
                    --v40;
                }
                if(v42 < 0 && arr_z[v35]) {
                    arr_v4[v41] = v42;
                    ++v41;
                }
                v44 = v5;
                v45 = v20;
                int v46 = v41;
                for(int v47 = 0; v47 < v33; ++v47) {
                    int v48 = arr_v1[v47] + v42;
                    if(v48 < 0 && arr_z[v47]) {
                        arr_v4[v46] = v48;
                        ++v46;
                    }
                }
                int[] arr_v6 = Arrays.copyOf(arr_v4, v46);
                int v49 = v33 - 1;
                int v50 = 0;
                while(v49 >= 0) {
                    int v51 = arr_v1[v49] + v42;
                    if(v51 > 0 && arr_z[v49]) {
                        arr_v5[v50] = v51;
                        ++v50;
                    }
                    --v49;
                }
                if(v42 > 0 && arr_z[v35]) {
                    arr_v5[v50] = v42;
                    ++v50;
                }
                int v52 = v50;
                for(int v53 = 0; v53 < v34; ++v53) {
                    int v54 = arr_v2[v53] + v42;
                    if(v54 > 0 && arr_z[v33 + v53]) {
                        arr_v5[v52] = v54;
                        ++v52;
                    }
                }
                arr_v2 = Arrays.copyOf(arr_v5, v52);
                v34 = v52;
                arr_v1 = arr_v6;
                v33 = v46;
            }
            ++v31;
            v20 = v45;
            v5 = v44;
            v30 = v38;
            arr_v = arr_v3;
        }
        if(zzfz0.zzf()) {
            for(int v59 = 0; v59 < zzfz0.zzc(); ++v59) {
                zzfz0.zze(v24 + 5);
            }
        }
        zzfz0.zze(2);
        float f = 1.0f;
        if(zzfz0.zzf()) {
            if(zzfz0.zzf()) {
                int v60 = zzfz0.zza(8);
                if(v60 == 0xFF) {
                    int v61 = zzfz0.zza(16);
                    int v62 = zzfz0.zza(16);
                    if(v61 != 0 && v62 != 0) {
                        f = ((float)v61) / ((float)v62);
                    }
                }
                else if(v60 < 17) {
                    f = zzfy.zzb[v60];
                }
                else {
                    zzes.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v60);
                }
            }
            if(zzfz0.zzf()) {
                zzfz0.zzd();
            }
            if(zzfz0.zzf()) {
                zzfz0.zze(3);
                int v63 = zzfz0.zzf() ? 1 : 2;
                if(zzfz0.zzf()) {
                    int v64 = zzfz0.zza(8);
                    int v65 = zzfz0.zza(8);
                    zzfz0.zze(8);
                    v66 = zzs.zzb(v65);
                    v67 = zzs.zza(v64);
                }
                else {
                    v67 = -1;
                    v66 = -1;
                }
                v32 = v63;
            }
            else {
                v67 = -1;
                v66 = -1;
            }
            if(zzfz0.zzf()) {
                zzfz0.zzc();
                zzfz0.zzc();
            }
            zzfz0.zzd();
            if(zzfz0.zzf()) {
                v21 += v21;
            }
            return new zzfv(v3, z, v4, v5, v20, v22, v23, arr_v, v8, v11, v13, v21, f, v67, v32, v66);
        }
        return new zzfv(v3, z, v4, v5, v20, v22, v23, arr_v, v8, v11, v13, v21, 1.0f, -1, -1, -1);
    }

    public static zzfw zzd(byte[] arr_b, int v, int v1) {
        zzfz zzfz0 = new zzfz(arr_b, 4, v1);
        int v2 = zzfz0.zzc();
        int v3 = zzfz0.zzc();
        zzfz0.zzd();
        return new zzfw(v2, v3, zzfz0.zzf());
    }

    public static zzfx zze(byte[] arr_b, int v, int v1) {
        float f;
        int v32;
        boolean z2;
        int v18;
        int v17;
        int v16;
        int v8;
        boolean z1;
        boolean z;
        int v7;
        zzfz zzfz0 = new zzfz(arr_b, v, v1);
        int v2 = zzfz0.zza(8);
        int v3 = zzfz0.zza(8);
        int v4 = zzfz0.zza(8);
        int v5 = zzfz0.zzc();
        int v6 = 1;
        switch(v2) {
            case 0x8A: {
                v2 = 0x8A;
                break;
            }
            case 44: 
            case 83: 
            case 86: 
            case 100: 
            case 110: 
            case 0x76: 
            case 0x7A: 
            case 0x80: 
            case 0xF4: {
                break;
            }
            default: {
                v7 = 1;
                z = false;
                goto label_39;
            }
        }
        v7 = zzfz0.zzc();
        if(v7 == 3) {
            z1 = zzfz0.zzf();
            v8 = 3;
        }
        else {
            v8 = v7;
            z1 = false;
        }
        zzfz0.zzc();
        zzfz0.zzc();
        zzfz0.zzd();
        if(zzfz0.zzf()) {
            for(int v9 = 0; v9 < (v8 == 3 ? 12 : 8); ++v9) {
                if(zzfz0.zzf()) {
                    int v10 = v9 >= 6 ? 0x40 : 16;
                    int v11 = 8;
                    int v12 = 8;
                    for(int v13 = 0; v13 < v10; ++v13) {
                        if(v11 != 0) {
                            v11 = (v12 + zzfz0.zzb() + 0x100) % 0x100;
                        }
                        if(v11 != 0) {
                            v12 = v11;
                        }
                    }
                }
            }
        }
        z = z1;
    label_39:
        int v14 = zzfz0.zzc();
        int v15 = zzfz0.zzc();
        if(v15 == 0) {
            v16 = v2;
            v17 = 0;
            v18 = zzfz0.zzc() + 4;
            z2 = false;
        }
        else if(v15 == 1) {
            boolean z3 = zzfz0.zzf();
            zzfz0.zzb();
            zzfz0.zzb();
            v16 = v2;
            long v19 = (long)zzfz0.zzc();
            for(int v20 = 0; ((long)v20) < v19; ++v20) {
                zzfz0.zzc();
            }
            z2 = z3;
            v18 = 0;
            v17 = 1;
        }
        else {
            v16 = v2;
            v17 = v15;
            v18 = 0;
            z2 = false;
        }
        int v21 = zzfz0.zzc();
        zzfz0.zzd();
        int v22 = zzfz0.zzc();
        int v23 = zzfz0.zzc();
        int v24 = zzfz0.zzf();
        int v25 = 2 - v24;
        if(v24 == 0) {
            zzfz0.zzd();
        }
        zzfz0.zzd();
        int v26 = (v22 + 1) * 16;
        int v27 = (v23 + 1) * v25 * 16;
        if(zzfz0.zzf()) {
            int v28 = zzfz0.zzc();
            int v29 = zzfz0.zzc();
            int v30 = zzfz0.zzc();
            int v31 = zzfz0.zzc();
            if(v7 == 0) {
                v32 = 1;
            }
            else {
                v32 = v7 == 3 ? 1 : 2;
                v25 *= (v7 == 1 ? 2 : 1);
            }
            v26 -= (v28 + v29) * v32;
            v27 -= (v30 + v31) * v25;
        }
        if(zzfz0.zzf()) {
            if(zzfz0.zzf()) {
                int v33 = zzfz0.zza(8);
                if(v33 == 0xFF) {
                    int v34 = zzfz0.zza(16);
                    int v35 = zzfz0.zza(16);
                    f = v34 == 0 || v35 == 0 ? 1.0f : ((float)v34) / ((float)v35);
                }
                else if(v33 < 17) {
                    f = zzfy.zzb[v33];
                }
                else {
                    zzes.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v33);
                    f = 1.0f;
                }
            }
            else {
                f = 1.0f;
            }
            if(zzfz0.zzf()) {
                zzfz0.zzd();
            }
            if(zzfz0.zzf()) {
                zzfz0.zze(3);
                if(!zzfz0.zzf()) {
                    v6 = 2;
                }
                if(zzfz0.zzf()) {
                    int v36 = zzfz0.zza(8);
                    int v37 = zzfz0.zza(8);
                    zzfz0.zze(8);
                    return new zzfx(v16, v3, v4, v5, v21, v26, v27, f, z, ((boolean)v24), v14 + 4, v17, v18, z2, zzs.zza(v36), v6, zzs.zzb(v37));
                }
                return new zzfx(v16, v3, v4, v5, v21, v26, v27, f, z, ((boolean)v24), v14 + 4, v17, v18, z2, -1, v6, -1);
            }
            return new zzfx(v16, v3, v4, v5, v21, v26, v27, f, z, ((boolean)v24), v14 + 4, v17, v18, z2, -1, -1, -1);
        }
        return new zzfx(v16, v3, v4, v5, v21, v26, v27, 1.0f, z, ((boolean)v24), v14 + 4, v17, v18, z2, -1, -1, -1);
    }

    public static void zzf(boolean[] arr_z) {
        arr_z[0] = false;
        arr_z[1] = false;
        arr_z[2] = false;
    }
}


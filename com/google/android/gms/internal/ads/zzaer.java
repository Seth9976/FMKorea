package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class zzaer {
    public static final zzaep zza;

    static {
        zzaer.zza = zzaeo.zza;
    }

    public static final zzbz zza(byte[] arr_b, int v, zzaep zzaep0, zzads zzads0) {
        zzaeq zzaeq0;
        ArrayList arrayList0 = new ArrayList();
        zzfb zzfb0 = new zzfb(arr_b, v);
        boolean z = false;
        int v1 = 10;
        if(zzfb0.zza() < 10) {
            zzes.zzf("Id3Decoder", "Data too short to be an ID3 tag");
            zzaeq0 = null;
        }
        else {
            int v2 = zzfb0.zzn();
            if(v2 == 4801587) {
                int v3 = zzfb0.zzl();
                zzfb0.zzH(1);
                int v4 = zzfb0.zzl();
                int v5 = zzfb0.zzk();
                if(v3 != 2) {
                    switch(v3) {
                        case 3: {
                            if((v4 & 0x40) != 0) {
                                int v6 = zzfb0.zzf();
                                zzfb0.zzH(v6);
                                v5 -= v6 + 4;
                            }
                            zzaeq0 = new zzaeq(3, (v4 & 0x80) != 0, v5);
                            break;
                        }
                        case 4: {
                            if((v4 & 0x40) != 0) {
                                int v7 = zzfb0.zzk();
                                zzfb0.zzH(v7 - 4);
                                v5 -= v7;
                            }
                            if((v4 & 16) != 0) {
                                v5 -= 10;
                            }
                            zzaeq0 = new zzaeq(4, false, v5);
                            break;
                        }
                        default: {
                            zzes.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + v3);
                            zzaeq0 = null;
                        }
                    }
                }
                else if((v4 & 0x40) != 0) {
                    zzes.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    zzaeq0 = null;
                }
                else {
                    zzaeq0 = new zzaeq(2, (v4 & 0x80) != 0, v5);
                }
            }
            else {
                zzes.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", v2));
                zzaeq0 = null;
            }
        }
        if(zzaeq0 == null) {
            return null;
        }
        int v8 = zzfb0.zzc();
        if(zzaeq0.zza == 2) {
            v1 = 6;
        }
        zzfb0.zzF(v8 + (zzaeq0.zzb ? zzaer.zze(zzfb0, zzaeq0.zzc) : zzaeq0.zzc));
        if(!zzaer.zzk(zzfb0, zzaeq0.zza, v1, false)) {
            if(zzaeq0.zza == 4 && zzaer.zzk(zzfb0, 4, v1, true)) {
                z = true;
                goto label_53;
            }
            zzes.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzaeq0.zza);
            return null;
        }
    label_53:
        while(zzfb0.zza() >= v1) {
            zzaes zzaes0 = zzaer.zzf(zzaeq0.zza, zzfb0, z, v1, zzaep0);
            if(zzaes0 != null) {
                arrayList0.add(zzaes0);
            }
        }
        return new zzbz(arrayList0);
    }

    private static int zzb(int v) {
        return v == 0 || v == 3 ? 1 : 2;
    }

    private static int zzc(byte[] arr_b, int v, int v1) {
        int v2 = zzaer.zzd(arr_b, v);
        if(v1 != 0 && v1 != 3) {
            while(v2 < arr_b.length - 1) {
                if((v2 - v) % 2 == 0 && arr_b[v2 + 1] == 0) {
                    return v2;
                }
                v2 = zzaer.zzd(arr_b, v2 + 1);
            }
            return arr_b.length;
        }
        return v2;
    }

    private static int zzd(byte[] arr_b, int v) {
        while(v < arr_b.length) {
            if(arr_b[v] == 0) {
                return v;
            }
            ++v;
        }
        return arr_b.length;
    }

    private static int zze(zzfb zzfb0, int v) {
        byte[] arr_b = zzfb0.zzI();
        int v1 = zzfb0.zzc();
        for(int v2 = v1; v2 + 1 < v1 + v; ++v2) {
            if((arr_b[v2] & 0xFF) == 0xFF && arr_b[v2 + 1] == 0) {
                System.arraycopy(arr_b, v2 + 2, arr_b, v2 + 1, v - (v2 - v1) - 2);
                --v;
            }
        }
        return v;
    }

    private static zzaes zzf(int v, zzfb zzfb0, boolean z, int v1, zzaep zzaep0) {
        int v20;
        byte[] arr_b4;
        Charset charset0;
        int v19;
        int v18;
        int v15;
        int v41;
        int v25;
        String s4;
        boolean z1;
        int v12;
        int v11;
        int v10;
        int v9;
        int v6;
        int v2 = zzfb0.zzl();
        int v3 = zzfb0.zzl();
        int v4 = zzfb0.zzl();
        int v5 = v < 3 ? 0 : zzfb0.zzl();
        switch(v) {
            case 3: {
                v6 = zzfb0.zzo();
                break;
            }
            case 4: {
                v6 = zzfb0.zzo();
                if(!z) {
                    v6 = v6 >> 24 << 21 | (v6 & 0xFF | (v6 >> 8 & 0xFF) << 7 | (v6 >> 16 & 0xFF) << 14);
                }
                break;
            }
            default: {
                v6 = zzfb0.zzn();
            }
        }
        int v7 = v < 3 ? 0 : zzfb0.zzp();
        zzaes zzaes0 = null;
        if(v2 == 0 && v3 == 0 && v4 == 0 && v5 == 0 && v6 == 0 && v7 == 0) {
            zzfb0.zzG(zzfb0.zzd());
            return null;
        }
        int v8 = zzfb0.zzc() + v6;
        if(v8 > zzfb0.zzd()) {
            zzes.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
            zzfb0.zzG(zzfb0.zzd());
            return null;
        }
        if(zzaep0 == null) {
            switch(v) {
                case 3: {
                    v9 = (v7 & 0x80) == 0 ? 0 : 1;
                    v10 = (v7 & 0x20) == 0 ? 0 : 1;
                    v12 = (v7 & 0x40) == 0 ? 0 : 1;
                    z1 = false;
                    v11 = v9;
                    break;
                }
                case 4: {
                    v11 = (v7 & 8) == 0 ? 0 : 1;
                    v12 = (v7 & 4) == 0 ? 0 : 1;
                    z1 = (v7 & 2) != 0;
                    v10 = (v7 & 0x40) == 0 ? 0 : 1;
                    v9 = v7 & 1;
                    break;
                }
                default: {
                    v9 = 0;
                    v10 = 0;
                    v11 = 0;
                    v12 = 0;
                    z1 = false;
                }
            }
            if(v11 != 0 || v12 != 0) {
                zzes.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                zzfb0.zzG(v8);
                return null;
            }
            if(v10 != 0) {
                zzfb0.zzH(1);
                --v6;
            }
            if(v9 != 0) {
                zzfb0.zzH(4);
                v6 -= 4;
            }
            if(z1) {
                v6 = zzaer.zze(zzfb0, v6);
            }
            if(v2 != 84 || v3 != 88 || v4 != 88 || v != 2 && v5 != 88) {
                goto label_61;
                try {
                label_99:
                    String s2 = new String(arr_b4, 0, v20, zzfqu.zzb);
                    int v21 = zzaer.zzc(arr_b4, v20 + 1, v19);
                    String s3 = zzaer.zzh(arr_b4, v20 + 1, v21, charset0);
                    int v22 = v21 + zzaer.zzb(v19);
                    int v23 = zzaer.zzc(arr_b4, v22, v19);
                    zzaes0 = new zzaen(s2, s3, zzaer.zzh(arr_b4, v22, v23, charset0), zzaer.zzl(arr_b4, v23 + zzaer.zzb(v19), v6 - 1));
                    v41 = v5;
                    goto label_233;
                label_109:
                    v18 = v8;
                label_110:
                    if(!(v == 2 ? v15 != 80 || v3 != 73 || v4 != 67 : v15 != 65 || v3 != 80 || v4 != 73 || v5 != 67)) {
                        int v24 = zzfb0.zzl();
                        Charset charset1 = zzaer.zzj(v24);
                        byte[] arr_b5 = new byte[v6 - 1];
                        zzfb0.zzC(arr_b5, 0, v6 - 1);
                        if(v == 2) {
                            s4 = "image/" + zzfqo.zza(new String(arr_b5, 0, 3, zzfqu.zzb));
                            if("image/jpg".equals(s4)) {
                                s4 = "image/jpeg";
                            }
                            v25 = 2;
                        }
                        else {
                            v25 = zzaer.zzd(arr_b5, 0);
                            s4 = zzfqo.zza(new String(arr_b5, 0, v25, zzfqu.zzb));
                            if(s4.indexOf(0x2F) == -1) {
                                s4 = "image/" + s4;
                            }
                        }
                        int v26 = arr_b5[v25 + 1] & 0xFF;
                        int v27 = zzaer.zzc(arr_b5, v25 + 2, v24);
                        zzaes0 = new zzaed(s4, new String(arr_b5, v25 + 2, v27 - (v25 + 2), charset1), v26, zzaer.zzl(arr_b5, v27 + zzaer.zzb(v24), v6 - 1));
                        v41 = v5;
                    }
                    else if(v15 == 67 && v3 == 0x4F && v4 == 77 && (v5 == 77 || v == 2)) {
                        if(v6 >= 4) {
                            int v51 = zzfb0.zzl();
                            Charset charset2 = zzaer.zzj(v51);
                            byte[] arr_b7 = new byte[3];
                            zzfb0.zzC(arr_b7, 0, 3);
                            String s8 = new String(arr_b7, 0, 3);
                            byte[] arr_b8 = new byte[v6 - 4];
                            zzfb0.zzC(arr_b8, 0, v6 - 4);
                            int v52 = zzaer.zzc(arr_b8, 0, v51);
                            int v53 = v52 + zzaer.zzb(v51);
                            zzaes0 = new zzael(s8, new String(arr_b8, 0, v52, charset2), zzaer.zzh(arr_b8, v53, zzaer.zzc(arr_b8, v53, v51), charset2));
                        }
                        v41 = v5;
                    }
                    else if(v15 == 67 && v3 == 72 && v4 == 65 && v5 == 80) {
                        int v28 = zzfb0.zzc();
                        int v29 = zzaer.zzd(zzfb0.zzI(), v28);
                        String s5 = new String(zzfb0.zzI(), v28, v29 - v28, zzfqu.zzb);
                        zzfb0.zzG(v29 + 1);
                        int v30 = zzfb0.zzf();
                        int v31 = zzfb0.zzf();
                        long v32 = zzfb0.zzt();
                        if(v32 == 0xFFFFFFFFL) {
                            v32 = -1L;
                        }
                        long v33 = zzfb0.zzt();
                        if(v33 == 0xFFFFFFFFL) {
                            v33 = -1L;
                        }
                        ArrayList arrayList0 = new ArrayList();
                        while(zzfb0.zzc() < v28 + v6) {
                            zzaes zzaes1 = zzaer.zzf(v, zzfb0, z, v1, null);
                            if(zzaes1 != null) {
                                arrayList0.add(zzaes1);
                            }
                        }
                        zzaes0 = new zzaeh(s5, v30, v31, v32, v33, ((zzaes[])arrayList0.toArray(new zzaes[0])));
                        v41 = v5;
                    }
                    else if(v15 == 67 && v3 == 84 && v4 == 0x4F && v5 == 67) {
                        int v34 = zzfb0.zzc();
                        int v35 = zzaer.zzd(zzfb0.zzI(), v34);
                        String s6 = new String(zzfb0.zzI(), v34, v35 - v34, zzfqu.zzb);
                        zzfb0.zzG(v35 + 1);
                        int v36 = zzfb0.zzl();
                        int v37 = zzfb0.zzl();
                        String[] arr_s = new String[v37];
                        for(int v38 = 0; v38 < v37; ++v38) {
                            int v39 = zzfb0.zzc();
                            int v40 = zzaer.zzd(zzfb0.zzI(), v39);
                            arr_s[v38] = new String(zzfb0.zzI(), v39, v40 - v39, zzfqu.zzb);
                            zzfb0.zzG(v40 + 1);
                        }
                        ArrayList arrayList1 = new ArrayList();
                        while(zzfb0.zzc() < v34 + v6) {
                            zzaes zzaes2 = zzaer.zzf(v, zzfb0, z, v1, null);
                            if(zzaes2 != null) {
                                arrayList1.add(zzaes2);
                            }
                        }
                        zzaes0 = new zzaej(s6, (v36 & 2) != 0, 1 == (v36 & 1), arr_s, ((zzaes[])arrayList1.toArray(new zzaes[0])));
                        v41 = 67;
                    }
                    else if(v15 != 77) {
                        v41 = v5;
                    label_203:
                        String s7 = zzaer.zzi(v, v15, v3, v4, v41);
                        byte[] arr_b6 = new byte[v6];
                        zzfb0.zzC(arr_b6, 0, v6);
                        zzaes0 = new zzaef(s7, arr_b6);
                    }
                    else if(v3 == 76) {
                        v41 = v5;
                        if(v4 != 76 || v41 != 84) {
                            goto label_203;
                        }
                        else {
                            int v42 = zzfb0.zzp();
                            int v43 = zzfb0.zzn();
                            int v44 = zzfb0.zzn();
                            int v45 = zzfb0.zzl();
                            int v46 = zzfb0.zzl();
                            zzfa zzfa0 = new zzfa();
                            zzfa0.zzh(zzfb0);
                            int v47 = (v6 - 10) * 8 / (v45 + v46);
                            int[] arr_v = new int[v47];
                            int[] arr_v1 = new int[v47];
                            for(int v48 = 0; v48 < v47; ++v48) {
                                int v49 = zzfa0.zzd(v45);
                                int v50 = zzfa0.zzd(v46);
                                arr_v[v48] = v49;
                                arr_v1[v48] = v50;
                            }
                            zzaes0 = new zzaew(v42, v43, v44, arr_v, arr_v1);
                        }
                    }
                    else {
                        v41 = v5;
                        goto label_203;
                    }
                    goto label_233;
                }
                catch(Throwable throwable0) {
                    v8 = v18;
                    zzfb0.zzG(v8);
                    throw throwable0;
                }
                try {
                label_221:
                    if(v6 > 0) {
                        int v54 = zzfb0.zzl();
                        byte[] arr_b9 = new byte[v6 - 1];
                        zzfb0.zzC(arr_b9, 0, v6 - 1);
                        int v55 = zzaer.zzc(arr_b9, 0, v54);
                        int v56 = v55 + zzaer.zzb(v54);
                        zzaes0 = new zzafc("WXXX", new String(arr_b9, 0, v55, zzaer.zzj(v54)), zzaer.zzh(arr_b9, v56, zzaer.zzd(arr_b9, v56), zzfqu.zzb));
                    }
                    v41 = v5;
                    v18 = v8;
                    goto label_233;
                }
                catch(Throwable throwable0) {
                }
                zzfb0.zzG(v8);
                throw throwable0;
            }
            else if(v6 > 0) {
                try {
                    int v13 = zzfb0.zzl();
                    byte[] arr_b = new byte[v6 - 1];
                    zzfb0.zzC(arr_b, 0, v6 - 1);
                    int v14 = zzaer.zzc(arr_b, 0, v13);
                    zzaes0 = new zzafa("TXXX", new String(arr_b, 0, v14, zzaer.zzj(v13)), zzaer.zzg(arr_b, v13, v14 + zzaer.zzb(v13)));
                    v41 = v5;
                    v18 = v8;
                    goto label_233;
                label_61:
                    switch(v2) {
                        case 84: {
                            goto label_64;
                        }
                        case 87: {
                            goto label_71;
                        }
                    }
                    v15 = v2;
                    goto label_73;
                label_64:
                    String s = zzaer.zzi(v, 84, v3, v4, v5);
                    if(v6 > 0) {
                        int v16 = zzfb0.zzl();
                        byte[] arr_b1 = new byte[v6 - 1];
                        zzfb0.zzC(arr_b1, 0, v6 - 1);
                        zzaes0 = new zzafa(s, null, zzaer.zzg(arr_b1, v16, 0));
                        v41 = v5;
                        v18 = v8;
                        goto label_233;
                    label_71:
                        if(v3 == 88 && v4 == 88 && (v == 2 || v5 == 88)) {
                            goto label_221;
                        }
                        else {
                            v15 = 87;
                        label_73:
                            if(v15 == 87) {
                                String s1 = zzaer.zzi(v, 87, v3, v4, v5);
                                byte[] arr_b2 = new byte[v6];
                                zzfb0.zzC(arr_b2, 0, v6);
                                zzaes0 = new zzafc(s1, null, new String(arr_b2, 0, zzaer.zzd(arr_b2, 0), zzfqu.zzb));
                                v41 = v5;
                                v18 = v8;
                            }
                            else if(v15 != 80) {
                            label_87:
                                if(v15 != 71) {
                                    goto label_109;
                                }
                                else if(v3 != 69 || v4 != 0x4F) {
                                    v18 = v8;
                                    v15 = 71;
                                    goto label_110;
                                }
                                else if(v5 != 66 && v != 2) {
                                    v15 = 71;
                                    v18 = v8;
                                    goto label_110;
                                }
                                else {
                                    v19 = zzfb0.zzl();
                                    charset0 = zzaer.zzj(v19);
                                    arr_b4 = new byte[v6 - 1];
                                    zzfb0.zzC(arr_b4, 0, v6 - 1);
                                    v20 = zzaer.zzd(arr_b4, 0);
                                    v18 = v8;
                                    goto label_99;
                                }
                            }
                            else if(v3 == 82 && v4 == 73 && v5 == 86) {
                                byte[] arr_b3 = new byte[v6];
                                zzfb0.zzC(arr_b3, 0, v6);
                                int v17 = zzaer.zzd(arr_b3, 0);
                                zzaes0 = new zzaey(new String(arr_b3, 0, v17, zzfqu.zzb), zzaer.zzl(arr_b3, v17 + 1, v6));
                                v41 = v5;
                                v18 = v8;
                            }
                            else {
                                v15 = 80;
                                goto label_87;
                            }
                        }
                    }
                    else {
                        v41 = v5;
                        v18 = v8;
                    }
                }
                catch(Throwable throwable0) {
                    zzfb0.zzG(v8);
                    throw throwable0;
                }
            }
            else {
                v41 = v5;
                v18 = v8;
            }
        label_233:
            if(zzaes0 == null) {
                try {
                    zzes.zzf("Id3Decoder", "Failed to decode frame: id=" + zzaer.zzi(v, v2, v3, v4, v41) + ", frameSize=" + v6);
                    goto label_240;
                }
                catch(Throwable throwable0) {
                    v8 = v18;
                }
                zzfb0.zzG(v8);
                throw throwable0;
            }
        label_240:
            zzfb0.zzG(v18);
            return zzaes0;
        }
        zzfb0.zzG(v8);
        return null;
    }

    private static zzfud zzg(byte[] arr_b, int v, int v1) {
        if(v1 >= arr_b.length) {
            return zzfud.zzm("");
        }
        zzfua zzfua0 = new zzfua();
        for(int v2 = zzaer.zzc(arr_b, v1, v); v1 < v2; v2 = zzaer.zzc(arr_b, v1, v)) {
            zzfua0.zzf(new String(arr_b, v1, v2 - v1, zzaer.zzj(v)));
            v1 = zzaer.zzb(v) + v2;
        }
        zzfud zzfud0 = zzfua0.zzi();
        return zzfud0.isEmpty() ? zzfud.zzm("") : zzfud0;
    }

    private static String zzh(byte[] arr_b, int v, int v1, Charset charset0) {
        return v1 <= v || v1 > arr_b.length ? "" : new String(arr_b, v, v1 - v, charset0);
    }

    private static String zzi(int v, int v1, int v2, int v3, int v4) {
        return v == 2 ? String.format(Locale.US, "%c%c%c", v1, v2, v3) : String.format(Locale.US, "%c%c%c%c", v1, v2, v3, v4);
    }

    private static Charset zzj(int v) {
        switch(v) {
            case 1: {
                return zzfqu.zzf;
            }
            case 2: {
                return zzfqu.zzd;
            }
            case 3: {
                return zzfqu.zzc;
            }
            default: {
                return zzfqu.zzb;
            }
        }
    }

    private static boolean zzk(zzfb zzfb0, int v, int v1, boolean z) {
        int v8;
        int v6;
        long v5;
        int v4;
        int v2 = zzfb0.zzc();
        while(true) {
            int v3 = 1;
            if(zzfb0.zza() < v1) {
                break;
            }
            try {
                if(v >= 3) {
                    v4 = zzfb0.zzf();
                    v5 = zzfb0.zzt();
                    v6 = zzfb0.zzp();
                }
                else {
                    v4 = zzfb0.zzn();
                    v5 = (long)zzfb0.zzn();
                    v6 = 0;
                }
            }
            catch(Throwable throwable0) {
                zzfb0.zzG(v2);
                throw throwable0;
            }
            if(v4 == 0 && v5 == 0L && v6 == 0) {
                zzfb0.zzG(v2);
                return true;
            }
            if(v == 4 && !z) {
                if((0x808080L & v5) != 0L) {
                    zzfb0.zzG(v2);
                    return false;
                }
                v5 = v5 >> 24 << 21 | ((v5 >> 16 & 0xFFL) << 14 | (v5 & 0xFFL | (v5 >> 8 & 0xFFL) << 7));
            }
            if(v == 4) {
                if((v6 & 0x40) == 0) {
                    v3 = 0;
                }
                int v7 = v3;
                v3 = v6 & 1;
                v8 = v7;
            }
            else if(v == 3) {
                v8 = (v6 & 0x20) == 0 ? 0 : 1;
                if((v6 & 0x80) == 0) {
                    v3 = 0;
                }
            }
            else {
                v8 = 0;
                v3 = 0;
            }
            if(v3 != 0) {
                v8 += 4;
            }
            if(v5 < ((long)v8)) {
                zzfb0.zzG(v2);
                return false;
            }
            if(((long)zzfb0.zza()) < v5) {
                zzfb0.zzG(v2);
                return false;
            }
            try {
                zzfb0.zzH(((int)v5));
                continue;
            }
            catch(Throwable throwable0) {
            }
            zzfb0.zzG(v2);
            throw throwable0;
        }
        zzfb0.zzG(v2);
        return true;
    }

    private static byte[] zzl(byte[] arr_b, int v, int v1) {
        return v1 > v ? Arrays.copyOfRange(arr_b, v, v1) : zzfk.zzf;
    }
}


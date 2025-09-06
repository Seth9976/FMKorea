package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzagr {
    private static final byte[] zza;

    static {
        zzagr.zza = "OpusHead".getBytes(zzfqu.zzc);
    }

    public static zzbz zza(zzagh zzagh0) {
        zzfo zzfo0;
        zzagi zzagi0 = zzagh0.zzb(0x68646C72);
        zzagi zzagi1 = zzagh0.zzb(1801812339);
        zzagi zzagi2 = zzagh0.zzb(0x696C7374);
        if(zzagi0 != null && zzagi1 != null && zzagi2 != null && zzagr.zzh(zzagi0.zza) == 0x6D647461) {
            zzfb zzfb0 = zzagi1.zza;
            zzfb0.zzG(12);
            int v = zzfb0.zzf();
            String[] arr_s = new String[v];
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = zzfb0.zzf();
                zzfb0.zzH(4);
                arr_s[v1] = zzfb0.zzy(v2 - 8, zzfqu.zzc);
            }
            zzfb zzfb1 = zzagi2.zza;
            zzfb1.zzG(8);
            ArrayList arrayList0 = new ArrayList();
            while(zzfb1.zza() > 8) {
                int v3 = zzfb1.zzc();
                int v4 = zzfb1.zzf();
                int v5 = zzfb1.zzf() - 1;
                if(v5 < 0 || v5 >= v) {
                    zzes.zzf("AtomParsers", "Skipped metadata with unknown key index: " + v5);
                }
                else {
                    String s = arr_s[v5];
                    int v6 = v3 + v4;
                    while(true) {
                        zzfo0 = null;
                        int v7 = zzfb1.zzc();
                        if(v7 < v6) {
                            int v8 = zzfb1.zzf();
                            if(zzfb1.zzf() == 1684108385) {
                                int v9 = zzfb1.zzf();
                                int v10 = zzfb1.zzf();
                                byte[] arr_b = new byte[v8 - 16];
                                zzfb1.zzC(arr_b, 0, v8 - 16);
                                zzfo0 = new zzfo(s, arr_b, v10, v9);
                            }
                            else {
                                zzfb1.zzG(v7 + v8);
                                continue;
                            }
                        }
                        break;
                    }
                    if(zzfo0 != null) {
                        arrayList0.add(zzfo0);
                    }
                }
                zzfb1.zzG(v3 + v4);
            }
            return arrayList0.isEmpty() ? null : new zzbz(arrayList0);
        }
        return null;
    }

    public static zzbz zzb(zzagi zzagi0) {
        zzfb zzfb0 = zzagi0.zza;
        zzfb0.zzG(8);
        zzbz zzbz0 = new zzbz(0x8000000000000001L, new zzby[0]);
        while(zzfb0.zza() >= 8) {
            int v = zzfb0.zzc();
            int v1 = zzfb0.zzf();
            int v2 = zzfb0.zzf();
            zzbz zzbz1 = null;
            if(v2 == 0x6D657461) {
                zzfb0.zzG(v);
                int v3 = v + v1;
                zzfb0.zzH(8);
                zzagr.zze(zzfb0);
                while(zzfb0.zzc() < v3) {
                    int v4 = zzfb0.zzc();
                    int v5 = zzfb0.zzf();
                    if(zzfb0.zzf() == 0x696C7374) {
                        zzfb0.zzG(v4);
                        int v6 = v4 + v5;
                        zzfb0.zzH(8);
                        ArrayList arrayList0 = new ArrayList();
                        while(zzfb0.zzc() < v6) {
                            zzby zzby0 = zzagy.zza(zzfb0);
                            if(zzby0 != null) {
                                arrayList0.add(zzby0);
                            }
                        }
                        if(!arrayList0.isEmpty()) {
                            zzbz1 = new zzbz(arrayList0);
                        }
                        break;
                    }
                    zzfb0.zzG(v4 + v5);
                }
                zzbz0 = zzbz0.zzd(zzbz1);
            }
            else {
                switch(v2) {
                    case 0xA978797A: {
                        zzbz0 = zzbz0.zzd(zzagr.zzl(zzfb0));
                        break;
                    }
                    case 1936553057: {
                        zzfb0.zzG(v);
                        int v7 = v + v1;
                        zzfb0.zzH(12);
                        while(zzfb0.zzc() < v7) {
                            int v8 = zzfb0.zzc();
                            int v9 = zzfb0.zzf();
                            if(zzfb0.zzf() == 1935766900) {
                                if(v9 >= 14) {
                                    zzfb0.zzH(5);
                                    int v10 = zzfb0.zzl();
                                    float f = 120.0f;
                                    if(v10 == 12) {
                                        f = 240.0f;
                                    }
                                    else if(v10 != 13) {
                                        break;
                                    }
                                    zzfb0.zzH(1);
                                    zzbz1 = new zzbz(0x8000000000000001L, new zzby[]{new zzafi(f, zzfb0.zzl())});
                                }
                                break;
                            }
                            zzfb0.zzG(v8 + v9);
                        }
                        zzbz0 = zzbz0.zzd(zzbz1);
                    }
                }
            }
            zzfb0.zzG(v + v1);
        }
        return zzbz0;
    }

    public static zzfu zzc(zzfb zzfb0) {
        zzfb0.zzG(8);
        return zzagj.zze(zzfb0.zzf()) == 0 ? new zzfu(zzfb0.zzt(), zzfb0.zzt(), zzfb0.zzt()) : new zzfu(zzfb0.zzs(), zzfb0.zzs(), zzfb0.zzt());
    }

    // This method was un-flattened
    public static List zzd(zzagh zzagh0, zzabq zzabq0, long v, zzad zzad0, boolean z, boolean z1, zzfqw zzfqw0) {
        ArrayList arrayList1;
        int v3;
        zzago zzago0;
        int[] arr_v38;
        int v159;
        int[] arr_v37;
        int[] arr_v36;
        int[] arr_v35;
        int[] arr_v34;
        int v147;
        int v146;
        int v144;
        long[] arr_v27;
        long[] arr_v26;
        long v135;
        int[] arr_v20;
        long[] arr_v18;
        int[] arr_v17;
        int v129;
        int v128;
        int v127;
        int v126;
        int v125;
        int v124;
        long[] arr_v16;
        zzfb zzfb7;
        zzfb zzfb8;
        zzagk zzagk1;
        int v119;
        zzfb zzfb6;
        int v118;
        int v117;
        int v116;
        int v102;
        long[] arr_v12;
        int[] arr_v11;
        int[] arr_v10;
        long[] arr_v9;
        long v101;
        int v83;
        int v82;
        int v81;
        boolean z4;
        zzagi zzagi9;
        zzahj zzahj0;
        long[] arr_v2;
        long[] arr_v1;
        int v42;
        int v41;
        int v40;
        zzagn zzagn2;
        int v39;
        zzfud zzfud0;
        long v38;
        String s2;
        int v37;
        int v36;
        zzfb zzfb2;
        int v35;
        ArrayList arrayList4;
        int v34;
        Pair pair1;
        zzagh zzagh6;
        int v33;
        int v32;
        int v31;
        String s1;
        zzagn zzagn1;
        int v30;
        zzagq zzagq1;
        int v29;
        int v64;
        int v60;
        zzagn zzagn4;
        float f1;
        int v59;
        int v58;
        byte[] arr_b2;
        String s5;
        boolean z3;
        int v56;
        int v55;
        int v54;
        int v53;
        String s3;
        zzad zzad1;
        zzagn zzagn3;
        int v19;
        long v12;
        long v10;
        int v9;
        zzahg zzahg0;
        zzagh zzagh3;
        ArrayList arrayList2;
        int v1 = 8;
        ArrayList arrayList0 = new ArrayList();
        int v2 = 0;
        while(v2 < zzagh0.zzc.size()) {
            zzagh zzagh1 = (zzagh)zzagh0.zzc.get(v2);
            if(zzagh1.zzd == 1953653099) {
                zzagi zzagi0 = zzagh0.zzb(0x6D766864);
                zzagi0.getClass();
                zzagh zzagh2 = zzagh1.zza(0x6D646961);
                zzagh2.getClass();
                zzagi zzagi1 = zzagh2.zzb(0x68646C72);
                zzagi1.getClass();
                int v4 = zzagr.zzf(zzagr.zzh(zzagi1.zza));
                if(v4 == -1) {
                    v3 = v2;
                    arrayList2 = arrayList0;
                    zzagh3 = zzagh1;
                    zzahg0 = null;
                }
                else {
                    zzagi zzagi2 = zzagh1.zzb(0x746B6864);
                    zzagi2.getClass();
                    zzfb zzfb0 = zzagi2.zza;
                    zzfb0.zzG(8);
                    int v5 = zzagj.zze(zzfb0.zzf());
                    if(v5 != 0) {
                        v1 = 16;
                    }
                    zzfb0.zzH(v1);
                    int v6 = zzfb0.zzf();
                    zzfb0.zzH(4);
                    int v7 = zzfb0.zzc();
                    int v8 = 0;
                    while(true) {
                        v9 = v5 == 0 ? 4 : 8;
                        v10 = 0x8000000000000001L;
                        if(v8 >= v9) {
                            break;
                        }
                        if(zzfb0.zzI()[v7 + v8] != -1) {
                            long v11 = v5 == 0 ? zzfb0.zzt() : zzfb0.zzu();
                            if(v11 == 0L) {
                                goto label_45;
                            }
                            else {
                                v12 = v11;
                                goto label_46;
                            }
                        }
                        ++v8;
                    }
                    zzfb0.zzH(v9);
                label_45:
                    v12 = 0x8000000000000001L;
                label_46:
                    zzfb0.zzH(16);
                    int v13 = zzfb0.zzf();
                    int v14 = zzfb0.zzf();
                    zzfb0.zzH(4);
                    int v15 = zzfb0.zzf();
                    int v16 = zzfb0.zzf();
                    int v17 = v2;
                    int v18 = 0x10000;
                    ArrayList arrayList3 = arrayList0;
                    if(v13 == 0) {
                        if(v14 == 0x10000) {
                            if(v15 == 0xFFFF0000) {
                                if(v16 == 0) {
                                    v19 = 90;
                                    goto label_80;
                                }
                                else {
                                    v14 = 0x10000;
                                    v15 = 0xFFFF0000;
                                    goto label_65;
                                }
                                goto label_64;
                            }
                            else {
                            label_64:
                                v14 = 0x10000;
                            }
                        }
                    label_65:
                        v13 = 0;
                    }
                    if(v13 == 0) {
                        if(v14 == 0xFFFF0000) {
                            if(v15 != 0x10000) {
                                v18 = v15;
                            }
                            else if(v16 == 0) {
                                v19 = 270;
                                goto label_80;
                            }
                            v14 = 0xFFFF0000;
                        }
                        else {
                            v18 = v15;
                        }
                        v13 = 0;
                    }
                    else {
                        v18 = v15;
                    }
                    v19 = v13 != 0xFFFF0000 || v14 != 0 || v18 != 0 || v16 != 0xFFFF0000 ? 0 : 180;
                label_80:
                    zzagq zzagq0 = new zzagq(v6, v12, v19);
                    long v20 = v == 0x8000000000000001L ? zzagq0.zzb : v;
                    long v21 = zzagr.zzc(zzagi0.zza).zzc;
                    if(v20 != 0x8000000000000001L) {
                        v10 = zzfk.zzq(v20, 1000000L, v21);
                    }
                    zzagh zzagh4 = zzagh2.zza(1835626086);
                    zzagh4.getClass();
                    zzagh zzagh5 = zzagh4.zza(1937007212);
                    zzagh5.getClass();
                    zzagi zzagi3 = zzagh2.zzb(0x6D646864);
                    zzagi3.getClass();
                    Pair pair0 = zzagr.zzj(zzagi3.zza);
                    zzagi zzagi4 = zzagh5.zzb(1937011556);
                    if(zzagi4 == null) {
                        throw zzcd.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    zzfb zzfb1 = zzagi4.zza;
                    int v22 = zzagq0.zza;
                    int v23 = zzagq0.zzc;
                    String s = (String)pair0.second;
                    zzfb1.zzG(12);
                    int v24 = zzfb1.zzf();
                    zzagn zzagn0 = new zzagn(v24);
                    int v25 = 0;
                    while(v25 < v24) {
                        int v26 = zzfb1.zzc();
                        int v27 = zzfb1.zzf();
                        zzabf.zzb(v27 > 0, "childAtomSize must be positive");
                        int v28 = zzfb1.zzf();
                        switch(v28) {
                            case 0x63616D6D: {
                                zzak zzak1 = new zzak();
                                zzak1.zzG(v22);
                                zzak1.zzS("application/x-camera-motion");
                                zzagn0.zzb = zzak1.zzY();
                                goto label_500;
                            }
                            case 0x64766831: {
                                zzagn1 = zzagn0;
                                s1 = s;
                                v31 = v23;
                                v32 = v22;
                                zzagq1 = zzagq0;
                                v33 = v4;
                                zzagh6 = zzagh1;
                                pair1 = pair0;
                                v34 = v17;
                                arrayList4 = arrayList3;
                                v35 = v24;
                                zzfb2 = zzfb1;
                            label_203:
                                zzfb2.zzG(v26 + 16);
                                zzfb2.zzH(16);
                                int v43 = zzfb2.zzp();
                                int v44 = zzfb2.zzp();
                                zzfb2.zzH(50);
                                int v45 = zzfb2.zzc();
                                if(v28 == 1701733238) {
                                    Pair pair2 = zzagr.zzk(zzfb2, v26, v27);
                                    if(pair2 == null) {
                                        zzagn3 = zzagn1;
                                        v28 = 1701733238;
                                        zzad1 = zzad0;
                                    }
                                    else {
                                        int v46 = (int)(((Integer)pair2.first));
                                        if(zzad0 == null) {
                                            zzagn3 = zzagn1;
                                            zzad1 = null;
                                        }
                                        else {
                                            zzad1 = zzad0.zzb(((zzahh)pair2.second).zzb);
                                            zzagn3 = zzagn1;
                                        }
                                        zzagn3.zza[v25] = (zzahh)pair2.second;
                                        v28 = v46;
                                    }
                                    zzfb2.zzG(v45);
                                }
                                else {
                                    zzagn3 = zzagn1;
                                    zzad1 = zzad0;
                                }
                                if(v28 == 0x6D317620) {
                                    s3 = "video/mpeg";
                                }
                                else if(v28 == 1211250227) {
                                    v28 = 1211250227;
                                    s3 = "video/3gpp";
                                }
                                else {
                                    s3 = null;
                                }
                                v41 = v25;
                                float f = 1.0f;
                                int v47 = -1;
                                int v48 = -1;
                                String s4 = null;
                                byte[] arr_b1 = null;
                                int v49 = -1;
                                ByteBuffer byteBuffer0 = null;
                                zzagl zzagl0 = null;
                                boolean z2 = false;
                                int v50 = -1;
                                List list0 = null;
                                while(true) {
                                    if(v45 - v26 >= v27) {
                                        v53 = v47;
                                        break;
                                    }
                                    zzfb2.zzG(v45);
                                    int v51 = zzfb2.zzc();
                                    int v52 = zzfb2.zzf();
                                    if(v52 == 0) {
                                        v53 = v47;
                                        if(zzfb2.zzc() - v26 == v27) {
                                            break;
                                        }
                                        else {
                                            v54 = 0;
                                            goto label_260;
                                        }
                                        goto label_258;
                                    }
                                    else {
                                    label_258:
                                        v53 = v47;
                                        v54 = v52;
                                    }
                                label_260:
                                    if(v54 > 0) {
                                        v55 = v26;
                                        v56 = v27;
                                        z3 = true;
                                    }
                                    else {
                                        v55 = v26;
                                        v56 = v27;
                                        z3 = false;
                                    }
                                    zzabf.zzb(z3, "childAtomSize must be positive");
                                    int v57 = zzfb2.zzf();
                                    switch(v57) {
                                        case 0x61763143: {
                                            zzabf.zzb(s3 == null, null);
                                            s3 = "video/av01";
                                            goto label_347;
                                        }
                                        case 1668050025: {
                                            if(byteBuffer0 == null) {
                                                byteBuffer0 = zzagr.zzn();
                                            }
                                            byteBuffer0.position(21);
                                            byteBuffer0.putShort(zzfb2.zzz());
                                            byteBuffer0.putShort(zzfb2.zzz());
                                        label_347:
                                            s5 = s4;
                                            arr_b2 = arr_b1;
                                            v58 = v43;
                                            v59 = v44;
                                            zzagn4 = zzagn3;
                                            v60 = v28;
                                            break;
                                        }
                                        case 1685480259: 
                                        case 0x64767643: {
                                            s5 = s4;
                                            arr_b2 = arr_b1;
                                            v58 = v43;
                                            v59 = v44;
                                            f1 = f;
                                            zzagn4 = zzagn3;
                                            v60 = v28;
                                            zzaax zzaax0 = zzaax.zza(zzfb2);
                                            if(zzaax0 != null) {
                                                s5 = zzaax0.zza;
                                                s3 = "video/dolby-vision";
                                            }
                                        label_365:
                                            f = f1;
                                            break;
                                        }
                                        case 0x68766343: {
                                            zzabf.zzb(s3 == null, null);
                                            zzfb2.zzG(v51 + 8);
                                            zzabr zzabr0 = zzabr.zza(zzfb2);
                                            List list1 = zzabr0.zza;
                                            zzagn3.zzc = zzabr0.zzb;
                                            if(!z2) {
                                                f = zzabr0.zzf;
                                            }
                                            list0 = list1;
                                            s5 = zzabr0.zzg;
                                            arr_b2 = arr_b1;
                                            v58 = v43;
                                            v59 = v44;
                                            v48 = zzabr0.zzc;
                                            zzagn4 = zzagn3;
                                            v50 = zzabr0.zzd;
                                            s3 = "video/hevc";
                                            v60 = v28;
                                            v49 = zzabr0.zze;
                                            break;
                                        }
                                        case 1835295606: {
                                            if(byteBuffer0 == null) {
                                                byteBuffer0 = zzagr.zzn();
                                            }
                                            int v66 = zzfb2.zzz();
                                            int v67 = zzfb2.zzz();
                                            v60 = v28;
                                            int v68 = zzfb2.zzz();
                                            zzagn4 = zzagn3;
                                            int v69 = zzfb2.zzz();
                                            arr_b2 = arr_b1;
                                            int v70 = zzfb2.zzz();
                                            int v71 = zzfb2.zzz();
                                            v59 = v44;
                                            int v72 = zzfb2.zzz();
                                            v58 = v43;
                                            int v73 = zzfb2.zzz();
                                            long v74 = zzfb2.zzt();
                                            long v75 = zzfb2.zzt();
                                            s5 = s4;
                                            byteBuffer0.position(1);
                                            byteBuffer0.putShort(((short)v70));
                                            byteBuffer0.putShort(((short)v71));
                                            byteBuffer0.putShort(((short)v66));
                                            byteBuffer0.putShort(((short)v67));
                                            byteBuffer0.putShort(((short)v68));
                                            byteBuffer0.putShort(((short)v69));
                                            byteBuffer0.putShort(((short)v72));
                                            byteBuffer0.putShort(((short)v73));
                                            byteBuffer0.putShort(((short)(((int)(v74 / 10000L)))));
                                            byteBuffer0.putShort(((short)(((int)(v75 / 10000L)))));
                                            break;
                                        }
                                        case 0x76706343: {
                                            zzabf.zzb(s3 == null, null);
                                            zzfb2.zzG(v51 + 12);
                                            zzfb2.zzH(2);
                                            int v76 = zzfb2.zzl();
                                            v48 = zzs.zza(zzfb2.zzl());
                                            v50 = 1 == (v76 & 1) ? 1 : 2;
                                            s5 = s4;
                                            arr_b2 = arr_b1;
                                            v58 = v43;
                                            v59 = v44;
                                            zzagn4 = zzagn3;
                                            v60 = v28;
                                            v49 = zzs.zzb(zzfb2.zzl());
                                            s3 = v28 == 0x76703038 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            break;
                                        }
                                        default: {
                                            s5 = s4;
                                            arr_b2 = arr_b1;
                                            v58 = v43;
                                            v59 = v44;
                                            f1 = f;
                                            zzagn4 = zzagn3;
                                            v60 = v28;
                                        alab1:
                                            switch(v57) {
                                                case 0x636F6C72: {
                                                    if(v48 == -1) {
                                                        if(v49 == -1) {
                                                            int v61 = zzfb2.zzf();
                                                            if(v61 == 1852009571 || v61 == 1852009592) {
                                                                int v62 = zzfb2.zzp();
                                                                int v63 = zzfb2.zzp();
                                                                zzfb2.zzH(2);
                                                                if(v54 == 19) {
                                                                    if((zzfb2.zzl() & 0x80) == 0) {
                                                                        v54 = 19;
                                                                    }
                                                                    else {
                                                                        v54 = 19;
                                                                        v48 = zzs.zza(v62);
                                                                        v64 = 1;
                                                                        v49 = zzs.zzb(v63);
                                                                        v50 = v64;
                                                                        goto label_365;
                                                                    }
                                                                }
                                                                v48 = zzs.zza(v62);
                                                                v64 = 2;
                                                                v49 = zzs.zzb(v63);
                                                                v50 = v64;
                                                            }
                                                            else {
                                                                zzes.zzf("AtomParsers", "Unsupported color type: " + zzagj.zzf(v61));
                                                                v48 = -1;
                                                                v49 = -1;
                                                            }
                                                        }
                                                        else {
                                                            v48 = -1;
                                                        }
                                                    }
                                                    goto label_365;
                                                }
                                                case 1702061171: {
                                                    zzabf.zzb(s3 == null, null);
                                                    zzagl zzagl1 = zzagr.zzm(zzfb2, v51);
                                                    String s6 = zzagl1.zza;
                                                    byte[] arr_b3 = zzagl1.zzb;
                                                    if(arr_b3 == null) {
                                                        zzagl0 = zzagl1;
                                                        s3 = s6;
                                                    }
                                                    else {
                                                        zzagl0 = zzagl1;
                                                        s3 = s6;
                                                        list0 = zzfud.zzm(arr_b3);
                                                    }
                                                    goto label_365;
                                                }
                                                case 0x70617370: {
                                                    zzfb2.zzG(v51 + 8);
                                                    f = ((float)zzfb2.zzo()) / ((float)zzfb2.zzo());
                                                    z2 = true;
                                                    break;
                                                }
                                                case 0x73743364: {
                                                    int v65 = zzfb2.zzl();
                                                    zzfb2.zzH(3);
                                                    if(v65 == 0) {
                                                        switch(zzfb2.zzl()) {
                                                            case 0: {
                                                                f = f1;
                                                                v53 = 0;
                                                                break alab1;
                                                            }
                                                            case 1: {
                                                                f = f1;
                                                                v53 = 1;
                                                                break alab1;
                                                            }
                                                            case 2: {
                                                                f = f1;
                                                                v53 = 2;
                                                                break alab1;
                                                            }
                                                            case 3: {
                                                                v53 = 3;
                                                            }
                                                        }
                                                    }
                                                    goto label_365;
                                                }
                                                case 0x73763364: {
                                                    arr_b2 = zzagr.zzs(zzfb2, v51, v54);
                                                    goto label_365;
                                                }
                                                default: {
                                                    goto label_365;
                                                }
                                            }
                                        }
                                    }
                                    v45 += v54;
                                    v26 = v55;
                                    v27 = v56;
                                    v47 = v53;
                                    v28 = v60;
                                    zzagn3 = zzagn4;
                                    arr_b1 = arr_b2;
                                    v44 = v59;
                                    v43 = v58;
                                    s4 = s5;
                                }
                                v39 = v26;
                                v40 = v27;
                                if(s3 == null) {
                                    zzagn2 = zzagn3;
                                    v42 = v31;
                                    v22 = v32;
                                }
                                else {
                                    zzak zzak2 = new zzak();
                                    v22 = v32;
                                    zzak2.zzG(v22);
                                    zzak2.zzS(s3);
                                    zzak2.zzx(s4);
                                    zzak2.zzX(v43);
                                    zzak2.zzF(v44);
                                    zzak2.zzP(f);
                                    v42 = v31;
                                    zzak2.zzR(v42);
                                    zzak2.zzQ(arr_b1);
                                    zzak2.zzV(v53);
                                    zzak2.zzI(list0);
                                    zzak2.zzB(zzad1);
                                    if(v48 != -1) {
                                        zzak2.zzy(new zzs(v48, v50, v49, (byteBuffer0 == null ? null : byteBuffer0.array())));
                                    }
                                    else if(v50 != -1) {
                                        zzak2.zzy(new zzs(-1, v50, v49, (byteBuffer0 == null ? null : byteBuffer0.array())));
                                    }
                                    else if(v49 != -1) {
                                        zzak2.zzy(new zzs(-1, -1, v49, (byteBuffer0 == null ? null : byteBuffer0.array())));
                                    }
                                    else if(byteBuffer0 != null) {
                                        zzak2.zzy(new zzs(-1, -1, -1, (byteBuffer0 == null ? null : byteBuffer0.array())));
                                    }
                                    if(zzagl0 != null) {
                                        zzak2.zzv(zzfwl.zzc(zzagl0.zzc));
                                        zzak2.zzO(zzfwl.zzc(zzagl0.zzd));
                                    }
                                    zzagn2 = zzagn3;
                                    zzagn2.zzb = zzak2.zzY();
                                }
                                break;
                            }
                            case 0x664C6143: {
                                v29 = v23;
                                zzagq1 = zzagq0;
                                v30 = v4;
                            label_484:
                                pair1 = pair0;
                                v35 = v24;
                                s1 = s;
                                v34 = v17;
                                arrayList4 = arrayList3;
                                zzfb2 = zzfb1;
                                v33 = v30;
                                zzagh6 = zzagh1;
                                zzagr.zzo(zzfb1, v28, v26, v27, v22, s1, z1, zzad0, zzagn0, v25);
                                v41 = v25;
                                v39 = v26;
                                v40 = v27;
                                zzagn2 = zzagn0;
                                v42 = v29;
                                break;
                            }
                            case 0x6D657474: {
                                zzagr.zzp(zzfb1, 0x6D657474, v26, v22, zzagn0);
                            label_500:
                                v41 = v25;
                                v39 = v26;
                                zzagn2 = zzagn0;
                                s1 = s;
                                zzagq1 = zzagq0;
                                v33 = v4;
                                zzagh6 = zzagh1;
                                v40 = v27;
                                pair1 = pair0;
                                v34 = v17;
                                arrayList4 = arrayList3;
                                v35 = v24;
                                zzfb2 = zzfb1;
                                v42 = v23;
                                break;
                            }
                            case 0x2E6D7032: 
                            case 0x2E6D7033: 
                            case 0x4F707573: 
                            case 0x61632D33: 
                            case 0x61632D34: 
                            case 0x616C6163: 
                            case 0x616C6177: 
                            case 0x64747363: 
                            case 0x64747365: 
                            case 1685353320: 
                            case 0x6474736C: 
                            case 0x64747378: 
                            case 1700998451: 
                            case 1701733217: 
                            case 0x6C70636D: 
                            case 0x6D686131: 
                            case 1835560241: 
                            case 0x6D6C7061: 
                            case 0x6D703461: 
                            case 1935764850: 
                            case 0x73617762: 
                            case 0x736F7774: 
                            case 0x74776F73: 
                            case 1970037111: {
                                v29 = v23;
                                zzagq1 = zzagq0;
                                v30 = v4;
                                goto label_484;
                            }
                            case 1211250227: 
                            case 0x61763031: 
                            case 0x61766331: 
                            case 0x61766333: 
                            case 0x64766131: 
                            case 0x64766176: 
                            case 0x64766865: 
                            case 1701733238: 
                            case 0x68657631: 
                            case 1752589105: 
                            case 0x6D317620: 
                            case 1836070006: 
                            case 1932670515: 
                            case 0x76703038: 
                            case 0x76703039: {
                                zzagn1 = zzagn0;
                                s1 = s;
                                v31 = v23;
                                v32 = v22;
                                zzagq1 = zzagq0;
                                v33 = v4;
                                zzagh6 = zzagh1;
                                pair1 = pair0;
                                v34 = v17;
                                arrayList4 = arrayList3;
                                v35 = v24;
                                zzfb2 = zzfb1;
                                goto label_203;
                            }
                            case 1414810956: 
                            case 0x63363038: 
                            case 1937010800: 
                            case 1954034535: 
                            case 2004251764: {
                                zzfb1.zzG(v26 + 16);
                                if(v28 == 1414810956) {
                                    v36 = v23;
                                    zzagq1 = zzagq0;
                                    v37 = v4;
                                    s2 = "application/ttml+xml";
                                    v38 = 0x7FFFFFFFFFFFFFFFL;
                                    zzfud0 = null;
                                }
                                else if(v28 == 1954034535) {
                                    byte[] arr_b = new byte[v27 - 16];
                                    v36 = v23;
                                    zzfb1.zzC(arr_b, 0, v27 - 16);
                                    zzfud0 = zzfud.zzm(arr_b);
                                    zzagq1 = zzagq0;
                                    v37 = v4;
                                    s2 = "application/x-quicktime-tx3g";
                                    v38 = 0x7FFFFFFFFFFFFFFFL;
                                }
                                else {
                                    v36 = v23;
                                    if(v28 == 2004251764) {
                                        zzagq1 = zzagq0;
                                        v37 = v4;
                                        s2 = "application/x-mp4-vtt";
                                        v38 = 0x7FFFFFFFFFFFFFFFL;
                                        zzfud0 = null;
                                    }
                                    else {
                                        zzagq1 = zzagq0;
                                        if(v28 == 1937010800) {
                                            v37 = v4;
                                            s2 = "application/ttml+xml";
                                            zzfud0 = null;
                                            v38 = 0L;
                                        }
                                        else {
                                            zzagn0.zzd = 1;
                                            v37 = v4;
                                            s2 = "application/x-mp4-cea-608";
                                            v38 = 0x7FFFFFFFFFFFFFFFL;
                                            zzfud0 = null;
                                        }
                                    }
                                }
                                zzak zzak0 = new zzak();
                                zzak0.zzG(v22);
                                zzak0.zzS(s2);
                                zzak0.zzK(s);
                                zzak0.zzW(v38);
                                zzak0.zzI(zzfud0);
                                zzagn0.zzb = zzak0.zzY();
                                v39 = v26;
                                zzagn2 = zzagn0;
                                s1 = s;
                                zzagh6 = zzagh1;
                                v40 = v27;
                                pair1 = pair0;
                                v33 = v37;
                                v34 = v17;
                                arrayList4 = arrayList3;
                                v35 = v24;
                                v41 = v25;
                                zzfb2 = zzfb1;
                                v42 = v36;
                                break;
                            }
                            default: {
                                goto label_500;
                            }
                        }
                        zzfb2.zzG(v39 + v40);
                        zzagn0 = zzagn2;
                        v23 = v42;
                        v25 = v41 + 1;
                        zzfb1 = zzfb2;
                        v24 = v35;
                        zzagq0 = zzagq1;
                        v17 = v34;
                        v4 = v33;
                        pair0 = pair1;
                        s = s1;
                        arrayList3 = arrayList4;
                        zzagh1 = zzagh6;
                    }
                    v3 = v17;
                    arrayList2 = arrayList3;
                    zzagh3 = zzagh1;
                    zzagh zzagh7 = zzagh3.zza(1701082227);
                    if(zzagh7 == null) {
                        arr_v2 = null;
                        arr_v1 = null;
                    }
                    else {
                        Pair pair3 = zzagr.zzi(zzagh7);
                        if(pair3 != null) {
                            long[] arr_v = (long[])pair3.first;
                            arr_v1 = (long[])pair3.second;
                            arr_v2 = arr_v;
                        }
                    }
                    zzahg0 = zzagn0.zzb == null ? null : new zzahg(zzagq0.zza, v4, ((long)(((Long)pair0.first))), v21, v10, zzagn0.zzb, zzagn0.zzd, zzagn0.zza, zzagn0.zzc, arr_v2, arr_v1);
                }
                zzahg zzahg1 = (zzahg)zzfqw0.apply(zzahg0);
                if(zzahg1 == null) {
                label_964:
                    arrayList1 = arrayList2;
                }
                else {
                    zzagh zzagh8 = zzagh3.zza(0x6D646961);
                    zzagh8.getClass();
                    zzagh zzagh9 = zzagh8.zza(1835626086);
                    zzagh9.getClass();
                    zzagh zzagh10 = zzagh9.zza(1937007212);
                    zzagh10.getClass();
                    zzagi zzagi5 = zzagh10.zzb(1937011578);
                    if(zzagi5 == null) {
                        zzagi zzagi6 = zzagh10.zzb(1937013298);
                        if(zzagi6 == null) {
                            throw zzcd.zza("Track has no sample table size information", null);
                        }
                        zzago0 = new zzagp(zzagi6);
                    label_557:
                        int v77 = zzago0.zzb();
                        if(v77 == 0) {
                            zzahj0 = new zzahj(zzahg1, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        }
                        else {
                            zzagi zzagi7 = zzagh10.zzb(1937007471);
                            if(zzagi7 == null) {
                                zzagi zzagi8 = zzagh10.zzb(0x636F3634);
                                zzagi8.getClass();
                                zzagi9 = zzagi8;
                                z4 = true;
                            }
                            else {
                                zzagi9 = zzagi7;
                                z4 = false;
                            }
                            zzagi zzagi10 = zzagh10.zzb(1937011555);
                            zzagi10.getClass();
                            zzagi zzagi11 = zzagh10.zzb(1937011827);
                            zzagi11.getClass();
                            zzfb zzfb3 = zzagi11.zza;
                            zzagi zzagi12 = zzagh10.zzb(1937011571);
                            zzfb zzfb4 = zzagi12 == null ? null : zzagi12.zza;
                            zzagi zzagi13 = zzagh10.zzb(0x63747473);
                            zzfb zzfb5 = zzagi13 == null ? null : zzagi13.zza;
                            zzagk zzagk0 = new zzagk(zzagi10.zza, zzagi9.zza, z4);
                            zzfb3.zzG(12);
                            int v78 = zzfb3.zzo() - 1;
                            int v79 = zzfb3.zzo();
                            int v80 = zzfb3.zzo();
                            if(zzfb5 == null) {
                                v81 = 0;
                            }
                            else {
                                zzfb5.zzG(12);
                                v81 = zzfb5.zzo();
                            }
                            if(zzfb4 == null) {
                                v83 = -1;
                                v82 = 0;
                            }
                            else {
                                zzfb4.zzG(12);
                                v82 = zzfb4.zzo();
                                if(v82 > 0) {
                                    v83 = zzfb4.zzo() - 1;
                                }
                                else {
                                    v83 = -1;
                                    zzfb4 = null;
                                }
                            }
                            int v84 = zzago0.zza();
                            String s7 = zzahg1.zzf.zzm;
                            if(v84 != -1 && ("audio/raw".equals(s7) || "audio/g711-mlaw".equals(s7) || "audio/g711-alaw".equals(s7)) && v78 == 0) {
                                if(v81 != 0 || v82 != 0) {
                                    v78 = 0;
                                }
                                else {
                                    int v85 = zzagk0.zza;
                                    long[] arr_v3 = new long[v85];
                                    int[] arr_v4 = new int[v85];
                                    while(zzagk0.zza()) {
                                        int v86 = zzagk0.zzb;
                                        arr_v3[v86] = zzagk0.zzd;
                                        arr_v4[v86] = zzagk0.zzc;
                                    }
                                    long v87 = (long)v80;
                                    int v88 = 0x2000 / v84;
                                    int v90 = 0;
                                    for(int v89 = 0; v89 < v85; ++v89) {
                                        v90 += (arr_v4[v89] + v88 - 1) / v88;
                                    }
                                    long[] arr_v5 = new long[v90];
                                    int[] arr_v6 = new int[v90];
                                    long[] arr_v7 = new long[v90];
                                    int[] arr_v8 = new int[v90];
                                    int v91 = 0;
                                    int v92 = 0;
                                    int v93;
                                    for(v93 = 0; v92 < v85; v93 = v97) {
                                        int v95 = arr_v4[v92];
                                        long v96 = arr_v3[v92];
                                        int v97 = v93;
                                        int v98 = v95;
                                        for(int v94 = 0; v98 > 0; ++v94) {
                                            int v99 = Math.min(v88, v98);
                                            arr_v5[v94] = v96;
                                            int v100 = v84 * v99;
                                            arr_v6[v94] = v100;
                                            v97 = Math.max(v97, v100);
                                            arr_v7[v94] = ((long)v91) * v87;
                                            arr_v8[v94] = 1;
                                            v96 += (long)arr_v6[v94];
                                            v91 += v99;
                                            v98 -= v99;
                                        }
                                        ++v92;
                                    }
                                    v101 = v87 * ((long)v91);
                                    arr_v9 = arr_v5;
                                    arr_v10 = arr_v8;
                                    arr_v11 = arr_v6;
                                    arr_v12 = arr_v7;
                                    v102 = v93;
                                    goto label_826;
                                }
                            }
                            long[] arr_v13 = new long[v77];
                            int[] arr_v14 = new int[v77];
                            long[] arr_v15 = new long[v77];
                            arr_v10 = new int[v77];
                            int v103 = v80;
                            int v104 = v81;
                            int v105 = 0;
                            int v106 = 0;
                            int v107 = 0;
                            long v108 = 0L;
                            long v109 = 0L;
                            int v110 = v78;
                            int v111 = v79;
                            int v112 = v83;
                            int v113 = 0;
                            int v114 = 0;
                            while(true) {
                                if(v106 < v77) {
                                    long v115 = v108;
                                    boolean z5 = true;
                                    v116 = v105;
                                    while(v116 == 0) {
                                        z5 = zzagk0.zza();
                                        if(z5) {
                                            v116 = zzagk0.zzc;
                                            v115 = zzagk0.zzd;
                                            continue;
                                        }
                                        v117 = v77;
                                        v118 = v111;
                                        zzfb6 = zzfb3;
                                        v119 = 0;
                                        goto label_692;
                                    }
                                    v117 = v77;
                                    v118 = v111;
                                    zzfb6 = zzfb3;
                                    v119 = v116;
                                label_692:
                                    if(z5) {
                                        if(zzfb5 != null) {
                                            while(v114 == 0) {
                                                v114 = 0;
                                                if(v104 > 0) {
                                                    --v104;
                                                    v114 = zzfb5.zzo();
                                                    v107 = zzfb5.zzf();
                                                }
                                                else if(true) {
                                                    break;
                                                }
                                            }
                                            --v114;
                                        }
                                        arr_v13[v106] = v115;
                                        int v120 = zzago0.zzc();
                                        arr_v14[v106] = v120;
                                        if(v120 > v113) {
                                            zzagk1 = zzagk0;
                                            v113 = v120;
                                            zzfb8 = zzfb5;
                                        }
                                        else {
                                            zzfb8 = zzfb5;
                                            zzagk1 = zzagk0;
                                        }
                                        arr_v15[v106] = v109 + ((long)v107);
                                        arr_v10[v106] = zzfb4 == null ? 1 : 0;
                                        if(v106 == v112) {
                                            arr_v10[v106] = 1;
                                            --v82;
                                            if(v82 > 0) {
                                                zzfb4.getClass();
                                                v112 = zzfb4.zzo() - 1;
                                            }
                                        }
                                        v109 += (long)v103;
                                        int v121 = v118 - 1;
                                        if(v121 == 0) {
                                            if(v110 > 0) {
                                                --v110;
                                                v121 = zzfb6.zzo();
                                                v103 = zzfb6.zzf();
                                            }
                                            else {
                                                v121 = 0;
                                            }
                                        }
                                        long v122 = v115 + ((long)arr_v14[v106]);
                                        ++v106;
                                        v105 = v119 - 1;
                                        zzfb5 = zzfb8;
                                        zzfb3 = zzfb6;
                                        v77 = v117;
                                        v111 = v121;
                                        zzagk0 = zzagk1;
                                        v108 = v122;
                                        continue;
                                    }
                                    else {
                                        zzes.zzf("AtomParsers", "Unexpected end of chunk data");
                                        arr_v13 = Arrays.copyOf(arr_v13, v106);
                                        arr_v14 = Arrays.copyOf(arr_v14, v106);
                                        arr_v15 = Arrays.copyOf(arr_v15, v106);
                                        arr_v10 = Arrays.copyOf(arr_v10, v106);
                                        zzfb7 = zzfb5;
                                        v77 = v106;
                                        break;
                                    }
                                }
                                zzfb7 = zzfb5;
                                v118 = v111;
                                v116 = v105;
                                break;
                            }
                            int v123 = 1;
                            if(zzfb7 != null) {
                                while(v104 > 0) {
                                    if(zzfb7.zzo() != 0) {
                                        v123 = 0;
                                        break;
                                    }
                                    zzfb7.zzf();
                                    --v104;
                                }
                            }
                            if(v82 == 0) {
                                if(v118 == 0) {
                                    if(v116 == 0) {
                                        if(v110 == 0) {
                                            if(v114 == 0) {
                                                if(v123 == 0) {
                                                    arr_v16 = arr_v13;
                                                    v124 = 0;
                                                    v125 = 0;
                                                    v126 = 0;
                                                    v127 = 0;
                                                    v128 = 0;
                                                    v129 = 0;
                                                    goto label_818;
                                                }
                                                else {
                                                    arr_v16 = arr_v13;
                                                    arr_v17 = arr_v14;
                                                    arr_v18 = arr_v15;
                                                    goto label_821;
                                                }
                                                goto label_779;
                                            }
                                            else {
                                            label_779:
                                                arr_v16 = arr_v13;
                                                v129 = v123;
                                                v128 = v114;
                                                v124 = 0;
                                                v125 = 0;
                                                v126 = 0;
                                                v127 = 0;
                                                goto label_818;
                                            }
                                            goto label_787;
                                        }
                                        else {
                                        label_787:
                                            arr_v16 = arr_v13;
                                            v129 = v123;
                                            v127 = v110;
                                            v128 = v114;
                                            v124 = 0;
                                            v125 = 0;
                                            v126 = 0;
                                            goto label_818;
                                        }
                                        goto label_795;
                                    }
                                    else {
                                    label_795:
                                        arr_v16 = arr_v13;
                                        v129 = v123;
                                        v127 = v110;
                                        v128 = v114;
                                        v126 = v116;
                                        v124 = 0;
                                        v125 = 0;
                                        goto label_818;
                                    }
                                    goto label_803;
                                }
                                else {
                                label_803:
                                    arr_v16 = arr_v13;
                                    v129 = v123;
                                    v127 = v110;
                                    v128 = v114;
                                    v126 = v116;
                                    v125 = v118;
                                    v124 = 0;
                                    goto label_818;
                                }
                                goto label_811;
                            }
                            else {
                            label_811:
                                arr_v16 = arr_v13;
                                v129 = v123;
                                v127 = v110;
                                v124 = v82;
                                v128 = v114;
                                v126 = v116;
                                v125 = v118;
                            }
                        label_818:
                            arr_v17 = arr_v14;
                            arr_v18 = arr_v15;
                            zzes.zzf("AtomParsers", "Inconsistent stbl box for track " + zzahg1.zza + ": remainingSynchronizationSamples " + v124 + ", remainingSamplesAtTimestampDelta " + v125 + ", remainingSamplesInChunk " + v126 + ", remainingTimestampDeltaChanges " + v127 + ", remainingSamplesAtTimestampOffset " + v128 + (1 == v129 ? "" : ", ctts invalid"));
                        label_821:
                            arr_v9 = arr_v16;
                            v101 = v109 + ((long)v107);
                            v102 = v113;
                            arr_v11 = arr_v17;
                            arr_v12 = arr_v18;
                        label_826:
                            long v130 = zzfk.zzq(v101, 1000000L, zzahg1.zzc);
                            long[] arr_v19 = zzahg1.zzh;
                            if(arr_v19 == null) {
                                zzfk.zzC(arr_v12, 1000000L, zzahg1.zzc);
                                zzahj0 = new zzahj(zzahg1, arr_v9, arr_v11, v102, arr_v12, arr_v10, v130);
                            }
                            else {
                                if(arr_v19.length != 1 || zzahg1.zzb != 1 || arr_v12.length < 2) {
                                    arr_v20 = arr_v10;
                                }
                                else {
                                    zzahg1.zzi.getClass();
                                    long v131 = zzahg1.zzi[0];
                                    long v132 = v131 + zzfk.zzq(arr_v19[0], zzahg1.zzc, zzahg1.zzd);
                                    arr_v20 = arr_v10;
                                    if(zzagr.zzq(arr_v12, v101, v131, v132)) {
                                        long v133 = zzfk.zzq(v131 - arr_v12[0], zzahg1.zzf.zzA, zzahg1.zzc);
                                        long v134 = zzfk.zzq(v101 - v132, zzahg1.zzf.zzA, zzahg1.zzc);
                                        if(v133 != 0L) {
                                            v135 = v133;
                                        label_845:
                                            if(v135 <= 0x7FFFFFFFL && v134 <= 0x7FFFFFFFL) {
                                                zzabq0.zza = (int)v135;
                                                zzabq0.zzb = (int)v134;
                                                zzfk.zzC(arr_v12, 1000000L, zzahg1.zzc);
                                                zzahj0 = new zzahj(zzahg1, arr_v9, arr_v11, v102, arr_v12, arr_v20, zzfk.zzq(zzahg1.zzh[0], 1000000L, zzahg1.zzd));
                                                arrayList1 = arrayList2;
                                                arrayList1.add(zzahj0);
                                                goto label_965;
                                            }
                                        }
                                        else if(v134 != 0L) {
                                            v135 = 0L;
                                            goto label_845;
                                        }
                                    }
                                }
                                long[] arr_v21 = zzahg1.zzh;
                                int v136 = arr_v21.length;
                                if(v136 == 1) {
                                    if(arr_v21[0] == 0L) {
                                        zzahg1.zzi.getClass();
                                        long v137 = zzahg1.zzi[0];
                                        for(int v138 = 0; v138 < arr_v12.length; ++v138) {
                                            arr_v12[v138] = zzfk.zzq(arr_v12[v138] - v137, 1000000L, zzahg1.zzc);
                                        }
                                        zzahj0 = new zzahj(zzahg1, arr_v9, arr_v11, v102, arr_v12, arr_v20, zzfk.zzq(v101 - v137, 1000000L, zzahg1.zzc));
                                        arrayList1 = arrayList2;
                                        arrayList1.add(zzahj0);
                                        goto label_965;
                                    }
                                    else {
                                        v136 = 1;
                                    }
                                }
                                boolean z6 = zzahg1.zzb == 1;
                                int[] arr_v22 = new int[v136];
                                int[] arr_v23 = new int[v136];
                                long[] arr_v24 = zzahg1.zzi;
                                arr_v24.getClass();
                                int v139 = 0;
                                int v140 = 0;
                                int v141 = 0;
                                int v142 = 0;
                                while(true) {
                                    long[] arr_v25 = zzahg1.zzh;
                                    if(v139 >= arr_v25.length) {
                                        break;
                                    }
                                    long v143 = arr_v24[v139];
                                    if(v143 == -1L) {
                                        arr_v27 = arr_v24;
                                        v144 = v77;
                                        arr_v26 = arr_v9;
                                    }
                                    else {
                                        arr_v26 = arr_v9;
                                        arr_v27 = arr_v24;
                                        v144 = v77;
                                        long v145 = zzfk.zzq(arr_v25[v139], zzahg1.zzc, zzahg1.zzd);
                                        arr_v22[v139] = zzfk.zzc(arr_v12, v143, true, true);
                                        arr_v23[v139] = zzfk.zza(arr_v12, v143 + v145, z6, false);
                                        while(true) {
                                            v146 = arr_v22[v139];
                                            v147 = arr_v23[v139];
                                            if(v146 >= v147 || (arr_v20[v146] & 1) != 0) {
                                                break;
                                            }
                                            arr_v22[v139] = v146 + 1;
                                        }
                                        v140 += v147 - v146;
                                        v141 |= (v142 == v146 ? 0 : 1);
                                        v142 = v147;
                                    }
                                    ++v139;
                                    arr_v9 = arr_v26;
                                    v77 = v144;
                                    arr_v24 = arr_v27;
                                }
                                long[] arr_v28 = arr_v9;
                                int[] arr_v29 = arr_v11;
                                int v148 = v141 | (v140 == v77 ? 0 : 1);
                                long[] arr_v30 = v148 == 0 ? arr_v28 : new long[v140];
                                int[] arr_v31 = v148 == 0 ? arr_v29 : new int[v140];
                                if(1 == v148) {
                                    v102 = 0;
                                }
                                int[] arr_v32 = v148 == 0 ? arr_v20 : new int[v140];
                                long[] arr_v33 = new long[v140];
                                int v149 = 0;
                                int v150 = 0;
                                long v151 = 0L;
                                while(v149 < zzahg1.zzh.length) {
                                    long v152 = zzahg1.zzi[v149];
                                    int v153 = arr_v22[v149];
                                    int v154 = arr_v23[v149];
                                    if(v148 == 0) {
                                        arr_v37 = arr_v20;
                                        arr_v34 = arr_v22;
                                        arr_v35 = arr_v23;
                                        arr_v36 = arr_v29;
                                    }
                                    else {
                                        arr_v34 = arr_v22;
                                        int v155 = v154 - v153;
                                        arr_v35 = arr_v23;
                                        System.arraycopy(arr_v28, v153, arr_v30, v150, v155);
                                        arr_v36 = arr_v29;
                                        System.arraycopy(arr_v36, v153, arr_v31, v150, v155);
                                        arr_v37 = arr_v20;
                                        System.arraycopy(arr_v37, v153, arr_v32, v150, v155);
                                    }
                                    int v156 = v102;
                                    while(v153 < v154) {
                                        long v157 = zzfk.zzq(v151, 1000000L, zzahg1.zzd);
                                        long v158 = zzfk.zzq(arr_v12[v153] - v152, 1000000L, zzahg1.zzc);
                                        if(zzagr.zzr(zzahg1.zzb)) {
                                            v159 = v149;
                                            arr_v38 = arr_v37;
                                            v158 = Math.max(0L, v158);
                                        }
                                        else {
                                            v159 = v149;
                                            arr_v38 = arr_v37;
                                        }
                                        arr_v33[v150] = v157 + v158;
                                        if(v148 != 0 && arr_v31[v150] > v156) {
                                            v156 = arr_v36[v153];
                                        }
                                        ++v150;
                                        ++v153;
                                        v149 = v159;
                                        arr_v37 = arr_v38;
                                    }
                                    v151 += zzahg1.zzh[v149];
                                    v102 = v156;
                                    ++v149;
                                    arr_v22 = arr_v34;
                                    arr_v20 = arr_v37;
                                    arr_v29 = arr_v36;
                                    arr_v23 = arr_v35;
                                }
                                zzahj0 = new zzahj(zzahg1, arr_v30, arr_v31, v102, arr_v33, arr_v32, zzfk.zzq(v151, 1000000L, zzahg1.zzd));
                            }
                        }
                        arrayList1 = arrayList2;
                        arrayList1.add(zzahj0);
                        goto label_965;
                    }
                    else {
                        zzago0 = new zzago(zzagi5, zzahg1.zzf);
                        goto label_557;
                    }
                    goto label_964;
                }
            }
            else {
                v3 = v2;
                arrayList1 = arrayList0;
            }
        label_965:
            v2 = v3 + 1;
            arrayList0 = arrayList1;
            v1 = 8;
        }
        return arrayList0;
    }

    public static void zze(zzfb zzfb0) {
        int v = zzfb0.zzc();
        zzfb0.zzH(4);
        if(zzfb0.zzf() != 0x68646C72) {
            v += 4;
        }
        zzfb0.zzG(v);
    }

    private static int zzf(int v) {
        switch(v) {
            case 0x6D657461: {
                return 5;
            }
            case 0x736F756E: {
                return 1;
            }
            case 0x636C6370: 
            case 0x7362746C: 
            case 1937072756: 
            case 1952807028: {
                return 3;
            }
            case 0x76696465: {
                return 2;
            }
            default: {
                return -1;
            }
        }
    }

    private static int zzg(zzfb zzfb0) {
        int v = zzfb0.zzl();
        int v1;
        for(v1 = v & 0x7F; (v & 0x80) == 0x80; v1 = v1 << 7 | v & 0x7F) {
            v = zzfb0.zzl();
        }
        return v1;
    }

    private static int zzh(zzfb zzfb0) {
        zzfb0.zzG(16);
        return zzfb0.zzf();
    }

    private static Pair zzi(zzagh zzagh0) {
        zzagi zzagi0 = zzagh0.zzb(1701606260);
        if(zzagi0 == null) {
            return null;
        }
        zzfb zzfb0 = zzagi0.zza;
        zzfb0.zzG(8);
        int v = zzagj.zze(zzfb0.zzf());
        int v1 = zzfb0.zzo();
        long[] arr_v = new long[v1];
        long[] arr_v1 = new long[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_v[v2] = v == 1 ? zzfb0.zzu() : zzfb0.zzt();
            arr_v1[v2] = v == 1 ? zzfb0.zzs() : ((long)zzfb0.zzf());
            if(zzfb0.zzz() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzfb0.zzH(2);
        }
        return Pair.create(arr_v, arr_v1);
    }

    private static Pair zzj(zzfb zzfb0) {
        int v = 8;
        zzfb0.zzG(8);
        int v1 = zzagj.zze(zzfb0.zzf());
        zzfb0.zzH((v1 == 0 ? 8 : 16));
        long v2 = zzfb0.zzt();
        if(v1 == 0) {
            v = 4;
        }
        zzfb0.zzH(v);
        int v3 = zzfb0.zzp();
        return Pair.create(v2, ((char)((v3 >> 10 & 0x1F) + 0x60)) + ((char)((v3 >> 5 & 0x1F) + 0x60)) + ((char)((v3 & 0x1F) + 0x60)));
    }

    private static Pair zzk(zzfb zzfb0, int v, int v1) {
        Pair pair0;
        zzahh zzahh0;
        Integer integer1;
        byte[] arr_b2;
        int v13;
        int v12;
        int v2 = zzfb0.zzc();
        while(v2 - v < v1) {
            zzfb0.zzG(v2);
            int v3 = zzfb0.zzf();
            boolean z = true;
            zzabf.zzb(v3 > 0, "childAtomSize must be positive");
            if(zzfb0.zzf() == 0x73696E66) {
                int v4 = v2 + 8;
                int v5 = 0;
                int v6 = -1;
                String s = null;
                Integer integer0 = null;
                while(v4 - v2 < v3) {
                    zzfb0.zzG(v4);
                    int v7 = zzfb0.zzf();
                    int v8 = zzfb0.zzf();
                    if(v8 == 0x66726D61) {
                        integer0 = zzfb0.zzf();
                    }
                    else {
                        switch(v8) {
                            case 0x73636869: {
                                v6 = v4;
                                v5 = v7;
                                break;
                            }
                            case 0x7363686D: {
                                zzfb0.zzH(4);
                                s = zzfb0.zzy(4, zzfqu.zzc);
                            }
                        }
                    }
                    v4 += v7;
                }
                if("cenc".equals(s) || "cbc1".equals(s) || "cens".equals(s) || "cbcs".equals(s)) {
                    zzabf.zzb(integer0 != null, "frma atom is mandatory");
                    zzabf.zzb(v6 != -1, "schi atom is mandatory");
                    int v9 = v6 + 8;
                    while(true) {
                        if(v9 - v6 < v5) {
                            zzfb0.zzG(v9);
                            int v10 = zzfb0.zzf();
                            if(zzfb0.zzf() == 1952804451) {
                                int v11 = zzagj.zze(zzfb0.zzf());
                                zzfb0.zzH(1);
                                if(v11 == 0) {
                                    zzfb0.zzH(1);
                                    v12 = 0;
                                    v13 = 0;
                                }
                                else {
                                    int v14 = zzfb0.zzl();
                                    v12 = v14 & 15;
                                    v13 = (v14 & 0xF0) >> 4;
                                }
                                boolean z1 = zzfb0.zzl() == 1;
                                int v15 = zzfb0.zzl();
                                byte[] arr_b = new byte[16];
                                zzfb0.zzC(arr_b, 0, 16);
                                if(!z1 || v15 != 0) {
                                    arr_b2 = null;
                                }
                                else {
                                    int v16 = zzfb0.zzl();
                                    byte[] arr_b1 = new byte[v16];
                                    zzfb0.zzC(arr_b1, 0, v16);
                                    arr_b2 = arr_b1;
                                }
                                integer1 = integer0;
                                zzahh0 = new zzahh(z1, s, v15, arr_b, v13, v12, arr_b2);
                                break;
                            }
                            else {
                                v9 += v10;
                                continue;
                            }
                        }
                        integer1 = integer0;
                        zzahh0 = null;
                        break;
                    }
                    if(zzahh0 == null) {
                        z = false;
                    }
                    zzabf.zzb(z, "tenc atom is mandatory");
                    pair0 = Pair.create(integer1, zzahh0);
                }
                else {
                    pair0 = null;
                }
                if(pair0 != null) {
                    return pair0;
                }
            }
            v2 += v3;
        }
        return null;
    }

    private static zzbz zzl(zzfb zzfb0) {
        int v = zzfb0.zzz();
        zzfb0.zzH(2);
        String s = zzfb0.zzy(v, zzfqu.zzc);
        int v1 = Math.max(s.lastIndexOf(43), s.lastIndexOf(45));
        try {
            return new zzbz(0x8000000000000001L, new zzby[]{new zzfr(Float.parseFloat(s.substring(0, v1)), Float.parseFloat(s.substring(v1, s.length() - 1)))});
        }
        catch(IndexOutOfBoundsException | NumberFormatException unused_ex) {
            return null;
        }
    }

    private static zzagl zzm(zzfb zzfb0, int v) {
        zzfb0.zzG(v + 12);
        zzfb0.zzH(1);
        zzagr.zzg(zzfb0);
        zzfb0.zzH(2);
        int v1 = zzfb0.zzl();
        if((v1 & 0x80) != 0) {
            zzfb0.zzH(2);
        }
        if((v1 & 0x40) != 0) {
            zzfb0.zzH(zzfb0.zzl());
        }
        if((v1 & 0x20) != 0) {
            zzfb0.zzH(2);
        }
        zzfb0.zzH(1);
        zzagr.zzg(zzfb0);
        String s = zzcc.zzd(zzfb0.zzl());
        if(!"audio/mpeg".equals(s) && !"audio/vnd.dts".equals(s) && !"audio/vnd.dts.hd".equals(s)) {
            zzfb0.zzH(4);
            long v2 = zzfb0.zzt();
            long v3 = zzfb0.zzt();
            zzfb0.zzH(1);
            int v4 = zzagr.zzg(zzfb0);
            byte[] arr_b = new byte[v4];
            zzfb0.zzC(arr_b, 0, v4);
            long v5 = Long.compare(v3, 0L) > 0 ? v3 : -1L;
            return v2 <= 0L ? new zzagl(s, arr_b, v5, -1L) : new zzagl(s, arr_b, v5, v2);
        }
        return new zzagl(s, null, -1L, -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzo(zzfb zzfb0, int v, int v1, int v2, int v3, String s, boolean z, zzad zzad0, zzagn zzagn0, int v4) {
        boolean z2;
        String s3;
        int v20;
        boolean z1;
        int v19;
        String s1;
        int v11;
        int v10;
        int v7;
        int v6;
        int v5;
        zzfb0.zzG(v1 + 16);
        if(z) {
            v5 = zzfb0.zzp();
            zzfb0.zzH(6);
        }
        else {
            zzfb0.zzH(8);
            v5 = 0;
        }
        if(v5 == 0 || v5 == 1) {
            int v12 = zzfb0.zzp();
            zzfb0.zzH(6);
            v6 = zzfb0.zzm();
            zzfb0.zzG(zzfb0.zzc() - 4);
            v11 = zzfb0.zzf();
            if(v5 == 1) {
                zzfb0.zzH(16);
            }
            v7 = v12;
            v10 = -1;
        }
        else {
            if(v5 == 2) {
                zzfb0.zzH(16);
                v6 = (int)Math.round(Double.longBitsToDouble(zzfb0.zzs()));
                v7 = zzfb0.zzo();
                zzfb0.zzH(4);
                int v8 = zzfb0.zzo();
                int v9 = zzfb0.zzo();
                if((v9 & 1) != 0) {
                    v10 = v8 == 0x20 ? 4 : -1;
                }
                else if(v8 == 8) {
                    v10 = 3;
                }
                else if(v8 != 16) {
                    switch(v8) {
                        case 24: {
                            v10 = (v9 & 2) == 0 ? 0x20000000 : 0x50000000;
                            break;
                        }
                        case 0x20: {
                            v10 = (v9 & 2) == 0 ? 0x30000000 : 0x60000000;
                            break;
                        }
                        default: {
                            v10 = -1;
                        }
                    }
                }
                else if((v9 & 2) != 0) {
                    v10 = 0x10000000;
                }
                else {
                    v10 = 2;
                }
                zzfb0.zzH(8);
                v11 = 0;
                goto label_49;
            }
            return;
        }
    label_49:
        int v13 = zzfb0.zzc();
        int v14 = 1701733217;
        int v15 = v;
        if(v15 == 1701733217) {
            Pair pair0 = zzagr.zzk(zzfb0, v1, v2);
            if(pair0 != null) {
                v14 = (int)(((Integer)pair0.first));
                zzad0 = zzad0 == null ? null : zzad0.zzb(((zzahh)pair0.second).zzb);
                zzagn0.zza[v4] = (zzahh)pair0.second;
            }
            zzfb0.zzG(v13);
            v15 = v14;
        }
        switch(v15) {
            case 0x2E6D7032: 
            case 0x2E6D7033: {
                s1 = "audio/mpeg";
                break;
            }
            case 0x4F707573: {
                s1 = "audio/opus";
                break;
            }
            case 0x61632D33: {
                s1 = "audio/ac3";
                break;
            }
            case 0x61632D34: {
                s1 = "audio/ac4";
                break;
            }
            case 0x616C6163: {
                s1 = "audio/alac";
                break;
            }
            case 0x616C6177: {
                s1 = "audio/g711-alaw";
                break;
            }
            case 0x64747363: {
                s1 = "audio/vnd.dts";
                break;
            }
            case 0x64747365: {
                s1 = "audio/vnd.dts.hd;profile=lbr";
                break;
            }
            case 1685353320: 
            case 0x6474736C: {
                s1 = "audio/vnd.dts.hd";
                break;
            }
            case 0x64747378: {
                s1 = "audio/vnd.dts.uhd;profile=p2";
                break;
            }
            case 1700998451: {
                s1 = "audio/eac3";
                break;
            }
            case 0x664C6143: {
                s1 = "audio/flac";
                break;
            }
            case 0x6C70636D: {
                if(v10 == -1) {
                    s1 = "audio/raw";
                    v10 = 2;
                }
                else {
                    s1 = "audio/raw";
                }
                break;
            }
            case 0x6D686131: {
                s1 = "audio/mha1";
                break;
            }
            case 1835560241: {
                s1 = "audio/mhm1";
                break;
            }
            case 0x6D6C7061: {
                s1 = "audio/true-hd";
                break;
            }
            case 1935764850: {
                s1 = "audio/3gpp";
                break;
            }
            case 0x73617762: {
                s1 = "audio/amr-wb";
                break;
            }
            case 0x736F7774: {
                s1 = "audio/raw";
                v10 = 2;
                break;
            }
            case 0x74776F73: {
                s1 = "audio/raw";
                v10 = 0x10000000;
                break;
            }
            case 1970037111: {
                s1 = "audio/g711-mlaw";
                break;
            }
            default: {
                s1 = null;
            }
        }
        String s2 = null;
        zzagl zzagl0 = null;
        List list0 = null;
        while(v13 - v1 < v2) {
            zzfb0.zzG(v13);
            int v16 = zzfb0.zzf();
            zzabf.zzb(v16 > 0, "childAtomSize must be positive");
            int v17 = zzfb0.zzf();
            if(v17 == 0x6D686143) {
                byte[] arr_b = new byte[v16 - 13];
                zzfb0.zzG(v13 + 13);
                zzfb0.zzC(arr_b, 0, v16 - 13);
                list0 = zzfud.zzm(arr_b);
            }
            else {
                if(v17 == 1702061171) {
                label_220:
                    s3 = s2;
                    v20 = v13;
                }
                else {
                    if(!z || v17 != 2002876005) {
                        s3 = s2;
                        switch(v17) {
                            case 0x616C6163: {
                                byte[] arr_b3 = new byte[v16 - 12];
                                zzfb0.zzG(v13 + 12);
                                zzfb0.zzC(arr_b3, 0, v16 - 12);
                                zzfb zzfb1 = new zzfb(arr_b3);
                                zzfb1.zzG(9);
                                int v23 = zzfb1.zzl();
                                zzfb1.zzG(20);
                                Pair pair1 = Pair.create(zzfb1.zzo(), v23);
                                int v24 = (int)(((Integer)pair1.first));
                                int v25 = (int)(((Integer)pair1.second));
                                list0 = zzfud.zzm(arr_b3);
                                s2 = s3;
                                v7 = v25;
                                v6 = v24;
                                goto label_264;
                            }
                            case 0x644F7073: {
                                byte[] arr_b1 = Arrays.copyOf(zzagr.zza, zzagr.zza.length + (v16 - 8));
                                zzfb0.zzG(v13 + 8);
                                zzfb0.zzC(arr_b1, zzagr.zza.length, v16 - 8);
                                list0 = zzabw.zzd(arr_b1);
                                s2 = s3;
                                goto label_264;
                            }
                            case 1684103987: {
                                zzfb0.zzG(v13 + 8);
                                zzagn0.zzb = zzaac.zzc(zzfb0, Integer.toString(v3), s, zzad0);
                                goto label_263;
                            }
                            case 1684103988: {
                                zzfb0.zzG(v13 + 8);
                                zzfb0.zzH(1);
                                int v22 = zzfb0.zzl();
                                zzak zzak0 = new zzak();
                                zzak0.zzH(Integer.toString(v3));
                                zzak0.zzS("audio/ac4");
                                zzak0.zzw(2);
                                zzak0.zzT((1 == (v22 & 0x20) >> 5 ? 48000 : 44100));
                                zzak0.zzB(zzad0);
                                zzak0.zzK(s);
                                zzagn0.zzb = zzak0.zzY();
                                goto label_263;
                            }
                            case 0x64656333: {
                                zzfb0.zzG(v13 + 8);
                                zzagn0.zzb = zzaac.zzd(zzfb0, Integer.toString(v3), s, zzad0);
                                goto label_263;
                            }
                            case 0x64664C61: {
                                byte[] arr_b2 = new byte[v16 - 8];
                                arr_b2[0] = 102;
                                arr_b2[1] = 76;
                                arr_b2[2] = 97;
                                arr_b2[3] = 67;
                                zzfb0.zzG(v13 + 12);
                                zzfb0.zzC(arr_b2, 4, v16 - 12);
                                list0 = zzfud.zzm(arr_b2);
                                s2 = s3;
                                goto label_264;
                            }
                            case 0x646D6C70: {
                                if(v11 <= 0) {
                                    throw zzcd.zza(("Invalid sample rate for Dolby TrueHD MLP stream: " + v11), null);
                                }
                                s2 = s3;
                                v6 = v11;
                                v7 = 2;
                                goto label_264;
                            }
                            case 1684305011: 
                            case 0x75647473: {
                                zzak zzak1 = new zzak();
                                zzak1.zzG(v3);
                                zzak1.zzS(s1);
                                zzak1.zzw(v7);
                                zzak1.zzT(v6);
                                zzak1.zzB(zzad0);
                                zzak1.zzK(s);
                                zzagn0.zzb = zzak1.zzY();
                                goto label_263;
                            }
                            default: {
                                goto label_263;
                            }
                        }
                    }
                    else {
                        int v18 = zzfb0.zzc();
                        if(v18 >= v13) {
                            v19 = v18;
                            z1 = true;
                        }
                        else {
                            v19 = v18;
                            z1 = false;
                        }
                        zzabf.zzb(z1, null);
                        v20 = v19;
                        while(v20 - v13 < v16) {
                            zzfb0.zzG(v20);
                            int v21 = zzfb0.zzf();
                            if(v21 > 0) {
                                s3 = s2;
                                z2 = true;
                            }
                            else {
                                s3 = s2;
                                z2 = false;
                            }
                            zzabf.zzb(z2, "childAtomSize must be positive");
                            if(zzfb0.zzf() == 1702061171) {
                                goto label_222;
                            }
                            v20 += v21;
                            s2 = s3;
                        }
                        s3 = s2;
                        v20 = -1;
                        goto label_222;
                    }
                    goto label_220;
                }
            label_222:
                if(v20 != -1) {
                    zzagl0 = zzagr.zzm(zzfb0, v20);
                    String s4 = zzagl0.zza;
                    byte[] arr_b4 = zzagl0.zzb;
                    if(arr_b4 == null) {
                        s2 = s3;
                    }
                    else if("audio/vorbis".equals(s4)) {
                        zzfb zzfb2 = new zzfb(arr_b4);
                        zzfb2.zzH(1);
                        int v26;
                        for(v26 = 0; zzfb2.zza() > 0 && zzfb2.zze() == 0xFF; v26 += 0xFF) {
                            zzfb2.zzH(1);
                        }
                        int v27 = v26 + zzfb2.zzl();
                        int v28;
                        for(v28 = 0; zzfb2.zza() > 0 && zzfb2.zze() == 0xFF; v28 += 0xFF) {
                            zzfb2.zzH(1);
                        }
                        int v29 = zzfb2.zzl();
                        byte[] arr_b5 = new byte[v27];
                        int v30 = zzfb2.zzc();
                        System.arraycopy(arr_b4, v30, arr_b5, 0, v27);
                        int v31 = v30 + v27 + (v28 + v29);
                        int v32 = arr_b4.length - v31;
                        byte[] arr_b6 = new byte[v32];
                        System.arraycopy(arr_b4, v31, arr_b6, 0, v32);
                        list0 = zzfud.zzn(arr_b5, arr_b6);
                        s2 = s3;
                        s1 = s4;
                        goto label_264;
                    }
                    else {
                        if("audio/mp4a-latm".equals(s4)) {
                            zzzy zzzy0 = zzzz.zza(arr_b4);
                            v6 = zzzy0.zza;
                            v7 = zzzy0.zzb;
                            s2 = zzzy0.zzc;
                        }
                        else {
                            s2 = s3;
                        }
                        list0 = zzfud.zzm(arr_b4);
                    }
                    s1 = s4;
                    goto label_264;
                }
            label_263:
                s2 = s3;
            }
        label_264:
            v13 += v16;
        }
        if(zzagn0.zzb == null && s1 != null) {
            zzak zzak2 = new zzak();
            zzak2.zzG(v3);
            zzak2.zzS(s1);
            zzak2.zzx(s2);
            zzak2.zzw(v7);
            zzak2.zzT(v6);
            zzak2.zzN(v10);
            zzak2.zzI(list0);
            zzak2.zzB(zzad0);
            zzak2.zzK(s);
            if(zzagl0 != null) {
                zzak2.zzv(zzfwl.zzc(zzagl0.zzc));
                zzak2.zzO(zzfwl.zzc(zzagl0.zzd));
            }
            zzagn0.zzb = zzak2.zzY();
        }
    }

    private static void zzp(zzfb zzfb0, int v, int v1, int v2, zzagn zzagn0) {
        zzfb0.zzG(v1 + 16);
        zzfb0.zzw('\u0000');
        String s = zzfb0.zzw('\u0000');
        if(s != null) {
            zzak zzak0 = new zzak();
            zzak0.zzG(v2);
            zzak0.zzS(s);
            zzagn0.zzb = zzak0.zzY();
        }
    }

    private static boolean zzq(long[] arr_v, long v, long v1, long v2) {
        return arr_v[0] <= v1 && v1 < arr_v[Math.max(0, Math.min(4, arr_v.length - 1))] && arr_v[Math.max(0, Math.min(arr_v.length - 4, arr_v.length - 1))] < v2 && v2 <= v;
    }

    private static boolean zzr(int v) {
        return v != 1;
    }

    private static byte[] zzs(zzfb zzfb0, int v, int v1) {
        for(int v2 = v + 8; v2 - v < v1; v2 += v3) {
            zzfb0.zzG(v2);
            int v3 = zzfb0.zzf();
            if(zzfb0.zzf() == 0x70726F6A) {
                return Arrays.copyOfRange(zzfb0.zzI(), v2, v3 + v2);
            }
        }
        return null;
    }
}


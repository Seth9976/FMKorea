package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzaac {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        zzaac.zzb = new int[]{1, 2, 3, 6};
        zzaac.zzc = new int[]{48000, 44100, 32000};
        zzaac.zzd = new int[]{24000, 22050, 16000};
        zzaac.zze = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        zzaac.zzf = new int[]{0x20, 40, 0x30, 56, 0x40, 80, 0x60, 0x70, 0x80, 0xA0, 0xC0, 0xE0, 0x100, 320, 0x180, 0x1C0, 0x200, 0x240, 640};
        zzaac.zzg = new int[]{69, 87, 104, 0x79, 0x8B, 0xAE, 0xD0, 0xF3, 278, 348, 417, 487, 557, 696, 835, 0x3CF, 0x45A, 0x4E5, 0x571};
    }

    public static int zza(ByteBuffer byteBuffer0) {
        int v = 3;
        if((byteBuffer0.get(byteBuffer0.position() + 5) & 0xF8) >> 3 > 10) {
            if((byteBuffer0.get(byteBuffer0.position() + 4) & 0xC0) >> 6 != 3) {
                v = (byteBuffer0.get(byteBuffer0.position() + 4) & 0x30) >> 4;
            }
            return zzaac.zzb[v] * 0x100;
        }
        return 0x600;
    }

    public static int zzb(byte[] arr_b) {
        if(arr_b.length < 6) {
            return -1;
        }
        if((arr_b[5] & 0xF8) >> 3 > 10) {
            int v = (arr_b[3] & 0xFF | (arr_b[2] & 7) << 8) + 1;
            return v + v;
        }
        return zzaac.zzf((arr_b[4] & 0xC0) >> 6, arr_b[4] & 0x3F);
    }

    public static zzam zzc(zzfb zzfb0, String s, String s1, zzad zzad0) {
        zzfa zzfa0 = new zzfa();
        zzfa0.zzh(zzfb0);
        int v = zzaac.zzc[zzfa0.zzd(2)];
        zzfa0.zzl(8);
        int v1 = zzaac.zze[zzfa0.zzd(3)];
        if(zzfa0.zzd(1) != 0) {
            ++v1;
        }
        int v2 = zzaac.zzf[zzfa0.zzd(5)] * 1000;
        zzfa0.zze();
        zzfb0.zzG(zzfa0.zzb());
        zzak zzak0 = new zzak();
        zzak0.zzH(s);
        zzak0.zzS("audio/ac3");
        zzak0.zzw(v1);
        zzak0.zzT(v);
        zzak0.zzB(zzad0);
        zzak0.zzK(s1);
        zzak0.zzv(v2);
        zzak0.zzO(v2);
        return zzak0.zzY();
    }

    public static zzam zzd(zzfb zzfb0, String s, String s1, zzad zzad0) {
        String s2;
        zzfa zzfa0 = new zzfa();
        zzfa0.zzh(zzfb0);
        int v = zzfa0.zzd(13);
        zzfa0.zzl(3);
        int v1 = zzaac.zzc[zzfa0.zzd(2)];
        zzfa0.zzl(10);
        int v2 = zzaac.zze[zzfa0.zzd(3)];
        if(zzfa0.zzd(1) != 0) {
            ++v2;
        }
        zzfa0.zzl(3);
        int v3 = zzfa0.zzd(4);
        zzfa0.zzl(1);
        if(v3 > 0) {
            zzfa0.zzl(6);
            if(zzfa0.zzd(1) != 0) {
                v2 += 2;
            }
            zzfa0.zzl(1);
        }
        if(zzfa0.zza() > 7) {
            zzfa0.zzl(7);
            s2 = zzfa0.zzd(1) == 0 ? "audio/eac3" : "audio/eac3-joc";
        }
        else {
            s2 = "audio/eac3";
        }
        zzfa0.zze();
        zzfb0.zzG(zzfa0.zzb());
        zzak zzak0 = new zzak();
        zzak0.zzH(s);
        zzak0.zzS(s2);
        zzak0.zzw(v2);
        zzak0.zzT(v1);
        zzak0.zzB(zzad0);
        zzak0.zzK(s1);
        zzak0.zzO(v * 1000);
        return zzak0.zzY();
    }

    public static zzaab zze(zzfa zzfa0) {
        int v14;
        int v13;
        int v6;
        int v5;
        int v4;
        zzfa0.zzl(40);
        int v = zzfa0.zzd(5);
        zzfa0.zzj(zzfa0.zzc());
        int v1 = -1;
        if(v > 10) {
            zzfa0.zzl(16);
            switch(zzfa0.zzd(2)) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                }
            }
            zzfa0.zzl(3);
            int v2 = zzfa0.zzd(11);
            int v3 = zzfa0.zzd(2);
            if(v3 == 3) {
                v4 = zzaac.zzd[zzfa0.zzd(2)];
                v5 = 6;
                v6 = 3;
            }
            else {
                int v7 = zzfa0.zzd(2);
                int v8 = zzaac.zzb[v7];
                v6 = v7;
                v4 = zzaac.zzc[v3];
                v5 = v8;
            }
            int v9 = v2 * 2 + 2;
            int v10 = zzfa0.zzd(3);
            int v11 = zzfa0.zzn();
            int v12 = zzaac.zze[v10] + v11;
            zzfa0.zzl(10);
            if(zzfa0.zzn()) {
                zzfa0.zzl(8);
            }
            if(v10 == 0) {
                zzfa0.zzl(5);
                if(zzfa0.zzn()) {
                    zzfa0.zzl(8);
                }
                v13 = 0;
                v10 = 0;
            }
            else {
                v13 = v10;
            }
            if(v1 == 1) {
                if(zzfa0.zzn()) {
                    zzfa0.zzl(16);
                }
                v14 = 1;
            }
            else {
                v14 = v1;
            }
            if(zzfa0.zzn()) {
                if(v13 > 2) {
                    zzfa0.zzl(2);
                }
                if((v13 & 1) != 0 && v13 > 2) {
                    zzfa0.zzl(6);
                }
                if((v13 & 4) != 0) {
                    zzfa0.zzl(6);
                }
                if(v11 != 0 && zzfa0.zzn()) {
                    zzfa0.zzl(5);
                }
                if(v14 == 0) {
                    if(zzfa0.zzn()) {
                        zzfa0.zzl(6);
                    }
                    if(v13 == 0 && zzfa0.zzn()) {
                        zzfa0.zzl(6);
                    }
                    if(zzfa0.zzn()) {
                        zzfa0.zzl(6);
                    }
                    int v15 = zzfa0.zzd(2);
                    if(v15 == 1) {
                        zzfa0.zzl(5);
                    }
                    else if(v15 == 2) {
                        zzfa0.zzl(12);
                    }
                    else if(v15 == 3) {
                        int v16 = zzfa0.zzd(5);
                        if(zzfa0.zzn()) {
                            zzfa0.zzl(5);
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(4);
                            }
                            if(zzfa0.zzn()) {
                                if(zzfa0.zzn()) {
                                    zzfa0.zzl(4);
                                }
                                if(zzfa0.zzn()) {
                                    zzfa0.zzl(4);
                                }
                            }
                        }
                        if(zzfa0.zzn()) {
                            zzfa0.zzl(5);
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(7);
                                if(zzfa0.zzn()) {
                                    zzfa0.zzl(8);
                                }
                            }
                        }
                        zzfa0.zzl((v16 + 2) * 8);
                        zzfa0.zze();
                    }
                    if(v13 < 2) {
                        if(zzfa0.zzn()) {
                            zzfa0.zzl(14);
                        }
                        if(v10 == 0 && zzfa0.zzn()) {
                            zzfa0.zzl(14);
                        }
                    }
                    if(!zzfa0.zzn()) {
                        v14 = 0;
                    }
                    else if(v6 == 0) {
                        zzfa0.zzl(5);
                        v14 = 0;
                        v6 = 0;
                    }
                    else {
                        for(int v17 = 0; v17 < v5; ++v17) {
                            if(zzfa0.zzn()) {
                                zzfa0.zzl(5);
                            }
                        }
                        v14 = 0;
                    }
                }
            }
            if(zzfa0.zzn()) {
                zzfa0.zzl(5);
                if(v13 == 2) {
                    zzfa0.zzl(4);
                    v13 = 2;
                }
                if(v13 >= 6) {
                    zzfa0.zzl(2);
                }
                if(zzfa0.zzn()) {
                    zzfa0.zzl(8);
                }
                if(v13 == 0 && zzfa0.zzn()) {
                    zzfa0.zzl(8);
                }
                if(v3 < 3) {
                    zzfa0.zzk();
                }
            }
            if(v14 == 0 && v6 != 3) {
                zzfa0.zzk();
            }
            if(v14 == 2 && (v6 == 3 || zzfa0.zzn())) {
                zzfa0.zzl(6);
            }
            return !zzfa0.zzn() || zzfa0.zzd(6) != 1 || zzfa0.zzd(8) != 1 ? new zzaab("audio/eac3", v1, v12, v4, v9, v5 * 0x100, v9 * v4 / (v5 * 0x20), null) : new zzaab("audio/eac3-joc", v1, v12, v4, v9, v5 * 0x100, v9 * v4 / (v5 * 0x20), null);
        }
        zzfa0.zzl(0x20);
        int v18 = zzfa0.zzd(2);
        int v19 = zzfa0.zzd(6);
        int v20 = zzaac.zzf[v19 / 2] * 1000;
        int v21 = zzaac.zzf(v18, v19);
        zzfa0.zzl(8);
        int v22 = zzfa0.zzd(3);
        if((v22 & 1) != 0 && v22 != 1) {
            zzfa0.zzl(2);
        }
        if((v22 & 4) != 0) {
            zzfa0.zzl(2);
        }
        if(v22 == 2) {
            zzfa0.zzl(2);
        }
        int v23 = v18 >= 3 ? -1 : zzaac.zzc[v18];
        int v24 = zzfa0.zzn();
        return new zzaab((v18 == 3 ? null : "audio/ac3"), -1, zzaac.zze[v22] + v24, v23, v21, 0x600, v20, null);
    }

    private static int zzf(int v, int v1) {
        if(v >= 0 && v < 3 && v1 >= 0 && v1 >> 1 < 19) {
            int v2 = zzaac.zzc[v];
            if(v2 == 44100) {
                int v3 = zzaac.zzg[v1 >> 1] + (v1 & 1);
                return v3 + v3;
            }
            int v4 = zzaac.zzf[v1 >> 1];
            return v2 == 32000 ? v4 * 6 : v4 * 4;
        }
        return -1;
    }
}


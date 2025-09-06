package com.google.android.gms.internal.ads;

final class zzahf {
    private static final int[] zza;

    static {
        zzahf.zza = new int[]{0x69736F6D, 0x69736F32, 0x69736F33, 0x69736F34, 0x69736F35, 0x69736F36, 0x69736F39, 0x61766331, 1752589105, 0x68657631, 0x61763031, 0x6D703431, 0x6D703432, 862401121, 862401122, 0x33677236, 0x33677336, 0x33676536, 0x33676736, 0x4D345620, 0x4D344120, 0x66347620, 1801741417, 1295275600, 0x71742020, 1297305174, 0x64627931, 0x69736D6C, 0x70696666};
    }

    public static boolean zza(zzabc zzabc0) {
        return zzahf.zzc(zzabc0, true, false);
    }

    public static boolean zzb(zzabc zzabc0, boolean z) {
        return zzahf.zzc(zzabc0, false, false);
    }

    private static boolean zzc(zzabc zzabc0, boolean z, boolean z1) {
        long v7;
        int v6;
        long v = zzabc0.zzd();
        int v1 = Long.compare(v, -1L);
        zzfb zzfb0 = new zzfb(0x40);
        int v2 = (int)(v1 == 0 || v > 0x1000L ? 0x1000L : v);
        int v3 = 0;
        boolean z2 = false;
        while(v3 < v2) {
            zzfb0.zzD(8);
            if(!zzabc0.zzm(zzfb0.zzI(), 0, 8, true)) {
                return z2 && !z;
            }
            long v4 = zzfb0.zzt();
            int v5 = zzfb0.zzf();
            if(v4 == 1L) {
                zzabc0.zzh(zzfb0.zzI(), 8, 8);
                v6 = 16;
                zzfb0.zzF(16);
                v7 = zzfb0.zzs();
            }
            else {
                if(v4 == 0L) {
                    long v8 = zzabc0.zzd();
                    if(v8 != -1L) {
                        v4 = v8 - zzabc0.zze() + 8L;
                    }
                }
                v7 = v4;
                v6 = 8;
            }
            if(v7 < ((long)v6)) {
                return false;
            }
            v3 += v6;
            if(v5 == 0x6D6F6F76) {
                int v9 = v2 + ((int)v7);
                v2 = v1 != 0 && ((long)v9) > v ? ((int)v) : v9;
            }
            else {
                if(v5 == 0x6D6F6F66 || v5 == 0x6D766578) {
                    return z2 && z;
                }
                if(((long)v3) + v7 - ((long)v6) >= ((long)v2)) {
                    break;
                }
                int v10 = (int)(v7 - ((long)v6));
                v3 += v10;
                if(v5 == 0x66747970) {
                    if(v10 < 8) {
                        return false;
                    }
                    zzfb0.zzD(v10);
                    zzabc0.zzh(zzfb0.zzI(), 0, v10);
                    int v11 = v10 >> 2;
                    int v12 = 0;
                    while(v12 < v11) {
                        if(v12 == 1) {
                            zzfb0.zzH(4);
                        }
                        else {
                            int v13 = zzfb0.zzf();
                            if(v13 >>> 8 == 0x336770) {
                                goto label_63;
                            }
                            else {
                                if(v13 == 0x68656963) {
                                    v13 = 0x68656963;
                                }
                                int[] arr_v = zzahf.zza;
                                int v14 = 0;
                                while(v14 < 29) {
                                    if(arr_v[v14] == v13) {
                                        goto label_63;
                                    }
                                    ++v14;
                                }
                            }
                        }
                        ++v12;
                        continue;
                    label_63:
                        z2 = true;
                        break;
                    }
                    if(z2) {
                        continue;
                    }
                    return false;
                }
                if(v10 != 0) {
                    zzabc0.zzg(v10);
                }
            }
        }
        return z2 && !z;
    }
}


package com.google.android.gms.internal.measurement;

final class zzhi {
    static double zza(byte[] arr_b, int v) {
        return Double.longBitsToDouble(zzhi.zzd(arr_b, v));
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzhl zzhl0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return zzhi.zzd(arr_b, v1, zzhl0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return zzhi.zzc(arr_b, v1, zzhl0) + zzhl0.zza;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = zzhi.zzc(arr_b, v1, zzhl0);
                        v4 = zzhl0.zza;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = zzhi.zza(v4, arr_b, v1, v2, zzhl0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw zzji.zzg();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw zzji.zzc();
                }
            }
        }
        throw zzji.zzc();
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzjf zzjf0, zzhl zzhl0) {
        int v3 = zzhi.zzc(arr_b, v1, zzhl0);
        ((zzja)zzjf0).zzd(zzhl0.zza);
        while(v3 < v2) {
            int v4 = zzhi.zzc(arr_b, v3, zzhl0);
            if(v != zzhl0.zza) {
                break;
            }
            v3 = zzhi.zzc(arr_b, v4, zzhl0);
            ((zzja)zzjf0).zzd(zzhl0.zza);
        }
        return v3;
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzlz zzlz0, zzhl zzhl0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzhi.zzd(arr_b, v1, zzhl0);
                    zzlz0.zza(v, zzhl0.zzb);
                    return v3;
                }
                case 1: {
                    zzlz0.zza(v, zzhi.zzd(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzhi.zzc(arr_b, v1, zzhl0);
                    int v5 = zzhl0.zza;
                    if(v5 < 0) {
                        throw zzji.zzf();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzji.zzh();
                    }
                    if(v5 == 0) {
                        zzlz0.zza(v, zzhm.zza);
                        return v4;
                    }
                    zzlz0.zza(v, zzhm.zza(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    zzlz zzlz1 = zzlz.zzd();
                    int v6 = v & -8 | 4;
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = zzhi.zzc(arr_b, v1, zzhl0);
                        int v9 = zzhl0.zza;
                        v7 = v9;
                        if(v9 == v6) {
                            v1 = v8;
                            if(true) {
                                break;
                            }
                        }
                        else {
                            int v10 = zzhi.zza(v7, arr_b, v8, v2, zzlz1, zzhl0);
                            v7 = v9;
                            v1 = v10;
                        }
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzji.zzg();
                    }
                    zzlz0.zza(v, zzlz1);
                    return v1;
                }
                case 5: {
                    zzlz0.zza(v, zzhi.zzc(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw zzji.zzc();
                }
            }
        }
        throw zzji.zzc();
    }

    static int zza(int v, byte[] arr_b, int v1, zzhl zzhl0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            zzhl0.zza = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            zzhl0.zza = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            zzhl0.zza = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            zzhl0.zza = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        zzhl0.zza = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int zza(zzlb zzlb0, int v, byte[] arr_b, int v1, int v2, zzjf zzjf0, zzhl zzhl0) {
        int v3 = zzhi.zza(zzlb0, arr_b, v1, v2, zzhl0);
        zzjf0.add(zzhl0.zzc);
        while(v3 < v2) {
            int v4 = zzhi.zzc(arr_b, v3, zzhl0);
            if(v != zzhl0.zza) {
                break;
            }
            v3 = zzhi.zza(zzlb0, arr_b, v4, v2, zzhl0);
            zzjf0.add(zzhl0.zzc);
        }
        return v3;
    }

    static int zza(zzlb zzlb0, byte[] arr_b, int v, int v1, int v2, zzhl zzhl0) {
        Object object0 = zzlb0.zza();
        int v3 = zzhi.zza(object0, zzlb0, arr_b, v, v1, v2, zzhl0);
        zzlb0.zzc(object0);
        zzhl0.zzc = object0;
        return v3;
    }

    static int zza(zzlb zzlb0, byte[] arr_b, int v, int v1, zzhl zzhl0) {
        Object object0 = zzlb0.zza();
        int v2 = zzhi.zza(object0, zzlb0, arr_b, v, v1, zzhl0);
        zzlb0.zzc(object0);
        zzhl0.zzc = object0;
        return v2;
    }

    static int zza(Object object0, zzlb zzlb0, byte[] arr_b, int v, int v1, int v2, zzhl zzhl0) {
        int v3 = ((zzkn)zzlb0).zza(object0, arr_b, v, v1, v2, zzhl0);
        zzhl0.zzc = object0;
        return v3;
    }

    static int zza(Object object0, zzlb zzlb0, byte[] arr_b, int v, int v1, zzhl zzhl0) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzhi.zza(v3, arr_b, v2, zzhl0);
            v3 = zzhl0.zza;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzji.zzh();
        }
        int v4 = v3 + v2;
        zzlb0.zza(object0, arr_b, v2, v4, zzhl0);
        zzhl0.zzc = object0;
        return v4;
    }

    static int zza(byte[] arr_b, int v, zzhl zzhl0) {
        int v1 = zzhi.zzc(arr_b, v, zzhl0);
        int v2 = zzhl0.zza;
        if(v2 < 0) {
            throw zzji.zzf();
        }
        if(v2 > arr_b.length - v1) {
            throw zzji.zzh();
        }
        if(v2 == 0) {
            zzhl0.zzc = zzhm.zza;
            return v1;
        }
        zzhl0.zzc = zzhm.zza(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zza(byte[] arr_b, int v, zzjf zzjf0, zzhl zzhl0) {
        int v1 = zzhi.zzc(arr_b, v, zzhl0);
        int v2 = zzhl0.zza + v1;
        while(v1 < v2) {
            v1 = zzhi.zzc(arr_b, v1, zzhl0);
            ((zzja)zzjf0).zzd(zzhl0.zza);
        }
        if(v1 != v2) {
            throw zzji.zzh();
        }
        return v1;
    }

    static float zzb(byte[] arr_b, int v) {
        return Float.intBitsToFloat(zzhi.zzc(arr_b, v));
    }

    static int zzb(byte[] arr_b, int v, zzhl zzhl0) {
        int v1 = zzhi.zzc(arr_b, v, zzhl0);
        int v2 = zzhl0.zza;
        if(v2 < 0) {
            throw zzji.zzf();
        }
        if(v2 == 0) {
            zzhl0.zzc = "";
            return v1;
        }
        zzhl0.zzc = zzmh.zzb(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zzc(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zzc(byte[] arr_b, int v, zzhl zzhl0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzhl0.zza = v1;
            return v + 1;
        }
        return zzhi.zza(v1, arr_b, v + 1, zzhl0);
    }

    static int zzd(byte[] arr_b, int v, zzhl zzhl0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            zzhl0.zzb = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        zzhl0.zzb = v4;
        return v2;
    }

    static long zzd(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }
}


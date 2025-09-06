package com.google.android.gms.internal.ads;

final class zzgpv {
    static int zza(byte[] arr_b, int v, zzgpu zzgpu0) {
        int v1 = zzgpv.zzh(arr_b, v, zzgpu0);
        int v2 = zzgpu0.zza;
        if(v2 < 0) {
            throw zzgsc.zzf();
        }
        if(v2 > arr_b.length - v1) {
            throw zzgsc.zzj();
        }
        if(v2 == 0) {
            zzgpu0.zzc = zzgqi.zzb;
            return v1;
        }
        zzgpu0.zzc = zzgqi.zzv(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zzb(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | ((arr_b[v + 1] & 0xFF) << 8 | arr_b[v] & 0xFF | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zzc(zzgtt zzgtt0, byte[] arr_b, int v, int v1, int v2, zzgpu zzgpu0) {
        Object object0 = zzgtt0.zze();
        int v3 = zzgpv.zzl(object0, zzgtt0, arr_b, v, v1, v2, zzgpu0);
        zzgtt0.zzf(object0);
        zzgpu0.zzc = object0;
        return v3;
    }

    static int zzd(zzgtt zzgtt0, byte[] arr_b, int v, int v1, zzgpu zzgpu0) {
        Object object0 = zzgtt0.zze();
        int v2 = zzgpv.zzm(object0, zzgtt0, arr_b, v, v1, zzgpu0);
        zzgtt0.zzf(object0);
        zzgpu0.zzc = object0;
        return v2;
    }

    static int zze(zzgtt zzgtt0, int v, byte[] arr_b, int v1, int v2, zzgrz zzgrz0, zzgpu zzgpu0) {
        int v3 = zzgpv.zzd(zzgtt0, arr_b, v1, v2, zzgpu0);
        zzgrz0.add(zzgpu0.zzc);
        while(v3 < v2) {
            int v4 = zzgpv.zzh(arr_b, v3, zzgpu0);
            if(v != zzgpu0.zza) {
                break;
            }
            v3 = zzgpv.zzd(zzgtt0, arr_b, v4, v2, zzgpu0);
            zzgrz0.add(zzgpu0.zzc);
        }
        return v3;
    }

    static int zzf(byte[] arr_b, int v, zzgrz zzgrz0, zzgpu zzgpu0) {
        int v1 = zzgpv.zzh(arr_b, v, zzgpu0);
        int v2 = zzgpu0.zza + v1;
        while(v1 < v2) {
            v1 = zzgpv.zzh(arr_b, v1, zzgpu0);
            ((zzgrr)zzgrz0).zzh(zzgpu0.zza);
        }
        if(v1 != v2) {
            throw zzgsc.zzj();
        }
        return v1;
    }

    static int zzg(int v, byte[] arr_b, int v1, int v2, zzgul zzgul0, zzgpu zzgpu0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzgpv.zzk(arr_b, v1, zzgpu0);
                    zzgul0.zzj(v, zzgpu0.zzb);
                    return v3;
                }
                case 1: {
                    zzgul0.zzj(v, zzgpv.zzn(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzgpv.zzh(arr_b, v1, zzgpu0);
                    int v5 = zzgpu0.zza;
                    if(v5 < 0) {
                        throw zzgsc.zzf();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzgsc.zzj();
                    }
                    if(v5 == 0) {
                        zzgul0.zzj(v, zzgqi.zzb);
                        return v4;
                    }
                    zzgul0.zzj(v, zzgqi.zzv(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    int v6 = v & -8 | 4;
                    zzgul zzgul1 = zzgul.zzf();
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = zzgpv.zzh(arr_b, v1, zzgpu0);
                        int v9 = zzgpu0.zza;
                        v7 = v9;
                        if(v9 == v6) {
                            v1 = v8;
                            if(true) {
                                break;
                            }
                        }
                        else {
                            int v10 = zzgpv.zzg(v7, arr_b, v8, v2, zzgul1, zzgpu0);
                            v7 = v9;
                            v1 = v10;
                        }
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzgsc.zzg();
                    }
                    zzgul0.zzj(v, zzgul1);
                    return v1;
                }
                case 5: {
                    zzgul0.zzj(v, zzgpv.zzb(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw zzgsc.zzc();
                }
            }
        }
        throw zzgsc.zzc();
    }

    static int zzh(byte[] arr_b, int v, zzgpu zzgpu0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzgpu0.zza = v1;
            return v + 1;
        }
        return zzgpv.zzi(v1, arr_b, v + 1, zzgpu0);
    }

    static int zzi(int v, byte[] arr_b, int v1, zzgpu zzgpu0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            zzgpu0.zza = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            zzgpu0.zza = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            zzgpu0.zza = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            zzgpu0.zza = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        zzgpu0.zza = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int zzj(int v, byte[] arr_b, int v1, int v2, zzgrz zzgrz0, zzgpu zzgpu0) {
        int v3 = zzgpv.zzh(arr_b, v1, zzgpu0);
        ((zzgrr)zzgrz0).zzh(zzgpu0.zza);
        while(v3 < v2) {
            int v4 = zzgpv.zzh(arr_b, v3, zzgpu0);
            if(v != zzgpu0.zza) {
                break;
            }
            v3 = zzgpv.zzh(arr_b, v4, zzgpu0);
            ((zzgrr)zzgrz0).zzh(zzgpu0.zza);
        }
        return v3;
    }

    static int zzk(byte[] arr_b, int v, zzgpu zzgpu0) {
        long v1 = (long)arr_b[v];
        if(Long.compare(v1, 0L) >= 0) {
            zzgpu0.zzb = v1;
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
        zzgpu0.zzb = v4;
        return v2;
    }

    static int zzl(Object object0, zzgtt zzgtt0, byte[] arr_b, int v, int v1, int v2, zzgpu zzgpu0) {
        int v3 = ((zzgtd)zzgtt0).zzc(object0, arr_b, v, v1, v2, zzgpu0);
        zzgpu0.zzc = object0;
        return v3;
    }

    static int zzm(Object object0, zzgtt zzgtt0, byte[] arr_b, int v, int v1, zzgpu zzgpu0) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzgpv.zzi(v3, arr_b, v2, zzgpu0);
            v3 = zzgpu0.zza;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzgsc.zzj();
        }
        int v4 = v3 + v2;
        zzgtt0.zzi(object0, arr_b, v2, v4, zzgpu0);
        zzgpu0.zzc = object0;
        return v4;
    }

    static long zzn(byte[] arr_b, int v) {
        return ((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30 | (((long)arr_b[v + 7]) & 0xFFL) << 56;
    }
}


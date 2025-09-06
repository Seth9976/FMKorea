package com.google.android.gms.internal.ads;

public final class zzabk {
    public static int zza(zzfb zzfb0, int v) {
        switch(v) {
            case 1: {
                return 0xC0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 0x240 << v - 2;
            }
            case 6: {
                return zzfb0.zzl() + 1;
            }
            case 7: {
                return zzfb0.zzp() + 1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0x100 << v - 8;
            }
            default: {
                return -1;
            }
        }
    }

    public static long zzb(zzabc zzabc0, zzabo zzabo0) {
        zzabc0.zzj();
        ((zzaar)zzabc0).zzl(1, false);
        byte[] arr_b = new byte[1];
        ((zzaar)zzabc0).zzm(arr_b, 0, 1, false);
        int v = arr_b[0] & 1;
        ((zzaar)zzabc0).zzl(2, false);
        int v1 = 1 == v ? 7 : 6;
        zzfb zzfb0 = new zzfb(v1);
        zzfb0.zzF(zzabf.zza(zzabc0, zzfb0.zzI(), 0, v1));
        zzabc0.zzj();
        zzabj zzabj0 = new zzabj();
        if(!zzabk.zzd(zzfb0, zzabo0, 1 == v, zzabj0)) {
            throw zzcd.zza(null, null);
        }
        return zzabj0.zza;
    }

    public static boolean zzc(zzfb zzfb0, zzabo zzabo0, int v, zzabj zzabj0) {
        int v1 = zzfb0.zzc();
        long v2 = zzfb0.zzt();
        if(Long.compare(v2 >>> 16, v) != 0) {
            return false;
        }
        boolean z = Long.compare(v2 >>> 16 & 1L, 1L) == 0;
        int v3 = (int)(v2 >> 4 & 15L);
        if(v3 > 7) {
            if(v3 <= 10 && zzabo0.zzg == 2) {
            label_10:
                int v4 = (int)(v2 >> 1 & 7L);
                if((v4 == 0 || v4 == zzabo0.zzi) && (v2 & 1L) != 1L && zzabk.zzd(zzfb0, zzabo0, z, zzabj0)) {
                    int v5 = zzabk.zza(zzfb0, ((int)(v2 >> 12 & 15L)));
                    if(v5 != -1 && v5 <= zzabo0.zzb) {
                        int v6 = zzabo0.zze;
                        int v7 = (int)(v2 >> 8 & 15L);
                        if(v7 == 0) {
                            return zzfb0.zzl() == zzfk.zze(zzfb0.zzI(), v1, zzfb0.zzc() - 1, 0);
                        }
                        if(v7 <= 11) {
                            return v7 == zzabo0.zzf ? zzfb0.zzl() == zzfk.zze(zzfb0.zzI(), v1, zzfb0.zzc() - 1, 0) : false;
                        }
                        if(v7 == 12) {
                            return zzfb0.zzl() * 1000 == v6 ? zzfb0.zzl() == zzfk.zze(zzfb0.zzI(), v1, zzfb0.zzc() - 1, 0) : false;
                        }
                        if(v7 <= 14) {
                            int v8 = zzfb0.zzp();
                            if(v7 == 14) {
                                v8 *= 10;
                            }
                            return v8 == v6 ? zzfb0.zzl() == zzfk.zze(zzfb0.zzI(), v1, zzfb0.zzc() - 1, 0) : false;
                        }
                    }
                }
            }
        }
        else if(v3 == zzabo0.zzg - 1) {
            goto label_10;
        }
        return false;
    }

    private static boolean zzd(zzfb zzfb0, zzabo zzabo0, boolean z, zzabj zzabj0) {
        long v;
        try {
            v = zzfb0.zzv();
        }
        catch(NumberFormatException unused_ex) {
            return false;
        }
        if(!z) {
            v *= (long)zzabo0.zzb;
        }
        zzabj0.zza = v;
        return true;
    }
}


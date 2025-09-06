package com.google.android.gms.internal.ads;

public final class zzqg implements zzpr {
    protected zzqg(zzqf zzqf0) {
    }

    protected static int zza(int v, int v1, int v2) {
        return zzfwl.zza(((long)v) * ((long)v1) * ((long)v2) / 1000000L);
    }

    protected static int zzb(int v) {
        switch(v) {
            case 5: {
                return 80000;
            }
            case 7: {
                return 192000;
            }
            case 8: {
                return 2250000;
            }
            case 9: {
                return 40000;
            }
            case 10: {
                return 100000;
            }
            case 11: {
                return 16000;
            }
            case 12: {
                return 7000;
            }
            case 14: {
                return 3062500;
            }
            case 15: {
                return 8000;
            }
            case 16: {
                return 256000;
            }
            case 17: {
                return 336000;
            }
            case 6: 
            case 18: {
                return 768000;
            }
            case 20: {
                return 0xF906;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}


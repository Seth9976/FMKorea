package com.google.android.gms.internal.ads;

public final class zzabv {
    private static final String[] zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        zzabv.zza = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        zzabv.zzb = new int[]{44100, 48000, 32000};
        zzabv.zzc = new int[]{32000, 0xFA00, 96000, 0x1F400, 160000, 192000, 224000, 256000, 288000, 320000, 0x55F00, 384000, 416000, 448000};
        zzabv.zzd = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000, 176000, 192000, 224000, 256000};
        zzabv.zze = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000, 384000};
        zzabv.zzf = new int[]{32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000};
        zzabv.zzg = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000};
    }

    static int zza(int v, int v1) {
        return zzabv.zzl(v, v1);
    }

    public static int zzb(int v) {
        int v7;
        if(!zzabv.zzm(v)) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        int v3 = v >>> 12 & 15;
        if(v3 != 0 && v3 != 15) {
            int v4 = v >>> 10 & 3;
            if(v4 == 3) {
                return -1;
            }
            int v5 = zzabv.zzb[v4];
            if(v1 == 2) {
                v5 /= 2;
            }
            else if(v1 == 0) {
                v5 /= 4;
            }
            int v6 = v >>> 9 & 1;
            if(v2 == 3) {
                return v1 == 3 ? (zzabv.zzc[v3 - 1] * 12 / v5 + v6) * 4 : (zzabv.zzd[v3 - 1] * 12 / v5 + v6) * 4;
            }
            if(v1 != 3) {
                v7 = zzabv.zzg[v3 - 1];
            }
            else if(v2 == 2) {
                v7 = zzabv.zze[v3 - 1];
            }
            else {
                v7 = zzabv.zzf[v3 - 1];
            }
            int v8 = 0x90;
            if(v1 == 3) {
                return v7 * 0x90 / v5 + v6;
            }
            if(v2 == 1) {
                v8 = 72;
            }
            return v8 * v7 / v5 + v6;
        }
        return -1;
    }

    public static int zzc(int v) {
        if(!zzabv.zzm(v)) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        return (v >>> 12 & 15) == 0 || (v >>> 12 & 15) == 15 || (v >>> 10 & 3) == 3 ? -1 : zzabv.zzl(v1, v2);
    }

    static boolean zzd(int v) {
        return zzabv.zzm(v);
    }

    static int[] zze() {
        return zzabv.zzc;
    }

    static int[] zzf() {
        return zzabv.zze;
    }

    static int[] zzg() {
        return zzabv.zzf;
    }

    static int[] zzh() {
        return zzabv.zzg;
    }

    static int[] zzi() {
        return zzabv.zzd;
    }

    static int[] zzj() {
        return zzabv.zzb;
    }

    static String[] zzk() {
        return zzabv.zza;
    }

    private static int zzl(int v, int v1) {
        switch(v1) {
            case 1: {
                return v == 3 ? 0x480 : 0x240;
            }
            case 2: {
                return 0x480;
            }
            default: {
                return 0x180;
            }
        }
    }

    private static boolean zzm(int v) {
        return (v & 0xFFE00000) == 0xFFE00000;
    }
}


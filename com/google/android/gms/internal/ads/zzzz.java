package com.google.android.gms.internal.ads;

public final class zzzz {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;

    static {
        zzzz.zzb = new int[]{96000, 88200, 0xFA00, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        zzzz.zzc = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static zzzy zza(byte[] arr_b) {
        return zzzz.zzb(new zzfa(arr_b, arr_b.length), false);
    }

    public static zzzy zzb(zzfa zzfa0, boolean z) {
        int v = zzzz.zzc(zzfa0);
        int v1 = zzzz.zzd(zzfa0);
        int v2 = zzfa0.zzd(4);
        String s = "mp4a.40." + v;
        int v3 = 22;
        if(v == 5 || v == 29) {
            v1 = zzzz.zzd(zzfa0);
            v = zzzz.zzc(zzfa0);
            if(v == 22) {
                v2 = zzfa0.zzd(4);
            }
        }
        int v4 = 3;
        if(z) {
            if(v != 1 && v != 2 && v != 3 && v != 4 && v != 6 && (v != 7 && v != 17) && (v != 19 && v != 20 && v != 21 && v != 22 && v != 23)) {
                throw zzcd.zzc(("Unsupported audio object type: " + v));
            }
            if(zzfa0.zzn()) {
                zzes.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if(zzfa0.zzn()) {
                zzfa0.zzl(14);
            }
            boolean z1 = zzfa0.zzn();
            if(v2 == 0) {
                throw new UnsupportedOperationException();
            }
            switch(v) {
                case 6: {
                    zzfa0.zzl(3);
                    break;
                }
                case 20: {
                    v = 20;
                    zzfa0.zzl(3);
                }
            }
            if(z1) {
                if(v == 22) {
                    zzfa0.zzl(16);
                }
                else {
                    v3 = v;
                }
                if(v3 == 17 || (v3 == 19 || v3 == 20) || v3 == 23) {
                    zzfa0.zzl(3);
                }
                zzfa0.zzl(1);
            }
            switch(v) {
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    int v5 = zzfa0.zzd(2);
                    if(v5 == 2) {
                        v4 = 2;
                    }
                    else if(v5 != 3) {
                        break;
                    }
                    throw zzcd.zzc(("Unsupported epConfig: " + v4));
                }
            }
        }
        int v6 = zzzz.zzc[v2];
        if(v6 == -1) {
            throw zzcd.zza(null, null);
        }
        return new zzzy(v1, v6, s, null);
    }

    private static int zzc(zzfa zzfa0) {
        int v = zzfa0.zzd(5);
        return v == 0x1F ? zzfa0.zzd(6) + 0x20 : v;
    }

    private static int zzd(zzfa zzfa0) {
        int v = zzfa0.zzd(4);
        if(v == 15) {
            if(zzfa0.zza() < 24) {
                throw zzcd.zza("AAC header insufficient data", null);
            }
            return zzfa0.zzd(24);
        }
        if(v >= 13) {
            throw zzcd.zza("AAC header wrong Sampling Frequency Index", null);
        }
        return zzzz.zzb[v];
    }
}


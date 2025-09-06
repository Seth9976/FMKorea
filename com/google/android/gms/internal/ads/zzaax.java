package com.google.android.gms.internal.ads;

public final class zzaax {
    public final String zza;

    private zzaax(int v, int v1, String s) {
        this.zza = s;
    }

    public static zzaax zza(zzfb zzfb0) {
        String s;
        zzfb0.zzH(2);
        int v = zzfb0.zzl();
        int v1 = zzfb0.zzl();
        if(v >> 1 == 4 || v >> 1 == 5) {
            s = "dvhe";
        }
        else {
            switch(v >> 1) {
                case 7: {
                    s = "dvhe";
                    break;
                }
                case 8: {
                    s = "hev1";
                    break;
                }
                case 9: {
                    s = "avc3";
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        int v2 = v1 >> 3 | (v & 1) << 5;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        String s1 = ".0";
        stringBuilder0.append(".0");
        stringBuilder0.append(v >> 1);
        if(v2 >= 10) {
            s1 = ".";
        }
        stringBuilder0.append(s1);
        stringBuilder0.append(v2);
        return new zzaax(v >> 1, v2, stringBuilder0.toString());
    }
}


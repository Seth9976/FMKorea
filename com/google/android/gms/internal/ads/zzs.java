package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

public final class zzs {
    public static final zzs zza;
    public static final zzs zzb;
    public static final zzn zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private int zzl;

    static {
        zzs.zza = new zzs(1, 2, 3, null);
        zzr zzr0 = new zzr();
        zzr0.zzb(1);
        zzr0.zza(1);
        zzr0.zzc(2);
        zzs.zzb = zzr0.zzd();
        zzs.zzh = "0";
        zzs.zzi = "1";
        zzs.zzj = "2";
        zzs.zzk = "3";
        zzs.zzc = zzp.zza;
    }

    @Deprecated
    public zzs(int v, int v1, int v2, byte[] arr_b) {
        this.zzd = v;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzs.class == class0 && this.zzd == ((zzs)object0).zzd && this.zze == ((zzs)object0).zze && this.zzf == ((zzs)object0).zzf && Arrays.equals(this.zzg, ((zzs)object0).zzg);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzl;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzg);
            v = (((this.zzd + 0x20F) * 0x1F + this.zze) * 0x1F + this.zzf) * 0x1F + v1;
            this.zzl = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "ColorInfo(" + zzs.zzg(this.zzd) + ", " + zzs.zzf(this.zze) + ", " + zzs.zzh(this.zzf) + ", " + (this.zzg != null) + ")";
    }

    public static int zza(int v) {
        switch(v) {
            case 1: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 9: {
                return 6;
            }
            default: {
                return v == 5 || v == 6 || v == 7 ? 2 : -1;
            }
        }
    }

    public static int zzb(int v) {
        switch(v) {
            case 4: {
                return 10;
            }
            case 1: 
            case 6: 
            case 7: {
                return 3;
            }
            case 13: {
                return 2;
            }
            case 16: {
                return 6;
            }
            case 18: {
                return 7;
            }
            default: {
                return -1;
            }
        }
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        return this.zze() ? String.format(Locale.US, "%s/%s/%s", zzs.zzg(this.zzd), zzs.zzf(this.zze), zzs.zzh(this.zzf)) : "NA";
    }

    public final boolean zze() {
        return this.zzd != -1 && this.zze != -1 && this.zzf != -1;
    }

    private static String zzf(int v) {
        switch(v) {
            case -1: {
                return "Unset color range";
            }
            case 1: {
                return "Full range";
            }
            case 2: {
                return "Limited range";
            }
            default: {
                return "Undefined color range";
            }
        }
    }

    private static String zzg(int v) {
        switch(v) {
            case -1: {
                return "Unset color space";
            }
            case 1: {
                return "BT709";
            }
            case 2: {
                return "BT601";
            }
            case 6: {
                return "BT2020";
            }
            default: {
                return "Undefined color space";
            }
        }
    }

    private static String zzh(int v) {
        switch(v) {
            case -1: {
                return "Unset color transfer";
            }
            case 1: {
                return "Linear";
            }
            case 2: {
                return "sRGB";
            }
            case 3: {
                return "SDR SMPTE 170M";
            }
            case 6: {
                return "ST2084 PQ";
            }
            case 7: {
                return "HLG";
            }
            case 10: {
                return "Gamma 2.2";
            }
            default: {
                return "Undefined color transfer";
            }
        }
    }
}


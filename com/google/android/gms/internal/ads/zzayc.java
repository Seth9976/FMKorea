package com.google.android.gms.internal.ads;

public enum zzayc implements zzgrs {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    private static final zzgrt zzl;
    private final int zzn;

    static {
        zzayc.zzl = new zzaya();
    }

    private zzayc(int v1) {
        this.zzn = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    public final int zza() {
        return this.zzn;
    }

    public static zzayc zzb(int v) {
        switch(v) {
            case 0: {
                return zzayc.zza;
            }
            case 1: {
                return zzayc.zzb;
            }
            case 2: {
                return zzayc.zzc;
            }
            case 3: {
                return zzayc.zzd;
            }
            case 4: {
                return zzayc.zze;
            }
            case 5: {
                return zzayc.zzf;
            }
            case 6: {
                return zzayc.zzg;
            }
            case 7: {
                return zzayc.zzh;
            }
            case 8: {
                return zzayc.zzi;
            }
            case 9: {
                return zzayc.zzj;
            }
            case 10: {
                return zzayc.zzk;
            }
            default: {
                return null;
            }
        }
    }
}


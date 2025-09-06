package com.google.android.gms.internal.ads;

public final class zzflz extends zzgrq implements zzgtb {
    private static final zzgrw zzb;
    private static final zzflz zzd;
    private int zze;
    private zzgrv zzf;
    private String zzg;
    private String zzh;
    private String zzi;

    static {
        zzflz.zzb = new zzflw();
        zzflz zzflz0 = new zzflz();
        zzflz.zzd = zzflz0;
        zzgrq.zzaU(zzflz.class, zzflz0);
    }

    private zzflz() {
        this.zzf = zzgrq.zzaJ();
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
    }

    public static zzfly zza() {
        return (zzfly)zzflz.zzd.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzflz.zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzflx.zza, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzflz();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzfly(null);
                    }
                    case 5: {
                        return zzflz.zzd;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzflz zzc() {
        return zzflz.zzd;
    }

    static void zzd(zzflz zzflz0, String s) {
        s.getClass();
        zzflz0.zze |= 1;
        zzflz0.zzg = s;
    }

    static void zze(zzflz zzflz0, int v) {
        zzgrv zzgrv0 = zzflz0.zzf;
        if(!zzgrv0.zzc()) {
            zzflz0.zzf = zzgrq.zzaK(zzgrv0);
        }
        zzflz0.zzf.zzh(2);
    }
}


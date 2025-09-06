package com.google.android.gms.internal.ads;

public final class zzfmd extends zzgrq implements zzgtb {
    private static final zzfmd zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private zzflz zzh;

    static {
        zzfmd zzfmd0 = new zzfmd();
        zzfmd.zzb = zzfmd0;
        zzgrq.zzaU(zzfmd.class, zzfmd0);
    }

    private zzfmd() {
        this.zzf = "";
        this.zzg = "";
    }

    public static zzfmb zza() {
        return (zzfmb)zzfmd.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzfmd.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfmc.zza, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzfmd();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzfmb(null);
                    }
                    case 5: {
                        return zzfmd.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzfmd zzc() {
        return zzfmd.zzb;
    }

    static void zzd(zzfmd zzfmd0, String s) {
        s.getClass();
        zzfmd0.zzd |= 2;
        zzfmd0.zzf = s;
    }

    static void zze(zzfmd zzfmd0, zzflz zzflz0) {
        zzflz0.getClass();
        zzfmd0.zzh = zzflz0;
        zzfmd0.zzd |= 8;
    }

    static void zzf(zzfmd zzfmd0, int v) {
        zzfmd0.zze = 1;
        zzfmd0.zzd |= 1;
    }
}


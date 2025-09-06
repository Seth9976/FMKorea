package com.google.android.gms.internal.ads;

public final class zzgxc extends zzgrq implements zzgtb {
    private static final zzgxc zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private zzgqi zzg;
    private zzgqi zzh;

    static {
        zzgxc zzgxc0 = new zzgxc();
        zzgxc.zzb = zzgxc0;
        zzgrq.zzaU(zzgxc.class, zzgxc0);
    }

    private zzgxc() {
        this.zzf = "";
        this.zzg = zzgqi.zzb;
        this.zzh = zzgqi.zzb;
    }

    public static zzgxa zza() {
        return (zzgxa)zzgxc.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxc.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgxb.zza, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgxc();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxa(null);
                    }
                    case 5: {
                        return zzgxc.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgxc zzc() {
        return zzgxc.zzb;
    }

    static void zzd(zzgxc zzgxc0, String s) {
        zzgxc0.zzd |= 2;
        zzgxc0.zzf = "image/png";
    }

    static void zze(zzgxc zzgxc0, zzgqi zzgqi0) {
        zzgqi0.getClass();
        zzgxc0.zzd |= 4;
        zzgxc0.zzg = zzgqi0;
    }

    static void zzf(zzgxc zzgxc0, int v) {
        zzgxc0.zze = 1;
        zzgxc0.zzd |= 1;
    }
}


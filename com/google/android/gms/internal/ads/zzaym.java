package com.google.android.gms.internal.ads;

public final class zzaym extends zzgrq implements zzgtb {
    private static final zzaym zzb;
    private int zzd;
    private String zze;
    private zzbac zzf;
    private int zzg;
    private zzbae zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaym zzaym0 = new zzaym();
        zzaym.zzb = zzaym0;
        zzgrq.zzaU(zzaym.class, zzaym0);
    }

    private zzaym() {
        this.zze = "";
        this.zzj = 1000;
        this.zzk = 1000;
        this.zzl = 1000;
    }

    static zzaym zza() {
        return zzaym.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaym.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzayr.zza, "zzk", zzayr.zza, "zzl", zzayr.zza});
            }
            case 3: {
                return new zzaym();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayl(null);
                    }
                    case 5: {
                        return zzaym.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzaym zzc() {
        return zzaym.zzb;
    }

    static void zzd(zzaym zzaym0, String s) {
        zzaym0.zzd |= 1;
        zzaym0.zze = s;
    }

    static void zze(zzaym zzaym0, zzbae zzbae0) {
        zzbae0.getClass();
        zzaym0.zzh = zzbae0;
        zzaym0.zzd |= 8;
    }
}


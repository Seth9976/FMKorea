package com.google.android.gms.internal.ads;

public final class zzayg extends zzgrq implements zzgtb {
    private static final zzayg zzb;
    private int zzd;
    private String zze;
    private zzgrz zzf;
    private int zzg;

    static {
        zzayg zzayg0 = new zzayg();
        zzayg.zzb = zzayg0;
        zzgrq.zzaU(zzayg.class, zzayg0);
    }

    private zzayg() {
        this.zze = "";
        this.zzf = zzgrq.zzaN();
    }

    static zzayg zza() {
        return zzayg.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayg.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaye.class, "zzg", zzayr.zza});
            }
            case 3: {
                return new zzayg();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayf(null);
                    }
                    case 5: {
                        return zzayg.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


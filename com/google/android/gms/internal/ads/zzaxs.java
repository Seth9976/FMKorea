package com.google.android.gms.internal.ads;

public final class zzaxs extends zzgrq implements zzgtb {
    private static final zzaxs zzb;
    private int zzd;
    private int zze;
    private zzaxw zzf;
    private zzaxy zzg;

    static {
        zzaxs zzaxs0 = new zzaxs();
        zzaxs.zzb = zzaxs0;
        zzgrq.zzaU(zzaxs.class, zzaxs0);
    }

    public static zzaxr zza() {
        return (zzaxr)zzaxs.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaxs.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxu.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzaxs();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaxr(null);
                    }
                    case 5: {
                        return zzaxs.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaxs zzc() {
        return zzaxs.zzb;
    }

    static void zzd(zzaxs zzaxs0, zzaxw zzaxw0) {
        zzaxw0.getClass();
        zzaxs0.zzf = zzaxw0;
        zzaxs0.zzd |= 2;
    }

    static void zze(zzaxs zzaxs0, zzaxy zzaxy0) {
        zzaxy0.getClass();
        zzaxs0.zzg = zzaxy0;
        zzaxs0.zzd |= 4;
    }

    static void zzf(zzaxs zzaxs0, int v) {
        zzaxs0.zze = 1;
        zzaxs0.zzd |= 1;
    }
}


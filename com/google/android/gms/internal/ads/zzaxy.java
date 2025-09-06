package com.google.android.gms.internal.ads;

public final class zzaxy extends zzgrq implements zzgtb {
    private static final zzaxy zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaxy zzaxy0 = new zzaxy();
        zzaxy.zzb = zzaxy0;
        zzgrq.zzaU(zzaxy.class, zzaxy0);
    }

    public static zzaxx zza() {
        return (zzaxx)zzaxy.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaxy.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzaxy();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaxx(null);
                    }
                    case 5: {
                        return zzaxy.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaxy zzc() {
        return zzaxy.zzb;
    }

    static void zzd(zzaxy zzaxy0, boolean z) {
        zzaxy0.zzd |= 1;
        zzaxy0.zze = z;
    }

    static void zze(zzaxy zzaxy0, boolean z) {
        zzaxy0.zzd |= 2;
        zzaxy0.zzf = z;
    }

    static void zzf(zzaxy zzaxy0, int v) {
        zzaxy0.zzd |= 4;
        zzaxy0.zzg = v;
    }
}


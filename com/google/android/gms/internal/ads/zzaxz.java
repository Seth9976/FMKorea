package com.google.android.gms.internal.ads;

public final class zzaxz extends zzgrq implements zzgtb {
    private static final zzaxz zzb;
    private zzgrz zzd;

    static {
        zzaxz zzaxz0 = new zzaxz();
        zzaxz.zzb = zzaxz0;
        zzgrq.zzaU(zzaxz.class, zzaxz0);
    }

    private zzaxz() {
        this.zzd = zzgrq.zzaN();
    }

    public static zzaxt zza() {
        return (zzaxt)zzaxz.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaxz.zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzaxs.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzaxz();
                    }
                    case 4: {
                        return new zzaxt(null);
                    }
                    case 5: {
                        return zzaxz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaxz zzc() {
        return zzaxz.zzb;
    }

    static void zzd(zzaxz zzaxz0, zzaxs zzaxs0) {
        zzaxs0.getClass();
        zzgrz zzgrz0 = zzaxz0.zzd;
        if(!zzgrz0.zzc()) {
            zzaxz0.zzd = zzgrq.zzaO(zzgrz0);
        }
        zzaxz0.zzd.add(zzaxs0);
    }
}


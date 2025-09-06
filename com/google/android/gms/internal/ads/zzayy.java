package com.google.android.gms.internal.ads;

public final class zzayy extends zzgrq implements zzgtb {
    private static final zzayy zzb;
    private int zzd;
    private int zze;
    private zzgrv zzf;

    static {
        zzayy zzayy0 = new zzayy();
        zzayy.zzb = zzayy0;
        zzgrq.zzaU(zzayy.class, zzayy0);
    }

    private zzayy() {
        this.zzf = zzgrq.zzaJ();
    }

    static zzayy zza() {
        return zzayy.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayy.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", zzayr.zza, "zzf"});
            }
            case 3: {
                return new zzayy();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayx(null);
                    }
                    case 5: {
                        return zzayy.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


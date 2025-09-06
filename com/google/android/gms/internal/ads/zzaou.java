package com.google.android.gms.internal.ads;

public final class zzaou extends zzgrq implements zzgtb {
    private static final zzaou zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgrv zzh;
    private long zzi;

    static {
        zzaou zzaou0 = new zzaou();
        zzaou.zzb = zzaou0;
        zzgrq.zzaU(zzaou.class, zzaou0);
    }

    private zzaou() {
        this.zzh = zzgrq.zzaJ();
    }

    static zzaou zza() {
        return zzaou.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaou.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzaou();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaot(null);
                    }
                    case 5: {
                        return zzaou.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


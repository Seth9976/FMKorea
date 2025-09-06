package com.google.android.gms.internal.ads;

public final class zzaon extends zzgrq implements zzgtb {
    private static final zzaon zzb;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzaon zzaon0 = new zzaon();
        zzaon.zzb = zzaon0;
        zzgrq.zzaU(zzaon.class, zzaon0);
    }

    private zzaon() {
        this.zze = -1L;
        this.zzf = 1000;
    }

    static zzaon zza() {
        return zzaon.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaon.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaoy.zza});
            }
            case 3: {
                return new zzaon();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaom(null);
                    }
                    case 5: {
                        return zzaon.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


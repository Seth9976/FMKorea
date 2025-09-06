package com.google.android.gms.internal.ads;

public final class zzaog extends zzgrq implements zzgtb {
    private static final zzaog zzb;
    private int zzd;
    private long zze;

    static {
        zzaog zzaog0 = new zzaog();
        zzaog.zzb = zzaog0;
        zzgrq.zzaU(zzaog.class, zzaog0);
    }

    private zzaog() {
        this.zze = -1L;
    }

    static zzaog zza() {
        return zzaog.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaog.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzaog();
                    }
                    case 4: {
                        return new zzaof(null);
                    }
                    case 5: {
                        return zzaog.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


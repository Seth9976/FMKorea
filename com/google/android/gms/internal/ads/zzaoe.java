package com.google.android.gms.internal.ads;

public final class zzaoe extends zzgrq implements zzgtb {
    private static final zzaoe zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private int zzg;

    static {
        zzaoe zzaoe0 = new zzaoe();
        zzaoe.zzb = zzaoe0;
        zzgrq.zzaU(zzaoe.class, zzaoe0);
    }

    private zzaoe() {
        this.zze = -1L;
        this.zzf = 1000;
        this.zzg = 1000;
    }

    static zzaoe zza() {
        return zzaoe.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaoe.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzaoy.zza, "zzg", zzaoy.zza});
            }
            case 3: {
                return new zzaoe();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaod(null);
                    }
                    case 5: {
                        return zzaoe.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


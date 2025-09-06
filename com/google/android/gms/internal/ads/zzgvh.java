package com.google.android.gms.internal.ads;

public final class zzgvh extends zzgrq implements zzgtb {
    private static final zzgvh zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzgvh zzgvh0 = new zzgvh();
        zzgvh.zzb = zzgvh0;
        zzgrq.zzaU(zzgvh.class, zzgvh0);
    }

    public static zzgvg zza() {
        return (zzgvg)zzgvh.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgvh.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgvh();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgvg(null);
                    }
                    case 5: {
                        return zzgvh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgvh zzc() {
        return zzgvh.zzb;
    }

    static void zzd(zzgvh zzgvh0, int v) {
        zzgvh0.zzd = v;
    }

    static void zze(zzgvh zzgvh0, long v) {
        zzgvh0.zze = v;
    }

    static void zzf(zzgvh zzgvh0, long v) {
        zzgvh0.zzf = v;
    }
}


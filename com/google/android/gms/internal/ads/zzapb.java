package com.google.android.gms.internal.ads;

public final class zzapb extends zzgrq implements zzgtb {
    private static final zzapb zzb;
    private int zzd;
    private long zze;
    private String zzf;
    private zzgqi zzg;

    static {
        zzapb zzapb0 = new zzapb();
        zzapb.zzb = zzapb0;
        zzgrq.zzaU(zzapb.class, zzapb0);
    }

    private zzapb() {
        this.zzf = "";
        this.zzg = zzgqi.zzb;
    }

    public final long zza() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzapb.zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzapb();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzapa(null);
                    }
                    case 5: {
                        return zzapb.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzapb zzc() {
        return zzapb.zzb;
    }

    public static zzapb zzd() {
        return zzapb.zzb;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}


package com.google.android.gms.internal.ads;

public final class zzgxt extends zzgrq implements zzgtb {
    private static final zzgxt zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private zzgrv zzg;
    private int zzh;
    private zzgrz zzi;
    private zzgqi zzj;

    static {
        zzgxt zzgxt0 = new zzgxt();
        zzgxt.zzb = zzgxt0;
        zzgrq.zzaU(zzgxt.class, zzgxt0);
    }

    private zzgxt() {
        this.zzf = "";
        this.zzg = zzgrq.zzaJ();
        this.zzi = zzgrq.zzaN();
        this.zzj = zzgqi.zzb;
    }

    static zzgxt zza() {
        return zzgxt.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxt.zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001B\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgxr.class, "zzj"});
            }
            case 3: {
                return new zzgxt();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxs(null);
                    }
                    case 5: {
                        return zzgxt.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


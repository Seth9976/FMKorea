package com.google.android.gms.internal.ads;

public final class zzgwj extends zzgrq implements zzgtb {
    private static final zzgwj zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzgwj zzgwj0 = new zzgwj();
        zzgwj.zzb = zzgwj0;
        zzgrq.zzaU(zzgwj.class, zzgwj0);
    }

    private zzgwj() {
        this.zze = zzgqi.zzb;
        this.zzf = zzgqi.zzb;
        this.zzg = zzgqi.zzb;
    }

    static zzgwj zza() {
        return zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwj.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgwj();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwi(null);
                    }
                    case 5: {
                        return zzgwj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


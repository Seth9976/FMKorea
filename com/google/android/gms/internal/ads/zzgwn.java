package com.google.android.gms.internal.ads;

public final class zzgwn extends zzgrq implements zzgtb {
    private static final zzgwn zzb;
    private int zzd;
    private int zze;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzgwn zzgwn0 = new zzgwn();
        zzgwn.zzb = zzgwn0;
        zzgrq.zzaU(zzgwn.class, zzgwn0);
    }

    private zzgwn() {
        this.zzf = zzgqi.zzb;
        this.zzg = zzgqi.zzb;
    }

    static zzgwn zza() {
        return zzgwn.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwn.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgwn();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwm(null);
                    }
                    case 5: {
                        return zzgwn.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


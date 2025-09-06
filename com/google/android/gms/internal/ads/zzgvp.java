package com.google.android.gms.internal.ads;

public final class zzgvp extends zzgrq implements zzgtb {
    private static final zzgvp zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgqi zzg;

    static {
        zzgvp zzgvp0 = new zzgvp();
        zzgvp.zzb = zzgvp0;
        zzgrq.zzaU(zzgvp.class, zzgvp0);
    }

    private zzgvp() {
        this.zzg = zzgqi.zzb;
    }

    static zzgvp zza() {
        return zzgvp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgvp.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzgvo.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzgvp();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgvn(null);
                    }
                    case 5: {
                        return zzgvp.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


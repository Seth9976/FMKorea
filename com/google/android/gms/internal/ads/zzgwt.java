package com.google.android.gms.internal.ads;

public final class zzgwt extends zzgrq implements zzgtb {
    private static final zzgwt zzb;
    private int zzd;
    private int zze;
    private zzgws zzf;
    private zzgws zzg;

    static {
        zzgwt zzgwt0 = new zzgwt();
        zzgwt.zzb = zzgwt0;
        zzgrq.zzaU(zzgwt.class, zzgwt0);
    }

    static zzgwt zza() {
        return zzgwt.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwt.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzgwq.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzgwt();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwp(null);
                    }
                    case 5: {
                        return zzgwt.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


package com.google.android.gms.internal.ads;

public final class zzgws extends zzgrq implements zzgtb {
    private static final zzgws zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzgws zzgws0 = new zzgws();
        zzgws.zzb = zzgws0;
        zzgrq.zzaU(zzgws.class, zzgws0);
    }

    static zzgws zza() {
        return zzgws.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgws.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgwq.zza, "zzf", "zzg", zzgwq.zza});
            }
            case 3: {
                return new zzgws();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwr(null);
                    }
                    case 5: {
                        return zzgws.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


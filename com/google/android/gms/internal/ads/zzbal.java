package com.google.android.gms.internal.ads;

public final class zzbal extends zzgrq implements zzgtb {
    private static final zzbal zzb;
    private int zzd;
    private int zze;

    static {
        zzbal zzbal0 = new zzbal();
        zzbal.zzb = zzbal0;
        zzgrq.zzaU(zzbal.class, zzbal0);
    }

    static zzbal zza() {
        return zzbal.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbal.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzbak.zza});
            }
            case 3: {
                return new zzbal();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbaj(null);
                    }
                    case 5: {
                        return zzbal.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


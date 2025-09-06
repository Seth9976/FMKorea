package com.google.android.gms.internal.ads;

public final class zzano extends zzgrq implements zzgtb {
    private static final zzano zzb;
    private int zzd;
    private zzanq zze;
    private zzant zzf;

    static {
        zzano zzano0 = new zzano();
        zzano.zzb = zzano0;
        zzgrq.zzaU(zzano.class, zzano0);
    }

    static zzano zza() {
        return zzano.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzano.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzano();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzann(null);
                    }
                    case 5: {
                        return zzano.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


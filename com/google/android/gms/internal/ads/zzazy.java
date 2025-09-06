package com.google.android.gms.internal.ads;

public final class zzazy extends zzgrq implements zzgtb {
    private static final zzazy zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazy zzazy0 = new zzazy();
        zzazy.zzb = zzazy0;
        zzgrq.zzaU(zzazy.class, zzazy0);
    }

    static zzazy zza() {
        return zzazy.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazy.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzazy();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazx(null);
                    }
                    case 5: {
                        return zzazy.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


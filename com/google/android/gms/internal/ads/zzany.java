package com.google.android.gms.internal.ads;

public final class zzany extends zzgrq implements zzgtb {
    private static final zzany zzb;
    private int zzd;
    private int zze;

    static {
        zzany zzany0 = new zzany();
        zzany.zzb = zzany0;
        zzgrq.zzaU(zzany.class, zzany0);
    }

    static zzany zza() {
        return zzany.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzany.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzaoc.zza});
            }
            case 3: {
                return new zzany();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzanx(null);
                    }
                    case 5: {
                        return zzany.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


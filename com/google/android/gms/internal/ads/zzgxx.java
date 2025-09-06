package com.google.android.gms.internal.ads;

public final class zzgxx extends zzgrq implements zzgtb {
    private static final zzgxx zzb;
    private int zzd;
    private String zze;

    static {
        zzgxx zzgxx0 = new zzgxx();
        zzgxx.zzb = zzgxx0;
        zzgrq.zzaU(zzgxx.class, zzgxx0);
    }

    private zzgxx() {
        this.zze = "";
    }

    static zzgxx zza() {
        return zzgxx.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxx.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgxx();
                    }
                    case 4: {
                        return new zzgxw(null);
                    }
                    case 5: {
                        return zzgxx.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


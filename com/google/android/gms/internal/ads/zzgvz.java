package com.google.android.gms.internal.ads;

public final class zzgvz extends zzgrq implements zzgtb {
    private static final zzgvz zzb;
    private int zzd;
    private zzgqi zze;

    static {
        zzgvz zzgvz0 = new zzgvz();
        zzgvz.zzb = zzgvz0;
        zzgrq.zzaU(zzgvz.class, zzgvz0);
    }

    private zzgvz() {
        this.zze = zzgqi.zzb;
    }

    static zzgvz zza() {
        return zzgvz.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgvz.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgvz();
                    }
                    case 4: {
                        return new zzgvy(null);
                    }
                    case 5: {
                        return zzgvz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


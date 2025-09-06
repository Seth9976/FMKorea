package com.google.android.gms.internal.ads;

public final class zzgvj extends zzgrq implements zzgtb {
    private static final zzgvj zzb;
    private zzgrz zzd;

    static {
        zzgvj zzgvj0 = new zzgvj();
        zzgvj.zzb = zzgvj0;
        zzgrq.zzaU(zzgvj.class, zzgvj0);
    }

    private zzgvj() {
        this.zzd = zzgrq.zzaN();
    }

    public static zzgvi zza() {
        return (zzgvi)zzgvj.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgvj.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzgvh.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgvj();
                    }
                    case 4: {
                        return new zzgvi(null);
                    }
                    case 5: {
                        return zzgvj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgvj zzc() {
        return zzgvj.zzb;
    }

    static void zzd(zzgvj zzgvj0, zzgvh zzgvh0) {
        zzgvh0.getClass();
        zzgrz zzgrz0 = zzgvj0.zzd;
        if(!zzgrz0.zzc()) {
            zzgvj0.zzd = zzgrq.zzaO(zzgrz0);
        }
        zzgvj0.zzd.add(zzgvh0);
    }
}


package com.google.android.gms.internal.ads;

public final class zzgni extends zzgrq implements zzgtb {
    private static final zzgni zzb;
    private int zzd;
    private zzgrz zze;

    static {
        zzgni zzgni0 = new zzgni();
        zzgni.zzb = zzgni0;
        zzgrq.zzaU(zzgni.class, zzgni0);
    }

    private zzgni() {
        this.zze = zzgrq.zzaN();
    }

    public static zzgnf zza() {
        return (zzgnf)zzgni.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgni.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zzd", "zze", zzgnh.class});
            }
            case 3: {
                return new zzgni();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgnf(null);
                    }
                    case 5: {
                        return zzgni.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgni zzc() {
        return zzgni.zzb;
    }

    static void zzd(zzgni zzgni0, int v) {
        zzgni0.zzd = v;
    }

    static void zze(zzgni zzgni0, zzgnh zzgnh0) {
        zzgnh0.getClass();
        zzgrz zzgrz0 = zzgni0.zze;
        if(!zzgrz0.zzc()) {
            zzgni0.zze = zzgrq.zzaO(zzgrz0);
        }
        zzgni0.zze.add(zzgnh0);
    }
}


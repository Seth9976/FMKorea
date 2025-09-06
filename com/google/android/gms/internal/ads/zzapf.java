package com.google.android.gms.internal.ads;

public final class zzapf extends zzgrq implements zzgtb {
    private static final zzapf zzb;
    private int zzd;
    private zzgrz zze;
    private zzgqi zzf;
    private int zzg;
    private int zzh;

    static {
        zzapf zzapf0 = new zzapf();
        zzapf.zzb = zzapf0;
        zzgrq.zzaU(zzapf.class, zzapf0);
    }

    private zzapf() {
        this.zze = zzgrq.zzaN();
        this.zzf = zzgqi.zzb;
        this.zzg = 1;
        this.zzh = 1;
    }

    public static zzape zza() {
        return (zzape)zzapf.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzapf.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001C\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaoz.zza, "zzh", zzaox.zza});
            }
            case 3: {
                return new zzapf();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzape(null);
                    }
                    case 5: {
                        return zzapf.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzapf zzc() {
        return zzapf.zzb;
    }

    static void zzd(zzapf zzapf0, zzgqi zzgqi0) {
        zzgrz zzgrz0 = zzapf0.zze;
        if(!zzgrz0.zzc()) {
            zzapf0.zze = zzgrq.zzaO(zzgrz0);
        }
        zzapf0.zze.add(zzgqi0);
    }

    static void zze(zzapf zzapf0, zzgqi zzgqi0) {
        zzapf0.zzd |= 1;
        zzapf0.zzf = zzgqi0;
    }

    static void zzf(zzapf zzapf0, int v) {
        zzapf0.zzh = 4;
        zzapf0.zzd |= 4;
    }
}


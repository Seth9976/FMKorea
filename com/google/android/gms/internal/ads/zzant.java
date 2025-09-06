package com.google.android.gms.internal.ads;

public final class zzant extends zzgrq implements zzgtb {
    private static final zzant zzb;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static {
        zzant zzant0 = new zzant();
        zzant.zzb = zzant0;
        zzgrq.zzaU(zzant.class, zzant0);
    }

    private zzant() {
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    static zzant zza() {
        return zzant.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzant.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzant();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzans(null);
                    }
                    case 5: {
                        return zzant.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


package com.google.android.gms.internal.ads;

public final class zzbat extends zzgrq implements zzgtb {
    private static final zzbat zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzbat zzbat0 = new zzbat();
        zzbat.zzb = zzbat0;
        zzgrq.zzaU(zzbat.class, zzbat0);
    }

    private zzbat() {
        this.zze = 1000;
    }

    static zzbat zza() {
        return zzbat.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbat.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzbat();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbas(null);
                    }
                    case 5: {
                        return zzbat.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


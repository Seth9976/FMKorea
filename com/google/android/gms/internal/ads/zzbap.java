package com.google.android.gms.internal.ads;

public final class zzbap extends zzgrq implements zzgtb {
    private static final zzbap zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbap zzbap0 = new zzbap();
        zzbap.zzb = zzbap0;
        zzgrq.zzaU(zzbap.class, zzbap0);
    }

    private zzbap() {
        this.zze = 1000;
    }

    static zzbap zza() {
        return zzbap.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbap.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzbap();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbao(null);
                    }
                    case 5: {
                        return zzbap.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


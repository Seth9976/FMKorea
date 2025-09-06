package com.google.android.gms.internal.ads;

public final class zzbax extends zzgrq implements zzgtb {
    private static final zzbax zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;

    static {
        zzbax zzbax0 = new zzbax();
        zzbax.zzb = zzbax0;
        zzgrq.zzaU(zzbax.class, zzbax0);
    }

    private zzbax() {
        this.zze = 1000;
    }

    static zzbax zza() {
        return zzbax.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbax.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayr.zza, "zzf"});
            }
            case 3: {
                return new zzbax();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbaw(null);
                    }
                    case 5: {
                        return zzbax.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


package com.google.android.gms.internal.ads;

public final class zzbav extends zzgrq implements zzgtb {
    private static final zzbav zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;
    private zzbac zzg;

    static {
        zzbav zzbav0 = new zzbav();
        zzbav.zzb = zzbav0;
        zzgrq.zzaU(zzbav.class, zzbav0);
    }

    private zzbav() {
        this.zze = 1000;
    }

    static zzbav zza() {
        return zzbav.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbav.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzbav();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbau(null);
                    }
                    case 5: {
                        return zzbav.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


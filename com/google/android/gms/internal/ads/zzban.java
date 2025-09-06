package com.google.android.gms.internal.ads;

public final class zzban extends zzgrq implements zzgtb {
    private static final zzban zzb;
    private int zzd;
    private zzbae zze;
    private int zzf;
    private zzbal zzg;
    private zzbac zzh;

    static {
        zzban zzban0 = new zzban();
        zzban.zzb = zzban0;
        zzgrq.zzaU(zzban.class, zzban0);
    }

    private zzban() {
        this.zzf = 1000;
    }

    static zzban zza() {
        return zzban.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzban.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg", "zzh"});
            }
            case 3: {
                return new zzban();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbam(null);
                    }
                    case 5: {
                        return zzban.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


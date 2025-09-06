package com.google.android.gms.internal.ads;

public final class zzayw extends zzgrq implements zzgtb {
    private static final zzayw zzb;
    private int zzd;
    private String zze;
    private int zzf;
    private zzgrv zzg;
    private zzbac zzh;

    static {
        zzayw zzayw0 = new zzayw();
        zzayw.zzb = zzayw0;
        zzgrq.zzaU(zzayw.class, zzayw0);
    }

    private zzayw() {
        this.zze = "";
        this.zzg = zzgrq.zzaJ();
    }

    static zzayw zza() {
        return zzayw.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayw.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg", "zzh"});
            }
            case 3: {
                return new zzayw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayv(null);
                    }
                    case 5: {
                        return zzayw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


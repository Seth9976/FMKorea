package com.google.android.gms.internal.ads;

public final class zzaza extends zzgrq implements zzgtb {
    private static final zzaza zzb;
    private int zzd;
    private zzayw zze;
    private zzgrz zzf;
    private int zzg;
    private zzbac zzh;

    static {
        zzaza zzaza0 = new zzaza();
        zzaza.zzb = zzaza0;
        zzgrq.zzaU(zzaza.class, zzaza0);
    }

    private zzaza() {
        this.zzf = zzgrq.zzaN();
    }

    static zzaza zza() {
        return zzaza.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaza.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001B\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbaa.class, "zzg", zzayr.zza, "zzh"});
            }
            case 3: {
                return new zzaza();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayz(null);
                    }
                    case 5: {
                        return zzaza.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


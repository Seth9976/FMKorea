package com.google.android.gms.internal.ads;

public final class zzbar extends zzgrq implements zzgtb {
    private static final zzbar zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;
    private zzbac zzg;

    static {
        zzbar zzbar0 = new zzbar();
        zzbar.zzb = zzbar0;
        zzgrq.zzaU(zzbar.class, zzbar0);
    }

    private zzbar() {
        this.zze = 1000;
    }

    static zzbar zza() {
        return zzbar.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbar.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzbar();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbaq(null);
                    }
                    case 5: {
                        return zzbar.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


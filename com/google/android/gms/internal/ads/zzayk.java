package com.google.android.gms.internal.ads;

public final class zzayk extends zzgrq implements zzgtb {
    private static final zzayk zzb;
    private int zzd;
    private int zze;
    private zzbac zzf;
    private zzbac zzg;
    private zzbac zzh;
    private zzgrz zzi;
    private int zzj;

    static {
        zzayk zzayk0 = new zzayk();
        zzayk.zzb = zzayk0;
        zzgrq.zzaU(zzayk.class, zzayk0);
    }

    private zzayk() {
        this.zzi = zzgrq.zzaN();
    }

    static zzayk zza() {
        return zzayk.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayk.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001B\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzbac.class, "zzj"});
            }
            case 3: {
                return new zzayk();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayj(null);
                    }
                    case 5: {
                        return zzayk.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


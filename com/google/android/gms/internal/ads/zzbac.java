package com.google.android.gms.internal.ads;

public final class zzbac extends zzgrq implements zzgtb {
    private static final zzbac zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbac zzbac0 = new zzbac();
        zzbac.zzb = zzbac0;
        zzgrq.zzaU(zzbac.class, zzbac0);
    }

    static zzbac zza() {
        return zzbac.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbac.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzbac();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbab(null);
                    }
                    case 5: {
                        return zzbac.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


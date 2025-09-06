package com.google.android.gms.internal.ads;

public final class zzbaz extends zzgrq implements zzgtb {
    private static final zzbaz zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbaz zzbaz0 = new zzbaz();
        zzbaz.zzb = zzbaz0;
        zzgrq.zzaU(zzbaz.class, zzbaz0);
    }

    public static zzbay zza() {
        return (zzbay)zzbaz.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbaz.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzbaz();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbay(null);
                    }
                    case 5: {
                        return zzbaz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzbaz zzc() {
        return zzbaz.zzb;
    }

    static void zzd(zzbaz zzbaz0, boolean z) {
        zzbaz0.zzd |= 1;
        zzbaz0.zze = z;
    }

    static void zze(zzbaz zzbaz0, int v) {
        zzbaz0.zzd |= 2;
        zzbaz0.zzf = v;
    }

    public final boolean zzf() {
        return this.zze;
    }
}


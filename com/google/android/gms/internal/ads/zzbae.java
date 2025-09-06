package com.google.android.gms.internal.ads;

public final class zzbae extends zzgrq implements zzgtb {
    private static final zzbae zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbae zzbae0 = new zzbae();
        zzbae.zzb = zzbae0;
        zzgrq.zzaU(zzbae.class, zzbae0);
    }

    public static zzbad zza() {
        return (zzbad)zzbae.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbae.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbae();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbad(null);
                    }
                    case 5: {
                        return zzbae.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzbae zzc() {
        return zzbae.zzb;
    }

    static void zzd(zzbae zzbae0, int v) {
        zzbae0.zzd |= 1;
        zzbae0.zze = v;
    }

    static void zze(zzbae zzbae0, int v) {
        zzbae0.zzd |= 2;
        zzbae0.zzf = v;
    }

    static void zzf(zzbae zzbae0, int v) {
        zzbae0.zzd |= 4;
        zzbae0.zzg = v;
    }
}


package com.google.android.gms.internal.ads;

public final class zzbaa extends zzgrq implements zzgtb {
    private static final zzbaa zzb;
    private int zzd;
    private String zze;
    private int zzf;
    private zzbac zzg;

    static {
        zzbaa zzbaa0 = new zzbaa();
        zzbaa.zzb = zzbaa0;
        zzgrq.zzaU(zzbaa.class, zzbaa0);
    }

    private zzbaa() {
        this.zze = "";
    }

    static zzbaa zza() {
        return zzbaa.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbaa.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg"});
            }
            case 3: {
                return new zzbaa();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazz(null);
                    }
                    case 5: {
                        return zzbaa.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


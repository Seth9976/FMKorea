package com.google.android.gms.internal.ads;

public final class zzgxr extends zzgrq implements zzgtb {
    private static final zzgxr zzb;
    private int zzd;
    private String zze;
    private String zzf;

    static {
        zzgxr zzgxr0 = new zzgxr();
        zzgxr.zzb = zzgxr0;
        zzgrq.zzaU(zzgxr.class, zzgxr0);
    }

    private zzgxr() {
        this.zze = "";
        this.zzf = "";
    }

    static zzgxr zza() {
        return zzgxr.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxr.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgxr();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxq(null);
                    }
                    case 5: {
                        return zzgxr.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


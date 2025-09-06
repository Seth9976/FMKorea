package com.google.android.gms.internal.ads;

public final class zzayp extends zzgrq implements zzgtb {
    private static final zzayp zzb;
    private int zzd;
    private int zze;
    private zzbae zzf;
    private String zzg;
    private String zzh;

    static {
        zzayp zzayp0 = new zzayp();
        zzayp.zzb = zzayp0;
        zzgrq.zzaU(zzayp.class, zzayp0);
    }

    private zzayp() {
        this.zzg = "";
        this.zzh = "";
    }

    static zzayp zza() {
        return zzayp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayp.zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzayo.zza, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzayp();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayn(null);
                    }
                    case 5: {
                        return zzayp.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


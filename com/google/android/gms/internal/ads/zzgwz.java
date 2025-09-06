package com.google.android.gms.internal.ads;

public final class zzgwz extends zzgrq implements zzgtb {
    private static final zzgwz zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzgwz zzgwz0 = new zzgwz();
        zzgwz.zzb = zzgwz0;
        zzgrq.zzaU(zzgwz.class, zzgwz0);
    }

    static zzgwz zza() {
        return zzgwz.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwz.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgwy.zza, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgwz();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwx(null);
                    }
                    case 5: {
                        return zzgwz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


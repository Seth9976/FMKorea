package com.google.android.gms.internal.ads;

public final class zzgww extends zzgrq implements zzgtb {
    private static final zzgww zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzgww zzgww0 = new zzgww();
        zzgww.zzb = zzgww0;
        zzgrq.zzaU(zzgww.class, zzgww0);
    }

    static zzgww zza() {
        return zzgww.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgww.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgwv.zza, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgww();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwu(null);
                    }
                    case 5: {
                        return zzgww.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


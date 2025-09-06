package com.google.android.gms.internal.ads;

public final class zzgwe extends zzgrq implements zzgtb {
    private static final zzgwe zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzgwe zzgwe0 = new zzgwe();
        zzgwe.zzb = zzgwe0;
        zzgrq.zzaU(zzgwe.class, zzgwe0);
    }

    static zzgwe zza() {
        return zzgwe.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwe.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgwd.zza, "zzf", zzgwb.zza, "zzg", "zzh"});
            }
            case 3: {
                return new zzgwe();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwc(null);
                    }
                    case 5: {
                        return zzgwe.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


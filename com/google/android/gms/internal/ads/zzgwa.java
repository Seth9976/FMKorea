package com.google.android.gms.internal.ads;

public final class zzgwa extends zzgrq implements zzgtb {
    private static final zzgwa zzb;
    private int zzd;
    private String zze;
    private zzgvz zzf;
    private long zzg;
    private String zzh;

    static {
        zzgwa zzgwa0 = new zzgwa();
        zzgwa.zzb = zzgwa0;
        zzgrq.zzaU(zzgwa.class, zzgwa0);
    }

    private zzgwa() {
        this.zze = "";
        this.zzh = "";
    }

    static zzgwa zza() {
        return zzgwa.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgwa.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgwa();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgvx(null);
                    }
                    case 5: {
                        return zzgwa.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


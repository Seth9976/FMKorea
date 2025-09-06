package com.google.android.gms.internal.ads;

@Deprecated
public final class zzgnz extends zzgrq implements zzgtb {
    private static final zzgnz zzb;
    private String zzd;
    private zzgrz zze;

    static {
        zzgnz zzgnz0 = new zzgnz();
        zzgnz.zzb = zzgnz0;
        zzgrq.zzaU(zzgnz.class, zzgnz0);
    }

    private zzgnz() {
        this.zzd = "";
        this.zze = zzgrq.zzaN();
    }

    static zzgnz zza() {
        return zzgnz.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgnz.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001B", new Object[]{"zzd", "zze", zzgmy.class});
            }
            case 3: {
                return new zzgnz();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgny(null);
                    }
                    case 5: {
                        return zzgnz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgnz zzc() {
        return zzgnz.zzb;
    }
}


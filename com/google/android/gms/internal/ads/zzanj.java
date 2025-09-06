package com.google.android.gms.internal.ads;

public final class zzanj extends zzgrq implements zzgtb {
    private static final zzanj zzb;
    private int zzd;
    private String zze;
    private String zzf;

    static {
        zzanj zzanj0 = new zzanj();
        zzanj.zzb = zzanj0;
        zzgrq.zzaU(zzanj.class, zzanj0);
    }

    private zzanj() {
        this.zze = "";
        this.zzf = "";
    }

    static zzanj zza() {
        return zzanj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzanj.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzanj();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzani(null);
                    }
                    case 5: {
                        return zzanj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


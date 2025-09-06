package com.google.android.gms.internal.ads;

public final class zzaol extends zzgrq implements zzgtb {
    private static final zzaol zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzaol zzaol0 = new zzaol();
        zzaol.zzb = zzaol0;
        zzgrq.zzaU(zzaol.class, zzaol0);
    }

    private zzaol() {
        this.zzf = -1L;
    }

    static zzaol zza() {
        return zzaol.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaol.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzaoa.zza, "zzf"});
            }
            case 3: {
                return new zzaol();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaok(null);
                    }
                    case 5: {
                        return zzaol.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


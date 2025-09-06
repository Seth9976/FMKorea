package com.google.android.gms.internal.ads;

public final class zzaye extends zzgrq implements zzgtb {
    private static final zzaye zzb;
    private int zzd;
    private int zze;
    private zzazy zzf;

    static {
        zzaye zzaye0 = new zzaye();
        zzaye.zzb = zzaye0;
        zzgrq.zzaU(zzaye.class, zzaye0);
    }

    static zzaye zza() {
        return zzaye.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaye.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayb.zza, "zzf"});
            }
            case 3: {
                return new zzaye();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayd(null);
                    }
                    case 5: {
                        return zzaye.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


package com.google.android.gms.internal.ads;

public final class zzfib extends zzgrq implements zzgtb {
    private static final zzfib zzb;
    private int zzd;
    private zzfhx zze;

    static {
        zzfib zzfib0 = new zzfib();
        zzfib.zzb = zzfib0;
        zzgrq.zzaU(zzfib.class, zzfib0);
    }

    public static zzfia zza() {
        return (zzfia)zzfib.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzfib.zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzfib();
                    }
                    case 4: {
                        return new zzfia(null);
                    }
                    case 5: {
                        return zzfib.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzfib zzc() {
        return zzfib.zzb;
    }

    static void zzd(zzfib zzfib0, zzfhx zzfhx0) {
        zzfhx0.getClass();
        zzfib0.zze = zzfhx0;
        zzfib0.zzd |= 1;
    }
}


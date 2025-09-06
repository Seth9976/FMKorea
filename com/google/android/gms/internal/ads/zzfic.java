package com.google.android.gms.internal.ads;

public final class zzfic extends zzgrq implements zzgtb {
    private static final zzfic zzb;
    private zzgrz zzd;

    static {
        zzfic zzfic0 = new zzfic();
        zzfic.zzb = zzfic0;
        zzgrq.zzaU(zzfic.class, zzfic0);
    }

    private zzfic() {
        this.zzd = zzgrq.zzaN();
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzfic.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzfib.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzfic();
                    }
                    case 4: {
                        return new zzfhz(null);
                    }
                    case 5: {
                        return zzfic.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzfhz zzc() {
        return (zzfhz)zzfic.zzb.zzaA();
    }

    static zzfic zzd() {
        return zzfic.zzb;
    }

    static void zze(zzfic zzfic0) {
        zzfic0.zzd = zzgrq.zzaN();
    }

    static void zzf(zzfic zzfic0, zzfib zzfib0) {
        zzfib0.getClass();
        zzgrz zzgrz0 = zzfic0.zzd;
        if(!zzgrz0.zzc()) {
            zzfic0.zzd = zzgrq.zzaO(zzgrz0);
        }
        zzfic0.zzd.add(zzfib0);
    }
}


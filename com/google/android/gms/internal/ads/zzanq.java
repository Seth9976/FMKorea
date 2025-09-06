package com.google.android.gms.internal.ads;

public final class zzanq extends zzgrq implements zzgtb {
    private static final zzanq zzb;
    private int zzd;
    private int zze;

    static {
        zzanq zzanq0 = new zzanq();
        zzanq.zzb = zzanq0;
        zzgrq.zzaU(zzanq.class, zzanq0);
    }

    private zzanq() {
        this.zze = 2;
    }

    static zzanq zza() {
        return zzanq.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzanq.zzb, "\u0001\u0001\u0000\u0001\u001B\u001B\u0001\u0000\u0000\u0000\u001B᠌\u0000", new Object[]{"zzd", "zze", zzanr.zza});
            }
            case 3: {
                return new zzanq();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzanp(null);
                    }
                    case 5: {
                        return zzanq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


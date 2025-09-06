package com.google.android.gms.internal.ads;

public final class zzgli extends zzgrq implements zzgtb {
    private static final zzgli zzb;
    private int zzd;

    static {
        zzgli zzgli0 = new zzgli();
        zzgli.zzb = zzgli0;
        zzgrq.zzaU(zzgli.class, zzgli0);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgli.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzd"});
            }
            case 3: {
                return new zzgli();
            }
            case 4: {
                return new zzglh(null);
            }
            case 5: {
                return zzgli.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzglh zzc() {
        return (zzglh)zzgli.zzb.zzaA();
    }

    static zzgli zzd() {
        return zzgli.zzb;
    }

    public static zzgli zze() {
        return zzgli.zzb;
    }

    static void zzf(zzgli zzgli0, int v) {
        zzgli0.zzd = v;
    }
}


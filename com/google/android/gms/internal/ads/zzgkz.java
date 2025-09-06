package com.google.android.gms.internal.ads;

public final class zzgkz extends zzgrq implements zzgtb {
    private static final zzgkz zzb;
    private int zzd;

    static {
        zzgkz zzgkz0 = new zzgkz();
        zzgkz.zzb = zzgkz0;
        zzgrq.zzaU(zzgkz.class, zzgkz0);
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
                return zzgrq.zzaR(zzgkz.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzd"});
            }
            case 3: {
                return new zzgkz();
            }
            case 4: {
                return new zzgky(null);
            }
            case 5: {
                return zzgkz.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgky zzc() {
        return (zzgky)zzgkz.zzb.zzaA();
    }

    static zzgkz zzd() {
        return zzgkz.zzb;
    }

    public static zzgkz zze() {
        return zzgkz.zzb;
    }

    static void zzf(zzgkz zzgkz0, int v) {
        zzgkz0.zzd = v;
    }
}


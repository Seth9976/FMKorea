package com.google.android.gms.internal.ads;

public final class zzgkk extends zzgrq implements zzgtb {
    private static final zzgkk zzb;
    private int zzd;

    static {
        zzgkk zzgkk0 = new zzgkk();
        zzgkk.zzb = zzgkk0;
        zzgrq.zzaU(zzgkk.class, zzgkk0);
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
                return zzgrq.zzaR(zzgkk.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzd"});
            }
            case 3: {
                return new zzgkk();
            }
            case 4: {
                return new zzgkj(null);
            }
            case 5: {
                return zzgkk.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgkj zzc() {
        return (zzgkj)zzgkk.zzb.zzaA();
    }

    static zzgkk zzd() {
        return zzgkk.zzb;
    }

    public static zzgkk zze() {
        return zzgkk.zzb;
    }

    static void zzf(zzgkk zzgkk0, int v) {
        zzgkk0.zzd = v;
    }
}


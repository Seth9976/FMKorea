package com.google.android.gms.internal.ads;

public final class zzgof extends zzgrq implements zzgtb {
    private static final zzgof zzb;
    private int zzd;

    static {
        zzgof zzgof0 = new zzgof();
        zzgof.zzb = zzgof0;
        zzgrq.zzaU(zzgof.class, zzgof0);
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
                return zzgrq.zzaR(zzgof.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzd"});
            }
            case 3: {
                return new zzgof();
            }
            case 4: {
                return new zzgoe(null);
            }
            case 5: {
                return zzgof.zzb;
            }
            default: {
                return null;
            }
        }
    }

    static zzgof zzc() {
        return zzgof.zzb;
    }

    public static zzgof zzd() {
        return zzgof.zzb;
    }

    public static zzgof zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgof)zzgrq.zzaG(zzgof.zzb, zzgqi0, zzgrc0);
    }
}


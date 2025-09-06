package com.google.android.gms.internal.ads;

public final class zzgma extends zzgrq implements zzgtb {
    private static final zzgma zzb;

    static {
        zzgma zzgma0 = new zzgma();
        zzgma.zzb = zzgma0;
        zzgrq.zzaU(zzgma.class, zzgma0);
    }

    static zzgma zza() {
        return zzgma.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgma.zzb, "\u0000\u0000", null);
            }
            case 3: {
                return new zzgma();
            }
            case 4: {
                return new zzglz(null);
            }
            case 5: {
                return zzgma.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgma zzc() {
        return zzgma.zzb;
    }

    public static zzgma zzd(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgma)zzgrq.zzaG(zzgma.zzb, zzgqi0, zzgrc0);
    }
}


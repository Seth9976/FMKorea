package com.google.android.gms.internal.ads;

public final class zzglr extends zzgrq implements zzgtb {
    private static final zzglr zzb;
    private int zzd;
    private zzgqi zze;

    static {
        zzglr zzglr0 = new zzglr();
        zzglr.zzb = zzglr0;
        zzgrq.zzaU(zzglr.class, zzglr0);
    }

    private zzglr() {
        this.zze = zzgqi.zzb;
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
                return zzgrq.zzaR(zzglr.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzglr();
                    }
                    case 4: {
                        return new zzglq(null);
                    }
                    case 5: {
                        return zzglr.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzglq zzc() {
        return (zzglq)zzglr.zzb.zzaA();
    }

    static zzglr zzd() {
        return zzglr.zzb;
    }

    public static zzglr zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglr)zzgrq.zzaG(zzglr.zzb, zzgqi0, zzgrc0);
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    static void zzg(zzglr zzglr0, int v) {
        zzglr0.zzd = 0;
    }

    static void zzh(zzglr zzglr0, zzgqi zzgqi0) {
        zzglr0.zze = zzgqi0;
    }
}


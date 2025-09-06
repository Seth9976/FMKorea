package com.google.android.gms.internal.ads;

public final class zzgll extends zzgrq implements zzgtb {
    private static final zzgll zzb;
    private int zzd;
    private zzgqi zze;

    static {
        zzgll zzgll0 = new zzgll();
        zzgll.zzb = zzgll0;
        zzgrq.zzaU(zzgll.class, zzgll0);
    }

    private zzgll() {
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
                return zzgrq.zzaR(zzgll.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgll();
                    }
                    case 4: {
                        return new zzglk(null);
                    }
                    case 5: {
                        return zzgll.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzglk zzc() {
        return (zzglk)zzgll.zzb.zzaA();
    }

    static zzgll zzd() {
        return zzgll.zzb;
    }

    public static zzgll zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgll)zzgrq.zzaG(zzgll.zzb, zzgqi0, zzgrc0);
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    static void zzg(zzgll zzgll0, int v) {
        zzgll0.zzd = 0;
    }

    static void zzh(zzgll zzgll0, zzgqi zzgqi0) {
        zzgll0.zze = zzgqi0;
    }
}


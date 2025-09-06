package com.google.android.gms.internal.ads;

public final class zzgoc extends zzgrq implements zzgtb {
    private static final zzgoc zzb;
    private int zzd;
    private zzgqi zze;

    static {
        zzgoc zzgoc0 = new zzgoc();
        zzgoc.zzb = zzgoc0;
        zzgrq.zzaU(zzgoc.class, zzgoc0);
    }

    private zzgoc() {
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
                return zzgrq.zzaR(zzgoc.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgoc();
                    }
                    case 4: {
                        return new zzgob(null);
                    }
                    case 5: {
                        return zzgoc.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgob zzc() {
        return (zzgob)zzgoc.zzb.zzaA();
    }

    static zzgoc zzd() {
        return zzgoc.zzb;
    }

    public static zzgoc zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgoc)zzgrq.zzaG(zzgoc.zzb, zzgqi0, zzgrc0);
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    static void zzg(zzgoc zzgoc0, int v) {
        zzgoc0.zzd = 0;
    }

    static void zzh(zzgoc zzgoc0, zzgqi zzgqi0) {
        zzgoc0.zze = zzgqi0;
    }
}


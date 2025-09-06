package com.google.android.gms.internal.ads;

public final class zzgke extends zzgrq implements zzgtb {
    private static final zzgke zzb;
    private int zzd;
    private int zze;
    private zzgqi zzf;
    private zzgkk zzg;

    static {
        zzgke zzgke0 = new zzgke();
        zzgke.zzb = zzgke0;
        zzgrq.zzaU(zzgke.class, zzgke0);
    }

    private zzgke() {
        this.zzf = zzgqi.zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgke.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgke();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgkd(null);
                    }
                    case 5: {
                        return zzgke.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgkd zzc() {
        return (zzgkd)zzgke.zzb.zzaA();
    }

    static zzgke zzd() {
        return zzgke.zzb;
    }

    public static zzgke zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgke)zzgrq.zzaG(zzgke.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkk zzf() {
        return this.zzg == null ? zzgkk.zze() : this.zzg;
    }

    public final zzgqi zzg() {
        return this.zzf;
    }

    static void zzh(zzgke zzgke0, int v) {
        zzgke0.zze = 0;
    }

    static void zzi(zzgke zzgke0, zzgqi zzgqi0) {
        zzgke0.zzf = zzgqi0;
    }

    static void zzj(zzgke zzgke0, zzgkk zzgkk0) {
        zzgkk0.getClass();
        zzgke0.zzg = zzgkk0;
        zzgke0.zzd |= 1;
    }
}


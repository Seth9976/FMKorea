package com.google.android.gms.internal.ads;

public final class zzgmf extends zzgrq implements zzgtb {
    private static final zzgmf zzb;
    private int zzd;
    private int zze;
    private zzgml zzf;
    private zzgqi zzg;

    static {
        zzgmf zzgmf0 = new zzgmf();
        zzgmf.zzb = zzgmf0;
        zzgrq.zzaU(zzgmf.class, zzgmf0);
    }

    private zzgmf() {
        this.zzg = zzgqi.zzb;
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
                return zzgrq.zzaR(zzgmf.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgmf();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgme(null);
                    }
                    case 5: {
                        return zzgmf.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgme zzc() {
        return (zzgme)zzgmf.zzb.zzaA();
    }

    static zzgmf zzd() {
        return zzgmf.zzb;
    }

    public static zzgmf zze() {
        return zzgmf.zzb;
    }

    public static zzgmf zzf(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgmf)zzgrq.zzaG(zzgmf.zzb, zzgqi0, zzgrc0);
    }

    public final zzgml zzg() {
        return this.zzf == null ? zzgml.zze() : this.zzf;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }

    static void zzi(zzgmf zzgmf0, int v) {
        zzgmf0.zze = 0;
    }

    static void zzj(zzgmf zzgmf0, zzgml zzgml0) {
        zzgml0.getClass();
        zzgmf0.zzf = zzgml0;
        zzgmf0.zzd |= 1;
    }

    static void zzk(zzgmf zzgmf0, zzgqi zzgqi0) {
        zzgmf0.zzg = zzgqi0;
    }
}


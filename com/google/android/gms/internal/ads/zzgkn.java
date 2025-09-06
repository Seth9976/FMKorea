package com.google.android.gms.internal.ads;

public final class zzgkn extends zzgrq implements zzgtb {
    private static final zzgkn zzb;
    private int zzd;
    private int zze;
    private zzgkt zzf;
    private zzgmf zzg;

    static {
        zzgkn zzgkn0 = new zzgkn();
        zzgkn.zzb = zzgkn0;
        zzgrq.zzaU(zzgkn.class, zzgkn0);
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
                return zzgrq.zzaR(zzgkn.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgkn();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgkm(null);
                    }
                    case 5: {
                        return zzgkn.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgkm zzc() {
        return (zzgkm)zzgkn.zzb.zzaA();
    }

    static zzgkn zzd() {
        return zzgkn.zzb;
    }

    public static zzgkn zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgkn)zzgrq.zzaG(zzgkn.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkt zzf() {
        return this.zzf == null ? zzgkt.zze() : this.zzf;
    }

    public final zzgmf zzg() {
        return this.zzg == null ? zzgmf.zze() : this.zzg;
    }

    static void zzh(zzgkn zzgkn0, int v) {
        zzgkn0.zze = 0;
    }

    static void zzi(zzgkn zzgkn0, zzgkt zzgkt0) {
        zzgkt0.getClass();
        zzgkn0.zzf = zzgkt0;
        zzgkn0.zzd |= 1;
    }

    static void zzj(zzgkn zzgkn0, zzgmf zzgmf0) {
        zzgmf0.getClass();
        zzgkn0.zzg = zzgmf0;
        zzgkn0.zzd |= 2;
    }
}


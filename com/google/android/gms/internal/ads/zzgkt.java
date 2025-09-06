package com.google.android.gms.internal.ads;

public final class zzgkt extends zzgrq implements zzgtb {
    private static final zzgkt zzb;
    private int zzd;
    private int zze;
    private zzgkz zzf;
    private zzgqi zzg;

    static {
        zzgkt zzgkt0 = new zzgkt();
        zzgkt.zzb = zzgkt0;
        zzgrq.zzaU(zzgkt.class, zzgkt0);
    }

    private zzgkt() {
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
                return zzgrq.zzaR(zzgkt.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgkt();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgks(null);
                    }
                    case 5: {
                        return zzgkt.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgks zzc() {
        return (zzgks)zzgkt.zzb.zzaA();
    }

    static zzgkt zzd() {
        return zzgkt.zzb;
    }

    public static zzgkt zze() {
        return zzgkt.zzb;
    }

    public static zzgkt zzf(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgkt)zzgrq.zzaG(zzgkt.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkz zzg() {
        return this.zzf == null ? zzgkz.zze() : this.zzf;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }

    static void zzi(zzgkt zzgkt0, int v) {
        zzgkt0.zze = 0;
    }

    static void zzj(zzgkt zzgkt0, zzgkz zzgkz0) {
        zzgkz0.getClass();
        zzgkt0.zzf = zzgkz0;
        zzgkt0.zzd |= 1;
    }

    static void zzk(zzgkt zzgkt0, zzgqi zzgqi0) {
        zzgkt0.zzg = zzgqi0;
    }
}


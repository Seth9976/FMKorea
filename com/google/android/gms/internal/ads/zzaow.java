package com.google.android.gms.internal.ads;

public final class zzaow extends zzgrq implements zzgtb {
    private static final zzaow zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private zzgqi zzg;
    private zzgqi zzh;

    static {
        zzaow zzaow0 = new zzaow();
        zzaow.zzb = zzaow0;
        zzgrq.zzaU(zzaow.class, zzaow0);
    }

    private zzaow() {
        this.zze = zzgqi.zzb;
        this.zzf = zzgqi.zzb;
        this.zzg = zzgqi.zzb;
        this.zzh = zzgqi.zzb;
    }

    public static zzaov zza() {
        return (zzaov)zzaow.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaow.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzaow();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaov(null);
                    }
                    case 5: {
                        return zzaow.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaow zzc() {
        return zzaow.zzb;
    }

    public static zzaow zzd(byte[] arr_b, zzgrc zzgrc0) {
        return (zzaow)zzgrq.zzaI(zzaow.zzb, arr_b, zzgrc0);
    }

    public final zzgqi zze() {
        return this.zze;
    }

    public final zzgqi zzf() {
        return this.zzf;
    }

    public final zzgqi zzg() {
        return this.zzh;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }

    static void zzi(zzaow zzaow0, zzgqi zzgqi0) {
        zzaow0.zzd |= 1;
        zzaow0.zze = zzgqi0;
    }

    static void zzj(zzaow zzaow0, zzgqi zzgqi0) {
        zzaow0.zzd |= 2;
        zzaow0.zzf = zzgqi0;
    }

    static void zzk(zzaow zzaow0, zzgqi zzgqi0) {
        zzaow0.zzd |= 4;
        zzaow0.zzg = zzgqi0;
    }

    static void zzl(zzaow zzaow0, zzgqi zzgqi0) {
        zzaow0.zzd |= 8;
        zzaow0.zzh = zzgqi0;
    }
}


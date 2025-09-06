package com.google.android.gms.internal.ads;

public final class zzglc extends zzgrq implements zzgtb {
    private static final zzglc zzb;
    private int zzd;
    private int zze;
    private zzgli zzf;
    private zzgqi zzg;

    static {
        zzglc zzglc0 = new zzglc();
        zzglc.zzb = zzglc0;
        zzgrq.zzaU(zzglc.class, zzglc0);
    }

    private zzglc() {
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
                return zzgrq.zzaR(zzglc.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzglc();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzglb(null);
                    }
                    case 5: {
                        return zzglc.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzglb zzc() {
        return (zzglb)zzglc.zzb.zzaA();
    }

    static zzglc zzd() {
        return zzglc.zzb;
    }

    public static zzglc zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglc)zzgrq.zzaG(zzglc.zzb, zzgqi0, zzgrc0);
    }

    public final zzgli zzf() {
        return this.zzf == null ? zzgli.zze() : this.zzf;
    }

    public final zzgqi zzg() {
        return this.zzg;
    }

    static void zzh(zzglc zzglc0, int v) {
        zzglc0.zze = 0;
    }

    static void zzi(zzglc zzglc0, zzgli zzgli0) {
        zzgli0.getClass();
        zzglc0.zzf = zzgli0;
        zzglc0.zzd |= 1;
    }

    static void zzj(zzglc zzglc0, zzgqi zzgqi0) {
        zzglc0.zzg = zzgqi0;
    }
}


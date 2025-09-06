package com.google.android.gms.internal.ads;

public final class zzgkh extends zzgrq implements zzgtb {
    private static final zzgkh zzb;
    private int zzd;
    private int zze;
    private zzgkk zzf;

    static {
        zzgkh zzgkh0 = new zzgkh();
        zzgkh.zzb = zzgkh0;
        zzgrq.zzaU(zzgkh.class, zzgkh0);
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
                return zzgrq.zzaR(zzgkh.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgkh();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgkg(null);
                    }
                    case 5: {
                        return zzgkh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgkg zzc() {
        return (zzgkg)zzgkh.zzb.zzaA();
    }

    static zzgkh zzd() {
        return zzgkh.zzb;
    }

    public static zzgkh zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgkh)zzgrq.zzaG(zzgkh.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkk zzf() {
        return this.zzf == null ? zzgkk.zze() : this.zzf;
    }

    static void zzg(zzgkh zzgkh0, int v) {
        zzgkh0.zze = v;
    }

    static void zzh(zzgkh zzgkh0, zzgkk zzgkk0) {
        zzgkk0.getClass();
        zzgkh0.zzf = zzgkk0;
        zzgkh0.zzd |= 1;
    }
}


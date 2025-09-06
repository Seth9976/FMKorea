package com.google.android.gms.internal.ads;

public final class zzgkq extends zzgrq implements zzgtb {
    private static final zzgkq zzb;
    private int zzd;
    private zzgkw zze;
    private zzgmi zzf;

    static {
        zzgkq zzgkq0 = new zzgkq();
        zzgkq.zzb = zzgkq0;
        zzgrq.zzaU(zzgkq.class, zzgkq0);
    }

    public static zzgkp zza() {
        return (zzgkp)zzgkq.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgkq.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgkq();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgkp(null);
                    }
                    case 5: {
                        return zzgkq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgkq zzc() {
        return zzgkq.zzb;
    }

    public static zzgkq zzd(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgkq)zzgrq.zzaG(zzgkq.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkw zze() {
        return this.zze == null ? zzgkw.zze() : this.zze;
    }

    public final zzgmi zzf() {
        return this.zzf == null ? zzgmi.zzf() : this.zzf;
    }

    static void zzg(zzgkq zzgkq0, zzgkw zzgkw0) {
        zzgkw0.getClass();
        zzgkq0.zze = zzgkw0;
        zzgkq0.zzd |= 1;
    }

    static void zzh(zzgkq zzgkq0, zzgmi zzgmi0) {
        zzgmi0.getClass();
        zzgkq0.zzf = zzgmi0;
        zzgkq0.zzd |= 2;
    }
}


package com.google.android.gms.internal.ads;

public final class zzgmi extends zzgrq implements zzgtb {
    private static final zzgmi zzb;
    private int zzd;
    private zzgml zze;
    private int zzf;
    private int zzg;

    static {
        zzgmi zzgmi0 = new zzgmi();
        zzgmi.zzb = zzgmi0;
        zzgrq.zzaU(zzgmi.class, zzgmi0);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgmi.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B\u0003\u000B", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgmi();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgmh(null);
                    }
                    case 5: {
                        return zzgmi.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final int zzc() {
        return this.zzg;
    }

    public static zzgmh zzd() {
        return (zzgmh)zzgmi.zzb.zzaA();
    }

    static zzgmi zze() {
        return zzgmi.zzb;
    }

    public static zzgmi zzf() {
        return zzgmi.zzb;
    }

    public static zzgmi zzg(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgmi)zzgrq.zzaG(zzgmi.zzb, zzgqi0, zzgrc0);
    }

    public final zzgml zzh() {
        return this.zze == null ? zzgml.zze() : this.zze;
    }

    static void zzi(zzgmi zzgmi0, zzgml zzgml0) {
        zzgml0.getClass();
        zzgmi0.zze = zzgml0;
        zzgmi0.zzd |= 1;
    }

    static void zzj(zzgmi zzgmi0, int v) {
        zzgmi0.zzf = v;
    }
}


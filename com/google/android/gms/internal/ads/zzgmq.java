package com.google.android.gms.internal.ads;

public final class zzgmq extends zzgrq implements zzgtb {
    private static final zzgmq zzb;
    private String zzd;
    private zzgqi zze;
    private int zzf;

    static {
        zzgmq zzgmq0 = new zzgmq();
        zzgmq.zzb = zzgmq0;
        zzgrq.zzaU(zzgmq.class, zzgmq0);
    }

    private zzgmq() {
        this.zzd = "";
        this.zze = zzgqi.zzb;
    }

    public static zzgmn zza() {
        return (zzgmn)zzgmq.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgmq.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgmq();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgmn(null);
                    }
                    case 5: {
                        return zzgmq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final zzgmp zzc() {
        switch(this.zzf) {
            case 0: {
                return zzgmp.zza == null ? zzgmp.zzf : zzgmp.zza;
            }
            case 1: {
                return zzgmp.zzb == null ? zzgmp.zzf : zzgmp.zzb;
            }
            case 2: {
                return zzgmp.zzc == null ? zzgmp.zzf : zzgmp.zzc;
            }
            case 3: {
                return zzgmp.zzd == null ? zzgmp.zzf : zzgmp.zzd;
            }
            case 4: {
                return zzgmp.zze == null ? zzgmp.zzf : zzgmp.zze;
            }
            default: {
                return zzgmp.zzf;
            }
        }
    }

    static zzgmq zzd() {
        return zzgmq.zzb;
    }

    public static zzgmq zze() {
        return zzgmq.zzb;
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }

    static void zzh(zzgmq zzgmq0, String s) {
        zzgmq0.zzd = s;
    }

    static void zzi(zzgmq zzgmq0, zzgqi zzgqi0) {
        zzgmq0.zze = zzgqi0;
    }

    static void zzj(zzgmq zzgmq0, zzgmp zzgmp0) {
        zzgmq0.zzf = zzgmp0.zza();
    }
}


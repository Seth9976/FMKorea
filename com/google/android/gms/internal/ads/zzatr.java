package com.google.android.gms.internal.ads;

public final class zzatr extends zzgrq implements zzgtb {
    private static final zzatr zzb;
    private int zzd;
    private zzatu zze;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzatr zzatr0 = new zzatr();
        zzatr.zzb = zzatr0;
        zzgrq.zzaU(zzatr.class, zzatr0);
    }

    private zzatr() {
        this.zzf = zzgqi.zzb;
        this.zzg = zzgqi.zzb;
    }

    static zzatr zza() {
        return zzatr.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzatr.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzatr();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzatq(null);
                    }
                    case 5: {
                        return zzatr.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzatr zzc(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzatr)zzgrq.zzaG(zzatr.zzb, zzgqi0, zzgrc0);
    }

    public final zzatu zzd() {
        return this.zze == null ? zzatu.zzg() : this.zze;
    }

    public final zzgqi zze() {
        return this.zzg;
    }

    public final zzgqi zzf() {
        return this.zzf;
    }
}


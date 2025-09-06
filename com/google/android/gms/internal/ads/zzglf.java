package com.google.android.gms.internal.ads;

public final class zzglf extends zzgrq implements zzgtb {
    private static final zzglf zzb;
    private int zzd;
    private zzgli zze;
    private int zzf;

    static {
        zzglf zzglf0 = new zzglf();
        zzglf.zzb = zzglf0;
        zzgrq.zzaU(zzglf.class, zzglf0);
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
                return zzgrq.zzaR(zzglf.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzglf();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgle(null);
                    }
                    case 5: {
                        return zzglf.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgle zzc() {
        return (zzgle)zzglf.zzb.zzaA();
    }

    static zzglf zzd() {
        return zzglf.zzb;
    }

    public static zzglf zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglf)zzgrq.zzaG(zzglf.zzb, zzgqi0, zzgrc0);
    }

    public final zzgli zzf() {
        return this.zze == null ? zzgli.zze() : this.zze;
    }

    static void zzg(zzglf zzglf0, zzgli zzgli0) {
        zzgli0.getClass();
        zzglf0.zze = zzgli0;
        zzglf0.zzd |= 1;
    }

    static void zzh(zzglf zzglf0, int v) {
        zzglf0.zzf = v;
    }
}


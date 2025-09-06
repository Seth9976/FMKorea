package com.google.android.gms.internal.ads;

public final class zzgnl extends zzgrq implements zzgtb {
    private static final zzgnl zzb;
    private int zzd;
    private int zze;
    private zzgno zzf;

    static {
        zzgnl zzgnl0 = new zzgnl();
        zzgnl.zzb = zzgnl0;
        zzgrq.zzaU(zzgnl.class, zzgnl0);
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
                return zzgrq.zzaR(zzgnl.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgnl();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgnk(null);
                    }
                    case 5: {
                        return zzgnl.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgnk zzc() {
        return (zzgnk)zzgnl.zzb.zzaA();
    }

    static zzgnl zzd() {
        return zzgnl.zzb;
    }

    public static zzgnl zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgnl)zzgrq.zzaG(zzgnl.zzb, zzgqi0, zzgrc0);
    }

    public final zzgno zzf() {
        return this.zzf == null ? zzgno.zzc() : this.zzf;
    }

    static void zzg(zzgnl zzgnl0, int v) {
        zzgnl0.zze = 0;
    }

    static void zzh(zzgnl zzgnl0, zzgno zzgno0) {
        zzgno0.getClass();
        zzgnl0.zzf = zzgno0;
        zzgnl0.zzd |= 1;
    }
}


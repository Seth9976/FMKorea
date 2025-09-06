package com.google.android.gms.internal.ads;

public final class zzgnr extends zzgrq implements zzgtb {
    private static final zzgnr zzb;
    private int zzd;
    private int zze;
    private zzgnu zzf;

    static {
        zzgnr zzgnr0 = new zzgnr();
        zzgnr.zzb = zzgnr0;
        zzgrq.zzaU(zzgnr.class, zzgnr0);
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
                return zzgrq.zzaR(zzgnr.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgnr();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgnq(null);
                    }
                    case 5: {
                        return zzgnr.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgnq zzc() {
        return (zzgnq)zzgnr.zzb.zzaA();
    }

    static zzgnr zzd() {
        return zzgnr.zzb;
    }

    public static zzgnr zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgnr)zzgrq.zzaG(zzgnr.zzb, zzgqi0, zzgrc0);
    }

    public final zzgnu zzf() {
        return this.zzf == null ? zzgnu.zzd() : this.zzf;
    }

    static void zzg(zzgnr zzgnr0, int v) {
        zzgnr0.zze = 0;
    }

    static void zzh(zzgnr zzgnr0, zzgnu zzgnu0) {
        zzgnu0.getClass();
        zzgnr0.zzf = zzgnu0;
        zzgnr0.zzd |= 1;
    }
}


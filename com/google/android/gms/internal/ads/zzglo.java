package com.google.android.gms.internal.ads;

public final class zzglo extends zzgrq implements zzgtb {
    private static final zzglo zzb;
    private int zzd;
    private int zze;

    static {
        zzglo zzglo0 = new zzglo();
        zzglo.zzb = zzglo0;
        zzgrq.zzaU(zzglo.class, zzglo0);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzglo.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000B\u0003\u000B", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzglo();
                    }
                    case 4: {
                        return new zzgln(null);
                    }
                    case 5: {
                        return zzglo.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final int zzc() {
        return this.zze;
    }

    public static zzgln zzd() {
        return (zzgln)zzglo.zzb.zzaA();
    }

    static zzglo zze() {
        return zzglo.zzb;
    }

    public static zzglo zzf(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglo)zzgrq.zzaG(zzglo.zzb, zzgqi0, zzgrc0);
    }

    static void zzg(zzglo zzglo0, int v) {
        zzglo0.zzd = v;
    }
}


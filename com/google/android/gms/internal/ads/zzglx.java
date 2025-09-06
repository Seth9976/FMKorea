package com.google.android.gms.internal.ads;

public final class zzglx extends zzgrq implements zzgtb {
    private static final zzglx zzb;
    private int zzd;
    private zzgqi zze;

    static {
        zzglx zzglx0 = new zzglx();
        zzglx.zzb = zzglx0;
        zzgrq.zzaU(zzglx.class, zzglx0);
    }

    private zzglx() {
        this.zze = zzgqi.zzb;
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
                return zzgrq.zzaR(zzglx.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\n", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzglx();
                    }
                    case 4: {
                        return new zzglw(null);
                    }
                    case 5: {
                        return zzglx.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzglw zzc() {
        return (zzglw)zzglx.zzb.zzaA();
    }

    static zzglx zzd() {
        return zzglx.zzb;
    }

    public static zzglx zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglx)zzgrq.zzaG(zzglx.zzb, zzgqi0, zzgrc0);
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    static void zzg(zzglx zzglx0, int v) {
        zzglx0.zzd = 0;
    }

    static void zzh(zzglx zzglx0, zzgqi zzgqi0) {
        zzglx0.zze = zzgqi0;
    }
}


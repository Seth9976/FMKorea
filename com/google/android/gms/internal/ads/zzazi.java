package com.google.android.gms.internal.ads;

public final class zzazi extends zzgrq implements zzgtb {
    private static final zzazi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazi zzazi0 = new zzazi();
        zzazi.zzb = zzazi0;
        zzgrq.zzaU(zzazi.class, zzazi0);
    }

    public static zzazb zza() {
        return (zzazb)zzazi.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazi.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazg.zza, "zzf", zzazd.zza});
            }
            case 3: {
                return new zzazi();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazb(null);
                    }
                    case 5: {
                        return zzazi.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzazi zzc() {
        return zzazi.zzb;
    }

    public static zzazi zzd() {
        return zzazi.zzb;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int v = zzaze.zza(this.zzf);
        return v == 0 ? 1 : v;
    }

    public final int zzh() {
        int v = zzazh.zza(this.zze);
        return v == 0 ? 1 : v;
    }

    static void zzi(zzazi zzazi0, int v) {
        zzazi0.zze = v - 1;
        zzazi0.zzd |= 1;
    }

    static void zzj(zzazi zzazi0, int v) {
        zzazi0.zzf = v - 1;
        zzazi0.zzd |= 2;
    }
}


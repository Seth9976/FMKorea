package com.google.android.gms.internal.ads;

public final class zzgkw extends zzgrq implements zzgtb {
    private static final zzgkw zzb;
    private int zzd;
    private zzgkz zze;
    private int zzf;

    static {
        zzgkw zzgkw0 = new zzgkw();
        zzgkw.zzb = zzgkw0;
        zzgrq.zzaU(zzgkw.class, zzgkw0);
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
                return zzgrq.zzaR(zzgkw.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgkw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgkv(null);
                    }
                    case 5: {
                        return zzgkw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgkv zzc() {
        return (zzgkv)zzgkw.zzb.zzaA();
    }

    static zzgkw zzd() {
        return zzgkw.zzb;
    }

    public static zzgkw zze() {
        return zzgkw.zzb;
    }

    public static zzgkw zzf(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgkw)zzgrq.zzaG(zzgkw.zzb, zzgqi0, zzgrc0);
    }

    public final zzgkz zzg() {
        return this.zze == null ? zzgkz.zze() : this.zze;
    }

    static void zzh(zzgkw zzgkw0, zzgkz zzgkz0) {
        zzgkz0.getClass();
        zzgkw0.zze = zzgkz0;
        zzgkw0.zzd |= 1;
    }

    static void zzi(zzgkw zzgkw0, int v) {
        zzgkw0.zzf = v;
    }
}


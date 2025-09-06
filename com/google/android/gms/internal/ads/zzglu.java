package com.google.android.gms.internal.ads;

public final class zzglu extends zzgrq implements zzgtb {
    private static final zzglu zzb;
    private int zzd;
    private int zze;

    static {
        zzglu zzglu0 = new zzglu();
        zzglu.zzb = zzglu0;
        zzgrq.zzaU(zzglu.class, zzglu0);
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
                return zzgrq.zzaR(zzglu.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\u000B", new Object[]{"zze", "zzd"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzglu();
                    }
                    case 4: {
                        return new zzglt(null);
                    }
                    case 5: {
                        return zzglu.zzb;
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

    public static zzglt zzd() {
        return (zzglt)zzglu.zzb.zzaA();
    }

    static zzglu zze() {
        return zzglu.zzb;
    }

    public static zzglu zzf(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzglu)zzgrq.zzaG(zzglu.zzb, zzgqi0, zzgrc0);
    }

    static void zzg(zzglu zzglu0, int v) {
        zzglu0.zzd = v;
    }
}


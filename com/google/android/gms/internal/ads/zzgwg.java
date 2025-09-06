package com.google.android.gms.internal.ads;

public final class zzgwg extends zzgrq implements zzgtb {
    private static final zzgwg zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private byte zzg;

    static {
        zzgwg zzgwg0 = new zzgwg();
        zzgwg.zzb = zzgwg0;
        zzgrq.zzaU(zzgwg.class, zzgwg0);
    }

    private zzgwg() {
        this.zzg = 2;
        this.zze = zzgqi.zzb;
        this.zzf = zzgqi.zzb;
    }

    public static zzgwf zza() {
        return (zzgwf)zzgwg.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzg;
            }
            case 2: {
                return zzgrq.zzaR(zzgwg.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgwg();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwf(null);
                    }
                    case 5: {
                        return zzgwg.zzb;
                    }
                    default: {
                        if(object0 == null) {
                            b = 0;
                        }
                        this.zzg = b;
                        return null;
                    }
                }
            }
        }
    }

    static zzgwg zzc() {
        return zzgwg.zzb;
    }

    static void zzd(zzgwg zzgwg0, zzgqi zzgqi0) {
        zzgwg0.zzd |= 1;
        zzgwg0.zze = zzgqi0;
    }

    static void zze(zzgwg zzgwg0, zzgqi zzgqi0) {
        zzgwg0.zzd |= 2;
        zzgwg0.zzf = zzgqi0;
    }
}


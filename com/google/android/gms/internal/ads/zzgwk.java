package com.google.android.gms.internal.ads;

public final class zzgwk extends zzgrq implements zzgtb {
    private static final zzgwk zzb;
    private int zzd;
    private zzgwj zze;
    private zzgrz zzf;
    private zzgqi zzg;
    private zzgqi zzh;
    private int zzi;
    private byte zzj;

    static {
        zzgwk zzgwk0 = new zzgwk();
        zzgwk.zzb = zzgwk0;
        zzgrq.zzaU(zzgwk.class, zzgwk0);
    }

    private zzgwk() {
        this.zzj = 2;
        this.zzf = zzgrq.zzaN();
        this.zzg = zzgqi.zzb;
        this.zzh = zzgqi.zzb;
    }

    public static zzgwh zza() {
        return (zzgwh)zzgwk.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzj;
            }
            case 2: {
                return zzgrq.zzaR(zzgwk.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzgwk();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwh(null);
                    }
                    case 5: {
                        return zzgwk.zzb;
                    }
                    default: {
                        if(object0 == null) {
                            b = 0;
                        }
                        this.zzj = b;
                        return null;
                    }
                }
            }
        }
    }

    static zzgwk zzc() {
        return zzgwk.zzb;
    }

    static void zzd(zzgwk zzgwk0, zzgwg zzgwg0) {
        zzgwg0.getClass();
        zzgrz zzgrz0 = zzgwk0.zzf;
        if(!zzgrz0.zzc()) {
            zzgwk0.zzf = zzgrq.zzaO(zzgrz0);
        }
        zzgwk0.zzf.add(zzgwg0);
    }
}


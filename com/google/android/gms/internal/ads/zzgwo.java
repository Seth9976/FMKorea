package com.google.android.gms.internal.ads;

public final class zzgwo extends zzgrq implements zzgtb {
    private static final zzgwo zzb;
    private int zzd;
    private zzgwn zze;
    private zzgrz zzf;
    private zzgqi zzg;
    private zzgqi zzh;
    private int zzi;
    private zzgqi zzj;
    private byte zzk;

    static {
        zzgwo zzgwo0 = new zzgwo();
        zzgwo.zzb = zzgwo0;
        zzgrq.zzaU(zzgwo.class, zzgwo0);
    }

    private zzgwo() {
        this.zzk = 2;
        this.zzf = zzgrq.zzaN();
        this.zzg = zzgqi.zzb;
        this.zzh = zzgqi.zzb;
        this.zzj = zzgqi.zzb;
    }

    static zzgwo zza() {
        return zzgwo.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzk;
            }
            case 2: {
                return zzgrq.zzaR(zzgwo.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzgwo();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgwl(null);
                    }
                    case 5: {
                        return zzgwo.zzb;
                    }
                    default: {
                        if(object0 == null) {
                            b = 0;
                        }
                        this.zzk = b;
                        return null;
                    }
                }
            }
        }
    }
}


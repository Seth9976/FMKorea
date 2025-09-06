package com.google.android.gms.internal.ads;

public final class zzazw extends zzgrq implements zzgtb {
    private static final zzazw zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazw zzazw0 = new zzazw();
        zzazw.zzb = zzazw0;
        zzgrq.zzaU(zzazw.class, zzazw0);
    }

    static zzazw zza() {
        return zzazw.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazw.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzazw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazv(null);
                    }
                    case 5: {
                        return zzazw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


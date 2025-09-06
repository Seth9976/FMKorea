package com.google.android.gms.internal.ads;

public final class zzgxo extends zzgrq implements zzgtb {
    private static final zzgxo zzb;
    private int zzd;
    private String zze;
    private zzgqi zzf;

    static {
        zzgxo zzgxo0 = new zzgxo();
        zzgxo.zzb = zzgxo0;
        zzgrq.zzaU(zzgxo.class, zzgxo0);
    }

    private zzgxo() {
        this.zze = "";
        this.zzf = zzgqi.zzb;
    }

    static zzgxo zza() {
        return zzgxo.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxo.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgxo();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxn(null);
                    }
                    case 5: {
                        return zzgxo.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


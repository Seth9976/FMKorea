package com.google.android.gms.internal.ads;

public final class zzazk extends zzgrq implements zzgtb {
    private static final zzazk zzb;
    private int zzd;
    private int zze;
    private zzbac zzf;

    static {
        zzazk zzazk0 = new zzazk();
        zzazk.zzb = zzazk0;
        zzgrq.zzaU(zzazk.class, zzazk0);
    }

    static zzazk zza() {
        return zzazk.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazk.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayr.zza, "zzf"});
            }
            case 3: {
                return new zzazk();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazj(null);
                    }
                    case 5: {
                        return zzazk.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


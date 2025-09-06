package com.google.android.gms.internal.ads;

public final class zzaxw extends zzgrq implements zzgtb {
    private static final zzaxw zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaxw zzaxw0 = new zzaxw();
        zzaxw.zzb = zzaxw0;
        zzgrq.zzaU(zzaxw.class, zzaxw0);
    }

    public static zzaxv zza() {
        return (zzaxv)zzaxw.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaxw.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzaxw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaxv(null);
                    }
                    case 5: {
                        return zzaxw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaxw zzc() {
        return zzaxw.zzb;
    }

    public static zzaxw zzd() {
        return zzaxw.zzb;
    }

    static void zze(zzaxw zzaxw0, boolean z) {
        zzaxw0.zzd |= 1;
        zzaxw0.zze = z;
    }

    static void zzf(zzaxw zzaxw0, int v) {
        zzaxw0.zzd |= 2;
        zzaxw0.zzf = v;
    }
}


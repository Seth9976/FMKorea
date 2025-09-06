package com.google.android.gms.internal.ads;

public final class zzgvw extends zzgrq implements zzgtb {
    private static final zzgvw zzb;
    private int zzd;
    private String zze;

    static {
        zzgvw zzgvw0 = new zzgvw();
        zzgvw.zzb = zzgvw0;
        zzgrq.zzaU(zzgvw.class, zzgvw0);
    }

    private zzgvw() {
        this.zze = "";
    }

    public static zzgvv zza() {
        return (zzgvv)zzgvw.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgvw.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgvw();
                    }
                    case 4: {
                        return new zzgvv(null);
                    }
                    case 5: {
                        return zzgvw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgvw zzc() {
        return zzgvw.zzb;
    }

    static void zzd(zzgvw zzgvw0, String s) {
        zzgvw0.zzd |= 1;
        zzgvw0.zze = s;
    }
}


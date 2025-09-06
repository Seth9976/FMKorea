package com.google.android.gms.internal.ads;

public final class zzapd extends zzgrq implements zzgtb {
    private static final zzapd zzb;
    private int zzd;
    private String zze;

    static {
        zzapd zzapd0 = new zzapd();
        zzapd.zzb = zzapd0;
        zzgrq.zzaU(zzapd.class, zzapd0);
    }

    private zzapd() {
        this.zze = "";
    }

    static zzapd zza() {
        return zzapd.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzapd.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzapd();
                    }
                    case 4: {
                        return new zzapc(null);
                    }
                    case 5: {
                        return zzapd.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


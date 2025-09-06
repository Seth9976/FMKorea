package com.google.android.gms.internal.ads;

public final class zzayi extends zzgrq implements zzgtb {
    private static final zzayi zzb;
    private int zzd;
    private String zze;
    private zzgrz zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzayi zzayi0 = new zzayi();
        zzayi.zzb = zzayi0;
        zzgrq.zzaU(zzayi.class, zzayi0);
    }

    private zzayi() {
        this.zze = "";
        this.zzf = zzgrq.zzaN();
        this.zzg = 1000;
        this.zzh = 1000;
        this.zzi = 1000;
    }

    static zzayi zza() {
        return zzayi.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayi.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzaye.class, "zzg", zzayr.zza, "zzh", zzayr.zza, "zzi", zzayr.zza});
            }
            case 3: {
                return new zzayi();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayh(null);
                    }
                    case 5: {
                        return zzayi.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzayi zzc() {
        return zzayi.zzb;
    }

    static void zzd(zzayi zzayi0, String s) {
        s.getClass();
        zzayi0.zzd |= 1;
        zzayi0.zze = s;
    }
}


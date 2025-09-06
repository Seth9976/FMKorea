package com.google.android.gms.internal.ads;

public final class zzgxk extends zzgrq implements zzgtb {
    private static final zzgxk zzb;
    private int zzd;
    private String zze;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zzi;
    private String zzj;

    static {
        zzgxk zzgxk0 = new zzgxk();
        zzgxk.zzb = zzgxk0;
        zzgrq.zzaU(zzgxk.class, zzgxk0);
    }

    private zzgxk() {
        this.zze = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static zzgxj zza() {
        return (zzgxj)zzgxk.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgxk.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgxl.zza, "zzi", "zzj"});
            }
            case 3: {
                return new zzgxk();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxj(null);
                    }
                    case 5: {
                        return zzgxk.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgxk zzc() {
        return zzgxk.zzb;
    }

    static void zzd(zzgxk zzgxk0, String s) {
        zzgxk0.zzd |= 1;
        zzgxk0.zze = s;
    }

    static void zze(zzgxk zzgxk0, long v) {
        zzgxk0.zzd |= 2;
        zzgxk0.zzf = v;
    }

    static void zzf(zzgxk zzgxk0, boolean z) {
        zzgxk0.zzd |= 4;
        zzgxk0.zzg = z;
    }
}


package com.google.android.gms.internal.ads;

public final class zzazu extends zzgrq implements zzgtb {
    private static final zzazu zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzazw zzo;

    static {
        zzazu zzazu0 = new zzazu();
        zzazu.zzb = zzazu0;
        zzgrq.zzaU(zzazu.class, zzazu0);
    }

    private zzazu() {
        this.zze = 1000;
        this.zzf = 1000;
    }

    static zzazu zza() {
        return zzazu.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazu.zzb, "\u0001\u000B\u0000\u0001\u0001\u000B\u000B\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000Bဉ\n", new Object[]{"zzd", "zze", zzayr.zza, "zzf", zzayr.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
            }
            case 3: {
                return new zzazu();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazt(null);
                    }
                    case 5: {
                        return zzazu.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


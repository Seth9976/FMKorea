package com.google.android.gms.internal.ads;

public final class zzaor extends zzgrq implements zzgtb {
    private static final zzaor zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        zzaor zzaor0 = new zzaor();
        zzaor.zzb = zzaor0;
        zzgrq.zzaU(zzaor.class, zzaor0);
    }

    private zzaor() {
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = -1L;
        this.zzk = -1L;
        this.zzl = -1L;
    }

    public static zzaoq zza() {
        return (zzaoq)zzaor.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaor.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            case 3: {
                return new zzaor();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaoq(null);
                    }
                    case 5: {
                        return zzaor.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaor zzc() {
        return zzaor.zzb;
    }

    static void zzd(zzaor zzaor0, long v) {
        zzaor0.zzd |= 1;
        zzaor0.zze = v;
    }

    static void zze(zzaor zzaor0, long v) {
        zzaor0.zzd |= 4;
        zzaor0.zzg = v;
    }

    static void zzf(zzaor zzaor0, long v) {
        zzaor0.zzd |= 8;
        zzaor0.zzh = v;
    }

    static void zzg(zzaor zzaor0, long v) {
        zzaor0.zzd |= 16;
        zzaor0.zzi = v;
    }

    static void zzh(zzaor zzaor0, long v) {
        zzaor0.zzd |= 0x20;
        zzaor0.zzj = v;
    }
}


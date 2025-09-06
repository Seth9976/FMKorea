package com.google.android.gms.internal.ads;

public final class zzaxq extends zzgrq implements zzgtb {
    private static final zzaxq zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzayg zzg;
    private zzayi zzh;
    private zzgrz zzi;
    private zzayk zzj;
    private zzazu zzk;
    private zzazk zzl;
    private zzayy zzm;
    private zzaza zzn;
    private zzgrz zzo;

    static {
        zzaxq zzaxq0 = new zzaxq();
        zzaxq.zzb = zzaxq0;
        zzgrq.zzaU(zzaxq.class, zzaxq0);
    }

    private zzaxq() {
        this.zzf = 1000;
        this.zzi = zzgrq.zzaN();
        this.zzo = zzgrq.zzaN();
    }

    static zzaxq zza() {
        return zzaxq.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaxq.zzb, "\u0001\u000B\u0000\u0001\u0007\u0011\u000B\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000B\u001B\fဉ\u0004\rဉ\u0005\u000Eဉ\u0006\u000Fဉ\u0007\u0010ဉ\b\u0011\u001B", new Object[]{"zzd", "zze", zzaxn.zza, "zzf", zzayr.zza, "zzg", "zzh", "zzi", zzaye.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbag.class});
            }
            case 3: {
                return new zzaxq();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaxp(null);
                    }
                    case 5: {
                        return zzaxq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzaxq zzc() {
        return zzaxq.zzb;
    }

    public final zzayi zzd() {
        return this.zzh == null ? zzayi.zzc() : this.zzh;
    }

    static void zze(zzaxq zzaxq0, zzaxo zzaxo0) {
        zzaxq0.zze = zzaxo0.zza();
        zzaxq0.zzd |= 1;
    }

    static void zzf(zzaxq zzaxq0, zzayi zzayi0) {
        zzayi0.getClass();
        zzaxq0.zzh = zzayi0;
        zzaxq0.zzd |= 8;
    }
}


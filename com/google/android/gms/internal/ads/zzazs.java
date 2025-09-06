package com.google.android.gms.internal.ads;

public final class zzazs extends zzgrq implements zzgtb {
    private static final zzazs zzb;
    private int zzd;
    private zzgrz zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private int zzl;

    static {
        zzazs zzazs0 = new zzazs();
        zzazs.zzb = zzazs0;
        zzgrq.zzaU(zzazs.class, zzazs0);
    }

    private zzazs() {
        this.zze = zzgrq.zzaN();
        this.zzi = "";
        this.zzj = "";
    }

    public static zzazo zza() {
        return (zzazo)zzazs.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazs.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001B\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzazn.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            case 3: {
                return new zzazs();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazo(null);
                    }
                    case 5: {
                        return zzazs.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzazs zzc() {
        return zzazs.zzb;
    }

    static void zzd(zzazs zzazs0, Iterable iterable0) {
        zzgrz zzgrz0 = zzazs0.zze;
        if(!zzgrz0.zzc()) {
            zzazs0.zze = zzgrq.zzaO(zzgrz0);
        }
        zzgpr.zzav(iterable0, zzazs0.zze);
    }

    static void zze(zzazs zzazs0, int v) {
        zzazs0.zzd |= 1;
        zzazs0.zzf = v;
    }

    static void zzf(zzazs zzazs0, int v) {
        zzazs0.zzd |= 2;
        zzazs0.zzg = v;
    }

    static void zzg(zzazs zzazs0, long v) {
        zzazs0.zzd |= 4;
        zzazs0.zzh = v;
    }

    static void zzh(zzazs zzazs0, String s) {
        s.getClass();
        zzazs0.zzd |= 8;
        zzazs0.zzi = s;
    }

    static void zzi(zzazs zzazs0, String s) {
        s.getClass();
        zzazs0.zzd |= 16;
        zzazs0.zzj = s;
    }

    static void zzj(zzazs zzazs0, long v) {
        zzazs0.zzd |= 0x20;
        zzazs0.zzk = v;
    }

    static void zzk(zzazs zzazs0, int v) {
        zzazs0.zzd |= 0x40;
        zzazs0.zzl = v;
    }
}


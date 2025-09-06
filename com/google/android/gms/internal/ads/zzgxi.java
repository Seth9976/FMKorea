package com.google.android.gms.internal.ads;

public final class zzgxi extends zzgrq implements zzgtb {
    private static final zzgxi zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private zzgwk zzg;
    private zzgwo zzh;
    private int zzi;
    private zzgrv zzj;
    private String zzk;
    private int zzl;
    private zzgrz zzm;
    private byte zzn;

    static {
        zzgxi zzgxi0 = new zzgxi();
        zzgxi.zzb = zzgxi0;
        zzgrq.zzaU(zzgxi.class, zzgxi0);
    }

    private zzgxi() {
        this.zzn = 2;
        this.zzf = "";
        this.zzj = zzgrq.zzaJ();
        this.zzk = "";
        this.zzm = zzgrq.zzaN();
    }

    public final int zza() {
        return this.zzm.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzn;
            }
            case 2: {
                return zzgrq.zzaR(zzgxi.zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001A", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgxf.zza, "zzm"});
            }
            case 3: {
                return new zzgxi();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgxh(null);
                    }
                    case 5: {
                        return zzgxi.zzb;
                    }
                    default: {
                        if(object0 == null) {
                            b = 0;
                        }
                        this.zzn = b;
                        return null;
                    }
                }
            }
        }
    }

    public static zzgxh zzc() {
        return (zzgxh)zzgxi.zzb.zzaA();
    }

    static zzgxi zzd() {
        return zzgxi.zzb;
    }

    public final String zze() [...] // 潜在的解密器

    static void zzf(zzgxi zzgxi0, int v) {
        zzgxi0.zzd |= 1;
        zzgxi0.zze = v;
    }

    static void zzg(zzgxi zzgxi0, String s) {
        s.getClass();
        zzgxi0.zzd |= 2;
        zzgxi0.zzf = s;
    }

    static void zzh(zzgxi zzgxi0, zzgwk zzgwk0) {
        zzgwk0.getClass();
        zzgxi0.zzg = zzgwk0;
        zzgxi0.zzd |= 4;
    }

    static void zzi(zzgxi zzgxi0, String s) {
        s.getClass();
        zzgrz zzgrz0 = zzgxi0.zzm;
        if(!zzgrz0.zzc()) {
            zzgxi0.zzm = zzgrq.zzaO(zzgrz0);
        }
        zzgxi0.zzm.add(s);
    }

    static void zzj(zzgxi zzgxi0, int v) {
        zzgxi0.zzl = v - 1;
        zzgxi0.zzd |= 0x40;
    }
}


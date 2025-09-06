package com.google.android.gms.internal.ads;

public final class zzatu extends zzgrq implements zzgtb {
    private static final zzatu zzb;
    private int zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzatu zzatu0 = new zzatu();
        zzatu.zzb = zzatu0;
        zzgrq.zzaU(zzatu.class, zzatu0);
    }

    private zzatu() {
        this.zze = "";
        this.zzf = "";
    }

    public final long zza() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzatu.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzatu();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzatt(null);
                    }
                    case 5: {
                        return zzatu.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public static zzatt zze() {
        return (zzatt)zzatu.zzb.zzaA();
    }

    static zzatu zzf() {
        return zzatu.zzb;
    }

    public static zzatu zzg() {
        return zzatu.zzb;
    }

    public static zzatu zzh(zzgqi zzgqi0) {
        return (zzatu)zzgrq.zzaE(zzatu.zzb, zzgqi0);
    }

    public static zzatu zzi(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzatu)zzgrq.zzaG(zzatu.zzb, zzgqi0, zzgrc0);
    }

    public final String zzj() [...] // 潜在的解密器

    public final String zzk() [...] // 潜在的解密器

    static void zzl(zzatu zzatu0, String s) {
        s.getClass();
        zzatu0.zzd |= 1;
        zzatu0.zze = s;
    }

    static void zzm(zzatu zzatu0, long v) {
        zzatu0.zzd |= 16;
        zzatu0.zzi = v;
    }

    static void zzn(zzatu zzatu0, String s) {
        s.getClass();
        zzatu0.zzd |= 2;
        zzatu0.zzf = s;
    }

    static void zzo(zzatu zzatu0, long v) {
        zzatu0.zzd |= 4;
        zzatu0.zzg = v;
    }

    static void zzp(zzatu zzatu0, long v) {
        zzatu0.zzd |= 8;
        zzatu0.zzh = v;
    }
}


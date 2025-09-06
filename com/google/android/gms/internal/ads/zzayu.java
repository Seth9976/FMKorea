package com.google.android.gms.internal.ads;

public final class zzayu extends zzgrq implements zzgtb {
    private static final zzayu zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private zzbae zzi;
    private zzgry zzj;
    private zzaym zzk;
    private zzayp zzl;
    private zzazi zzm;
    private zzaxq zzn;
    private zzazs zzo;
    private zzbaz zzp;
    private zzaxz zzq;

    static {
        zzayu zzayu0 = new zzayu();
        zzayu.zzb = zzayu0;
        zzgrq.zzaU(zzayu.class, zzayu0);
    }

    private zzayu() {
        this.zzf = "";
        this.zzh = 1000;
        this.zzj = zzgrq.zzaL();
    }

    public final zzaxq zza() {
        return this.zzn == null ? zzaxq.zzc() : this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzayu.zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000Bဋ\u0002\f᠌\u0003\rဉ\u0004\u000E\u0015\u000Fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000B", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzayr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
            }
            case 3: {
                return new zzayu();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzayt(null);
                    }
                    case 5: {
                        return zzayu.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final zzaym zzc() {
        return this.zzk == null ? zzaym.zzc() : this.zzk;
    }

    public static zzayt zzd() {
        return (zzayt)zzayu.zzb.zzaA();
    }

    static zzayu zze() {
        return zzayu.zzb;
    }

    public final String zzf() [...] // 潜在的解密器

    static void zzg(zzayu zzayu0, String s) {
        s.getClass();
        zzayu0.zzd |= 2;
        zzayu0.zzf = s;
    }

    static void zzh(zzayu zzayu0, Iterable iterable0) {
        zzgry zzgry0 = zzayu0.zzj;
        if(!zzgry0.zzc()) {
            zzayu0.zzj = zzgrq.zzaM(zzgry0);
        }
        zzgpr.zzav(iterable0, zzayu0.zzj);
    }

    static void zzi(zzayu zzayu0) {
        zzayu0.zzj = zzgrq.zzaL();
    }

    static void zzj(zzayu zzayu0, zzaym zzaym0) {
        zzaym0.getClass();
        zzayu0.zzk = zzaym0;
        zzayu0.zzd |= 0x20;
    }

    static void zzk(zzayu zzayu0, zzaxq zzaxq0) {
        zzaxq0.getClass();
        zzayu0.zzn = zzaxq0;
        zzayu0.zzd |= 0x100;
    }

    static void zzl(zzayu zzayu0, zzazs zzazs0) {
        zzazs0.getClass();
        zzayu0.zzo = zzazs0;
        zzayu0.zzd |= 0x200;
    }

    static void zzm(zzayu zzayu0, zzbaz zzbaz0) {
        zzbaz0.getClass();
        zzayu0.zzp = zzbaz0;
        zzayu0.zzd |= 0x400;
    }

    static void zzn(zzayu zzayu0, zzaxz zzaxz0) {
        zzaxz0.getClass();
        zzayu0.zzq = zzaxz0;
        zzayu0.zzd |= 0x800;
    }
}


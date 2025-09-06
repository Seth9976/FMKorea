package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzgxp extends zzgrq implements zzgtb {
    private zzgrz zzA;
    private zzgwa zzB;
    private String zzC;
    private zzgvs zzD;
    private zzgrz zzE;
    private zzgwt zzF;
    private int zzG;
    private zzgrz zzH;
    private zzgrz zzI;
    private byte zzJ;
    private static final zzgxp zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private zzgvw zzj;
    private zzgrz zzk;
    private zzgrz zzl;
    private String zzm;
    private zzgxc zzn;
    private boolean zzo;
    private zzgrz zzp;
    private String zzq;
    private boolean zzr;
    private boolean zzs;
    private zzgqi zzt;
    private zzgxk zzu;
    private boolean zzv;
    private String zzw;
    private zzgrz zzx;
    private zzgrz zzy;
    private zzgxo zzz;

    static {
        zzgxp zzgxp0 = new zzgxp();
        zzgxp.zzb = zzgxp0;
        zzgrq.zzaU(zzgxp.class, zzgxp0);
    }

    private zzgxp() {
        this.zzJ = 2;
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzk = zzgrq.zzaN();
        this.zzl = zzgrq.zzaN();
        this.zzm = "";
        this.zzp = zzgrq.zzaN();
        this.zzq = "";
        this.zzt = zzgqi.zzb;
        this.zzw = "";
        this.zzx = zzgrq.zzaN();
        this.zzy = zzgrq.zzaN();
        this.zzA = zzgrq.zzaN();
        this.zzC = "";
        this.zzE = zzgrq.zzaN();
        this.zzH = zzgrq.zzaN();
        this.zzI = zzgrq.zzaN();
    }

    public static zzgvu zza() {
        return (zzgvu)zzgxp.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzJ;
            }
            case 2: {
                return zzgrq.zzaR(zzgxp.zzb, "\u0001\u001F\u0000\u0001\u0001\u001F\u001F\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001A\u0007ဈ\t\bဇ\n\tဇ\u000B\n᠌\u0000\u000B᠌\u0001\fဉ\u0005\rဈ\u0006\u000Eဉ\u0007\u000Fည\f\u0010\u001B\u0011ဉ\r\u0012ဇ\u000E\u0013ဈ\u000F\u0014\u001A\u0015\u001A\u0016ဉ\u0010\u0017\u001B\u0018ဉ\u0011\u0019ဈ\u0012\u001Aဉ\u0013\u001B\u001B\u001Cဉ\u0014\u001D᠌\u0015\u001E\u001B\u001F\u001B", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgxi.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgxd.zza, "zzf", zzgvt.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgxt.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgxz.class, "zzB", "zzC", "zzD", "zzE", zzgwe.class, "zzF", "zzG", zzgxm.zza, "zzH", zzgww.class, "zzI", zzgwz.class});
            }
            case 3: {
                return new zzgxp();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgvu(null);
                    }
                    case 5: {
                        return zzgxp.zzb;
                    }
                    default: {
                        if(object0 == null) {
                            b = 0;
                        }
                        this.zzJ = b;
                        return null;
                    }
                }
            }
        }
    }

    static zzgxp zzc() {
        return zzgxp.zzb;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }

    static void zzg(zzgxp zzgxp0, String s) {
        s.getClass();
        zzgxp0.zzd |= 4;
        zzgxp0.zzg = s;
    }

    static void zzh(zzgxp zzgxp0, String s) {
        s.getClass();
        zzgxp0.zzd |= 8;
        zzgxp0.zzh = s;
    }

    static void zzi(zzgxp zzgxp0, zzgvw zzgvw0) {
        zzgvw0.getClass();
        zzgxp0.zzj = zzgvw0;
        zzgxp0.zzd |= 0x20;
    }

    static void zzj(zzgxp zzgxp0, zzgxi zzgxi0) {
        zzgxi0.getClass();
        zzgrz zzgrz0 = zzgxp0.zzk;
        if(!zzgrz0.zzc()) {
            zzgxp0.zzk = zzgrq.zzaO(zzgrz0);
        }
        zzgxp0.zzk.add(zzgxi0);
    }

    static void zzk(zzgxp zzgxp0, String s) {
        zzgxp0.zzd |= 0x40;
        zzgxp0.zzm = s;
    }

    static void zzl(zzgxp zzgxp0) {
        zzgxp0.zzd &= -65;
        zzgxp0.zzm = zzgxp.zzb.zzm;
    }

    static void zzm(zzgxp zzgxp0, zzgxc zzgxc0) {
        zzgxc0.getClass();
        zzgxp0.zzn = zzgxc0;
        zzgxp0.zzd |= 0x80;
    }

    static void zzn(zzgxp zzgxp0, zzgxk zzgxk0) {
        zzgxk0.getClass();
        zzgxp0.zzu = zzgxk0;
        zzgxp0.zzd |= 0x2000;
    }

    static void zzo(zzgxp zzgxp0, Iterable iterable0) {
        zzgrz zzgrz0 = zzgxp0.zzx;
        if(!zzgrz0.zzc()) {
            zzgxp0.zzx = zzgrq.zzaO(zzgrz0);
        }
        zzgpr.zzav(iterable0, zzgxp0.zzx);
    }

    static void zzp(zzgxp zzgxp0, Iterable iterable0) {
        zzgrz zzgrz0 = zzgxp0.zzy;
        if(!zzgrz0.zzc()) {
            zzgxp0.zzy = zzgrq.zzaO(zzgrz0);
        }
        zzgpr.zzav(iterable0, zzgxp0.zzy);
    }

    static void zzq(zzgxp zzgxp0, int v) {
        zzgxp0.zze = v - 1;
        zzgxp0.zzd |= 1;
    }
}


package com.google.android.gms.internal.ads;

public final class zzaop extends zzgrq implements zzgtb {
    private static final zzaop zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;

    static {
        zzaop zzaop0 = new zzaop();
        zzaop.zzb = zzaop0;
        zzgrq.zzaU(zzaop.class, zzaop0);
    }

    private zzaop() {
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = -1L;
        this.zzk = 1000;
        this.zzl = -1L;
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzo = 1000;
        this.zzp = -1L;
        this.zzq = -1L;
        this.zzr = -1L;
        this.zzs = -1L;
        this.zzv = -1L;
        this.zzw = -1L;
        this.zzx = -1L;
        this.zzy = -1L;
    }

    public static zzaoo zza() {
        return (zzaoo)zzaop.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzaop.zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000B᠌\n\fဂ\u000B\rဂ\f\u000Eဂ\r\u000Fဂ\u000E\u0010ဂ\u000F\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaoy.zza, "zzl", "zzm", "zzn", "zzo", zzaoy.zza, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
            }
            case 3: {
                return new zzaop();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzaoo(null);
                    }
                    case 5: {
                        return zzaop.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzaop zzc() {
        return zzaop.zzb;
    }

    static void zzd(zzaop zzaop0, long v) {
        zzaop0.zzd |= 1;
        zzaop0.zze = v;
    }

    static void zze(zzaop zzaop0, long v) {
        zzaop0.zzd |= 2;
        zzaop0.zzf = v;
    }

    static void zzf(zzaop zzaop0, long v) {
        zzaop0.zzd |= 4;
        zzaop0.zzg = v;
    }

    static void zzg(zzaop zzaop0, long v) {
        zzaop0.zzd |= 8;
        zzaop0.zzh = v;
    }

    static void zzh(zzaop zzaop0) {
        zzaop0.zzd &= -9;
        zzaop0.zzh = -1L;
    }

    static void zzi(zzaop zzaop0, long v) {
        zzaop0.zzd |= 16;
        zzaop0.zzi = v;
    }

    static void zzj(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x20;
        zzaop0.zzj = v;
    }

    static void zzk(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x80;
        zzaop0.zzl = v;
    }

    static void zzl(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x100;
        zzaop0.zzm = v;
    }

    static void zzm(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x200;
        zzaop0.zzn = v;
    }

    static void zzn(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x800;
        zzaop0.zzp = v;
    }

    static void zzo(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x1000;
        zzaop0.zzq = v;
    }

    static void zzp(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x2000;
        zzaop0.zzr = v;
    }

    static void zzq(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x4000;
        zzaop0.zzs = v;
    }

    static void zzr(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x8000;
        zzaop0.zzt = v;
    }

    static void zzs(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x10000;
        zzaop0.zzu = v;
    }

    static void zzt(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x20000;
        zzaop0.zzv = v;
    }

    static void zzu(zzaop zzaop0, long v) {
        zzaop0.zzd |= 0x40000;
        zzaop0.zzw = v;
    }

    static void zzv(zzaop zzaop0, int v) {
        zzaop0.zzk = v - 1;
        zzaop0.zzd |= 0x40;
    }

    static void zzw(zzaop zzaop0, int v) {
        zzaop0.zzo = v - 1;
        zzaop0.zzd |= 0x400;
    }
}


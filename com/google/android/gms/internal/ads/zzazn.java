package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzazn extends zzgrq implements zzgtb {
    private static final zzgrw zzb;
    private static final zzazn zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgrv zzj;
    private zzazi zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzazn.zzb = new zzazl();
        zzazn zzazn0 = new zzazn();
        zzazn.zzd = zzazn0;
        zzgrq.zzaU(zzazn.class, zzazn0);
    }

    private zzazn() {
        this.zzj = zzgrq.zzaJ();
    }

    static void zzA(zzazn zzazn0, int v) {
        zzazn0.zzm = v - 1;
        zzazn0.zze |= 0x40;
    }

    static void zzB(zzazn zzazn0, int v) {
        zzazn0.zzn = v - 1;
        zzazn0.zze |= 0x80;
    }

    static void zzC(zzazn zzazn0, int v) {
        zzazn0.zzp = v - 1;
        zzazn0.zze |= 0x200;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzazn.zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000B᠌\t\f᠌\n\rဂ\u000B", new Object[]{"zze", "zzf", "zzg", zzayr.zza, "zzh", "zzi", "zzj", zzayb.zza, "zzk", "zzl", zzayr.zza, "zzm", zzayr.zza, "zzn", zzayr.zza, "zzo", "zzp", zzayr.zza, "zzq", zzazq.zza, "zzr"});
            }
            case 3: {
                return new zzazn();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzazm(null);
                    }
                    case 5: {
                        return zzazn.zzd;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazi zzf() {
        return this.zzk == null ? zzazi.zzd() : this.zzk;
    }

    public static zzazm zzg() {
        return (zzazm)zzazn.zzd.zzaA();
    }

    static zzazn zzh() {
        return zzazn.zzd;
    }

    public static zzazn zzi(byte[] arr_b) {
        return (zzazn)zzgrq.zzaF(zzazn.zzd, arr_b);
    }

    public final zzazr zzj() {
        zzazr zzazr0 = zzazr.zzb(this.zzq);
        return zzazr0 == null ? zzazr.zza : zzazr0;
    }

    public final List zzk() {
        return new zzgrx(this.zzj, zzazn.zzb);
    }

    static void zzl(zzazn zzazn0, long v) {
        zzazn0.zze |= 1;
        zzazn0.zzf = v;
    }

    static void zzm(zzazn zzazn0, long v) {
        zzazn0.zze |= 4;
        zzazn0.zzh = v;
    }

    static void zzn(zzazn zzazn0, long v) {
        zzazn0.zze |= 8;
        zzazn0.zzi = v;
    }

    static void zzo(zzazn zzazn0, Iterable iterable0) {
        zzgrv zzgrv0 = zzazn0.zzj;
        if(!zzgrv0.zzc()) {
            zzazn0.zzj = zzgrq.zzaK(zzgrv0);
        }
        for(Object object0: iterable0) {
            zzazn0.zzj.zzh(((zzayc)object0).zza());
        }
    }

    static void zzp(zzazn zzazn0, zzazi zzazi0) {
        zzazi0.getClass();
        zzazn0.zzk = zzazi0;
        zzazn0.zze |= 16;
    }

    static void zzq(zzazn zzazn0, int v) {
        zzazn0.zze |= 0x100;
        zzazn0.zzo = v;
    }

    static void zzr(zzazn zzazn0, zzazr zzazr0) {
        zzazn0.zzq = zzazr0.zza();
        zzazn0.zze |= 0x400;
    }

    static void zzs(zzazn zzazn0, long v) {
        zzazn0.zze |= 0x800;
        zzazn0.zzr = v;
    }

    public final int zzt() {
        int v = zzays.zza(this.zzm);
        return v == 0 ? 1 : v;
    }

    public final int zzu() {
        int v = zzays.zza(this.zzn);
        return v == 0 ? 1 : v;
    }

    public final int zzv() {
        int v = zzays.zza(this.zzp);
        return v == 0 ? 1 : v;
    }

    public final int zzw() {
        int v = zzays.zza(this.zzg);
        return v == 0 ? 1 : v;
    }

    public final int zzx() {
        int v = zzays.zza(this.zzl);
        return v == 0 ? 1 : v;
    }

    static void zzy(zzazn zzazn0, int v) {
        zzazn0.zzg = v - 1;
        zzazn0.zze |= 2;
    }

    static void zzz(zzazn zzazn0, int v) {
        zzazn0.zzl = v - 1;
        zzazn0.zze |= 0x20;
    }
}


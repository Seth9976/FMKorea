package com.google.android.gms.internal.ads;

public final class zzanl extends zzgrq implements zzgtb {
    private static final zzanl zzb;
    private int zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private long zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private zzgrz zzp;
    private int zzq;

    static {
        zzanl zzanl0 = new zzanl();
        zzanl.zzb = zzanl0;
        zzgrq.zzaU(zzanl.class, zzanl0);
    }

    private zzanl() {
        this.zze = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzl = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = zzgrq.zzaN();
    }

    public static zzanh zza() {
        return (zzanh)zzanl.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzanl.zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000Bဈ\n\f\u001B\r᠌\u000B", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzanj.class, "zzq", zzank.zza});
            }
            case 3: {
                return new zzanl();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzanh(null);
                    }
                    case 5: {
                        return zzanl.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzanl zzc() {
        return zzanl.zzb;
    }

    static void zzd(zzanl zzanl0, long v) {
        zzanl0.zzd |= 2;
        zzanl0.zzf = v;
    }

    static void zze(zzanl zzanl0, String s) {
        s.getClass();
        zzanl0.zzd |= 4;
        zzanl0.zzg = s;
    }

    static void zzf(zzanl zzanl0, String s) {
        s.getClass();
        zzanl0.zzd |= 8;
        zzanl0.zzh = s;
    }

    static void zzg(zzanl zzanl0, String s) {
        zzanl0.zzd |= 16;
        zzanl0.zzi = s;
    }

    static void zzh(zzanl zzanl0, String s) {
        zzanl0.zzd |= 0x400;
        zzanl0.zzo = s;
    }

    static void zzi(zzanl zzanl0, String s) {
        s.getClass();
        zzanl0.zzd |= 1;
        zzanl0.zze = s;
    }

    static void zzj(zzanl zzanl0, int v) {
        zzanl0.zzq = v - 1;
        zzanl0.zzd |= 0x800;
    }
}


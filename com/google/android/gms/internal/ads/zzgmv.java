package com.google.android.gms.internal.ads;

public final class zzgmv extends zzgrq implements zzgtb {
    private static final zzgmv zzb;
    private String zzd;
    private zzgqi zze;
    private int zzf;

    static {
        zzgmv zzgmv0 = new zzgmv();
        zzgmv.zzb = zzgmv0;
        zzgrq.zzaU(zzgmv.class, zzgmv0);
    }

    private zzgmv() {
        this.zzd = "";
        this.zze = zzgqi.zzb;
    }

    public static zzgmu zza() {
        return (zzgmu)zzgmv.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgmv.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgmv();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgmu(null);
                    }
                    case 5: {
                        return zzgmv.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgmv zzc() {
        return zzgmv.zzb;
    }

    public static zzgmv zzd() {
        return zzgmv.zzb;
    }

    public static zzgmv zze(byte[] arr_b, zzgrc zzgrc0) {
        return (zzgmv)zzgrq.zzaI(zzgmv.zzb, arr_b, zzgrc0);
    }

    public final zzgnw zzf() {
        zzgnw zzgnw0 = zzgnw.zzb(this.zzf);
        return zzgnw0 == null ? zzgnw.zzf : zzgnw0;
    }

    public final zzgqi zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzd;
    }

    static void zzi(zzgmv zzgmv0, String s) {
        zzgmv0.zzd = s;
    }

    static void zzj(zzgmv zzgmv0, zzgqi zzgqi0) {
        zzgmv0.zze = zzgqi0;
    }

    static void zzk(zzgmv zzgmv0, zzgnw zzgnw0) {
        zzgmv0.zzf = zzgnw0.zza();
    }
}


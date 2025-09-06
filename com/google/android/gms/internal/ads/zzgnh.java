package com.google.android.gms.internal.ads;

public final class zzgnh extends zzgrq implements zzgtb {
    private static final zzgnh zzb;
    private String zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgnh zzgnh0 = new zzgnh();
        zzgnh.zzb = zzgnh0;
        zzgrq.zzaU(zzgnh.class, zzgnh0);
    }

    private zzgnh() {
        this.zzd = "";
    }

    public static zzgng zza() {
        return (zzgng)zzgnh.zzb.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgnh.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000B\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgnh();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgng(null);
                    }
                    case 5: {
                        return zzgnh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgnh zzc() {
        return zzgnh.zzb;
    }

    static void zzd(zzgnh zzgnh0, String s) {
        s.getClass();
        zzgnh0.zzd = s;
    }

    static void zze(zzgnh zzgnh0, zzgnw zzgnw0) {
        zzgnh0.zzg = zzgnw0.zza();
    }

    static void zzf(zzgnh zzgnh0, int v) {
        zzgnh0.zzf = v;
    }

    static void zzg(zzgnh zzgnh0, int v) {
        zzgnh0.zze = zzgms.zza(v);
    }
}


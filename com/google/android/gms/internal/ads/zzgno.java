package com.google.android.gms.internal.ads;

public final class zzgno extends zzgrq implements zzgtb {
    private static final zzgno zzb;
    private String zzd;

    static {
        zzgno zzgno0 = new zzgno();
        zzgno.zzb = zzgno0;
        zzgrq.zzaU(zzgno.class, zzgno0);
    }

    private zzgno() {
        this.zzd = "";
    }

    static zzgno zza() {
        return zzgno.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgno.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
            }
            case 3: {
                return new zzgno();
            }
            case 4: {
                return new zzgnn(null);
            }
            case 5: {
                return zzgno.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgno zzc() {
        return zzgno.zzb;
    }

    public static zzgno zzd(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgno)zzgrq.zzaG(zzgno.zzb, zzgqi0, zzgrc0);
    }

    public final String zze() [...] // 潜在的解密器
}


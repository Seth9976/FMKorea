package com.google.android.gms.internal.ads;

public final class zzgnu extends zzgrq implements zzgtb {
    private static final zzgnu zzb;
    private int zzd;
    private String zze;
    private zzgmv zzf;

    static {
        zzgnu zzgnu0 = new zzgnu();
        zzgnu.zzb = zzgnu0;
        zzgrq.zzaU(zzgnu.class, zzgnu0);
    }

    private zzgnu() {
        this.zze = "";
    }

    public final zzgmv zza() {
        return this.zzf == null ? zzgmv.zzd() : this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgnu.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgnu();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgnt(null);
                    }
                    case 5: {
                        return zzgnu.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    static zzgnu zzc() {
        return zzgnu.zzb;
    }

    public static zzgnu zzd() {
        return zzgnu.zzb;
    }

    public static zzgnu zze(zzgqi zzgqi0, zzgrc zzgrc0) {
        return (zzgnu)zzgrq.zzaG(zzgnu.zzb, zzgqi0, zzgrc0);
    }

    public final String zzf() [...] // 潜在的解密器

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }
}


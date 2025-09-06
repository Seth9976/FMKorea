package com.google.android.gms.internal.ads;

@Deprecated
public final class zzgmy extends zzgrq implements zzgtb {
    private static final zzgmy zzb;
    private String zzd;
    private String zze;
    private int zzf;
    private boolean zzg;
    private String zzh;

    static {
        zzgmy zzgmy0 = new zzgmy();
        zzgmy.zzb = zzgmy0;
        zzgrq.zzaU(zzgmy.class, zzgmy0);
    }

    private zzgmy() {
        this.zzd = "";
        this.zze = "";
        this.zzh = "";
    }

    static zzgmy zza() {
        return zzgmy.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgmy.zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000B\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgmy();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgmx(null);
                    }
                    case 5: {
                        return zzgmy.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


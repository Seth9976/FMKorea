package com.google.android.gms.internal.ads;

public final class zzbai extends zzgrq implements zzgtb {
    private static final zzbai zzb;
    private int zzd;
    private int zze;
    private zzbal zzf;
    private zzbac zzg;

    static {
        zzbai zzbai0 = new zzbai();
        zzbai.zzb = zzbai0;
        zzgrq.zzaU(zzbai.class, zzbai0);
    }

    private zzbai() {
        this.zze = 1000;
    }

    static zzbai zza() {
        return zzbai.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzbai.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzbai();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbah(null);
                    }
                    case 5: {
                        return zzbai.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}


package com.google.android.gms.internal.ads;

public final class zzgml extends zzgrq implements zzgtb {
    private static final zzgml zzb;
    private int zzd;
    private int zze;

    static {
        zzgml zzgml0 = new zzgml();
        zzgml.zzb = zzgml0;
        zzgrq.zzaU(zzgml.class, zzgml0);
    }

    public final int zza() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgml.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000B", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgml();
                    }
                    case 4: {
                        return new zzgmk(null);
                    }
                    case 5: {
                        return zzgml.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzgmk zzc() {
        return (zzgmk)zzgml.zzb.zzaA();
    }

    static zzgml zzd() {
        return zzgml.zzb;
    }

    public static zzgml zze() {
        return zzgml.zzb;
    }

    static void zzf(zzgml zzgml0, int v) {
        zzgml0.zze = v;
    }

    public final int zzg() {
        int v = 2;
        switch(this.zzd) {
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                return 4;
            }
            case 0: 
            case 3: {
                break;
            }
            case 4: {
                return 6;
            }
            case 5: {
                return 7;
            }
            default: {
                return 1;
            }
        }
        return v == 0 ? 1 : v;
    }

    static void zzh(zzgml zzgml0, int v) {
        zzgml0.zzd = zzgmc.zza(v);
    }
}


package com.google.android.gms.internal.ads;

public final class zzgnc extends zzgrq implements zzgtb {
    private static final zzgnc zzb;
    private int zzd;
    private zzgmq zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgnc zzgnc0 = new zzgnc();
        zzgnc.zzb = zzgnc0;
        zzgrq.zzaU(zzgnc.class, zzgnc0);
    }

    public final int zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgnc.zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000B\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgnc();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgnb(null);
                    }
                    case 5: {
                        return zzgnc.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final zzgmq zzc() {
        return this.zze == null ? zzgmq.zze() : this.zze;
    }

    public static zzgnb zzd() {
        return (zzgnb)zzgnc.zzb.zzaA();
    }

    static zzgnc zze() {
        return zzgnc.zzb;
    }

    public final zzgnw zzf() {
        zzgnw zzgnw0 = zzgnw.zzb(this.zzh);
        return zzgnw0 == null ? zzgnw.zzf : zzgnw0;
    }

    static void zzg(zzgnc zzgnc0, zzgmq zzgmq0) {
        zzgmq0.getClass();
        zzgnc0.zze = zzgmq0;
        zzgnc0.zzd |= 1;
    }

    static void zzh(zzgnc zzgnc0, zzgnw zzgnw0) {
        zzgnc0.zzh = zzgnw0.zza();
    }

    static void zzi(zzgnc zzgnc0, int v) {
        zzgnc0.zzg = v;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final int zzk() {
        int v = this.zzf;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                default: {
                    return 1;
                }
            }
        }
        return v1 == 0 ? 1 : v1;
    }

    static void zzl(zzgnc zzgnc0, int v) {
        zzgnc0.zzf = zzgms.zza(v);
    }
}


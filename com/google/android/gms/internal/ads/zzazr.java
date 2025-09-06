package com.google.android.gms.internal.ads;

public enum zzazr implements zzgrs {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    private static final zzgrt zzg;
    private final int zzi;

    static {
        zzazr.zzg = new zzazp();
    }

    private zzazr(int v1) {
        this.zzi = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }

    public static zzazr zzb(int v) {
        switch(v) {
            case 0: {
                return zzazr.zza;
            }
            case 1: {
                return zzazr.zzb;
            }
            case 2: {
                return zzazr.zzc;
            }
            case 3: {
                return zzazr.zzd;
            }
            case 4: {
                return zzazr.zze;
            }
            case 5: {
                return zzazr.zzf;
            }
            default: {
                return null;
            }
        }
    }
}


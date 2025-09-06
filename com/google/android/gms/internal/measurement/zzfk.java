package com.google.android.gms.internal.measurement;

public enum zzfk implements zzjc {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private static final zzjb zzg;
    private final int zzi;

    static {
        zzfk.zzg = new zzfj();
    }

    private zzfk(int v1) {
        this.zzi = v1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "<com.google.android.gms.internal.measurement.zzfk" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + this.name() + '>';
    }

    public static zzfk zza(int v) {
        switch(v) {
            case 0: {
                return zzfk.zza;
            }
            case 1: {
                return zzfk.zzb;
            }
            case 2: {
                return zzfk.zzc;
            }
            case 3: {
                return zzfk.zzd;
            }
            case 4: {
                return zzfk.zze;
            }
            case 5: {
                return zzfk.zzf;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjc
    public final int zza() {
        return this.zzi;
    }

    public static zzje zzb() {
        return zzfl.zza;
    }
}


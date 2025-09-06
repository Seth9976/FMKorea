package com.google.android.gms.internal.ads;

public final class zzbxu implements zzbyd {
    public static final zzbxu zza;

    static {
        zzbxu.zza = new zzbxu();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyd
    public final Object zza(zzcgz zzcgz0) {
        String s = zzcgz0.zzh();
        if(s == null) {
            s = zzcgz0.zzg();
            return s == null ? "" : s;
        }
        return s;
    }
}


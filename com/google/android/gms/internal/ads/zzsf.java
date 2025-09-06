package com.google.android.gms.internal.ads;

public final class zzsf implements zzso {
    public static final zzsf zza;

    static {
        zzsf.zza = new zzsf();
    }

    @Override  // com.google.android.gms.internal.ads.zzso
    public final int zza(Object object0) {
        String s = ((zzrw)object0).zza;
        if(!s.startsWith("OMX.google") && !s.startsWith("c2.android")) {
            return zzfk.zza >= 26 || !s.equals("OMX.MTK.AUDIO.DECODER.RAW") ? 0 : -1;
        }
        return 1;
    }
}


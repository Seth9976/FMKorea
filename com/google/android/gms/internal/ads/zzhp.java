package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo.Pattern;
import android.media.MediaCodec.CryptoInfo;

final class zzhp {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb;

    zzhp(MediaCodec.CryptoInfo mediaCodec$CryptoInfo0, zzho zzho0) {
        this.zza = mediaCodec$CryptoInfo0;
        this.zzb = w.a(0, 0);
    }

    static void zza(zzhp zzhp0, int v, int v1) {
        zzhp0.zzb.set(v, v1);
        zzhp0.zza.setPattern(zzhp0.zzb);
    }
}


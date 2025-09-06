package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public final class zzry extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrw zzc;
    public final String zzd;
    public final zzry zze;

    public zzry(zzam zzam0, Throwable throwable0, boolean z, int v) {
        this("Decoder init failed: [" + v + "], " + zzam0, throwable0, zzam0.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(v), null);
    }

    public zzry(zzam zzam0, Throwable throwable0, boolean z, zzrw zzrw0) {
        String s = zzfk.zza < 21 || !(throwable0 instanceof MediaCodec.CodecException) ? null : ((MediaCodec.CodecException)throwable0).getDiagnosticInfo();
        this("Decoder init failed: " + zzrw0.zza + ", " + zzam0, throwable0, zzam0.zzm, false, zzrw0, s, null);
    }

    private zzry(String s, Throwable throwable0, String s1, boolean z, zzrw zzrw0, String s2, zzry zzry0) {
        super(s, throwable0);
        this.zza = s1;
        this.zzb = false;
        this.zzc = zzrw0;
        this.zzd = s2;
        this.zze = zzry0;
    }

    static zzry zza(zzry zzry0, zzry zzry1) {
        return new zzry(zzry0.getMessage(), zzry0.getCause(), zzry0.zza, false, zzry0.zzc, zzry0.zzd, zzry1);
    }
}


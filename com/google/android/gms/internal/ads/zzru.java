package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public class zzru extends zzhr {
    public final zzrw zza;
    public final String zzb;

    public zzru(Throwable throwable0, zzrw zzrw0) {
        String s = null;
        super("Decoder failed: " + (zzrw0 == null ? null : zzrw0.zza), throwable0);
        this.zza = zzrw0;
        if(zzfk.zza >= 21 && throwable0 instanceof MediaCodec.CodecException) {
            s = ((MediaCodec.CodecException)throwable0).getDiagnosticInfo();
        }
        this.zzb = s;
    }
}


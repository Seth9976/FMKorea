package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

public final class zzrf implements zzrs {
    private final zzfry zzb;
    private final zzfry zzc;

    public zzrf(int v, boolean z) {
        zzrd zzrd0 = () -> new HandlerThread(zzrh.zzd(v));
        zzre zzre0 = () -> new HandlerThread(zzrh.zze(v));
        super();
        this.zzb = zzrd0;
        this.zzc = zzre0;
    }

    // 检测为 Lambda 实现
    static HandlerThread zza(int v) [...]

    // 检测为 Lambda 实现
    static HandlerThread zzb(int v) [...]

    public final zzrh zzc(zzrr zzrr0) {
        zzrh zzrh1;
        MediaCodec mediaCodec0;
        zzrh zzrh0 = null;
        try {
            Trace.beginSection(("createCodec:" + zzrr0.zza.zza));
            mediaCodec0 = null;
            mediaCodec0 = MediaCodec.createByCodecName(zzrr0.zza.zza);
            zzrh1 = new zzrh(mediaCodec0, zzrf.zza(((zzrd)this.zzb).zza), zzrf.zzb(((zzre)this.zzc).zza), false, null);
        }
        catch(Exception exception0) {
            goto label_13;
        }
        try {
            Trace.endSection();
            zzrh.zzh(zzrh1, zzrr0.zzb, zzrr0.zzd, null, 0);
            return zzrh1;
        }
        catch(Exception exception0) {
            zzrh0 = zzrh1;
        }
    label_13:
        if(zzrh0 != null) {
            zzrh0.zzl();
        }
        else if(mediaCodec0 != null) {
            mediaCodec0.release();
        }
        throw exception0;
    }
}


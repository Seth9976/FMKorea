package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

final class zzrh implements zzrt {
    private final MediaCodec zza;
    private final zzrn zzb;
    private final zzrl zzc;
    private boolean zzd;
    private int zze;

    zzrh(MediaCodec mediaCodec0, HandlerThread handlerThread0, HandlerThread handlerThread1, boolean z, zzrg zzrg0) {
        this.zza = mediaCodec0;
        this.zzb = new zzrn(handlerThread0);
        this.zzc = new zzrl(mediaCodec0, handlerThread1);
        this.zze = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        this.zzc.zzc();
        return this.zzb.zzb(mediaCodec$BufferInfo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    static String zzd(int v) {
        return zzrh.zzs(v, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    static String zze(int v) {
        return zzrh.zzs(v, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final ByteBuffer zzf(int v) {
        return this.zza.getInputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final ByteBuffer zzg(int v) {
        return this.zza.getOutputBuffer(v);
    }

    static void zzh(zzrh zzrh0, MediaFormat mediaFormat0, Surface surface0, MediaCrypto mediaCrypto0, int v) {
        zzrh0.zzb.zzf(zzrh0.zza);
        Trace.beginSection("configureCodec");
        zzrh0.zza.configure(mediaFormat0, surface0, null, 0);
        Trace.endSection();
        zzrh0.zzc.zzg();
        Trace.beginSection("startCodec");
        zzrh0.zza.start();
        Trace.endSection();
        zzrh0.zze = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzj(int v, int v1, int v2, long v3, int v4) {
        this.zzc.zzd(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzk(int v, int v1, zzhq zzhq0, long v2, int v3) {
        this.zzc.zze(v, 0, zzhq0, v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzl() {
        try {
            if(this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
                goto label_9;
            label_5:
                if(this.zzd) {
                    throw throwable0;
                }
                goto label_6;
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            goto label_5;
        }
    label_6:
        this.zza.release();
        this.zzd = true;
        throw throwable0;
    label_9:
        this.zze = 2;
        if(!this.zzd) {
            this.zza.release();
            this.zzd = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzm(int v, long v1) {
        this.zza.releaseOutputBuffer(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzn(int v, boolean z) {
        this.zza.releaseOutputBuffer(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzo(Surface surface0) {
        this.zza.setOutputSurface(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzp(Bundle bundle0) {
        this.zza.setParameters(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzq(int v) {
        this.zza.setVideoScalingMode(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final boolean zzr() {
        return false;
    }

    private static String zzs(int v, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(v == 1) {
            stringBuilder0.append("Audio");
            return stringBuilder0.toString();
        }
        if(v == 2) {
            stringBuilder0.append("Video");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("Unknown(");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}


package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class zzsr implements zzrt {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    zzsr(MediaCodec mediaCodec0, zzsq zzsq0) {
        this.zza = mediaCodec0;
        if(zzfk.zza < 21) {
            this.zzb = mediaCodec0.getInputBuffers();
            this.zzc = mediaCodec0.getOutputBuffers();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        int v;
        do {
            v = this.zza.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
            if(v == -3) {
                if(zzfk.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                v = -3;
            }
        }
        while(v == -3);
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final ByteBuffer zzf(int v) {
        return zzfk.zza < 21 ? this.zzb[v] : this.zza.getInputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final ByteBuffer zzg(int v) {
        return zzfk.zza < 21 ? this.zzc[v] : this.zza.getOutputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzi() {
        this.zza.flush();
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzj(int v, int v1, int v2, long v3, int v4) {
        this.zza.queueInputBuffer(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzk(int v, int v1, zzhq zzhq0, long v2, int v3) {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzhq0.zza();
        this.zza.queueSecureInputBuffer(v, 0, mediaCodec$CryptoInfo0, v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrt
    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
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
}


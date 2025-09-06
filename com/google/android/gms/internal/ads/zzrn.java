package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

final class zzrn extends MediaCodec.Callback {
    private final Object zza;
    private final HandlerThread zzb;
    private Handler zzc;
    private final zzrq zzd;
    private final zzrq zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private long zzk;
    private boolean zzl;
    private IllegalStateException zzm;

    zzrn(HandlerThread handlerThread0) {
        this.zza = new Object();
        this.zzb = handlerThread0;
        this.zzd = new zzrq();
        this.zze = new zzrq();
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onError(MediaCodec mediaCodec0, MediaCodec.CodecException mediaCodec$CodecException0) {
        synchronized(this.zza) {
            this.zzj = mediaCodec$CodecException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec0, int v) {
        synchronized(this.zza) {
            this.zzd.zzb(v);
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec0, int v, MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.zza) {
            MediaFormat mediaFormat0 = this.zzi;
            if(mediaFormat0 != null) {
                this.zzh(mediaFormat0);
                this.zzi = null;
            }
            this.zze.zzb(v);
            this.zzf.add(mediaCodec$BufferInfo0);
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        synchronized(this.zza) {
            this.zzh(mediaFormat0);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized(this.zza) {
            this.zzj();
            this.zzk();
            int v1 = -1;
            if(this.zzl()) {
                return -1;
            }
            if(!this.zzd.zzd()) {
                v1 = this.zzd.zza();
            }
            return v1;
        }
    }

    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.zza) {
            this.zzj();
            this.zzk();
            if(this.zzl()) {
                return -1;
            }
            if(this.zze.zzd()) {
                return -1;
            }
            int v1 = this.zze.zza();
            if(v1 >= 0) {
                zzdy.zzb(this.zzh);
                MediaCodec.BufferInfo mediaCodec$BufferInfo1 = (MediaCodec.BufferInfo)this.zzf.remove();
                mediaCodec$BufferInfo0.set(mediaCodec$BufferInfo1.offset, mediaCodec$BufferInfo1.size, mediaCodec$BufferInfo1.presentationTimeUs, mediaCodec$BufferInfo1.flags);
            }
            else if(v1 == -2) {
                this.zzh = (MediaFormat)this.zzg.remove();
                v1 = -2;
            }
            return v1;
        }
    }

    public final MediaFormat zzc() {
        synchronized(this.zza) {
            MediaFormat mediaFormat0 = this.zzh;
            if(mediaFormat0 != null) {
                return mediaFormat0;
            }
        }
        throw new IllegalStateException();
    }

    // 检测为 Lambda 实现
    public static void zzd(zzrn zzrn0) [...]

    public final void zze() {
        synchronized(this.zza) {
            ++this.zzk;
            this.zzc.post(() -> synchronized(this.zza) {
                if(this.zzl) {
                    return;
                }
                long v1 = this.zzk - 1L;
                this.zzk = v1;
                int v2 = Long.compare(v1, 0L);
                if(v2 > 0) {
                    return;
                }
                if(v2 < 0) {
                    IllegalStateException illegalStateException0 = new IllegalStateException();
                    synchronized(this.zza) {
                        this.zzm = illegalStateException0;
                    }
                    return;
                }
                this.zzi();
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec0) {
        zzdy.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler0 = new Handler(this.zzb.getLooper());
        mediaCodec0.setCallback(this, handler0);
        this.zzc = handler0;
    }

    public final void zzg() {
        synchronized(this.zza) {
            this.zzl = true;
            this.zzb.quit();
            this.zzi();
        }
    }

    private final void zzh(MediaFormat mediaFormat0) {
        this.zze.zzb(-2);
        this.zzg.add(mediaFormat0);
    }

    private final void zzi() {
        if(!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat)this.zzg.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException0 = this.zzm;
        if(illegalStateException0 == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException0;
    }

    private final void zzk() {
        MediaCodec.CodecException mediaCodec$CodecException0 = this.zzj;
        if(mediaCodec$CodecException0 == null) {
            return;
        }
        this.zzj = null;
        throw mediaCodec$CodecException0;
    }

    private final boolean zzl() {
        return this.zzk > 0L || this.zzl;
    }
}


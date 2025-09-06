package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

final class zzrl {
    private static final ArrayDeque zza;
    private static final Object zzb;
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeb zzg;
    private boolean zzh;

    static {
        zzrl.zza = new ArrayDeque();
        zzrl.zzb = new Object();
    }

    public zzrl(MediaCodec mediaCodec0, HandlerThread handlerThread0) {
        zzeb zzeb0 = new zzeb(zzdz.zza);
        super();
        this.zzc = mediaCodec0;
        this.zzd = handlerThread0;
        this.zzg = zzeb0;
        this.zzf = new AtomicReference();
    }

    static void zza(zzrl zzrl0, Message message0) {
        zzrk zzrk1;
        zzrk zzrk0 = null;
        switch(message0.what) {
            case 0: {
                zzrk1 = (zzrk)message0.obj;
                try {
                    zzrl0.zzc.queueInputBuffer(zzrk1.zza, 0, zzrk1.zzc, zzrk1.zze, zzrk1.zzf);
                }
                catch(RuntimeException runtimeException0) {
                    zzri.zza(zzrl0.zzf, null, runtimeException0);
                }
                zzrk0 = zzrk1;
                break;
            }
            case 1: {
                zzrk1 = (zzrk)message0.obj;
                int v = zzrk1.zza;
                long v1 = zzrk1.zze;
                int v2 = zzrk1.zzf;
                try {
                    synchronized(zzrl.zzb) {
                        zzrl0.zzc.queueSecureInputBuffer(v, 0, zzrk1.zzd, v1, v2);
                    }
                }
                catch(RuntimeException runtimeException1) {
                    zzri.zza(zzrl0.zzf, null, runtimeException1);
                }
                zzrk0 = zzrk1;
                break;
            }
            case 2: {
                zzrl0.zzg.zze();
                break;
            }
            default: {
                IllegalStateException illegalStateException0 = new IllegalStateException(String.valueOf(message0.what));
                zzri.zza(zzrl0.zzf, null, illegalStateException0);
            }
        }
        if(zzrk0 != null) {
            synchronized(zzrl.zza) {
                zzrl.zza.add(zzrk0);
            }
        }
    }

    public final void zzb() {
        if(this.zzh) {
            try {
                Handler handler0 = this.zze;
                if(handler0 == null) {
                    throw null;
                }
                handler0.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler1 = this.zze;
                if(handler1 == null) {
                    throw null;
                }
                handler1.obtainMessage(2).sendToTarget();
                this.zzg.zza();
                return;
            }
            catch(InterruptedException interruptedException0) {
            }
            Thread.currentThread().interrupt();
            throw new IllegalStateException(interruptedException0);
        }
    }

    public final void zzc() {
        RuntimeException runtimeException0 = (RuntimeException)this.zzf.getAndSet(null);
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
    }

    public final void zzd(int v, int v1, int v2, long v3, int v4) {
        this.zzc();
        zzrk zzrk0 = zzrl.zzh();
        zzrk0.zza(v, 0, v2, v3, v4);
        this.zze.obtainMessage(0, zzrk0).sendToTarget();
    }

    public final void zze(int v, int v1, zzhq zzhq0, long v2, int v3) {
        this.zzc();
        zzrk zzrk0 = zzrl.zzh();
        zzrk0.zza(v, 0, 0, v2, 0);
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzrk0.zzd;
        mediaCodec$CryptoInfo0.numSubSamples = zzhq0.zzf;
        mediaCodec$CryptoInfo0.numBytesOfClearData = zzrl.zzj(zzhq0.zzd, mediaCodec$CryptoInfo0.numBytesOfClearData);
        mediaCodec$CryptoInfo0.numBytesOfEncryptedData = zzrl.zzj(zzhq0.zze, mediaCodec$CryptoInfo0.numBytesOfEncryptedData);
        byte[] arr_b = zzrl.zzi(zzhq0.zzb, mediaCodec$CryptoInfo0.key);
        arr_b.getClass();
        mediaCodec$CryptoInfo0.key = arr_b;
        byte[] arr_b1 = zzrl.zzi(zzhq0.zza, mediaCodec$CryptoInfo0.iv);
        arr_b1.getClass();
        mediaCodec$CryptoInfo0.iv = arr_b1;
        mediaCodec$CryptoInfo0.mode = zzhq0.zzc;
        if(zzfk.zza >= 24) {
            mediaCodec$CryptoInfo0.setPattern(w.a(zzhq0.zzg, zzhq0.zzh));
        }
        this.zze.obtainMessage(1, zzrk0).sendToTarget();
    }

    public final void zzf() {
        if(this.zzh) {
            this.zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if(!this.zzh) {
            this.zzd.start();
            this.zze = new zzrj(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }

    private static zzrk zzh() {
        ArrayDeque arrayDeque0 = zzrl.zza;
        synchronized(arrayDeque0) {
            if(arrayDeque0.isEmpty()) {
                return new zzrk();
            }
        }
        return (zzrk)arrayDeque0.removeFirst();
    }

    private static byte[] zzi(byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null) {
            return arr_b1;
        }
        if(arr_b1 != null && arr_b1.length >= arr_b.length) {
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            return arr_b1;
        }
        return Arrays.copyOf(arr_b, arr_b.length);
    }

    private static int[] zzj(int[] arr_v, int[] arr_v1) {
        if(arr_v == null) {
            return arr_v1;
        }
        if(arr_v1 != null && arr_v1.length >= arr_v.length) {
            System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
            return arr_v1;
        }
        return Arrays.copyOf(arr_v, arr_v.length);
    }
}


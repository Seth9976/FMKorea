package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class zzza extends HandlerThread implements Handler.Callback {
    private zzee zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzc zze;

    public zzza() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                try {
                    try {
                        int v = message0.arg1;
                        zzee zzee0 = this.zza;
                        if(zzee0 == null) {
                            throw null;
                        }
                        zzee0.zzb(v);
                        this.zze = new zzzc(this, this.zza.zza(), v != 0, null);
                        goto label_50;
                    }
                    catch(RuntimeException runtimeException0) {
                    }
                    catch(zzeg zzeg0) {
                        goto label_20;
                    }
                    catch(Error error0) {
                        goto label_31;
                    }
                    zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", runtimeException0);
                    this.zzd = runtimeException0;
                }
                catch(Throwable throwable0) {
                    goto label_42;
                }
                synchronized(this) {
                    this.notify();
                }
                return true;
                try {
                label_20:
                    zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", zzeg0);
                    this.zzd = new IllegalStateException(zzeg0);
                }
                catch(Throwable throwable0) {
                    goto label_42;
                }
                synchronized(this) {
                    this.notify();
                }
                return true;
                try {
                label_31:
                    zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", error0);
                    this.zzc = error0;
                }
                catch(Throwable throwable0) {
                    goto label_42;
                }
                synchronized(this) {
                    this.notify();
                }
                return true;
            label_42:
                synchronized(this) {
                    this.notify();
                }
                throw throwable0;
            label_50:
                synchronized(this) {
                    this.notify();
                }
                return true;
            }
            case 2: {
                try {
                    zzee zzee1 = this.zza;
                    if(zzee1 == null) {
                        throw null;
                    }
                    zzee1.zzc();
                }
                catch(Throwable throwable6) {
                    try {
                        zzes.zzd("PlaceholderSurface", "Failed to release placeholder surface", throwable6);
                    }
                    catch(Throwable throwable7) {
                        this.quit();
                        throw throwable7;
                    }
                }
                this.quit();
                return true;
            }
            default: {
                return true;
            }
        }
    }

    public final zzzc zza(int v) {
        this.start();
        this.zzb = new Handler(this.getLooper(), this);
        this.zza = new zzee(this.zzb, null);
        synchronized(this) {
            boolean z = false;
            this.zzb.obtainMessage(1, v, 0).sendToTarget();
            while(this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException0 = this.zzd;
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
        Error error0 = this.zzc;
        if(error0 != null) {
            throw error0;
        }
        zzzc zzzc0 = this.zze;
        zzzc0.getClass();
        return zzzc0;
    }

    public final void zzb() {
        Handler handler0 = this.zzb;
        handler0.getClass();
        handler0.sendEmptyMessage(2);
    }
}


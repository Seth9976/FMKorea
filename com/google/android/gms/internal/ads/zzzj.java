package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;

final class zzzj implements Handler.Callback, Choreographer.FrameCallback {
    public volatile long zza;
    private static final zzzj zzb;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    static {
        zzzj.zzb = new zzzj();
    }

    private zzzj() {
        this.zza = 0x8000000000000001L;
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread0;
        handlerThread0.start();
        Handler handler0 = new Handler(handlerThread0.getLooper(), this);
        this.zzc = handler0;
        handler0.sendEmptyMessage(0);
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.zza = v;
        Choreographer choreographer0 = this.zze;
        choreographer0.getClass();
        choreographer0.postFrameCallbackDelayed(this, 500L);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = message0.what;
        switch(v) {
            case 0: {
                try {
                    this.zze = Choreographer.getInstance();
                }
                catch(RuntimeException runtimeException0) {
                    zzes.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", runtimeException0);
                }
                return true;
            }
            case 1: {
                Choreographer choreographer1 = this.zze;
                if(choreographer1 != null) {
                    int v2 = this.zzf + 1;
                    this.zzf = v2;
                    if(v2 == 1) {
                        choreographer1.postFrameCallback(this);
                    }
                }
                return true;
            }
            default: {
                if(v != 2) {
                    return false;
                }
                Choreographer choreographer0 = this.zze;
                if(choreographer0 != null) {
                    int v1 = this.zzf - 1;
                    this.zzf = v1;
                    if(v1 == 0) {
                        choreographer0.removeFrameCallback(this);
                        this.zza = 0x8000000000000001L;
                    }
                }
                return true;
            }
        }
    }

    public static zzzj zza() {
        return zzzj.zzb;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}


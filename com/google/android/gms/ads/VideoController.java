package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcaa;
import jeb.synthetic.FIN;

public final class VideoController {
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN;
    private final Object zza;
    private zzdq zzb;
    private VideoLifecycleCallbacks zzc;

    public VideoController() {
        this.zza = new Object();
    }

    @KeepForSdk
    public int getPlaybackState() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdq zzdq0 = this.zzb;
        if(zzdq0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return 0;
        }
        try {
            int v1 = zzdq0.zzh();
            FIN.finallyExec$NT(v);
            return v1;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call getPlaybackState on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return 0;
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        synchronized(this.zza) {
        }
        return this.zzc;
    }

    public boolean hasVideoContent() {
        synchronized(this.zza) {
        }
        return this.zzb != null;
    }

    public boolean isClickToExpandEnabled() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdq zzdq0 = this.zzb;
        if(zzdq0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzdq0.zzo();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call isClickToExpandEnabled.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isCustomControlsEnabled() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdq zzdq0 = this.zzb;
        if(zzdq0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzdq0.zzp();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call isUsingCustomPlayerControls.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isMuted() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdq zzdq0 = this.zzb;
        if(zzdq0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return true;
        }
        try {
            boolean z = zzdq0.zzq();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call isMuted on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return true;
        }
    }

    public void mute(boolean z) {
        synchronized(this.zza) {
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                try {
                    zzdq0.zzj(z);
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Unable to call mute on video controller.", remoteException0);
                }
            }
        }
    }

    public void pause() {
        synchronized(this.zza) {
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                try {
                    zzdq0.zzk();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Unable to call pause on video controller.", remoteException0);
                }
            }
        }
    }

    public void play() {
        synchronized(this.zza) {
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                try {
                    zzdq0.zzl();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Unable to call play on video controller.", remoteException0);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        zzfk zzfk0;
        synchronized(this.zza) {
            this.zzc = videoController$VideoLifecycleCallbacks0;
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                if(videoController$VideoLifecycleCallbacks0 == null) {
                    zzfk0 = null;
                }
                else {
                    try {
                        zzfk0 = new zzfk(videoController$VideoLifecycleCallbacks0);
                    label_10:
                        zzdq0.zzm(zzfk0);
                        return;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    zzcaa.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", remoteException0);
                    return;
                }
                goto label_10;
            }
        }
    }

    public void stop() {
        synchronized(this.zza) {
            zzdq zzdq0 = this.zzb;
            if(zzdq0 != null) {
                try {
                    zzdq0.zzn();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Unable to call stop on video controller.", remoteException0);
                }
            }
        }
    }

    public final zzdq zza() {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    public final void zzb(zzdq zzdq0) {
        synchronized(this.zza) {
            this.zzb = zzdq0;
            VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0 = this.zzc;
            if(videoController$VideoLifecycleCallbacks0 != null) {
                this.setVideoLifecycleCallbacks(videoController$VideoLifecycleCallbacks0);
            }
        }
    }
}


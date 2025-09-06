package com.google.android.gms.internal.ads;

import android.media.AudioTrack.StreamEventCallback;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

final class zzqc {
    final zzqe zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    public zzqc(zzqe zzqe0) {
        this.zza = zzqe0;
        super();
        this.zzb = new Handler(Looper.myLooper());
        this.zzc = new zzqb(this, zzqe0);
    }

    public final void zza(AudioTrack audioTrack0) {
        audioTrack0.registerStreamEventCallback(new zzqa(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack0) {
        audioTrack0.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}


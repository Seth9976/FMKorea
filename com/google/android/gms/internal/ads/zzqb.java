package com.google.android.gms.internal.ads;

import android.media.AudioTrack.StreamEventCallback;
import android.media.AudioTrack;

final class zzqb extends AudioTrack.StreamEventCallback {
    final zzqe zza;
    final zzqc zzb;

    zzqb(zzqc zzqc0, zzqe zzqe0) {
        this.zzb = zzqc0;
        this.zza = zzqe0;
        super();
    }

    @Override  // android.media.AudioTrack$StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack0, int v) {
        if(!audioTrack0.equals(zzqe.zzC(this.zzb.zza))) {
            return;
        }
        zzqe zzqe0 = this.zzb.zza;
        if(zzqe.zzD(zzqe0) != null && zzqe.zzF(zzqe0)) {
            zzqe.zzD(zzqe0).zzb();
        }
    }

    @Override  // android.media.AudioTrack$StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack0) {
        if(!audioTrack0.equals(zzqe.zzC(this.zzb.zza))) {
            return;
        }
        zzqe zzqe0 = this.zzb.zza;
        if(zzqe.zzD(zzqe0) != null && zzqe.zzF(zzqe0)) {
            zzqe.zzD(zzqe0).zzb();
        }
    }
}


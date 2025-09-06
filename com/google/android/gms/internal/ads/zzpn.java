package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

public final class zzpn implements Runnable {
    public final AudioTrack zza;
    public final zzeb zzb;

    public zzpn(AudioTrack audioTrack0, zzeb zzeb0) {
        this.zza = audioTrack0;
        this.zzb = zzeb0;
    }

    @Override
    public final void run() {
        zzqe.zzE(this.zza, this.zzb);
    }
}


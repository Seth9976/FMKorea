package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

final class zzcbf implements Runnable {
    final MediaPlayer zza;
    final zzcbn zzb;

    zzcbf(zzcbn zzcbn0, MediaPlayer mediaPlayer0) {
        this.zzb = zzcbn0;
        this.zza = mediaPlayer0;
        super();
    }

    @Override
    public final void run() {
        zzcbn.zzl(this.zzb, this.zza);
        zzcbn zzcbn0 = this.zzb;
        if(zzcbn.zzi(zzcbn0) != null) {
            zzcbn.zzi(zzcbn0).zzf();
        }
    }
}


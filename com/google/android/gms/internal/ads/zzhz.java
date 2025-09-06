package com.google.android.gms.internal.ads;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

final class zzhz implements AudioManager.OnAudioFocusChangeListener {
    final zzib zza;
    private final Handler zzb;

    public zzhz(zzib zzib0, Handler handler0) {
        this.zza = zzib0;
        super();
        this.zzb = handler0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        zzhy zzhy0 = new zzhy(this, v);
        this.zzb.post(zzhy0);
    }
}


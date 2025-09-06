package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

final class zzpk {
    public static zzom zza(AudioFormat audioFormat0, AudioAttributes audioAttributes0, boolean z) {
        if(!AudioManager.isOffloadedPlaybackSupported(audioFormat0, audioAttributes0)) {
            return zzom.zza;
        }
        zzok zzok0 = new zzok();
        zzok0.zza(true);
        zzok0.zzc(z);
        return zzok0.zzd();
    }
}


package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

final class zzpl {
    public static zzom zza(AudioFormat audioFormat0, AudioAttributes audioAttributes0, boolean z) {
        int v = AudioManager.getPlaybackOffloadSupport(audioFormat0, audioAttributes0);
        if(v == 0) {
            return zzom.zza;
        }
        zzok zzok0 = new zzok();
        zzok0.zza(true);
        zzok0.zzb(zzfk.zza > 0x20 && v == 2);
        zzok0.zzc(z);
        return zzok0.zzd();
    }
}


package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;

public final class zzi {
    public final AudioAttributes zza;

    zzi(zzk zzk0, zzh zzh0) {
        AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int v = zzfk.zza;
        if(v >= 29) {
            zzf.zza(audioAttributes$Builder0, 1);
        }
        if(v >= 0x20) {
            zzg.zza(audioAttributes$Builder0, 0);
        }
        this.zza = audioAttributes$Builder0.build();
    }
}


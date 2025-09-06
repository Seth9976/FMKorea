package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;

final class zzoi {
    private static final AudioAttributes zza;

    static {
        zzoi.zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();
    }

    public static int zza(int v, int v1) {
        for(int v2 = 10; v2 > 0; --v2) {
            if(AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(v).setSampleRate(v1).setChannelMask(zzfk.zzg(v2)).build(), zzoi.zza)) {
                return v2;
            }
        }
        return 0;
    }

    public static zzfud zzb() {
        zzfua zzfua0 = new zzfua();
        zzfwd zzfwd0 = zzoj.zzb().zzi().zze();
        while(zzfwd0.hasNext()) {
            Object object0 = zzfwd0.next();
            Integer integer0 = (Integer)object0;
            int v = (int)integer0;
            if(zzfk.zza >= zzfk.zzf(v) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(v).setSampleRate(48000).build(), zzoi.zza)) {
                zzfua0.zzf(integer0);
            }
        }
        zzfua0.zzf(2);
        return zzfua0.zzi();
    }
}


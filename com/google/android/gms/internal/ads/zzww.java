package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

final class zzww {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzww(Spatializer spatializer0) {
        this.zza = spatializer0;
        this.zzb = spatializer0.getImmersiveAudioLevel() != 0;
    }

    public static zzww zza(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        return audioManager0 == null ? null : new zzww(audioManager0.getSpatializer());
    }

    public final void zzb(zzxd zzxd0, Looper looper0) {
        if(this.zzd == null && this.zzc == null) {
            this.zzd = new zzwv(this, zzxd0);
            Handler handler0 = new Handler(looper0);
            this.zzc = handler0;
            zzwu zzwu0 = new zzwu(handler0);
            this.zza.addOnSpatializerStateChangedListener(zzwu0, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener0 = this.zzd;
        if(spatializer$OnSpatializerStateChangedListener0 != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener0);
            this.zzc.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzk0, zzam zzam0) {
        AudioFormat.Builder audioFormat$Builder0 = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzfk.zzg((!"audio/eac3-joc".equals(zzam0.zzm) || zzam0.zzz != 16 ? zzam0.zzz : 12)));
        int v = zzam0.zzA;
        if(v != -1) {
            audioFormat$Builder0.setSampleRate(v);
        }
        zzi zzi0 = zzk0.zza();
        AudioFormat audioFormat0 = audioFormat$Builder0.build();
        return this.zza.canBeSpatialized(zzi0.zza, audioFormat0);
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}


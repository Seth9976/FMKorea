package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack;

final class zzpt {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdo zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzpt(zzam zzam0, int v, int v1, int v2, int v3, int v4, int v5, int v6, zzdo zzdo0, boolean z, boolean z1) {
        this.zza = zzam0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = zzdo0;
        this.zzj = false;
        this.zzk = false;
    }

    public final long zza(long v) {
        return v * 1000000L / ((long)this.zze);
    }

    public final AudioTrack zzb(boolean z, zzk zzk0, int v) {
        AudioTrack audioTrack0;
        try {
            int v1 = zzfk.zza;
            if(v1 >= 29) {
                AudioFormat audioFormat1 = zzfk.zzt(this.zze, this.zzf, this.zzg);
                zzi zzi1 = zzk0.zza();
                audioTrack0 = new AudioTrack.Builder().setAudioAttributes(zzi1.zza).setAudioFormat(audioFormat1).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(v).setOffloadedPlayback(this.zzc == 1).build();
            }
            else if(v1 >= 21) {
                zzi zzi0 = zzk0.zza();
                AudioFormat audioFormat0 = zzfk.zzt(this.zze, this.zzf, this.zzg);
                audioTrack0 = new AudioTrack(zzi0.zza, audioFormat0, this.zzh, 1, v);
            }
            else if(v == 0) {
                audioTrack0 = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
            }
            else {
                audioTrack0 = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, v);
            }
        }
        catch(UnsupportedOperationException | IllegalArgumentException unsupportedOperationException0) {
            boolean z1 = this.zzc();
            throw new zzpa(0, this.zze, this.zzf, this.zzh, this.zza, z1, unsupportedOperationException0);
        }
        int v2 = audioTrack0.getState();
        if(v2 == 1) {
            return audioTrack0;
        }
        try {
            audioTrack0.release();
        }
        catch(Exception unused_ex) {
        }
        boolean z2 = this.zzc();
        throw new zzpa(v2, this.zze, this.zzf, this.zzh, this.zza, z2, null);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}


package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

final class zzib {
    private final AudioManager zza;
    private final zzhz zzb;
    private zzia zzc;
    private int zzd;
    private float zze;

    public zzib(Context context0, Handler handler0, zzia zzia0) {
        this.zze = 1.0f;
        AudioManager audioManager0 = (AudioManager)context0.getApplicationContext().getSystemService("audio");
        audioManager0.getClass();
        this.zza = audioManager0;
        this.zzc = zzia0;
        this.zzb = new zzhz(this, handler0);
        this.zzd = 0;
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int v) {
        this.zze();
        return z ? 1 : -1;
    }

    static void zzc(zzib zzib0, int v) {
        if(v != -3 && v != -2) {
            switch(v) {
                case -1: {
                    zzib0.zzf(-1);
                    zzib0.zze();
                    return;
                }
                case 1: {
                    zzib0.zzg(1);
                    zzib0.zzf(1);
                    return;
                }
                default: {
                    zzes.zzf("AudioFocusManager", "Unknown focus change type: " + v);
                    return;
                }
            }
        }
        if(v != -2) {
            zzib0.zzg(3);
            return;
        }
        zzib0.zzf(0);
        zzib0.zzg(2);
    }

    public final void zzd() {
        this.zzc = null;
        this.zze();
    }

    private final void zze() {
        if(this.zzd == 0) {
            return;
        }
        if(zzfk.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        this.zzg(0);
    }

    private final void zzf(int v) {
        zzia zzia0 = this.zzc;
        if(zzia0 != null) {
            boolean z = ((zzjx)zzia0).zza.zzv();
            zzkb.zzR(((zzjx)zzia0).zza, z, v, zzkb.zzC(z, v));
        }
    }

    private final void zzg(int v) {
        if(this.zzd == v) {
            return;
        }
        this.zzd = v;
        float f = v == 3 ? 0.2f : 1.0f;
        if(this.zze == f) {
            return;
        }
        this.zze = f;
        zzia zzia0 = this.zzc;
        if(zzia0 != null) {
            zzkb.zzO(((zzjx)zzia0).zza);
        }
    }
}


package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class zzfjd extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfjb zzc;
    private float zzd;
    private final zzfjo zze;

    public zzfjd(Handler handler0, Context context0, zzfjb zzfjb0, zzfjo zzfjo0) {
        super(handler0);
        this.zza = context0;
        this.zzb = (AudioManager)context0.getSystemService("audio");
        this.zzc = zzfjb0;
        this.zze = zzfjo0;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float f = this.zzc();
        if(f != this.zzd) {
            this.zzd = f;
            this.zzd();
        }
    }

    public final void zza() {
        this.zzd = this.zzc();
        this.zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }

    private final float zzc() {
        int v = this.zzb.getStreamVolume(3);
        int v1 = this.zzb.getStreamMaxVolume(3);
        if(v1 > 0 && v > 0) {
            float f = ((float)v) / ((float)v1);
            return f > 1.0f ? 1.0f : f;
        }
        return 0.0f;
    }

    private final void zzd() {
        this.zze.zze(this.zzd);
    }
}


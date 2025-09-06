package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

public final class zzfjo implements zzfji {
    private static zzfjo zza;
    private float zzb;
    private final zzfje zzc;
    private final zzfjc zzd;
    private zzfjd zze;
    private zzfjh zzf;

    public zzfjo(zzfje zzfje0, zzfjc zzfjc0) {
        this.zzb = 0.0f;
        this.zzc = zzfje0;
        this.zzd = zzfjc0;
    }

    public final float zza() {
        return this.zzb;
    }

    public static zzfjo zzb() {
        if(zzfjo.zza == null) {
            zzfjc zzfjc0 = new zzfjc();
            zzfjo.zza = new zzfjo(new zzfje(), zzfjc0);
        }
        return zzfjo.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfji
    public final void zzc(boolean z) {
        if(z) {
            zzfko.zzd().zzi();
            return;
        }
        zzfko.zzd().zzh();
    }

    public final void zzd(Context context0) {
        zzfjb zzfjb0 = new zzfjb();
        this.zze = new zzfjd(new Handler(), context0, zzfjb0, this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if(this.zzf == null) {
            this.zzf = zzfjh.zza();
        }
        for(Object object0: this.zzf.zzb()) {
            ((zzfit)object0).zzg().zzi(f);
        }
    }

    public final void zzf() {
        zzfjg.zza().zze(this);
        zzfjg.zza().zzf();
        zzfko.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfko.zzd().zzj();
        zzfjg.zza().zzg();
        this.zze.zzb();
    }
}


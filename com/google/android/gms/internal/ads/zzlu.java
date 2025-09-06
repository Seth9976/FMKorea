package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzlu implements zzkp {
    private final zzdz zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzch zze;

    public zzlu(zzdz zzdz0) {
        this.zza = zzdz0;
        this.zze = zzch.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        long v = this.zzc;
        if(this.zzb) {
            long v1 = SystemClock.elapsedRealtime() - this.zzd;
            return this.zze.zzc == 1.0f ? v + zzfk.zzp(v1) : v + this.zze.zza(v1);
        }
        return v;
    }

    public final void zzb(long v) {
        this.zzc = v;
        if(this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zze;
    }

    public final void zzd() {
        if(!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if(this.zzb) {
            this.zzb(this.zza());
            this.zzb = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzch0) {
        if(this.zzb) {
            this.zzb(this.zza());
        }
        this.zze = zzch0;
    }
}


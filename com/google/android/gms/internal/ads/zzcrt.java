package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcrt implements zzauf, zzcxw {
    private final zzfbe zza;
    private final zzcxa zzb;
    private final zzcyf zzc;
    private final AtomicBoolean zzd;
    private final AtomicBoolean zze;

    public zzcrt(zzfbe zzfbe0, zzcxa zzcxa0, zzcyf zzcyf0) {
        this.zzd = new AtomicBoolean();
        this.zze = new AtomicBoolean();
        this.zza = zzfbe0;
        this.zzb = zzcxa0;
        this.zzc = zzcyf0;
    }

    private final void zza() {
        if(this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        if(this.zza.zzf == 1 && zzaue0.zzj) {
            this.zza();
        }
        if(zzaue0.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        synchronized(this) {
            if(this.zza.zzf != 1) {
                this.zza();
            }
        }
    }
}


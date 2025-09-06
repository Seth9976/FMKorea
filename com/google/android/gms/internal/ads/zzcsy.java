package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcsy implements zzo {
    private final zzcxp zza;
    private final AtomicBoolean zzb;
    private final AtomicBoolean zzc;

    public zzcsy(zzcxp zzcxp0) {
        this.zzb = new AtomicBoolean(false);
        this.zzc = new AtomicBoolean(false);
        this.zza = zzcxp0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        this.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzc();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        this.zzb.set(true);
        this.zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }

    private final void zzh() {
        if(!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }
}


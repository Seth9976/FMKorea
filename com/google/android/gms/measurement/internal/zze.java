package com.google.android.gms.measurement.internal;

abstract class zze extends zzf {
    private boolean zza;

    zze(zzhf zzhf0) {
        super(zzhf0);
        this.zzu.zzaa();
    }

    protected final void zzu() {
        if(!this.zzy()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzv() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.zzz()) {
            this.zzu.zzz();
            this.zza = true;
        }
    }

    public final void zzw() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzx();
        this.zzu.zzz();
        this.zza = true;
    }

    protected void zzx() {
    }

    final boolean zzy() {
        return this.zza;
    }

    protected abstract boolean zzz();
}


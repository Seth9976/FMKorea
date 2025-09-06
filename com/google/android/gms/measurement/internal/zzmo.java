package com.google.android.gms.measurement.internal;

abstract class zzmo extends zzml {
    private boolean zza;

    zzmo(zzmp zzmp0) {
        super(zzmp0);
        this.zzf.zzu();
    }

    protected final void zzak() {
        if(!this.zzam()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzal() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzc();
        this.zzf.zzt();
        this.zza = true;
    }

    final boolean zzam() {
        return this.zza;
    }

    protected abstract boolean zzc();
}


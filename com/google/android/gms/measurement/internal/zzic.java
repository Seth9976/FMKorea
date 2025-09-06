package com.google.android.gms.measurement.internal;

abstract class zzic extends zzid {
    private boolean zza;

    zzic(zzhf zzhf0) {
        super(zzhf0);
        this.zzu.zzaa();
    }

    protected final void zzab() {
        if(!this.zzae()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzac() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.zzo()) {
            this.zzu.zzz();
            this.zza = true;
        }
    }

    public final void zzad() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzz();
        this.zzu.zzz();
        this.zza = true;
    }

    final boolean zzae() {
        return this.zza;
    }

    protected abstract boolean zzo();

    protected void zzz() {
    }
}


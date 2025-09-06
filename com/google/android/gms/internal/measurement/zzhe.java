package com.google.android.gms.internal.measurement;

public abstract class zzhe implements zzks {
    private boolean zza;
    private int zzb;

    public zzhe() {
        this.zza = true;
        this.zzb = -1;
    }

    @Override
    public Object clone() {
        return this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzks
    public final zzks zza() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }
}


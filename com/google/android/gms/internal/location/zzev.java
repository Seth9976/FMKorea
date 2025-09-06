package com.google.android.gms.internal.location;

final class zzev extends zzet {
    private final zzex zza;

    zzev(zzex zzex0, int v) {
        super(zzex0.size(), v);
        this.zza = zzex0;
    }

    @Override  // com.google.android.gms.internal.location.zzet
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}


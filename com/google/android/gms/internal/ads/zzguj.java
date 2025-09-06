package com.google.android.gms.internal.ads;

public final class zzguj extends RuntimeException {
    public zzguj(zzgta zzgta0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgsc zza() {
        return new zzgsc(this.getMessage());
    }
}


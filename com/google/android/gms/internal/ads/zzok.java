package com.google.android.gms.internal.ads;

public final class zzok {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzok zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzok zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzok zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzom zzd() {
        if(!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzom(this, null);
    }
}


package com.google.android.gms.internal.ads;

public final class zzdhz {
    private zzbet zza;

    public zzdhz(zzdhl zzdhl0) {
        this.zza = zzdhl0;
    }

    public final zzbet zza() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final void zzb(zzbet zzbet0) {
        synchronized(this) {
            this.zza = zzbet0;
        }
    }
}


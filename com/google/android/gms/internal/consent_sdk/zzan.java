package com.google.android.gms.internal.consent_sdk;

final class zzan implements zzay {
    private final zzaj zza;
    private zzbs zzb;

    zzan(zzaj zzaj0, zzam zzam0) {
        this.zza = zzaj0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzay
    public final zzay zza(zzbs zzbs0) {
        this.zzb = zzbs0;
        return this;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzay
    public final zzaz zzb() {
        zzdq.zzb(this.zzb, zzbs.class);
        return new zzap(this.zza, this.zzb, null);
    }
}


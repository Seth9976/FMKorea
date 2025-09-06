package com.google.android.gms.internal.ads;

final class zzfox extends zzfpq {
    private String zza;
    private String zzb;

    @Override  // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zzb(String s) {
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpq
    public final zzfpr zzc() {
        return new zzfoz(this.zza, this.zzb, null);
    }
}


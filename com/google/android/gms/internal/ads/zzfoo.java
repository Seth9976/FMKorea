package com.google.android.gms.internal.ads;

final class zzfoo extends zzfpa {
    private String zza;
    private String zzb;

    @Override  // com.google.android.gms.internal.ads.zzfpa
    public final zzfpa zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpa
    public final zzfpa zzb(String s) {
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpa
    public final zzfpb zzc() {
        return new zzfoq(this.zza, this.zzb, null);
    }
}


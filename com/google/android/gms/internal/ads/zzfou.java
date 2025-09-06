package com.google.android.gms.internal.ads;

final class zzfou extends zzfpn {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final zzfpn zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final zzfpn zzb(int v) {
        this.zza = v;
        this.zzc = 1;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final zzfpo zzc() {
        if(this.zzc != 1) {
            throw new IllegalStateException("Missing required properties: statusCode");
        }
        return new zzfow(this.zza, this.zzb, null);
    }
}


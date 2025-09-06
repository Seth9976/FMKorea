package com.google.android.gms.internal.ads;

public final class zzdkz implements zzcgt {
    public final zzcar zza;

    public zzdkz(zzcar zzcar0) {
        this.zza = zzcar0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zza(boolean z, int v, String s, String s1) {
        zzcar zzcar0 = this.zza;
        if(z) {
            zzcar0.zzb();
            return;
        }
        zzcar0.zzd(new zzehf(1, "Image Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
    }
}


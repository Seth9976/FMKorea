package com.google.android.gms.internal.ads;

public final class zzdoj implements zzcgt {
    public final zzcas zza;

    public zzdoj(zzcas zzcas0) {
        this.zza = zzcas0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zza(boolean z, int v, String s, String s1) {
        zzcas zzcas0 = this.zza;
        if(z) {
            zzcas0.zzc(null);
            return;
        }
        zzcas0.zzd(new Exception("Ad Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
    }
}


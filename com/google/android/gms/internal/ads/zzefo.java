package com.google.android.gms.internal.ads;

public final class zzefo implements zzfqw {
    public final zzefq zza;
    public final zzcfi zzb;
    public final zzfbe zzc;
    public final zzdeq zzd;

    public zzefo(zzefq zzefq0, zzcfi zzcfi0, zzfbe zzfbe0, zzdeq zzdeq0) {
        this.zza = zzefq0;
        this.zzb = zzcfi0;
        this.zzc = zzfbe0;
        this.zzd = zzdeq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        zzcfi zzcfi0 = this.zzb;
        zzdeq zzdeq0 = this.zzd;
        if(this.zzc.zzN) {
            zzcfi0.zzae();
        }
        zzcfi0.zzY();
        zzcfi0.onPause();
        return zzdeq0.zzg();
    }
}


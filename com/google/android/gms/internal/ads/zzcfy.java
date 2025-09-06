package com.google.android.gms.internal.ads;

public final class zzcfy implements zzaxd {
    public final boolean zza;
    public final int zzb;

    public zzcfy(boolean z, int v) {
        this.zza = z;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxd
    public final void zza(zzayt zzayt0) {
        boolean z = this.zza;
        int v = this.zzb;
        zzbay zzbay0 = zzbaz.zza();
        if(zzbay0.zzc() != z) {
            zzbay0.zza(z);
        }
        zzbay0.zzb(v);
        zzayt0.zzj(((zzbaz)zzbay0.zzal()));
    }
}


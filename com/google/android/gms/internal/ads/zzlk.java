package com.google.android.gms.internal.ads;

final class zzlk extends zztg {
    private final zzcv zzd;

    zzlk(zzll zzll0, zzcw zzcw0) {
        super(zzcw0);
        this.zzd = new zzcv();
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final zzct zzd(int v, zzct zzct0, boolean z) {
        zzct zzct1 = this.zzc.zzd(v, zzct0, z);
        if(this.zzc.zze(zzct1.zzd, this.zzd, 0L).zzb()) {
            zzct1.zzl(zzct0.zzb, zzct0.zzc, zzct0.zzd, zzct0.zze, 0L, zzd.zza, true);
            return zzct1;
        }
        zzct1.zzg = true;
        return zzct1;
    }
}


package com.google.android.gms.internal.ads;

public final class zzvq extends zztg {
    private final zzbp zzd;

    public zzvq(zzcw zzcw0, zzbp zzbp0) {
        super(zzcw0);
        this.zzd = zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final zzcv zze(int v, zzcv zzcv0, long v1) {
        this.zzc.zze(v, zzcv0, v1);
        zzcv0.zze = this.zzd;
        zzcv0.zzd = null;
        return zzcv0;
    }
}


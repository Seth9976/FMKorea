package com.google.android.gms.internal.ads;

public final class zztm extends zzcw {
    private final zzbp zzc;

    public zztm(zzbp zzbp0) {
        this.zzc = zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object object0) {
        return object0 == zztl.zzd ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int v, zzct zzct0, boolean z) {
        Object object0 = null;
        Integer integer0 = z ? 0 : null;
        if(z) {
            object0 = zztl.zzd;
        }
        zzct0.zzl(integer0, object0, 0, 0x8000000000000001L, 0L, zzd.zza, true);
        return zzct0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int v, zzcv zzcv0, long v1) {
        zzcv0.zza(zzcv.zza, this.zzc, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, false, true, null, 0L, 0x8000000000000001L, 0, 0, 0L);
        zzcv0.zzm = true;
        return zzcv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int v) {
        return zztl.zzd;
    }
}


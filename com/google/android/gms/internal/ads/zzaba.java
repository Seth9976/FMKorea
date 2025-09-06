package com.google.android.gms.internal.ads;

import java.io.EOFException;

public final class zzaba implements zzace {
    private final byte[] zza;

    public zzaba() {
        this.zza = new byte[0x1000];
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final int zze(zzt zzt0, int v, boolean z) {
        return zzacc.zza(this, zzt0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zzt0, int v, boolean z, int v1) {
        int v2 = zzt0.zza(this.zza, 0, Math.min(0x1000, v));
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzam0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzq(zzfb zzfb0, int v) {
        zzacc.zzb(this, zzfb0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfb0, int v, int v1) {
        zzfb0.zzH(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzs(long v, int v1, int v2, int v3, zzacd zzacd0) {
    }
}


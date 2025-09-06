package com.google.android.gms.internal.ads;

public final class zzpd extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzpd(int v, zzam zzam0, boolean z) {
        super("AudioTrack write failed: " + v);
        this.zzb = z;
        this.zza = v;
        this.zzc = zzam0;
    }
}


package com.google.android.gms.internal.ads;

public final class zzpa extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzpa(int v, int v1, int v2, int v3, zzam zzam0, boolean z, Exception exception0) {
        super("AudioTrack init failed " + v + " Config(" + v1 + ", " + v2 + ", " + v3 + ") " + zzam0 + (z ? " (recoverable)" : ""), exception0);
        this.zza = v;
        this.zzb = z;
        this.zzc = zzam0;
    }
}


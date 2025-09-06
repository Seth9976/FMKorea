package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

public final class zzrr {
    public final zzrw zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze;

    private zzrr(zzrw zzrw0, MediaFormat mediaFormat0, zzam zzam0, Surface surface0, MediaCrypto mediaCrypto0, int v) {
        this.zza = zzrw0;
        this.zzb = mediaFormat0;
        this.zzc = zzam0;
        this.zzd = surface0;
        this.zze = null;
    }

    public static zzrr zza(zzrw zzrw0, MediaFormat mediaFormat0, zzam zzam0, MediaCrypto mediaCrypto0) {
        return new zzrr(zzrw0, mediaFormat0, zzam0, null, null, 0);
    }

    public static zzrr zzb(zzrw zzrw0, MediaFormat mediaFormat0, zzam zzam0, Surface surface0, MediaCrypto mediaCrypto0) {
        return new zzrr(zzrw0, mediaFormat0, zzam0, surface0, null, 0);
    }
}


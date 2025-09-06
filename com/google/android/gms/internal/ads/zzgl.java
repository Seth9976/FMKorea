package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class zzgl {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private int zzd;

    public zzgl() {
        this.zzb = Collections.emptyMap();
    }

    public final zzgl zza(int v) {
        this.zzd = 6;
        return this;
    }

    public final zzgl zzb(Map map0) {
        this.zzb = map0;
        return this;
    }

    public final zzgl zzc(long v) {
        this.zzc = v;
        return this;
    }

    public final zzgl zzd(Uri uri0) {
        this.zza = uri0;
        return this;
    }

    public final zzgn zze() {
        if(this.zza == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new zzgn(this.zza, 0L, 1, null, this.zzb, this.zzc, -1L, null, this.zzd, null, null);
    }
}


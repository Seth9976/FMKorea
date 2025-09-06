package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class zzhj implements zzgi {
    private final zzgi zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzhj(zzgi zzgi0) {
        this.zza = zzgi0;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v2 = this.zza.zza(arr_b, v, v1);
        if(v2 != -1) {
            this.zzb += (long)v2;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        this.zzc = zzgn0.zza;
        this.zzd = Collections.emptyMap();
        long v = this.zza.zzb(zzgn0);
        Uri uri0 = this.zzc();
        uri0.getClass();
        this.zzc = uri0;
        this.zzd = this.zze();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhk0) {
        zzhk0.getClass();
        this.zza.zzf(zzhk0);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}


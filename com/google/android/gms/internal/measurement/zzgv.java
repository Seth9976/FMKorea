package com.google.android.gms.internal.measurement;

import X1.c;
import android.net.Uri;

public final class zzgv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final c zzh;
    private final boolean zzi;

    public zzgv(Uri uri0) {
        this(null, uri0, "", "", false, false, false, false, null);
    }

    private zzgv(String s, Uri uri0, String s1, String s2, boolean z, boolean z1, boolean z2, boolean z3, c c0) {
        this.zza = s;
        this.zzb = uri0;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = z1;
        this.zzi = z2;
        this.zzg = z3;
        this.zzh = c0;
    }

    public final zzgn zza(String s, double f) {
        return zzgn.zza(this, s, -3.0, true);
    }

    public final zzgn zza(String s, long v) {
        return zzgn.zza(this, s, v, true);
    }

    public final zzgn zza(String s, String s1) {
        return zzgn.zza(this, s, s1, true);
    }

    public final zzgn zza(String s, boolean z) {
        return zzgn.zza(this, s, Boolean.valueOf(z), true);
    }

    public final zzgv zza() {
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzgv zzb() {
        if(!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        if(this.zzh != null) {
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, null);
    }
}


package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

public final class zzevj {
    private final zzbun zza;
    private final int zzb;

    public zzevj(zzbun zzbun0, int v) {
        this.zza = zzbun0;
        this.zzb = v;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfrx.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    final boolean zzg() {
        return this.zza.zzl;
    }

    final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    final boolean zzi() {
        return this.zza.zzk;
    }
}


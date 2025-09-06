package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

public final class zzdom {
    private final zzcfu zza;
    private final Context zzb;
    private final zzaqx zzc;
    private final zzbct zzd;
    private final zzcag zze;
    private final zza zzf;
    private final zzaxe zzg;
    private final zzcyx zzh;
    private final zzecs zzi;

    public zzdom(zzcfu zzcfu0, Context context0, zzaqx zzaqx0, zzbct zzbct0, zzcag zzcag0, zza zza0, zzaxe zzaxe0, zzcyx zzcyx0, zzecs zzecs0) {
        this.zza = zzcfu0;
        this.zzb = context0;
        this.zzc = zzaqx0;
        this.zzd = zzbct0;
        this.zze = zzcag0;
        this.zzf = zza0;
        this.zzg = zzaxe0;
        this.zzh = zzcyx0;
        this.zzi = zzecs0;
    }

    public final zzcfi zza(zzq zzq0, zzfbe zzfbe0, zzfbi zzfbi0) {
        zzcgx zzcgx0 = zzcgx.zzc(zzq0);
        zzdob zzdob0 = new zzdob(this);
        return zzcfu.zza(this.zzb, zzcgx0, zzq0.zza, false, false, this.zzc, this.zzd, this.zze, null, zzdob0, this.zzf, this.zzg, zzfbe0, zzfbi0, this.zzi);
    }

    static zzcyx zzb(zzdom zzdom0) {
        return zzdom0.zzh;
    }
}


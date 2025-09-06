package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzcqh implements zzcxw {
    public final Context zza;
    public final zzcag zzb;
    public final zzfbe zzc;
    public final zzfca zzd;

    public zzcqh(Context context0, zzcag zzcag0, zzfbe zzfbe0, zzfca zzfca0) {
        this.zza = context0;
        this.zzb = zzcag0;
        this.zzc = zzfbe0;
        this.zzd = zzfca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzt.zzs().zzn(this.zza, this.zzb.zza, this.zzc.zzD.toString(), this.zzd.zzf);
    }
}


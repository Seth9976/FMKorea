package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzfxl;

public final class zzk implements zzfxl {
    public final zzaa zza;
    public final zzdnb[] zzb;
    public final String zzc;

    public zzk(zzaa zzaa0, zzdnb[] arr_zzdnb, String s) {
        this.zza = zzaa0;
        this.zzb = arr_zzdnb;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzv(this.zzb, this.zzc, ((zzdnb)object0));
    }
}


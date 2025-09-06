package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

public final class zzfhd implements zzcwy, zzddf, zzddj {
    private final zzfhr zza;
    private final zzfhg zzb;

    zzfhd(Context context0, zzfhr zzfhr0) {
        this.zza = zzfhr0;
        this.zzb = zzfhf.zza(context0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzddj
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddj
    public final void zzb() {
        if(((Boolean)zzbdd.zzd.zze()).booleanValue()) {
            this.zzb.zzf(true);
            this.zza.zza(this.zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
        if(((Boolean)zzbdd.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        if(((Boolean)zzbdd.zzd.zze()).booleanValue()) {
            String s = zze0.zza().toString();
            this.zzb.zzc(s);
            this.zzb.zzf(false);
            this.zza.zza(this.zzb);
        }
    }
}


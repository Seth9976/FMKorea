package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;

final class zzdwh implements zzfya {
    final zzdwi zza;

    zzdwh(zzdwi zzdwi0) {
        this.zza = zzdwi0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            Matcher matcher0 = zzdwi.zzd().matcher(throwable0.getMessage());
            if(matcher0.matches()) {
                String s = matcher0.group(1);
                zzdwi.zza(this.zza).zzi(Integer.parseInt(s));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            this.zza.zzf.zzi(((zzfbr)object0).zzb.zzb.zze);
            this.zza.zzf.zzj(((zzfbr)object0).zzb.zzb.zzf);
        }
    }
}


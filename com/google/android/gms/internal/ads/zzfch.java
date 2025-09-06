package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzfch implements zzbir {
    public final zzfik zza;
    public final zzech zzb;

    public zzfch(zzfik zzfik0, zzech zzech0) {
        this.zza = zzfik0;
        this.zzb = zzech0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzfik zzfik0 = this.zza;
        zzech zzech0 = this.zzb;
        Object object1 = map0.get("u");
        if(((String)object1) == null) {
            zzcaa.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        if(!((zzcez)object0).zzD().zzaj) {
            zzfik0.zzc(((String)object1), null);
            return;
        }
        zzech0.zzd(new zzecj(zzt.zzB().currentTimeMillis(), ((zzcgf)(((zzcez)object0))).zzP().zzb, ((String)object1), 2));
    }
}


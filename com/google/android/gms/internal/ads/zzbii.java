package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

final class zzbii implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(((zzcfi)object0).zzJ() != null) {
            ((zzcfi)object0).zzJ().zza();
        }
        zzl zzl0 = ((zzcfi)object0).zzL();
        if(zzl0 != null) {
            zzl0.zzb();
            return;
        }
        zzl zzl1 = ((zzcfi)object0).zzM();
        if(zzl1 != null) {
            zzl1.zzb();
            return;
        }
        zzcaa.zzj("A GMSG tried to close something that wasn\'t an overlay.");
    }
}


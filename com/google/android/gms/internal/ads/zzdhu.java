package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

final class zzdhu implements zzauf {
    final String zza;
    final zzdhx zzb;

    zzdhu(zzdhx zzdhx0, String s) {
        this.zzb = zzdhx0;
        this.zza = s;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbG)).booleanValue()) {
            synchronized(this) {
                if(zzaue0.zzj) {
                    zzdhx zzdhx0 = this.zzb;
                    if(zzdhx.zze(zzdhx0) != null) {
                        zzdhx.zzh(zzdhx0).put(this.zza, Boolean.TRUE);
                        View view0 = zzdhx.zze(this.zzb).zzf();
                        Map map0 = zzdhx.zze(this.zzb).zzl();
                        Map map1 = zzdhx.zze(this.zzb).zzm();
                        this.zzb.zzz(view0, map0, map1, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if(zzaue0.zzj) {
            zzdhx.zzh(this.zzb).put(this.zza, Boolean.TRUE);
            View view1 = zzdhx.zze(this.zzb).zzf();
            Map map2 = zzdhx.zze(this.zzb).zzl();
            Map map3 = zzdhx.zze(this.zzb).zzm();
            this.zzb.zzz(view1, map2, map3, true);
        }
    }
}


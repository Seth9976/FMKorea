package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;

public final class zzene implements zzesi {
    private final zzw zza;
    private final zzcag zzb;
    private final boolean zzc;

    public zzene(zzw zzw0, zzcag zzcag0, boolean z) {
        this.zza = zzw0;
        this.zzb = zzcag0;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzfc)));
        if(this.zzb.zzc >= v) {
            ((Bundle)object0).putString("app_open_version", "2");
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzfd)).booleanValue()) {
            ((Bundle)object0).putBoolean("app_switched", this.zzc);
        }
        zzw zzw0 = this.zza;
        if(zzw0 != null) {
            int v1 = zzw0.zza;
            if(v1 == 1) {
                ((Bundle)object0).putString("avo", "p");
                return;
            }
            if(v1 == 2) {
                ((Bundle)object0).putString("avo", "l");
            }
        }
    }
}


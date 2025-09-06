package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeta implements zzesi {
    final String zza;
    final int zzb;

    zzeta(String s, int v, zzesz zzesz0) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            if(!TextUtils.isEmpty(this.zza)) {
                ((Bundle)object0).putString("topics", this.zza);
            }
            int v = this.zzb;
            if(v != -1) {
                ((Bundle)object0).putInt("atps", v);
            }
        }
    }
}


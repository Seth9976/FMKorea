package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzerc implements zzesi {
    private final String zza;
    private final String zzb;

    public zzerc(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgO)).booleanValue()) {
            ((Bundle)object0).putString("request_id", this.zzb);
            return;
        }
        ((Bundle)object0).putString("request_id", this.zza);
    }
}


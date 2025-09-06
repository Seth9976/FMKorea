package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqa implements zzesi {
    public final zzfbd zza;

    public zzeqa(zzfbd zzfbd0) {
        this.zza = zzfbd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        zzfbd zzfbd0 = this.zza;
        if(zzfbd0 != null) {
            ((Bundle)object0).putBoolean("render_in_browser", zzfbd0.zzd());
            ((Bundle)object0).putBoolean("disable_ml", this.zza.zzc());
        }
    }
}


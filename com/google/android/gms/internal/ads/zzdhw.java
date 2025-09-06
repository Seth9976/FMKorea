package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzt;

final class zzdhw implements zzfya {
    final View zza;
    final zzdhx zzb;

    zzdhw(zzdhx zzdhx0, View view0) {
        this.zzb = zzdhx0;
        this.zza = view0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "omid native display exp");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzdhx.zzr(this.zzb, this.zza, ((zzfip)object0));
    }
}


package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzmw implements zznf {
    final zzmp zza;

    zzmw(zzmp zzmp0) {
        this.zza = zzmp0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zznf
    public final void zza(String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            this.zza.zzl().zzb(new zzmv(this, s, s1, bundle0));
        }
        else if(this.zza.zzm != null) {
            this.zza.zzm.zzj().zzg().zza("AppId not known when logging event", s1);
        }
    }
}


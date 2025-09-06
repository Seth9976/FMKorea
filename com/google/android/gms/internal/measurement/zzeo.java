package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeo extends zza {
    private final Bundle zzc;
    private final Activity zzd;
    private final zzd zze;

    zzeo(zzd zzdf$zzd0, Bundle bundle0, Activity activity0) {
        this.zze = zzdf$zzd0;
        this.zzc = bundle0;
        this.zzd = activity0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        Bundle bundle0;
        if(this.zzc == null) {
            bundle0 = null;
        }
        else {
            bundle0 = new Bundle();
            if(this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object object0 = this.zzc.get("com.google.app_measurement.screen_service");
                if(object0 instanceof Bundle) {
                    bundle0.putBundle("com.google.app_measurement.screen_service", ((Bundle)object0));
                }
            }
        }
        ((zzcu)Preconditions.checkNotNull(zzdf.this.zzj)).onActivityCreated(ObjectWrapper.wrap(this.zzd), bundle0, this.zzb);
    }
}


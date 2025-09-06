package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzauk implements zzaur {
    final Activity zza;
    final Bundle zzb;

    zzauk(zzaus zzaus0, Activity activity0, Bundle bundle0) {
        this.zza = activity0;
        this.zzb = bundle0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzaur
    public final void zza(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        application$ActivityLifecycleCallbacks0.onActivityCreated(this.zza, this.zzb);
    }
}


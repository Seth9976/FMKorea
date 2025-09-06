package com.google.android.gms.internal.ads;

import android.app.AppOpsManager.OnOpActiveChangedListener;

final class zzasg implements AppOpsManager.OnOpActiveChangedListener {
    final zzash zza;

    zzasg(zzash zzash0) {
        this.zza = zzash0;
        super();
    }

    @Override  // android.app.AppOpsManager$OnOpActiveChangedListener
    public final void onOpActiveChanged(String s, int v, String s1, boolean z) {
        if(z) {
            zzash.zzg(this.zza, System.currentTimeMillis());
            zzash.zzf(this.zza, true);
            return;
        }
        long v1 = System.currentTimeMillis();
        zzash zzash0 = this.zza;
        if(zzash.zza(zzash0) > 0L && v1 >= zzash.zza(zzash0)) {
            zzash.zze(zzash0, v1 - zzash.zza(zzash0));
        }
        zzash.zzf(this.zza, false);
    }
}


package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzdvv implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdvv(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = (Context)this.zza.zzb();
        ApplicationInfo applicationInfo0 = ((zzdvq)this.zzb).zza();
        try {
            return Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }
}


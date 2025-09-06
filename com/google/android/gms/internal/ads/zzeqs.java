package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class zzeqs implements zzesi, zzesj {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;

    zzeqs(ApplicationInfo applicationInfo0, PackageInfo packageInfo0) {
        this.zza = applicationInfo0;
        this.zzb = packageInfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 29;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return zzfye.zzh(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        String s = null;
        Integer integer0 = this.zzb == null ? null : this.zzb.versionCode;
        ((Bundle)object0).putString("pn", this.zza.packageName);
        if(integer0 != null) {
            ((Bundle)object0).putInt("vc", ((int)integer0));
        }
        PackageInfo packageInfo0 = this.zzb;
        if(packageInfo0 != null) {
            s = packageInfo0.versionName;
        }
        if(s != null) {
            ((Bundle)object0).putString("vnm", s);
        }
    }
}


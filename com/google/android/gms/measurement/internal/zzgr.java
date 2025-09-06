package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzgr implements Callable {
    private zzgp zza;
    private String zzb;

    public zzgr(zzgp zzgp0, String s) {
        this.zza = zzgp0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        String s = this.zzb;
        zzh zzh0 = this.zza.zzh().zzd(s);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("platform", "android");
        hashMap0.put("package_name", s);
        hashMap0.put("gmp_version", 82001L);
        if(zzh0 != null) {
            String s1 = zzh0.zzaa();
            if(s1 != null) {
                hashMap0.put("app_version", s1);
            }
            hashMap0.put("app_version_int", zzh0.zzc());
            hashMap0.put("dynamite_version", zzh0.zzm());
        }
        return hashMap0;
    }
}


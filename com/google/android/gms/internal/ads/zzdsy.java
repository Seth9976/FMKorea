package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

public final class zzdsy implements Runnable {
    public final zzdtj zza;
    public final zzcas zzb;

    public zzdsy(zzdtj zzdtj0, zzcas zzcas0) {
        this.zza = zzdtj0;
        this.zzb = zzcas0;
    }

    @Override
    public final void run() {
        zzcas zzcas0 = this.zzb;
        String s = zzt.zzo().zzh().zzh().zzc();
        if(!TextUtils.isEmpty(s)) {
            zzcas0.zzc(s);
            return;
        }
        zzcas0.zzd(new Exception());
    }
}


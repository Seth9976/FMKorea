package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdys extends zzdyy {
    private zzbtv zzh;

    zzdys(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.zze = context0;
        this.zzf = zzt.zzt().zzb();
        this.zzg = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this) {
            try {
                if(!this.zzc) {
                    try {
                        this.zzc = true;
                        this.zzd.zzp().zze(this.zzh, new zzdyx(this));
                        return;
                    }
                    catch(RemoteException unused_ex) {
                        goto label_7;
                    }
                }
            }
            catch(Throwable throwable0) {
                zzt.zzo().zzu(throwable0, "RemoteAdsServiceProxyClientTask.onConnected");
                this.zza.zzd(throwable0);
            }
            return;
        }
    label_7:
        zzdxh zzdxh0 = new zzdxh(1);
        this.zza.zzd(zzdxh0);
    }

    public final d zza(zzbtv zzbtv0, long v) {
        synchronized(this) {
            if(this.zzb) {
                return zzfye.zzo(this.zza, v, TimeUnit.MILLISECONDS, this.zzg);
            }
            this.zzb = true;
            this.zzh = zzbtv0;
            this.zzb();
            d d1 = zzfye.zzo(this.zza, v, TimeUnit.MILLISECONDS, this.zzg);
            d1.addListener(new zzdyr(this), zzcan.zzf);
            return d1;
        }
    }
}


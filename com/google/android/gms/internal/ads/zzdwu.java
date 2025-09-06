package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

public final class zzdwu extends zzdws {
    zzdwu(Context context0) {
        this.zzf = new zzbtn(context0, zzt.zzt().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.zzb) {
            try {
                if(!this.zzd) {
                    try {
                        this.zzd = true;
                        this.zzf.zzp().zzf(this.zze, new zzdwr(this));
                        return;
                    }
                    catch(RemoteException | IllegalArgumentException unused_ex) {
                    }
                    goto label_7;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_11;
            }
        }
    label_7:
        zzdxh zzdxh0 = new zzdxh(1);
        this.zza.zzd(zzdxh0);
        return;
    label_11:
        zzt.zzo().zzu(throwable0, "RemoteSignalsClientTask.onConnected");
        zzdxh zzdxh1 = new zzdxh(1);
        this.zza.zzd(zzdxh1);
    }

    public final d zzb(zzbun zzbun0) {
        synchronized(this.zzb) {
            if(this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbun0;
            this.zzf.checkAvailabilityAndConnect();
            zzdwt zzdwt0 = new zzdwt(this);
            this.zza.addListener(zzdwt0, zzcan.zzf);
            return this.zza;
        }
    }
}


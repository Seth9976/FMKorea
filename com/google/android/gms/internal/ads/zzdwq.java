package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzdwq extends zzdws {
    public zzdwq(Context context0) {
        this.zzf = new zzbtn(context0, zzt.zzt().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.zzb) {
            try {
                if(!this.zzd) {
                    try {
                        this.zzd = true;
                        this.zzf.zzp().zzg(this.zze, new zzdwr(this));
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
        zzt.zzo().zzu(throwable0, "RemoteAdRequestClientTask.onConnected");
        zzdxh zzdxh1 = new zzdxh(1);
        this.zza.zzd(zzdxh1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdws
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcaa.zze("Cannot connect to remote service, fallback to local instance.");
        zzdxh zzdxh0 = new zzdxh(1);
        this.zza.zzd(zzdxh0);
    }
}


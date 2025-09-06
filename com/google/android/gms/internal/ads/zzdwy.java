package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzdwy extends zzdws {
    private String zzg;
    private int zzh;

    zzdwy(Context context0) {
        this.zzh = 1;
        this.zzf = new zzbtn(context0, zzt.zzt().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.zzb) {
            try {
                if(!this.zzd) {
                    try {
                        this.zzd = true;
                        switch(this.zzh) {
                            case 2: {
                                this.zzf.zzp().zze(this.zze, new zzdwr(this));
                                break;
                            }
                            case 3: {
                                this.zzf.zzp().zzh(this.zzg, new zzdwr(this));
                                break;
                            }
                            default: {
                                zzdxh zzdxh0 = new zzdxh(1);
                                this.zza.zzd(zzdxh0);
                            }
                        }
                    }
                    catch(RemoteException | IllegalArgumentException unused_ex) {
                        goto label_15;
                    }
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
        }
    label_15:
        zzdxh zzdxh1 = new zzdxh(1);
        this.zza.zzd(zzdxh1);
        return;
    label_18:
        zzt.zzo().zzu(throwable0, "RemoteUrlAndCacheKeyClientTask.onConnected");
        zzdxh zzdxh2 = new zzdxh(1);
        this.zza.zzd(zzdxh2);
    }

    @Override  // com.google.android.gms.internal.ads.zzdws
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcaa.zze("Cannot connect to remote service, fallback to local instance.");
        zzdxh zzdxh0 = new zzdxh(1);
        this.zza.zzd(zzdxh0);
    }

    public final d zzb(zzbun zzbun0) {
        synchronized(this.zzb) {
            if(this.zzh != 1 && this.zzh != 2) {
                return zzfye.zzg(new zzdxh(2));
            }
            if(this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbun0;
            this.zzf.checkAvailabilityAndConnect();
            zzdwx zzdwx0 = new zzdwx(this);
            this.zza.addListener(zzdwx0, zzcan.zzf);
            return this.zza;
        }
    }

    public final d zzc(String s) {
        synchronized(this.zzb) {
            if(this.zzh != 1 && this.zzh != 3) {
                return zzfye.zzg(new zzdxh(2));
            }
            if(this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = s;
            this.zzf.checkAvailabilityAndConnect();
            zzdww zzdww0 = new zzdww(this);
            this.zza.addListener(zzdww0, zzcan.zzf);
            return this.zza;
        }
    }
}


package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public abstract class zzdws implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    protected final zzcas zza;
    protected final Object zzb;
    protected boolean zzc;
    protected boolean zzd;
    protected zzbun zze;
    protected zzbtn zzf;

    public zzdws() {
        this.zza = new zzcas();
        this.zzb = new Object();
        this.zzc = false;
        this.zzd = false;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcaa.zze("Disconnected from remote ad request service.");
        zzdxh zzdxh0 = new zzdxh(1);
        this.zza.zzd(zzdxh0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        zzcaa.zze("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zza() {
        synchronized(this.zzb) {
            this.zzd = true;
            if(this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}


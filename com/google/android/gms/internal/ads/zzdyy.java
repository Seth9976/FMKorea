package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzdyy implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    protected final zzcas zza;
    protected boolean zzb;
    protected boolean zzc;
    protected zzbtq zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    public zzdyy() {
        this.zza = new zzcas();
        this.zzb = false;
        this.zzc = false;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        String s = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", connectionResult0.getErrorCode());
        zzcaa.zze(s);
        zzdxh zzdxh0 = new zzdxh(1, s);
        this.zza.zzd(zzdxh0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnectionSuspended(int v) {
        String s = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", v);
        zzcaa.zze(s);
        zzdxh zzdxh0 = new zzdxh(1, s);
        this.zza.zzd(zzdxh0);
    }

    protected final void zzb() {
        synchronized(this) {
            if(this.zzd == null) {
                this.zzd = new zzbtq(this.zze, this.zzf, this, this);
            }
            this.zzd.checkAvailabilityAndConnect();
        }
    }

    protected final void zzc() {
        synchronized(this) {
            this.zzc = true;
            zzbtq zzbtq0 = this.zzd;
            if(zzbtq0 == null) {
                return;
            }
            if(zzbtq0.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}


package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

public final class zzlm implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    final zzkp zza;
    private volatile boolean zzb;
    private volatile zzfs zzc;

    protected zzlm(zzkp zzkp0) {
        this.zza = zzkp0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized(this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                zzfk zzfk0 = (zzfk)this.zzc.getService();
                this.zza.zzl().zzb(new zzln(this, zzfk0));
            }
            catch(DeadObjectException | IllegalStateException unused_ex) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfr zzfr0 = this.zza.zzu.zzm();
        if(zzfr0 != null) {
            zzfr0.zzu().zza("Service connection failed", connectionResult0);
        }
        synchronized(this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzl().zzb(new zzlp(this));
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzj().zzc().zza("Service connection suspended");
        this.zza.zzl().zzb(new zzlq(this));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzfk zzfk0;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized(this) {
            if(iBinder0 == null) {
                this.zzb = false;
                this.zza.zzj().zzg().zza("Service connected with null binder");
                return;
            }
            try {
                zzfk0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfk zzfk1 = iInterface0 instanceof zzfk ? ((zzfk)iInterface0) : new zzfm(iBinder0);
                    zzfk0 = zzfk1;
                    this.zza.zzj().zzp().zza("Bound to IMeasurementService interface");
                }
                else {
                    this.zza.zzj().zzg().zza("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.zza.zzj().zzg().zza("Service connect failed to get IMeasurementService");
            }
            if(zzfk0 == null) {
                try {
                    this.zzb = false;
                    ConnectionTracker.getInstance().unbindService(this.zza.zza(), this.zza.zza);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else {
                this.zza.zzl().zzb(new zzll(this, zzfk0));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzj().zzc().zza("Service disconnected");
        this.zza.zzl().zzb(new zzlo(this, componentName0));
    }

    static void zza(zzlm zzlm0, boolean z) {
        zzlm0.zzb = false;
    }

    public final void zza() {
        this.zza.zzt();
        Context context0 = this.zza.zza();
        synchronized(this) {
            if(this.zzb) {
                this.zza.zzj().zzp().zza("Connection attempt already in progress");
                return;
            }
            if(this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzj().zzp().zza("Already awaiting connection attempt");
                return;
            }
            this.zzc = new zzfs(context0, Looper.getMainLooper(), this, this);
            this.zza.zzj().zzp().zza("Connecting to remote service");
            this.zzb = true;
            Preconditions.checkNotNull(this.zzc);
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    public final void zza(Intent intent0) {
        this.zza.zzt();
        Context context0 = this.zza.zza();
        ConnectionTracker connectionTracker0 = ConnectionTracker.getInstance();
        synchronized(this) {
            if(this.zzb) {
                this.zza.zzj().zzp().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzj().zzp().zza("Using local app measurement service");
            this.zzb = true;
            connectionTracker0.bindService(context0, intent0, this.zza.zza, 0x81);
        }
    }

    public final void zzb() {
        if(this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}


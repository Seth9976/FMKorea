package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class zzawm {
    private ScheduledFuture zza;
    private final Runnable zzb;
    private final Object zzc;
    private zzawp zzd;
    private Context zze;
    private zzaws zzf;

    public zzawm() {
        this.zza = null;
        this.zzb = new zzawi(this);
        this.zzc = new Object();
    }

    public final long zza(zzawq zzawq0) {
        synchronized(this.zzc) {
            if(this.zzf == null) {
                return -2L;
            }
            if(this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzawq0);
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Unable to call into cache service.", remoteException0);
                }
            }
            return -2L;
        }
    }

    public final zzawn zzb(zzawq zzawq0) {
        Object object0 = this.zzc;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zzf == null) {
            zzawn zzawn0 = new zzawn();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return zzawn0;
        }
        try {
            if(this.zzd.zzp()) {
                zzawn zzawn1 = this.zzf.zzg(zzawq0);
                FIN.finallyExec$NT(v);
                return zzawn1;
            }
            zzawn zzawn2 = this.zzf.zzf(zzawq0);
            FIN.finallyExec$NT(v);
            return zzawn2;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call into cache service.", remoteException0);
            FIN.finallyExec$NT(v);
            return new zzawn();
        }
    }

    static zzawp zzc(zzawm zzawm0) {
        return zzawm0.zzd;
    }

    protected final zzawp zzd(BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        synchronized(this) {
            return new zzawp(this.zze, zzt.zzt().zzb(), baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0);
        }
    }

    static Object zze(zzawm zzawm0) {
        return zzawm0.zzc;
    }

    static void zzf(zzawm zzawm0, zzawp zzawp0) {
        zzawm0.zzd = null;
    }

    static void zzg(zzawm zzawm0) {
        zzawm0.zzl();
    }

    static void zzh(zzawm zzawm0) {
        synchronized(zzawm0.zzc) {
            zzawp zzawp0 = zzawm0.zzd;
            if(zzawp0 == null) {
                return;
            }
            if(zzawp0.isConnected() || zzawm0.zzd.isConnecting()) {
                zzawm0.zzd.disconnect();
            }
            zzawm0.zzd = null;
            zzawm0.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    public final void zzi(Context context0) {
        if(context0 == null) {
            return;
        }
        synchronized(this.zzc) {
            if(this.zze != null) {
                return;
            }
            this.zze = context0.getApplicationContext();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzea)).booleanValue()) {
                this.zzl();
            }
            else if(((Boolean)zzba.zzc().zzb(zzbbr.zzdZ)).booleanValue()) {
                zzt.zzb().zzc(new zzawj(this));
            }
        }
    }

    public final void zzj() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeb)).booleanValue()) {
            Object object0 = this.zzc;
            synchronized(object0) {
                this.zzl();
                ScheduledFuture scheduledFuture0 = this.zza;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                long v1 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzec)));
                this.zza = zzcan.zzd.schedule(this.zzb, v1, TimeUnit.MILLISECONDS);
            }
        }
    }

    static void zzk(zzawm zzawm0, zzaws zzaws0) {
        zzawm0.zzf = zzaws0;
    }

    private final void zzl() {
        synchronized(this.zzc) {
            if(this.zze != null && this.zzd == null) {
                zzawp zzawp0 = this.zzd(new zzawk(this), new zzawl(this));
                this.zzd = zzawp0;
                zzawp0.checkAvailabilityAndConnect();
            }
        }
    }
}


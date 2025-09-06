package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzflj implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    protected final zzfmj zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzflj(Context context0, String s, String s1) {
        this.zzb = s;
        this.zzc = s1;
        HandlerThread handlerThread0 = new HandlerThread("GassClient");
        this.zze = handlerThread0;
        handlerThread0.start();
        zzfmj zzfmj0 = new zzfmj(context0, handlerThread0.getLooper(), this, this, 9200000);
        this.zza = zzfmj0;
        this.zzd = new LinkedBlockingQueue();
        zzfmj0.checkAvailabilityAndConnect();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfmo zzfmo0 = this.zzd();
        if(zzfmo0 != null) {
            try {
                zzaos zzaos0 = zzfmo0.zze(new zzfmk(this.zzb, this.zzc)).zza();
                this.zzd.put(zzaos0);
            }
            catch(Throwable unused_ex) {
                try {
                    zzaos zzaos1 = zzflj.zza();
                    this.zzd.put(zzaos1);
                }
                catch(InterruptedException unused_ex) {
                }
            }
            finally {
                this.zzc();
                this.zze.quit();
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        try {
            zzaos zzaos0 = zzflj.zza();
            this.zzd.put(zzaos0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            zzaos zzaos0 = zzflj.zza();
            this.zzd.put(zzaos0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    static zzaos zza() {
        zzanv zzanv0 = zzaos.zza();
        zzanv0.zzD(0x8000L);
        return (zzaos)zzanv0.zzal();
    }

    public final zzaos zzb(int v) {
        zzaos zzaos0 = null;
        try {
            zzaos0 = (zzaos)this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
        }
        return zzaos0 == null ? zzflj.zza() : zzaos0;
    }

    public final void zzc() {
        if(this.zza != null && (this.zza.isConnected() || this.zza.isConnecting())) {
            this.zza.disconnect();
        }
    }

    protected final zzfmo zzd() {
        try {
            return this.zza.zzp();
        }
        catch(IllegalStateException | DeadObjectException unused_ex) {
            return null;
        }
    }
}


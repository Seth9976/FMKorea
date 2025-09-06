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

final class zzfll implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    protected final zzfmj zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzflc zzf;
    private final long zzg;
    private final int zzh;

    public zzfll(Context context0, int v, int v1, String s, String s1, String s2, zzflc zzflc0) {
        this.zzb = s;
        this.zzh = v1;
        this.zzc = s1;
        this.zzf = zzflc0;
        HandlerThread handlerThread0 = new HandlerThread("GassDGClient");
        this.zze = handlerThread0;
        handlerThread0.start();
        this.zzg = System.currentTimeMillis();
        zzfmj zzfmj0 = new zzfmj(context0, handlerThread0.getLooper(), this, this, 19621000);
        this.zza = zzfmj0;
        this.zzd = new LinkedBlockingQueue();
        zzfmj0.checkAvailabilityAndConnect();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfmo zzfmo0 = this.zzd();
        if(zzfmo0 != null) {
            try {
                zzfmv zzfmv0 = zzfmo0.zzf(new zzfmt(1, this.zzh, this.zzb, this.zzc));
                this.zze(5011, this.zzg, null);
                this.zzd.put(zzfmv0);
            }
            catch(Throwable throwable0) {
                Exception exception0 = new Exception(throwable0);
                this.zze(2010, this.zzg, exception0);
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
            this.zze(0xFAC, this.zzg, null);
            zzfmv zzfmv0 = zzfll.zza();
            this.zzd.put(zzfmv0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            this.zze(0xFAB, this.zzg, null);
            zzfmv zzfmv0 = zzfll.zza();
            this.zzd.put(zzfmv0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    static zzfmv zza() {
        return new zzfmv(null, 1);
    }

    public final zzfmv zzb(int v) {
        zzfmv zzfmv0;
        try {
            zzfmv0 = (zzfmv)this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            this.zze(2009, this.zzg, interruptedException0);
            zzfmv0 = null;
        }
        this.zze(3004, this.zzg, null);
        if(zzfmv0 != null) {
            if(zzfmv0.zzc == 7) {
                zzflc.zzg(3);
                return zzfmv0 == null ? zzfll.zza() : zzfmv0;
            }
            zzflc.zzg(2);
        }
        return zzfmv0 == null ? zzfll.zza() : zzfmv0;
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

    private final void zze(int v, long v1, Exception exception0) {
        this.zzf.zzc(v, System.currentTimeMillis() - v1, exception0);
    }
}


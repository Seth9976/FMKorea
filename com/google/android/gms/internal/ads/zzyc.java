package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
final class zzyc extends Handler implements Runnable {
    final zzyh zza;
    private final zzyd zzb;
    private final long zzc;
    private zzxz zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    public zzyc(zzyh zzyh0, Looper looper0, zzyd zzyd0, zzxz zzxz0, int v, long v1) {
        this.zza = zzyh0;
        super(looper0);
        this.zzb = zzyd0;
        this.zzd = zzxz0;
        this.zzc = v1;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(this.zzi) {
            return;
        }
        int v = message0.what;
        if(v == 0) {
            this.zzd();
            return;
        }
        if(v != 3) {
            zzyh.zze(this.zza, null);
            long v1 = SystemClock.elapsedRealtime();
            long v2 = v1 - this.zzc;
            zzxz zzxz0 = this.zzd;
            zzxz0.getClass();
            if(this.zzh) {
                zzxz0.zzI(this.zzb, v1, v2, false);
                return;
            }
            switch(message0.what) {
                case 1: {
                    try {
                        zzxz0.zzJ(this.zzb, v1, v2);
                    }
                    catch(RuntimeException runtimeException0) {
                        zzes.zzd("LoadTask", "Unexpected exception handling load completed", runtimeException0);
                        zzyg zzyg0 = new zzyg(runtimeException0);
                        zzyh.zzf(this.zza, zzyg0);
                    }
                    return;
                }
                case 2: {
                    this.zze = (IOException)message0.obj;
                    int v3 = this.zzf + 1;
                    this.zzf = v3;
                    zzyb zzyb0 = zzxz0.zzt(this.zzb, v1, v2, ((IOException)message0.obj), v3);
                    if(zzyb0.zza == 3) {
                        zzyh.zzf(this.zza, this.zze);
                        return;
                    }
                    if(zzyb0.zza != 2) {
                        if(zzyb0.zza == 1) {
                            this.zzf = 1;
                        }
                        this.zzc((zzyb0.zzb == 0x8000000000000001L ? ((long)Math.min((this.zzf - 1) * 1000, 5000)) : zzyb0.zzb));
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw (Error)message0.obj;
    }

    @Override
    public final void run() {
        try {
            __monitor_enter(this);
            this.zzg = Thread.currentThread();
            __monitor_exit(this);
            if(!this.zzh) {
                Trace.beginSection(("load:" + this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                }
                finally {
                    Trace.endSection();
                }
            }
            synchronized(this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if(!this.zzi) {
                this.sendEmptyMessage(1);
                return;
            label_27:
                if(!this.zzi) {
                    goto label_28;
                }
            }
            return;
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Exception exception0) {
            goto label_30;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_34;
        }
        catch(Error error0) {
            goto label_38;
        }
    label_28:
        this.obtainMessage(2, iOException0).sendToTarget();
        return;
    label_30:
        if(!this.zzi) {
            zzes.zzd("LoadTask", "Unexpected exception loading stream", exception0);
            this.obtainMessage(2, new zzyg(exception0)).sendToTarget();
            return;
        label_34:
            if(!this.zzi) {
                zzes.zzd("LoadTask", "OutOfMemory error loading stream", outOfMemoryError0);
                this.obtainMessage(2, new zzyg(outOfMemoryError0)).sendToTarget();
                return;
            label_38:
                if(!this.zzi) {
                    zzes.zzd("LoadTask", "Unexpected error loading stream", error0);
                    this.obtainMessage(3, error0).sendToTarget();
                }
                throw error0;
            }
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if(this.hasMessages(0)) {
            this.zzh = true;
            this.removeMessages(0);
            if(!z) {
                this.sendEmptyMessage(1);
            }
        }
        else {
            synchronized(this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread0 = this.zzg;
                if(thread0 != null) {
                    thread0.interrupt();
                }
            }
        }
        if(z) {
            zzyh.zze(this.zza, null);
            long v1 = SystemClock.elapsedRealtime();
            zzxz zzxz0 = this.zzd;
            zzxz0.getClass();
            zzxz0.zzI(this.zzb, v1, v1 - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int v) {
        IOException iOException0 = this.zze;
        if(iOException0 != null && this.zzf > v) {
            throw iOException0;
        }
    }

    public final void zzc(long v) {
        zzdy.zzf(zzyh.zzc(this.zza) == null);
        zzyh.zze(this.zza, this);
        if(v > 0L) {
            this.sendEmptyMessageDelayed(0, v);
            return;
        }
        this.zzd();
    }

    private final void zzd() {
        this.zze = null;
        ExecutorService executorService0 = zzyh.zzd(this.zza);
        zzyc zzyc0 = zzyh.zzc(this.zza);
        zzyc0.getClass();
        executorService0.execute(zzyc0);
    }
}


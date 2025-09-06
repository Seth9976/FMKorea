package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzalj extends Thread {
    private final BlockingQueue zza;
    private final zzali zzb;
    private final zzakz zzc;
    private volatile boolean zzd;
    private final zzalg zze;

    public zzalj(BlockingQueue blockingQueue0, zzali zzali0, zzakz zzakz0, zzalg zzalg0) {
        this.zzd = false;
        this.zza = blockingQueue0;
        this.zzb = zzali0;
        this.zzc = zzakz0;
        this.zze = zzalg0;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        while(true) {
            try {
            label_1:
                this.zzb();
                goto label_1;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.zzd) {
                break;
            }
            zzamb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    public final void zza() {
        this.zzd = true;
        this.interrupt();
    }

    private void zzb() {
        zzalp zzalp0 = (zzalp)this.zza.take();
        SystemClock.elapsedRealtime();
        zzalp0.zzt(3);
        try {
            zzalp0.zzm("network-queue-take");
            TrafficStats.setThreadStatsTag(zzalp0.zzc());
            zzall zzall0 = this.zzb.zza(zzalp0);
            zzalp0.zzm("network-http-complete");
            if(!zzall0.zze || !zzalp0.zzv()) {
                zzalv zzalv0 = zzalp0.zzh(zzall0);
                zzalp0.zzm("network-parse-complete");
                if(zzalv0.zzb != null) {
                    String s = zzalp0.zzj();
                    this.zzc.zzd(s, zzalv0.zzb);
                    zzalp0.zzm("network-cache-written");
                }
                zzalp0.zzq();
                this.zze.zzb(zzalp0, zzalv0, null);
                zzalp0.zzs(zzalv0);
                return;
            }
            zzalp0.zzp("not-modified");
            zzalp0.zzr();
        }
        catch(zzaly zzaly0) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalp0, zzaly0);
            zzalp0.zzr();
        }
        catch(Exception exception0) {
            zzamb.zzc(exception0, "Unhandled exception %s", new Object[]{exception0.toString()});
            zzaly zzaly1 = new zzaly(exception0);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalp0, zzaly1);
            zzalp0.zzr();
        }
        finally {
            zzalp0.zzt(4);
        }
    }
}


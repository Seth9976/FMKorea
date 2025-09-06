package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class zzalb extends Thread {
    private static final boolean zza;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzakz zzd;
    private volatile boolean zze;
    private final zzamc zzf;
    private final zzalg zzg;

    static {
        zzalb.zza = zzamb.zzb;
    }

    public zzalb(BlockingQueue blockingQueue0, BlockingQueue blockingQueue1, zzakz zzakz0, zzalg zzalg0) {
        this.zze = false;
        this.zzb = blockingQueue0;
        this.zzc = blockingQueue1;
        this.zzd = zzakz0;
        this.zzg = zzalg0;
        this.zzf = new zzamc(this, blockingQueue1, zzalg0);
    }

    @Override
    public final void run() {
        if(zzalb.zza) {
            zzamb.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while(true) {
            try {
            label_4:
                this.zzc();
                goto label_4;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.zze) {
                break;
            }
            zzamb.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    static BlockingQueue zza(zzalb zzalb0) {
        return zzalb0.zzc;
    }

    public final void zzb() {
        this.zze = true;
        this.interrupt();
    }

    private void zzc() {
        zzalp zzalp0 = (zzalp)this.zzb.take();
        zzalp0.zzm("cache-queue-take");
        zzalp0.zzt(1);
        try {
            String s = zzalp0.zzj();
            zzaky zzaky0 = this.zzd.zza(s);
            if(zzaky0 == null) {
                zzalp0.zzm("cache-miss");
                if(!this.zzf.zzc(zzalp0)) {
                    this.zzc.put(zzalp0);
                }
                return;
            }
            long v1 = System.currentTimeMillis();
            if(zzaky0.zza(v1)) {
                zzalp0.zzm("cache-hit-expired");
                zzalp0.zze(zzaky0);
                if(!this.zzf.zzc(zzalp0)) {
                    this.zzc.put(zzalp0);
                }
                return;
            }
            zzalp0.zzm("cache-hit");
            zzalv zzalv0 = zzalp0.zzh(new zzall(zzaky0.zza, zzaky0.zzg));
            zzalp0.zzm("cache-hit-parsed");
            if(!zzalv0.zzc()) {
                zzalp0.zzm("cache-parsing-failed");
                String s1 = zzalp0.zzj();
                this.zzd.zzc(s1, true);
                zzalp0.zze(null);
                if(!this.zzf.zzc(zzalp0)) {
                    this.zzc.put(zzalp0);
                }
                return;
            }
            if(zzaky0.zzf < v1) {
                zzalp0.zzm("cache-hit-refresh-needed");
                zzalp0.zze(zzaky0);
                zzalv0.zzd = true;
                if(this.zzf.zzc(zzalp0)) {
                    this.zzg.zzb(zzalp0, zzalv0, null);
                }
                else {
                    zzala zzala0 = new zzala(this, zzalp0);
                    this.zzg.zzb(zzalp0, zzalv0, zzala0);
                }
            }
            else {
                this.zzg.zzb(zzalp0, zzalv0, null);
            }
        }
        finally {
            zzalp0.zzt(2);
        }
    }
}


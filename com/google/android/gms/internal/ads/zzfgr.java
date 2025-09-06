package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzfgr implements zzfgo {
    private final zzfgo zza;
    private final Queue zzb;
    private final int zzc;
    private final AtomicBoolean zzd;

    public zzfgr(zzfgo zzfgo0, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = zzfgo0;
        this.zzb = new LinkedBlockingQueue();
        this.zzc = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzio)));
        this.zzd = new AtomicBoolean(false);
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzin)));
        scheduledExecutorService0.scheduleAtFixedRate(() -> while(!this.zzb.isEmpty()) {
            zzfgn zzfgn0 = (zzfgn)this.zzb.remove();
            this.zza.zzb(zzfgn0);
        }, ((long)v), ((long)v), TimeUnit.MILLISECONDS);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final String zza(zzfgn zzfgn0) {
        return this.zza.zza(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzb(zzfgn zzfgn0) {
        if(this.zzb.size() >= this.zzc) {
            if(!this.zzd.getAndSet(true)) {
                Queue queue0 = this.zzb;
                zzfgn zzfgn1 = zzfgn.zzb("dropped_event");
                Map map0 = zzfgn0.zzj();
                if(map0.containsKey("action")) {
                    zzfgn1.zza("dropped_action", ((String)map0.get("action")));
                }
                queue0.offer(zzfgn1);
            }
            return;
        }
        this.zzb.offer(zzfgn0);
    }

    // 检测为 Lambda 实现
    public static void zzc(zzfgr zzfgr0) [...]
}


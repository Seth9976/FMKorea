package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final class zzamc implements zzalo {
    private final Map zza;
    private final zzalb zzb;
    private final BlockingQueue zzc;
    private final zzalg zzd;

    zzamc(zzalb zzalb0, BlockingQueue blockingQueue0, zzalg zzalg0) {
        this.zza = new HashMap();
        this.zzd = zzalg0;
        this.zzb = zzalb0;
        this.zzc = blockingQueue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzalo
    public final void zza(zzalp zzalp0) {
        synchronized(this) {
            String s = zzalp0.zzj();
            List list0 = (List)this.zza.remove(s);
            if(list0 != null && !list0.isEmpty()) {
                if(zzamb.zzb) {
                    zzamb.zzd("%d waiting requests for cacheKey=%s; resend to network", new Object[]{list0.size(), s});
                }
                zzalp zzalp1 = (zzalp)list0.remove(0);
                this.zza.put(s, list0);
                zzalp1.zzu(this);
                try {
                    this.zzc.put(zzalp1);
                }
                catch(InterruptedException interruptedException0) {
                    zzamb.zzb("Couldn\'t add request to queue. %s", new Object[]{interruptedException0.toString()});
                    Thread.currentThread().interrupt();
                    this.zzb.zzb();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzalo
    public final void zzb(zzalp zzalp0, zzalv zzalv0) {
        List list0;
        if(zzalv0.zzb != null && !zzalv0.zzb.zza(System.currentTimeMillis())) {
            String s = zzalp0.zzj();
            synchronized(this) {
                list0 = (List)this.zza.remove(s);
            }
            if(list0 != null) {
                if(zzamb.zzb) {
                    zzamb.zzd("Releasing %d waiting requests for cacheKey=%s.", new Object[]{list0.size(), s});
                }
                for(Object object0: list0) {
                    this.zzd.zzb(((zzalp)object0), zzalv0, null);
                }
            }
            return;
        }
        this.zza(zzalp0);
    }

    final boolean zzc(zzalp zzalp0) {
        synchronized(this) {
            String s = zzalp0.zzj();
            if(this.zza.containsKey(s)) {
                List list0 = (List)this.zza.get(s);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                zzalp0.zzm("waiting-for-response");
                list0.add(zzalp0);
                this.zza.put(s, list0);
                if(zzamb.zzb) {
                    zzamb.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{s});
                }
                return true;
            }
            this.zza.put(s, null);
            zzalp0.zzu(this);
            if(zzamb.zzb) {
                zzamb.zza("new request, sending to network %s", new Object[]{s});
            }
            return false;
        }
    }
}


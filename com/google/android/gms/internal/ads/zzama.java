package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class zzama {
    public static final boolean zza;
    private final List zzb;
    private boolean zzc;

    static {
        zzama.zza = zzamb.zzb;
    }

    zzama() {
        this.zzb = new ArrayList();
        this.zzc = false;
    }

    @Override
    protected final void finalize() {
        if(!this.zzc) {
            this.zzb("Request on the loose");
            zzamb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final void zza(String s, long v) {
        synchronized(this) {
            if(!this.zzc) {
                zzalz zzalz0 = new zzalz(s, v, SystemClock.elapsedRealtime());
                this.zzb.add(zzalz0);
                return;
            }
        }
        throw new IllegalStateException("Marker added to finished log");
    }

    public final void zzb(String s) {
        long v1;
        synchronized(this) {
            this.zzc = true;
            if(this.zzb.size() == 0) {
                v1 = 0L;
            }
            else {
                long v2 = ((zzalz)this.zzb.get(0)).zzc;
                v1 = ((zzalz)this.zzb.get(this.zzb.size() - 1)).zzc - v2;
            }
            if(v1 <= 0L) {
                return;
            }
            long v3 = ((zzalz)this.zzb.get(0)).zzc;
            zzamb.zza("(%-4d ms) %s", new Object[]{v1, s});
            for(Object object0: this.zzb) {
                zzamb.zza("(+%-4d) [%2d] %s", new Object[]{((long)(((zzalz)object0).zzc - v3)), ((zzalz)object0).zzb, ((zzalz)object0).zza});
                v3 = ((zzalz)object0).zzc;
            }
        }
    }
}


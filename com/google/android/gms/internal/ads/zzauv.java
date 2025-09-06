package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class zzauv {
    int zza;
    private final Object zzb;
    private final List zzc;

    public zzauv() {
        this.zzb = new Object();
        this.zzc = new LinkedList();
    }

    public final zzauu zza(boolean z) {
        int v = 0;
        zzauu zzauu0 = null;
        synchronized(this.zzb) {
            if(this.zzc.isEmpty()) {
                zzcaa.zze("Queue empty");
                return null;
            }
            if(this.zzc.size() >= 2) {
                int v2 = 0x80000000;
                int v3 = 0;
                for(Object object1: this.zzc) {
                    zzauu zzauu1 = (zzauu)object1;
                    int v4 = zzauu1.zzb();
                    if(v4 > v2) {
                        v = v3;
                    }
                    if(v4 > v2) {
                        zzauu0 = zzauu1;
                    }
                    ++v3;
                    v2 = v4 <= v2 ? v2 : v4;
                }
                this.zzc.remove(v);
                return zzauu0;
            }
            zzauu zzauu2 = (zzauu)this.zzc.get(0);
            if(z) {
                this.zzc.remove(0);
            }
            else {
                zzauu2.zzi();
            }
            return zzauu2;
        }
    }

    public final void zzb(zzauu zzauu0) {
        synchronized(this.zzb) {
            if(this.zzc.size() >= 10) {
                zzcaa.zze(("Queue is full, current size = " + this.zzc.size()));
                this.zzc.remove(0);
            }
            int v1 = this.zza;
            this.zza = v1 + 1;
            zzauu0.zzj(v1);
            zzauu0.zzn();
            this.zzc.add(zzauu0);
        }
    }

    public final boolean zzc(zzauu zzauu0) {
        synchronized(this.zzb) {
            Iterator iterator0 = this.zzc.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzauu zzauu1 = (zzauu)object1;
                if(!zzt.zzo().zzh().zzN()) {
                    if(zzauu0.equals(zzauu1) || !zzauu1.zzd().equals(zzauu0.zzd())) {
                        continue;
                    }
                    iterator0.remove();
                    return true;
                }
                if(!zzt.zzo().zzh().zzO() && !zzauu0.equals(zzauu1) && zzauu1.zzf().equals(zzauu0.zzf())) {
                    iterator0.remove();
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzauu zzauu0) {
        synchronized(this.zzb) {
            return this.zzc.contains(zzauu0);
        }
    }
}


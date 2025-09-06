package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdbs {
    protected final Map zza;

    protected zzdbs(Set set0) {
        this.zza = new HashMap();
        this.zzp(set0);
    }

    public final void zzk(zzddo zzddo0) {
        synchronized(this) {
            this.zzo(zzddo0.zza, zzddo0.zzb);
        }
    }

    public final void zzo(Object object0, Executor executor0) {
        synchronized(this) {
            this.zza.put(object0, executor0);
        }
    }

    public final void zzp(Set set0) {
        synchronized(this) {
            for(Object object0: set0) {
                this.zzk(((zzddo)object0));
            }
        }
    }

    protected final void zzt(zzdbr zzdbr0) {
        synchronized(this) {
            for(Object object0: this.zza.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new zzdbq(zzdbr0, object1));
            }
        }
    }
}


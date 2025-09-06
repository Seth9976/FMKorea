package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class zzasl extends zzatm {
    private static final zzatn zzi;
    private final Context zzj;

    static {
        zzasl.zzi = new zzatn();
    }

    public zzasl(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, Context context0) {
        super(zzary0, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", zzanv0, v, 29);
        this.zzj = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        this.zze.zzn("E");
        AtomicReference atomicReference0 = zzasl.zzi.zza("com.fmkorea.m.fmk");
        if(atomicReference0.get() == null) {
            synchronized(atomicReference0) {
                if(atomicReference0.get() == null) {
                    atomicReference0.set(((String)this.zzf.invoke(null, this.zzj)));
                }
            }
        }
        String s = (String)atomicReference0.get();
        synchronized(this.zze) {
            String s1 = zzapi.zza(s.getBytes(), true);
            this.zze.zzn(s1);
        }
    }
}


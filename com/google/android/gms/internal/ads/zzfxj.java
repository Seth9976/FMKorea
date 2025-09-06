package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzfxj extends zzfws.zzi {
    private volatile int remaining;
    private volatile Set seenExceptions;
    private static final zzfxf zzbb;
    private static final Logger zzbc;

    static {
        RuntimeException runtimeException1;
        zzfxg zzfxg0;
        zzfxj.zzbc = Logger.getLogger("com.google.android.gms.internal.ads.zzfxj");
        try {
            zzfxg0 = new zzfxg(AtomicReferenceFieldUpdater.newUpdater(zzfxj.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfxj.class, "remaining"));
            runtimeException1 = null;
        }
        catch(RuntimeException | Error runtimeException0) {
            zzfxg0 = new zzfxi(null);
            runtimeException1 = runtimeException0;
        }
        zzfxj.zzbb = zzfxg0;
        if(runtimeException1 != null) {
            zzfxj.zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", runtimeException1);
        }
    }

    zzfxj(int v) {
        this.seenExceptions = null;
        this.remaining = v;
    }

    final int zzA() {
        return zzfxj.zzbb.zza(this);
    }

    final Set zzC() {
        Set set0 = this.seenExceptions;
        if(set0 == null) {
            Set set1 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.zze(set1);
            zzfxj.zzbb.zzb(this, null, set1);
            set0 = this.seenExceptions;
            set0.getClass();
        }
        return set0;
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set arg1);
}


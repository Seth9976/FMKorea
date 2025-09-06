package com.google.android.gms.internal.ads;

import com.facebook.internal.q;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfct {
    public static boolean zza(AtomicReference atomicReference0, Object object0, Object object1) {
        do {
            if(q.a(atomicReference0, null, object1)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        return false;
    }
}


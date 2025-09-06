package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeyj {
    public static void zza(AtomicReference atomicReference0, zzeyi zzeyi0) {
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            return;
        }
        try {
            zzeyi0.zza(object0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
        catch(NullPointerException nullPointerException0) {
            zzcaa.zzk("NullPointerException occurs when invoking a method from a delegating listener.", nullPointerException0);
        }
    }
}


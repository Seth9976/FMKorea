package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzez {
    private static zzez zza;
    private final Handler zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;

    private zzez(Context context0) {
        this.zzb = new Handler(Looper.getMainLooper());
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context0.registerReceiver(new zzey(this, null), intentFilter0);
    }

    public final int zza() {
        synchronized(this.zzd) {
        }
        return this.zze;
    }

    public static zzez zzb(Context context0) {
        synchronized(zzez.class) {
            if(zzez.zza == null) {
                zzez.zza = new zzez(context0);
            }
            return zzez.zza;
        }
    }

    static void zzc(zzez zzez0, int v) {
        synchronized(zzez0.zzd) {
            if(zzez0.zze == v) {
                return;
            }
            zzez0.zze = v;
        }
        for(Object object1: zzez0.zzc) {
            WeakReference weakReference0 = (WeakReference)object1;
            zzxv zzxv0 = (zzxv)weakReference0.get();
            if(zzxv0 == null) {
                zzez0.zzc.remove(weakReference0);
            }
            else {
                zzxx.zzh(zzxv0.zza, v);
            }
        }
    }

    public final void zzd(zzxv zzxv0) {
        for(Object object0: this.zzc) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == null) {
                this.zzc.remove(weakReference0);
            }
        }
        WeakReference weakReference1 = new WeakReference(zzxv0);
        this.zzc.add(weakReference1);
        zzev zzev0 = new zzev(this, zzxv0);
        this.zzb.post(zzev0);
    }
}


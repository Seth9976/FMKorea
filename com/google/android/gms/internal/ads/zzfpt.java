package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzfpt extends zzatw implements zzfpu {
    public static zzfpu zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterface0 instanceof zzfpu ? ((zzfpu)iInterface0) : new zzfps(iBinder0);
    }
}


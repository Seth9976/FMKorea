package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfoe;

public final class zzf extends zzfoe {
    public zzf(Looper looper0) {
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            super.handleMessage(message0);
        }
        catch(Exception exception0) {
            zzt.zzo().zzu(exception0, "AdMobHandler.handleMessage");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfoe
    protected final void zza(Message message0) {
        try {
            super.zza(message0);
        }
        catch(Throwable throwable0) {
            zzs.zzJ(zzt.zzo().zzc(), throwable0);
            throw throwable0;
        }
    }
}


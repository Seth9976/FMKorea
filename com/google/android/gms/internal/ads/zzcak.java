package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

final class zzcak implements Executor {
    private final Handler zza;

    zzcak() {
        this.zza = new zzf(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable0.run();
                return;
            }
            catch(Throwable throwable0) {
                zzs.zzJ(zzt.zzo().zzc(), throwable0);
                throw throwable0;
            }
        }
        this.zza.post(runnable0);
    }
}


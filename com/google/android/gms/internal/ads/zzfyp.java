package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class zzfyp implements Executor {
    final Executor zza;
    final zzfws zzb;

    zzfyp(Executor executor0, zzfws zzfws0) {
        this.zza = executor0;
        this.zzb = zzfws0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        try {
            this.zza.execute(runnable0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.zzb.zzd(rejectedExecutionException0);
        }
    }
}


package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfkz implements Runnable {
    public final TaskCompletionSource zza;

    public zzfkz(TaskCompletionSource taskCompletionSource0) {
        this.zza = taskCompletionSource0;
    }

    @Override
    public final void run() {
        zzfne zzfne0 = zzfne.zzc();
        this.zza.setResult(zzfne0);
    }
}


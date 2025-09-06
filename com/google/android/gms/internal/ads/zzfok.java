package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class zzfok implements OnCompleteListener {
    public final zzfol zza;

    public zzfok(zzfol zzfol0) {
        this.zza = zzfol0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        zzfol zzfol0 = this.zza;
        if(task0.isCanceled()) {
            zzfol0.cancel(false);
            return;
        }
        if(task0.isSuccessful()) {
            zzfol0.zzc(task0.getResult());
            return;
        }
        Exception exception0 = task0.getException();
        if(exception0 == null) {
            throw new IllegalStateException();
        }
        zzfol0.zzd(exception0);
    }
}


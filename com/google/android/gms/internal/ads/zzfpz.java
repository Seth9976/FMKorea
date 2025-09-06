package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfpz implements OnCompleteListener {
    public final zzfqi zza;
    public final TaskCompletionSource zzb;

    public zzfpz(zzfqi zzfqi0, TaskCompletionSource taskCompletionSource0) {
        this.zza = zzfqi0;
        this.zzb = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        this.zza.zzt(this.zzb, task0);
    }
}


package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfla implements Continuation {
    public static final zzfla zza;

    static {
        zzfla.zza = new zzfla();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Boolean.valueOf(task0.isSuccessful());
    }
}


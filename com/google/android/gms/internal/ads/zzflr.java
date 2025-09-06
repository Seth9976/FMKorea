package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

public final class zzflr implements OnFailureListener {
    public final zzflv zza;

    public zzflr(zzflv zzflv0) {
        this.zza = zzflv0;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        this.zza.zzf(exception0);
    }
}


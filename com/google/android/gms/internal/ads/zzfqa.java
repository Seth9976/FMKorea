package com.google.android.gms.internal.ads;

import android.os.IBinder.DeathRecipient;

public final class zzfqa implements IBinder.DeathRecipient {
    public final zzfqi zza;

    public zzfqa(zzfqi zzfqi0) {
        this.zza = zzfqi0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        zzfqi.zzj(this.zza);
    }
}


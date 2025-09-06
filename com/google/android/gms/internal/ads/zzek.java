package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Message;

public final class zzek implements Handler.Callback {
    public final zzep zza;

    public zzek(zzep zzep0) {
        this.zza = zzep0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        zzep.zzg(this.zza, message0);
        return true;
    }
}


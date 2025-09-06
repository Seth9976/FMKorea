package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class zzfoe extends Handler {
    private final Looper zza;

    public zzfoe() {
        this.zza = Looper.getMainLooper();
    }

    public zzfoe(Looper looper0) {
        super(looper0);
        this.zza = Looper.getMainLooper();
    }

    @Override  // android.os.Handler
    public final void dispatchMessage(Message message0) {
        this.zza(message0);
    }

    protected void zza(Message message0) {
        super.dispatchMessage(message0);
    }
}


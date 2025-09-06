package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

final class zzff implements zzei {
    private Message zza;
    private zzfg zzb;

    private zzff() {
    }

    zzff(zzfe zzfe0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzei
    public final void zza() {
        Message message0 = this.zza;
        message0.getClass();
        message0.sendToTarget();
        this.zzd();
    }

    public final zzff zzb(Message message0, zzfg zzfg0) {
        this.zza = message0;
        this.zzb = zzfg0;
        return this;
    }

    public final boolean zzc(Handler handler0) {
        Message message0 = this.zza;
        message0.getClass();
        boolean z = handler0.sendMessageAtFrontOfQueue(message0);
        this.zzd();
        return z;
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfg.zzl(this);
    }
}


package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzalg {
    private final Executor zza;

    public zzalg(Handler handler0) {
        this.zza = new zzale(this, handler0);
    }

    public final void zza(zzalp zzalp0, zzaly zzaly0) {
        zzalp0.zzm("post-error");
        zzalf zzalf0 = new zzalf(zzalp0, zzalv.zza(zzaly0), null);
        ((zzale)this.zza).zza.post(zzalf0);
    }

    public final void zzb(zzalp zzalp0, zzalv zzalv0, Runnable runnable0) {
        zzalp0.zzq();
        zzalp0.zzm("post-response");
        zzalf zzalf0 = new zzalf(zzalp0, zzalv0, runnable0);
        ((zzale)this.zza).zza.post(zzalf0);
    }
}


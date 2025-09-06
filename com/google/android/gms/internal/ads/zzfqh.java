package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class zzfqh implements ServiceConnection {
    final zzfqi zza;

    zzfqh(zzfqi zzfqi0, zzfqg zzfqg0) {
        this.zza = zzfqi0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzfqi.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
        zzfqe zzfqe0 = new zzfqe(this, iBinder0);
        this.zza.zzc().post(zzfqe0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzfqi.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
        zzfqf zzfqf0 = new zzfqf(this);
        this.zza.zzc().post(zzfqf0);
    }
}


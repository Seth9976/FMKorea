package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

public final class zzgl implements ServiceConnection {
    final zzgm zza;
    private final String zzb;

    zzgl(zzgm zzgm0, String s) {
        this.zza = zzgm0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(iBinder0 == null) {
            this.zza.zza.zzj().zzu().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zzby0 = zzcb.zza(iBinder0);
            if(zzby0 == null) {
                this.zza.zza.zzj().zzu().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzj().zzp().zza("Install Referrer Service connected");
            this.zza.zza.zzl().zzb(new zzgo(this, zzby0, this));
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        this.zza.zza.zzj().zzu().zza("Exception occurred while calling Install Referrer API", runtimeException0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.zza.zza.zzj().zzp().zza("Install Referrer Service disconnected");
    }
}


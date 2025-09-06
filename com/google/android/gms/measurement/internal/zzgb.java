package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

class zzgb extends BroadcastReceiver {
    private static final String zza = "com.google.android.gms.measurement.internal.zzgb";
    private final zzmp zzb;
    private boolean zzc;
    private boolean zzd;

    static {
    }

    zzgb(zzmp zzmp0) {
        Preconditions.checkNotNull(zzmp0);
        this.zzb = zzmp0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        this.zzb.zzs();
        String s = intent0.getAction();
        this.zzb.zzj().zzp().zza("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = this.zzb.zzh().zzu();
            if(this.zzd != z) {
                this.zzd = z;
                this.zzb.zzl().zzb(new zzge(this, z));
            }
            return;
        }
        this.zzb.zzj().zzu().zza("NetworkBroadcastReceiver received unknown action", s);
    }

    public final void zza() {
        this.zzb.zzs();
        this.zzb.zzl().zzt();
        if(this.zzc) {
            return;
        }
        this.zzb.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzh().zzu();
        this.zzb.zzj().zzp().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        this.zzb.zzs();
        this.zzb.zzl().zzt();
        this.zzb.zzl().zzt();
        if(!this.zzc) {
            return;
        }
        this.zzb.zzj().zzp().zza("Unregistering connectivity change receiver");
        this.zzc = false;
        this.zzd = false;
        Context context0 = this.zzb.zza();
        try {
            context0.unregisterReceiver(this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.zzb.zzj().zzg().zza("Failed to unregister the network broadcast receiver", illegalArgumentException0);
        }
    }
}


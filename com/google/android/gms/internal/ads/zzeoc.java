package com.google.android.gms.internal.ads;

import Z1.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeoc implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    zzeoc(zzfyo zzfyo0, Context context0) {
        this.zza = zzfyo0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 14;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    @SuppressLint({"UnprotectedReceiver"})
    public final d zzb() {
        zzeob zzeob0 = () -> {
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intent0 = !((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() || Build.VERSION.SDK_INT < 33 ? this.zzb.registerReceiver(null, intentFilter0) : this.zzb.registerReceiver(null, intentFilter0, 4);
            boolean z = false;
            if(intent0 != null) {
                int v = intent0.getIntExtra("status", -1);
                int v1 = intent0.getIntExtra("level", -1);
                double f = (double)intent0.getIntExtra("scale", -1);
                if(v == 2 || v == 5) {
                    z = true;
                }
                return new zzeod(((double)v1) / f, z);
            }
            return new zzeod(-1.0, false);
        };
        return this.zza.zzb(zzeob0);
    }

    // 检测为 Lambda 实现
    final zzeod zzc() [...]
}


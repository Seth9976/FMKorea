package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfpg extends zzfpy {
    final zzfpm zza;
    final zzfpp zzb;
    final TaskCompletionSource zzc;
    final zzfpk zzd;

    zzfpg(zzfpk zzfpk0, TaskCompletionSource taskCompletionSource0, zzfpm zzfpm0, zzfpp zzfpp0, TaskCompletionSource taskCompletionSource1) {
        this.zzd = zzfpk0;
        this.zza = zzfpm0;
        this.zzb = zzfpp0;
        this.zzc = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            IInterface iInterface0 = this.zzd.zza.zze();
            String s = zzfpk.zzb(this.zzd);
            zzfpm zzfpm0 = this.zza;
            Bundle bundle0 = new Bundle();
            bundle0.putBinder("windowToken", zzfpm0.zze());
            bundle0.putString("adFieldEnifd", zzfpm0.zzf());
            bundle0.putInt("layoutGravity", zzfpm0.zzc());
            bundle0.putFloat("layoutVerticalMargin", zzfpm0.zza());
            bundle0.putInt("displayMode", 0);
            bundle0.putInt("windowWidthPx", zzfpm0.zzd());
            bundle0.putBoolean("stableSessionToken", false);
            bundle0.putString("callerPackage", zzfpk.zzb(this.zzd));
            if(zzfpm0.zzg() != null) {
                bundle0.putString("appId", zzfpm0.zzg());
            }
            ((zzfpu)iInterface0).zzf(s, bundle0, new zzfpj(this.zzd, this.zzb));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzfpk.zza().zzb(remoteException0, "show overlay display from: %s", new Object[]{zzfpk.zzb(this.zzd)});
        RuntimeException runtimeException0 = new RuntimeException(remoteException0);
        this.zzc.trySetException(runtimeException0);
    }
}


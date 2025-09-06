package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfph extends zzfpy {
    final zzfpb zza;
    final zzfpp zzb;
    final TaskCompletionSource zzc;
    final zzfpk zzd;

    zzfph(zzfpk zzfpk0, TaskCompletionSource taskCompletionSource0, zzfpb zzfpb0, zzfpp zzfpp0, TaskCompletionSource taskCompletionSource1) {
        this.zzd = zzfpk0;
        this.zza = zzfpb0;
        this.zzb = zzfpp0;
        this.zzc = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("sessionToken", this.zza.zzb());
            bundle0.putString("callerPackage", zzfpk.zzb(this.zzd));
            bundle0.putString("appId", this.zza.zza());
            zzfpj zzfpj0 = new zzfpj(this.zzd, this.zzb);
            ((zzfpu)this.zzd.zza.zze()).zze(bundle0, zzfpj0);
        }
        catch(RemoteException remoteException0) {
            zzfpk.zza().zzb(remoteException0, "dismiss overlay display from: %s", new Object[]{zzfpk.zzb(this.zzd)});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.zzc.trySetException(runtimeException0);
        }
    }
}


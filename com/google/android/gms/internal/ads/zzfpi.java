package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfpi extends zzfpy {
    final zzfpr zza;
    final int zzb;
    final zzfpp zzc;
    final TaskCompletionSource zzd;
    final zzfpk zze;

    zzfpi(zzfpk zzfpk0, TaskCompletionSource taskCompletionSource0, zzfpr zzfpr0, int v, zzfpp zzfpp0, TaskCompletionSource taskCompletionSource1) {
        this.zze = zzfpk0;
        this.zza = zzfpr0;
        this.zzb = v;
        this.zzc = zzfpp0;
        this.zzd = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("sessionToken", this.zza.zzb());
            bundle0.putInt("displayMode", this.zzb);
            bundle0.putString("callerPackage", zzfpk.zzb(this.zze));
            bundle0.putString("appId", this.zza.zza());
            zzfpj zzfpj0 = new zzfpj(this.zze, this.zzc);
            ((zzfpu)this.zze.zza.zze()).zzg(bundle0, zzfpj0);
        }
        catch(RemoteException remoteException0) {
            zzfpk.zza().zzb(remoteException0, "switchDisplayMode overlay display to %d from: %s", new Object[]{this.zzb, zzfpk.zzb(this.zze)});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.zzd.trySetException(runtimeException0);
        }
    }
}


package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzbkl implements BaseConnectionCallbacks {
    final zzcas zza;
    final zzbkn zzb;

    zzbkl(zzbkn zzbkn0, zzcas zzcas0) {
        this.zzb = zzbkn0;
        this.zza = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        try {
            zzbkh zzbkh0 = zzbkn.zzb(this.zzb).zzp();
            this.zza.zzc(zzbkh0);
        }
        catch(DeadObjectException deadObjectException0) {
            this.zza.zzd(deadObjectException0);
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        RuntimeException runtimeException0 = new RuntimeException("onConnectionSuspended: " + v);
        this.zza.zzd(runtimeException0);
    }
}


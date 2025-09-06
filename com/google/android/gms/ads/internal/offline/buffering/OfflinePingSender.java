package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.j.a;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbrv;

@KeepForSdk
public class OfflinePingSender extends Worker {
    private final zzbrv zza;

    public OfflinePingSender(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.zza = zzay.zza().zzm(context0, new zzboc());
    }

    @Override  // androidx.work.Worker
    public final a doWork() {
        try {
            this.zza.zzh();
            return a.c();
        }
        catch(RemoteException unused_ex) {
            return a.a();
        }
    }
}


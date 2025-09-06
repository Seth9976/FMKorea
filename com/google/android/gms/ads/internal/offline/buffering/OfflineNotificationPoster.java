package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.j.a;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbrv;

@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    private final zzbrv zza;

    public OfflineNotificationPoster(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.zza = zzay.zza().zzm(context0, new zzboc());
    }

    @Override  // androidx.work.Worker
    public final a doWork() {
        String s = this.getInputData().l("uri");
        String s1 = this.getInputData().l("gws_query_id");
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.getApplicationContext());
            this.zza.zzi(iObjectWrapper0, s, s1);
            return a.c();
        }
        catch(RemoteException unused_ex) {
            return a.a();
        }
    }
}


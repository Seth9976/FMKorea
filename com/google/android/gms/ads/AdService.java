package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzcaa;

@KeepForSdk
public class AdService extends IntentService {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override  // android.app.IntentService
    protected final void onHandleIntent(Intent intent0) {
        try {
            zzay.zza().zzm(this, new zzboc()).zze(intent0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzg(("RemoteException calling handleNotificationIntent: " + remoteException0.toString()));
        }
    }
}


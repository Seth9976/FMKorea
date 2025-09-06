package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbof;

@KeepForSdk
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcl
    public zzbof getAdapterCreator() {
        return new zzboc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(233012802, 233012000, "22.4.0");
    }
}


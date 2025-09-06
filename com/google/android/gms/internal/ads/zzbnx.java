package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public final class zzbnx implements Runnable {
    public final zzbny zza;
    public final Context zzb;
    public final String zzc;

    public zzbnx(zzbny zzbny0, Context context0, String s) {
        this.zza = zzbny0;
        this.zzb = context0;
        this.zzc = s;
    }

    @Override
    public final void run() {
        Context context0 = this.zzb;
        String s = this.zzc;
        zzbbr.zza(context0);
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("measurementEnabled", ((Boolean)zzba.zzc().zzb(zzbbr.zzai)).booleanValue());
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzap)).booleanValue()) {
            bundle0.putString("ad_storage", "denied");
            bundle0.putString("analytics_storage", "denied");
        }
        AppMeasurementSdk appMeasurementSdk0 = AppMeasurementSdk.getInstance(context0, "FA-Ads", "am", s, bundle0);
        try {
            ((zzchc)zzcae.zzb(context0, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", (zzbnw this) -> zzchb.zzb(((IBinder)object0)))).zze(ObjectWrapper.wrap(context0), new zzbnv(appMeasurementSdk0));
        }
        catch(zzcad | NullPointerException | RemoteException zzcad0) {
            zzcaa.zzl("#007 Could not call remote method.", zzcad0);
        }
    }
}


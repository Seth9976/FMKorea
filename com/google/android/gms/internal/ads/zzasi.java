package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzasi extends zzatm {
    private final Activity zzi;
    private final View zzj;

    public zzasi(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, View view0, Activity activity0) {
        super(zzary0, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", zzanv0, v, 62);
        this.zzj = view0;
        this.zzi = activity0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(this.zzj == null) {
            return;
        }
        Boolean boolean0 = (Boolean)zzba.zzc().zzb(zzbbr.zzcq);
        Object[] arr_object = (Object[])this.zzf.invoke(null, this.zzj, this.zzi, boolean0);
        synchronized(this.zze) {
            this.zze.zzc(((long)(((Long)arr_object[0]))));
            this.zze.zze(((long)(((Long)arr_object[1]))));
            if(boolean0.booleanValue()) {
                this.zze.zzd(((String)arr_object[2]));
            }
        }
    }
}


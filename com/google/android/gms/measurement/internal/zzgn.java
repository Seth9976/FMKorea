package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgn {
    public interface zza {
        void doStartService(Context arg1, Intent arg2);
    }

    private final zza zza;

    public zzgn(zza zzgn$zza0) {
        Preconditions.checkNotNull(zzgn$zza0);
        this.zza = zzgn$zza0;
    }

    public final void zza(Context context0, Intent intent0) {
        zzfr zzfr0 = zzhf.zza(context0, null, null).zzj();
        if(intent0 == null) {
            zzfr0.zzu().zza("Receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        zzfr0.zzp().zza("Local receiver got", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementService");
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            zzfr0.zzp().zza("Starting wakeful intent.");
            this.zza.doStartService(context0, intent1);
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            zzfr0.zzu().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}


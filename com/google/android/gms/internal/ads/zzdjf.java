package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzdjf implements zzbir {
    public final zzdjg zza;
    public final zzbgq zzb;

    public zzdjf(zzdjg zzdjg0, zzbgq zzbgq0) {
        this.zza = zzdjg0;
        this.zzb = zzbgq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzbgq zzbgq0;
        zzdjg zzdjg0;
        try {
            zzdjg0 = this.zza;
            zzbgq0 = this.zzb;
            zzdjg0.zzb = Long.parseLong(((String)map0.get("timestamp")));
        }
        catch(NumberFormatException unused_ex) {
            zzcaa.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdjg0.zza = (String)map0.get("id");
        String s = (String)map0.get("asset_id");
        if(zzbgq0 == null) {
            zzcaa.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbgq0.zzf(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}


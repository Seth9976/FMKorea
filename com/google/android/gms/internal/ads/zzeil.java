package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

public final class zzeil implements zzedp {
    private final zzejp zza;
    private final zzdpc zzb;

    zzeil(zzejp zzejp0, zzdpc zzdpc0) {
        this.zza = zzejp0;
        this.zzb = zzdpc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String s, JSONObject jSONObject0) {
        zzbqc zzbqc0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbB)).booleanValue()) {
            try {
                zzbqc0 = this.zzb.zzb(s);
                return zzbqc0 == null ? null : new zzedq(zzbqc0, new zzefj(), s);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Coundn\'t create RTB adapter: ", remoteException0);
                return null;
            }
        }
        zzbqc0 = this.zza.zza(s);
        return zzbqc0 == null ? null : new zzedq(zzbqc0, new zzefj(), s);
    }
}


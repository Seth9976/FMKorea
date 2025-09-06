package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzcpj implements zzgyt {
    private final zzgzg zza;

    public zzcpj(zzgzg zzgzg0) {
        this.zza = zzgzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzfbe zzfbe0 = ((zzcsu)this.zza).zza();
        try {
            return new JSONObject(zzfbe0.zzA);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }
}


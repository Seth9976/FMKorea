package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class zzbje implements zzbjf {
    final zzcas zza;

    zzbje(zzbjg zzbjg0, zzcas zzcas0) {
        this.zza = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String s) {
        zzbmx zzbmx0 = new zzbmx(s);
        this.zza.zzd(zzbmx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject0) {
        this.zza.zzc(jSONObject0);
    }
}


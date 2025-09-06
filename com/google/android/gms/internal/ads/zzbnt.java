package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class zzbnt implements zzbjf {
    final zzbnu zza;
    private final zzcas zzb;

    public zzbnt(zzbnu zzbnu0, zzcas zzcas0) {
        this.zza = zzbnu0;
        super();
        this.zzb = zzcas0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String s) {
        try {
            if(s == null) {
                zzbmx zzbmx0 = new zzbmx();
                this.zzb.zzd(zzbmx0);
                return;
            }
            zzbmx zzbmx1 = new zzbmx(s);
            this.zzb.zzd(zzbmx1);
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject0) {
        try {
            this.zzb.zzc(jSONObject0);
        }
        catch(IllegalStateException jSONException0) {
            this.zzb.zzd(jSONException0);
        }
        catch(JSONException unused_ex) {
        }
    }
}


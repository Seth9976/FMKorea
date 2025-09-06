package com.google.android.gms.internal.ads;

import Z1.d;
import org.json.JSONObject;

public final class zzbnu implements zzfxl {
    private final zzbna zza;
    private final zzbnb zzb;
    private final String zzc;
    private final d zzd;

    zzbnu(d d0, String s, zzbnb zzbnb0, zzbna zzbna0) {
        this.zzd = d0;
        this.zzc = "google.afma.activeView.handleUpdate";
        this.zzb = zzbnb0;
        this.zza = zzbna0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zzb(object0);
    }

    public final d zzb(Object object0) {
        zzbns zzbns0 = (zzbmv zzbmv0) -> {
            d d0 = new zzcas();
            zzbnt zzbnt0 = new zzbnt(this, ((zzcas)d0));
            zzbiq.zzo.zzc("a1faab7c-7e15-4de8-8d2a-ab0687b47daa", zzbnt0);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", "a1faab7c-7e15-4de8-8d2a-ab0687b47daa");
            jSONObject0.put("args", ((JSONObject)object0));
            zzbmv0.zzl(this.zzc, jSONObject0);
            return d0;
        };
        return zzfye.zzn(this.zzd, zzbns0, zzcan.zzf);
    }

    // 检测为 Lambda 实现
    final d zzc(Object object0, zzbmv zzbmv0) [...]
}


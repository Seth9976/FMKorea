package com.google.android.gms.internal.ads;

import Z1.d;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import org.json.JSONObject;

public final class zzdks {
    private final zzfyo zza;
    private final zzdlf zzb;
    private final zzdlk zzc;

    public zzdks(zzfyo zzfyo0, zzdlf zzdlf0, zzdlk zzdlk0) {
        this.zza = zzfyo0;
        this.zzb = zzdlf0;
        this.zzc = zzdlk0;
    }

    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0, JSONObject jSONObject0) {
        d d8;
        zzdkq zzdkq0 = new zzdkq(this, zzfbr0, zzfbe0, jSONObject0);
        d d0 = this.zza.zzb(zzdkq0);
        d d1 = this.zzb.zzf(jSONObject0, "images");
        d d2 = this.zzb.zzg(jSONObject0, "images", zzfbe0, zzfbr0.zzb.zzb);
        d d3 = this.zzb.zze(jSONObject0, "secondary_image");
        d d4 = this.zzb.zze(jSONObject0, "app_icon");
        d d5 = this.zzb.zzd(jSONObject0, "attribution");
        d d6 = this.zzb.zzh(jSONObject0, zzfbe0, zzfbr0.zzb.zzb);
        d d7 = this.zzc.zza(jSONObject0, "custom_assets");
        zzdlf zzdlf0 = this.zzb;
        if(jSONObject0.optBoolean("enable_omid")) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
            if(jSONObject1 == null) {
                d8 = zzfye.zzh(null);
            }
            else {
                String s = jSONObject1.optString("omid_html");
                d8 = TextUtils.isEmpty(s) ? zzfye.zzh(null) : zzfye.zzn(zzfye.zzh(null), new zzdku(zzdlf0, s), zzcan.zze);
            }
        }
        else {
            d8 = zzfye.zzh(null);
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(d0);
        arrayList0.add(d1);
        arrayList0.add(d2);
        arrayList0.add(d3);
        arrayList0.add(d4);
        arrayList0.add(d5);
        arrayList0.add(d6);
        arrayList0.add(d7);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            arrayList0.add(d8);
        }
        return zzfye.zza(arrayList0).zza(new zzdkr(this, d0, d1, d4, d3, d5, jSONObject0, d6, d2, d8, d7), this.zza);
    }
}


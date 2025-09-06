package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzegh implements zzegb {
    private final zzdgm zza;
    private final zzfyo zzb;
    private final zzdks zzc;
    private final zzfcx zzd;
    private final zzdnh zze;

    public zzegh(zzdgm zzdgm0, zzfyo zzfyo0, zzdks zzdks0, zzfcx zzfcx0, zzdnh zzdnh0) {
        this.zza = zzdgm0;
        this.zzb = zzfyo0;
        this.zzc = zzdks0;
        this.zzd = zzfcx0;
        this.zze = zzdnh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfye.zzn(zzfye.zzn(this.zzd.zza(), (zzdnb zzdnb0) -> {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("isNonagon", true);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzii)).booleanValue()) {
                jSONObject0.put("skipDeepLinkValidation", true);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("response", zzfbe0.zzt.zzc);
            jSONObject1.put("sdk_params", jSONObject0);
            return zzfye.zzn(zzdnb0.zzd("google.afma.nativeAds.preProcessJson", jSONObject1), (JSONObject jSONObject0) -> {
                d d0 = zzfye.zzh(zzdnb0);
                this.zzd.zzb(d0);
                if(!jSONObject0.optBoolean("success")) {
                    throw new zzbmx("process json failed");
                }
                return zzfye.zzh(jSONObject0.getJSONObject("json").getJSONArray("ads"));
            }, this.zzb);
        }, this.zzb), (JSONArray jSONArray0) -> {
            if(jSONArray0.length() == 0) {
                return zzfye.zzg(new zzdve(3));
            }
            if(zzfbr0.zza.zza.zzk > 1) {
                int v1 = jSONArray0.length();
                this.zzd.zzc(Math.min(v1, zzfbr0.zza.zza.zzk));
                ArrayList arrayList0 = new ArrayList(zzfbr0.zza.zza.zzk);
                for(int v = 0; v < zzfbr0.zza.zza.zzk; ++v) {
                    if(v < v1) {
                        arrayList0.add(this.zzg(zzfbr0, zzfbe0, jSONArray0.getJSONObject(v)));
                    }
                    else {
                        arrayList0.add(zzfye.zzg(new zzdve(3)));
                    }
                }
                return zzfye.zzh(arrayList0);
            }
            return zzfye.zzm(this.zzg(zzfbr0, zzfbe0, jSONArray0.getJSONObject(0)), zzegg.zza, this.zzb);
        }, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfbe0.zzt != null && zzfbe0.zzt.zzc != null;
    }

    // 检测为 Lambda 实现
    final zzdhx zzc(d d0, d d1, zzfbr zzfbr0, zzfbe zzfbe0, JSONObject jSONObject0) [...]

    // 检测为 Lambda 实现
    final d zzd(zzdnb zzdnb0, JSONObject jSONObject0) [...]

    // 检测为 Lambda 实现
    final d zze(zzfbe zzfbe0, zzdnb zzdnb0) [...]

    // 检测为 Lambda 实现
    final d zzf(zzfbr zzfbr0, zzfbe zzfbe0, JSONArray jSONArray0) [...]

    private final d zzg(zzfbr zzfbr0, zzfbe zzfbe0, JSONObject jSONObject0) {
        d d0 = this.zzd.zza();
        d d1 = this.zzc.zza(zzfbr0, zzfbe0, jSONObject0);
        return zzfye.zzc(new d[]{d0, d1}).zza(() -> {
            zzdic zzdic0 = (zzdic)d1.get();
            zzdnb zzdnb0 = (zzdnb)d0.get();
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzdio zzdio0 = new zzdio(zzdic0);
            zzdhb zzdhb0 = new zzdhb(jSONObject0, zzdnb0);
            zzdid zzdid0 = this.zza.zzd(zzcst0, zzdio0, zzdhb0);
            zzdid0.zzh().zzb();
            zzdid0.zzk().zza(zzdnb0);
            zzdid0.zzg().zza(zzdic0.zzs());
            zzdid0.zzl().zza(this.zze);
            return zzdid0.zza();
        }, this.zzb);
    }
}


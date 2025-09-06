package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdwn {
    private final zzchd zza;
    private final Context zzb;
    private final zzcag zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhr zzg;
    private final zzfcn zzh;
    private final zzdrc zzi;

    public zzdwn(zzchd zzchd0, Context context0, zzcag zzcag0, zzfca zzfca0, Executor executor0, String s, zzfhr zzfhr0, zzdrc zzdrc0) {
        this.zza = zzchd0;
        this.zzb = context0;
        this.zzc = zzcag0;
        this.zzd = zzfca0;
        this.zze = executor0;
        this.zzf = s;
        this.zzg = zzfhr0;
        this.zzh = zzchd0.zzw();
        this.zzi = zzdrc0;
    }

    public final d zza() {
        String s = this.zzd.zzd.zzx;
        if(!TextUtils.isEmpty(s) && ((Boolean)zzba.zzc().zzb(zzbbr.zzgP)).booleanValue()) {
            String s1 = zzdwn.zze(s);
            zzbbj zzbbj0 = zzbbr.zzhb;
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() && s1.isEmpty()) {
                int v = s.lastIndexOf("&request_id=");
                s1 = v == -1 ? "" : s.substring(v + 12);
            }
            if(TextUtils.isEmpty(s1)) {
                return zzfye.zzg(new zzehf(15, "Invalid ad string."));
            }
            String s2 = this.zza.zzn().zzb(s1, this.zzi);
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
                zzdrc zzdrc0 = this.zzi;
                if(!TextUtils.isEmpty(s2)) {
                    try {
                        if(new JSONObject(s2).optString("is_gbid").equals("true")) {
                            goto label_15;
                        }
                    }
                    catch(JSONException unused_ex) {
                    }
                    goto label_31;
                label_15:
                    int v1 = s.lastIndexOf("&");
                    String s3 = null;
                    String s4 = v1 == -1 ? null : s.substring(0, v1);
                    if(!TextUtils.isEmpty(s4)) {
                        try {
                            byte[] arr_b = Base64.decode(s4, 11);
                            byte[] arr_b1 = s1.getBytes("UTF-8");
                            try {
                                s3 = new JSONObject(s2).getString("arek");
                            }
                            catch(JSONException jSONException0) {
                                zze.zza(("Failed to get key from QueryJSONMap" + jSONException0.toString()));
                                zzt.zzo().zzu(jSONException0, "CryptoUtils.getKeyFromQueryJsonMap");
                            }
                            s = zzfcn.zzb(arr_b, arr_b1, s3, zzdrc0);
                        }
                        catch(UnsupportedEncodingException unsupportedEncodingException0) {
                            zze.zza(("Failed to decode the adResponse. " + unsupportedEncodingException0.toString()));
                            zzt.zzo().zzu(unsupportedEncodingException0, "PreloadedLoader.decryptAdResponseIfNecessary");
                        }
                    }
                }
            }
        label_31:
            if(!TextUtils.isEmpty(s2)) {
                return this.zzc(s, this.zzd(s2));
            }
        }
        zzc zzc0 = this.zzd.zzd.zzs;
        if(zzc0 != null) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzgN)).booleanValue()) {
                String s5 = zzdwn.zze(zzc0.zza);
                String s6 = zzdwn.zze(zzc0.zzb);
                if(!TextUtils.isEmpty(s6) && s5.equals(s6)) {
                    this.zza.zzn().zzf(s5);
                    this.zzi.zza().put("rid", s5);
                    goto label_44;
                }
                this.zzi.zza().put("ridmm", "true");
                return zzfye.zzg(new zzehf(14, "Mismatch request IDs."));
            }
        label_44:
            String s7 = this.zzd(zzc0.zzb);
            return this.zzc(zzc0.zza, s7);
        }
        return zzfye.zzg(new zzehf(14, "Mismatch request IDs."));
    }

    // 检测为 Lambda 实现
    final d zzb(JSONObject jSONObject0) [...]

    private final d zzc(String s, String s1) {
        zzfhg zzfhg0 = zzfhf.zza(this.zzb, 11);
        zzfhg0.zzh();
        zzfhu zzfhu0 = this.zza.zzz();
        zzbmy zzbmy0 = zzt.zzf().zza(this.zzb, this.zzc, zzfhu0).zza("google.afma.response.normalize", zzbnf.zza, zzbnf.zza);
        d d0 = zzfye.zzn(zzfye.zzn(zzfye.zzn(zzfye.zzh(""), new zzdwk(this, s, s1), this.zze), new zzdwl(zzbmy0), this.zze), (JSONObject jSONObject0) -> zzfye.zzh(new zzfbr(new zzfbo(this.zzd), zzfbq.zza(new StringReader(jSONObject0.toString())))), this.zze);
        zzfhq.zza(d0, this.zzg, zzfhg0);
        return d0;
    }

    private final String zzd(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_types");
            if(jSONArray0 != null && "unknown".equals(jSONArray0.getString(0))) {
                jSONObject0.put("ad_types", new JSONArray().put(this.zzf));
                return jSONObject0.toString();
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
        }
        zzcaa.zzj(("Failed to update the ad types for rendering. " + jSONException0.toString()));
        return s;
    }

    private static final String zze(String s) {
        try {
            return new JSONObject(s).optString("request_id", "");
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }
}


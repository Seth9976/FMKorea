package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbzd {
    private final List zza;
    private final List zzb;
    private final Map zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private final List zzi;
    private boolean zzj;

    public zzbzd(String s, long v) {
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
        this.zzc = new HashMap();
        this.zzd = "";
        this.zzh = false;
        this.zzi = new ArrayList();
        this.zzj = false;
        this.zze = s;
        this.zzf = v;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        else {
            try {
                this.zzg = new JSONObject(s);
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zzkv)).booleanValue() || !this.zzj()) {
                    if(this.zzg.optInt("status", -1) != 1) {
                        this.zzh = false;
                        zzcaa.zzj("App settings could not be fetched successfully.");
                        return;
                    }
                    this.zzh = true;
                    this.zzd = this.zzg.optString("app_id");
                    JSONArray jSONArray0 = this.zzg.optJSONArray("ad_unit_id_settings");
                    if(jSONArray0 != null) {
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v1);
                            String s1 = jSONObject0.optString("format");
                            String s2 = jSONObject0.optString("ad_unit_id");
                            if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                                if("interstitial".equalsIgnoreCase(s1)) {
                                    this.zzb.add(s2);
                                }
                                else if("rewarded".equalsIgnoreCase(s1) || "rewarded_interstitial".equals(s1)) {
                                    JSONObject jSONObject1 = jSONObject0.optJSONObject("mediation_config");
                                    if(jSONObject1 != null) {
                                        zzboa zzboa0 = new zzboa(jSONObject1);
                                        this.zzc.put(s2, zzboa0);
                                    }
                                }
                            }
                        }
                    }
                    JSONArray jSONArray1 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
                    if(jSONArray1 != null) {
                        for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                            String s3 = jSONArray1.optString(v2);
                            this.zza.add(s3);
                        }
                    }
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzgM)).booleanValue()) {
                        JSONObject jSONObject2 = this.zzg.optJSONObject("common_settings");
                        if(jSONObject2 != null) {
                            JSONArray jSONArray2 = jSONObject2.optJSONArray("loeid");
                            if(jSONArray2 != null) {
                                for(int v3 = 0; v3 < jSONArray2.length(); ++v3) {
                                    String s4 = jSONArray2.get(v3).toString();
                                    this.zzi.add(s4);
                                }
                            }
                        }
                    }
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzgh)).booleanValue()) {
                        JSONObject jSONObject3 = this.zzg.optJSONObject("common_settings");
                        if(jSONObject3 != null) {
                            this.zzj = jSONObject3.optBoolean("is_prefetching_enabled", false);
                        }
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
            }
        }
        zzcaa.zzk("Exception occurred while processing app setting json", jSONException0);
        zzt.zzo().zzu(jSONException0, "AppSettings.parseAppSettingsJson");
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long v) {
        this.zzf = v;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if(!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbbj zzbbj0 = zzbbr.zzky;
            long v = (long)(((Long)zzba.zzc().zzb(zzbbj0)));
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkx)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                v = this.zzg.optLong("cache_ttl_sec", ((long)(((Long)zzba.zzc().zzb(zzbbj0)))));
            }
            long v1 = zzt.zzB().currentTimeMillis();
            if(v >= 0L && (this.zzf > v1 || TimeUnit.MILLISECONDS.toSeconds(v1 - this.zzf) > v)) {
                this.zza.clear();
                this.zzb.clear();
                this.zzc.clear();
                this.zzd = "";
                this.zze = "";
                this.zzg = null;
                this.zzh = false;
                this.zzi.clear();
                this.zzj = false;
                return true;
            }
        }
        return false;
    }
}


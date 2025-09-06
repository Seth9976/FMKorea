package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzbnz {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzbnz(JSONObject jSONObject0) {
        this.zzb = jSONObject0.optString("id");
        JSONArray jSONArray0 = jSONObject0.getJSONArray("adapters");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arrayList0.add(jSONArray0.getString(v));
        }
        this.zzc = Collections.unmodifiableList(arrayList0);
        this.zzd = jSONObject0.optString("allocation_id", null);
        this.zzf = zzbob.zza(jSONObject0, "clickurl");
        this.zzg = zzbob.zza(jSONObject0, "imp_urls");
        this.zzh = zzbob.zza(jSONObject0, "downloaded_imp_urls");
        this.zzj = zzbob.zza(jSONObject0, "fill_urls");
        this.zzl = zzbob.zza(jSONObject0, "video_start_urls");
        this.zzn = zzbob.zza(jSONObject0, "video_complete_urls");
        this.zzm = zzbob.zza(jSONObject0, "video_reward_urls");
        this.zzo = jSONObject0.optString("transaction_id");
        this.zzp = jSONObject0.optString("valid_from_timestamp");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("ad");
        this.zzi = jSONObject1 == null ? null : zzbob.zza(jSONObject1, "manual_impression_urls");
        this.zza = jSONObject1 == null ? null : jSONObject1.toString();
        JSONObject jSONObject2 = jSONObject0.optJSONObject("data");
        this.zzk = jSONObject2 == null ? null : jSONObject2.toString();
        this.zze = jSONObject2 == null ? null : jSONObject2.optString("class_name");
        this.zzq = jSONObject0.optString("html_template", null);
        this.zzr = jSONObject0.optString("ad_base_url", null);
        JSONObject jSONObject3 = jSONObject0.optJSONObject("assets");
        this.zzs = jSONObject3 == null ? null : jSONObject3.toString();
        this.zzt = zzbob.zza(jSONObject0, "template_ids");
        JSONObject jSONObject4 = jSONObject0.optJSONObject("ad_loader_options");
        this.zzu = jSONObject4 == null ? null : jSONObject4.toString();
        this.zzv = jSONObject0.optString("response_type", null);
        jSONObject0.optLong("ad_network_timeout_millis", -1L);
    }
}


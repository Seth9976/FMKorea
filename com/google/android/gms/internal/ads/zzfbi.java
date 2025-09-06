package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbi {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfbg zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;

    zzfbi(JsonReader jsonReader0) {
        Bundle bundle1;
        List list0 = Collections.emptyList();
        Bundle bundle0 = new Bundle();
        JSONObject jSONObject0 = new JSONObject();
        jsonReader0.beginObject();
        String s = "";
        String s1 = "";
        String s2 = "";
        int v = 0;
        int v1 = 0;
        boolean z = false;
        zzfbg zzfbg0 = null;
        long v2 = 0L;
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        while(jsonReader0.hasNext()) {
            String s7 = jsonReader0.nextName();
            if("nofill_urls".equals(s7)) {
                list0 = zzbu.zzd(jsonReader0);
            }
            else if("refresh_interval".equals(s7)) {
                v = jsonReader0.nextInt();
            }
            else if("gws_query_id".equals(s7)) {
                s = jsonReader0.nextString();
            }
            else if("analytics_query_ad_event_id".equals(s7)) {
                s3 = jsonReader0.nextString();
            }
            else if("is_idless".equals(s7)) {
                z = jsonReader0.nextBoolean();
            }
            else if("response_code".equals(s7)) {
                v1 = jsonReader0.nextInt();
            }
            else if("latency".equals(s7)) {
                v2 = jsonReader0.nextLong();
            }
            else if(((Boolean)zzba.zzc().zzb(zzbbr.zzhV)).booleanValue() && "public_error".equals(s7) && jsonReader0.peek() == JsonToken.BEGIN_OBJECT) {
                zzfbg0 = new zzfbg(jsonReader0);
            }
            else if("bidding_data".equals(s7)) {
                s4 = jsonReader0.nextString();
            }
            else if(((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() && zzfbh.zza(s7, "topics_should_record_observation")) {
                jsonReader0.nextBoolean();
            }
            else if("adapter_response_replacement_key".equals(s7)) {
                s2 = jsonReader0.nextString();
            }
            else if(!"response_info_extras".equals(s7)) {
                if("adRequestPostBody".equals(s7)) {
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
                        s6 = jsonReader0.nextString();
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                    continue;
                }
                else if(!"adRequestUrl".equals(s7)) {
                    zzbbj zzbbj0 = zzbbr.zziT;
                    if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() && zzfbh.zza(s7, "adResponseBody")) {
                        s1 = jsonReader0.nextString();
                    }
                    else if(!((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() || !zzfbh.zza(s7, "adResponseHeaders")) {
                        jsonReader0.skipValue();
                    }
                    else {
                        jSONObject0 = zzbu.zzh(jsonReader0);
                    }
                }
                else if(((Boolean)zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
                    s5 = jsonReader0.nextString();
                }
                else {
                    jsonReader0.skipValue();
                }
            }
            else if(((Boolean)zzba.zzc().zzb(zzbbr.zzgI)).booleanValue()) {
                try {
                    bundle1 = zzbu.zza(zzbu.zzh(jsonReader0));
                    goto label_58;
                }
                catch(JSONException unused_ex) {
                }
                catch(IOException | IllegalStateException unused_ex) {
                    continue;
                }
                jsonReader0.skipValue();
                continue;
            label_58:
                if(bundle1 != null) {
                    bundle0 = bundle1;
                }
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        this.zza = list0;
        this.zzc = v;
        this.zzb = s;
        this.zzd = s3;
        this.zze = v1;
        this.zzf = v2;
        this.zzi = zzfbg0;
        this.zzg = z;
        this.zzh = s4;
        this.zzj = bundle0;
        this.zzk = s5;
        this.zzl = s6;
        this.zzm = s1;
        this.zzn = jSONObject0;
        this.zzo = s2;
    }
}


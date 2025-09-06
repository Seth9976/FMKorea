package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzejt {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Executor zzf;
    private JSONObject zzg;

    zzejt(Executor executor0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        this.zze = new HashMap();
        this.zzf = executor0;
    }

    public final Map zza(String s, String s1) {
        synchronized(this) {
            Map map0 = this.zzb(s, s1);
            zzfug zzfug0 = this.zzh(s1);
            Map map1 = new HashMap();
            for(Object object0: ((zzfug)map0).zzh()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s2 = (String)map$Entry0.getKey();
                if(zzfug0.containsKey(s2)) {
                    zzejx zzejx0 = (zzejx)zzfug0.get(s2);
                    List list0 = (List)map$Entry0.getValue();
                    Bundle bundle0 = list0 == null || list0.isEmpty() ? new Bundle() : ((Bundle)list0.get(0));
                    map1.put(s2, new zzejx(s2, zzejx0.zzb, zzejx0.zzc, zzejx0.zzd, bundle0));
                }
            }
            zzfwd zzfwd0 = zzfug0.zzh().zze();
            while(zzfwd0.hasNext()) {
                Object object1 = zzfwd0.next();
                Map.Entry map$Entry1 = (Map.Entry)object1;
                String s3 = (String)map$Entry1.getKey();
                if(!map1.containsKey(s3) && ((zzejx)map$Entry1.getValue()).zzd) {
                    map1.put(s3, ((zzejx)map$Entry1.getValue()));
                }
            }
            return map1;
        }
    }

    public final Map zzb(String s, String s1) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(zzt.zzo().zzh().zzh().zzc())) {
                Map map0 = (Map)this.zzc.get(s);
                if(map0 == null) {
                    return zzfug.zzd();
                }
                List list0 = (List)map0.get(s1);
                if(list0 == null) {
                    String s2 = zzdpj.zza(this.zzg, s1, s);
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzjO)).booleanValue()) {
                        s2 = s2.toLowerCase(Locale.ROOT);
                    }
                    list0 = (List)map0.get(s2);
                }
                if(list0 == null) {
                    return zzfug.zzd();
                }
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    String s3 = ((zzejv)object0).zza;
                    if(!hashMap0.containsKey(s3)) {
                        hashMap0.put(s3, new ArrayList());
                    }
                    ((List)hashMap0.get(s3)).add(((zzejv)object0).zzc);
                }
                return zzfug.zzc(hashMap0);
            }
        }
        return zzfug.zzd();
    }

    public final Map zzc() {
        synchronized(this) {
            return TextUtils.isEmpty(zzt.zzo().zzh().zzh().zzc()) ? zzfug.zzd() : zzfug.zzc(this.zzb);
        }
    }

    // 检测为 Lambda 实现
    public static void zzd(zzejt zzejt0) [...]

    public final void zze() {
        zzt.zzo().zzh().zzq(() -> {
            zzejs zzejs0 = () -> this.zzj();
            this.zzf.execute(zzejs0);
        });
        zzejs zzejs0 = () -> this.zzj();
        this.zzf.execute(zzejs0);
    }

    // 检测为 Lambda 实现
    final void zzf() [...]

    public final void zzg(String s) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(this.zza.containsKey(s)) {
                return;
            }
            zzejv zzejv0 = new zzejv(s, "", new Bundle());
            this.zza.put(s, zzejv0);
        }
    }

    private final zzfug zzh(String s) {
        HashMap hashMap0;
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(zzt.zzo().zzh().zzh().zzc())) {
                boolean z = Pattern.matches(((String)zzba.zzc().zzb(zzbbr.zzcS)), s);
                boolean z1 = Pattern.matches(((String)zzba.zzc().zzb(zzbbr.zzcT)), s);
                if(z) {
                    hashMap0 = new HashMap(this.zze);
                }
                else if(z1) {
                    hashMap0 = new HashMap(this.zzd);
                }
                else {
                    return zzfug.zzd();
                }
                return zzfug.zzc(hashMap0);
            }
        }
        return zzfug.zzd();
    }

    private final List zzi(JSONObject jSONObject0, String s) {
        synchronized(this) {
            List list0 = new ArrayList();
            if(jSONObject0 == null) {
                return list0;
            }
            Bundle bundle0 = zzejt.zzo(jSONObject0.optJSONObject("data"));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("rtb_adapters");
            if(jSONArray0 == null) {
                return list0;
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                String s1 = jSONArray0.optString(v2, "");
                if(!TextUtils.isEmpty(s1)) {
                    arrayList0.add(s1);
                }
            }
            int v3 = arrayList0.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                String s2 = (String)arrayList0.get(v1);
                this.zzg(s2);
                if(((zzejv)this.zza.get(s2)) != null) {
                    list0.add(new zzejv(s2, s, bundle0));
                }
            }
            return list0;
        }
    }

    private final void zzj() {
        synchronized(this) {
            this.zzb.clear();
            this.zza.clear();
            this.zze.clear();
            this.zzd.clear();
            this.zzm();
            this.zzn();
            this.zzk();
        }
    }

    private final void zzk() {
        synchronized(this) {
            if(!((Boolean)zzbdp.zzb.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzbJ)).booleanValue()) {
                JSONObject jSONObject0 = zzt.zzo().zzh().zzh().zzf();
                if(jSONObject0 == null) {
                    return;
                }
                try {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("adapter_settings");
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        String s = jSONObject1.optString("adapter_class_name");
                        JSONArray jSONArray1 = jSONObject1.optJSONArray("permission_set");
                        if(!TextUtils.isEmpty(s)) {
                            for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                                JSONObject jSONObject2 = jSONArray1.getJSONObject(v2);
                                boolean z = jSONObject2.optBoolean("enable_rendering", false);
                                boolean z1 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean z2 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String s1 = jSONObject2.optString("platform");
                                zzejx zzejx0 = new zzejx(s, z1, z, z2, new Bundle());
                                if(s1.equals("ADMOB")) {
                                    this.zzd.put(s, zzejx0);
                                }
                                else if(s1.equals("AD_MANAGER")) {
                                    this.zze.put(s, zzejx0);
                                }
                            }
                        }
                    }
                    return;
                }
                catch(JSONException jSONException0) {
                }
                zze.zzb("Malformed config loading JSON.", jSONException0);
            }
        }
    }

    private final void zzl(String s, String s1, List list0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                Map map0 = (Map)this.zzc.get(s);
                if(map0 == null) {
                    map0 = new HashMap();
                }
                this.zzc.put(s, map0);
                List list1 = (List)map0.get(s1);
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.addAll(list0);
                map0.put(s1, list1);
            }
        }
    }

    private final void zzm() {
        synchronized(this) {
            JSONObject jSONObject0 = zzt.zzo().zzh().zzh().zzf();
            if(jSONObject0 != null) {
                try {
                    JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObject0.optJSONObject("ad_unit_patterns");
                    if(jSONArray0 != null) {
                        for(int v1 = 0; true; ++v1) {
                            if(v1 >= jSONArray0.length()) {
                                break;
                            }
                            JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                            String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzjO)).booleanValue() ? jSONObject1.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject1.optString("ad_unit_id", "");
                            String s1 = jSONObject1.optString("format", "");
                            ArrayList arrayList0 = new ArrayList();
                            JSONObject jSONObject2 = jSONObject1.optJSONObject("mediation_config");
                            if(jSONObject2 != null) {
                                JSONArray jSONArray1 = jSONObject2.optJSONArray("ad_networks");
                                if(jSONArray1 != null) {
                                    for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                                        arrayList0.addAll(this.zzi(jSONArray1.getJSONObject(v2), s1));
                                    }
                                }
                            }
                            this.zzl(s1, s, arrayList0);
                        }
                    }
                    return;
                }
                catch(JSONException jSONException0) {
                }
                zze.zzb("Malformed config loading JSON.", jSONException0);
            }
        }
    }

    private final void zzn() {
        synchronized(this) {
            if(!((Boolean)zzbdp.zzg.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzbI)).booleanValue()) {
                JSONObject jSONObject0 = zzt.zzo().zzh().zzh().zzf();
                if(jSONObject0 == null) {
                    return;
                }
                try {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("signal_adapters");
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        Bundle bundle0 = zzejt.zzo(jSONObject1.optJSONObject("data"));
                        String s = jSONObject1.optString("adapter_class_name");
                        boolean z = jSONObject1.optBoolean("render", false);
                        boolean z1 = jSONObject1.optBoolean("collect_signals", false);
                        if(!TextUtils.isEmpty(s)) {
                            zzejx zzejx0 = new zzejx(s, z1, z, true, bundle0);
                            this.zzb.put(s, zzejx0);
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    zze.zzb("Malformed config loading JSON.", jSONException0);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject0) {
        Bundle bundle0 = new Bundle();
        if(jSONObject0 != null) {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                bundle0.putString(((String)object0), jSONObject0.optString(((String)object0), ""));
            }
        }
        return bundle0;
    }
}


package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdph {
    private final Map zza;
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdph(Executor executor0) {
        this.zza = new ConcurrentHashMap();
        this.zzc = executor0;
    }

    public final JSONObject zza() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzdP)).booleanValue() ? this.zzb : null;
    }

    public final JSONObject zzb(String s, String s1) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzdO)).booleanValue()) {
            return null;
        }
        if(s != null && s1 != null) {
            if(!this.zzd) {
                this.zzg();
            }
            Map map0 = (Map)this.zza.get(s1);
            if(map0 == null) {
                return null;
            }
            JSONObject jSONObject0 = (JSONObject)map0.get(s);
            if(jSONObject0 != null) {
                return jSONObject0;
            }
            String s2 = zzdpj.zza(this.zze, s, s1);
            return s2 == null ? null : ((JSONObject)map0.get(s2));
        }
        return null;
    }

    public final void zzc() {
        zzt.zzo().zzh().zzq(() -> {
            zzdpg zzdpg0 = () -> this.zzg();
            this.zzc.execute(zzdpg0);
        });
        zzdpf zzdpf0 = () -> this.zzg();
        this.zzc.execute(zzdpf0);
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    // 检测为 Lambda 实现
    final void zze() [...]

    // 检测为 Lambda 实现
    final void zzf() [...]

    private final void zzg() {
        Map map0;
        synchronized(this) {
            this.zzd = true;
            zzbzd zzbzd0 = zzt.zzo().zzh().zzh();
            if(zzbzd0 == null) {
                return;
            }
            JSONObject jSONObject0 = zzbzd0.zzf();
            if(jSONObject0 == null) {
                return;
            }
            this.zzb = ((Boolean)zzba.zzc().zzb(zzbbr.zzdP)).booleanValue() ? jSONObject0.optJSONObject("common_settings") : null;
            this.zze = jSONObject0.optJSONObject("ad_unit_patterns");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
            if(jSONArray0 != null) {
                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 != null) {
                        String s = jSONObject1.optString("ad_unit_id");
                        String s1 = jSONObject1.optString("format");
                        JSONObject jSONObject2 = jSONObject1.optJSONObject("request_signals");
                        if(s != null && jSONObject2 != null && s1 != null) {
                            if(this.zza.containsKey(s1)) {
                                map0 = (Map)this.zza.get(s1);
                            }
                            else {
                                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                                this.zza.put(s1, concurrentHashMap0);
                                map0 = concurrentHashMap0;
                            }
                            map0.put(s, jSONObject2);
                        }
                    }
                }
            }
        }
    }
}


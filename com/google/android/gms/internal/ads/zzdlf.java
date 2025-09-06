package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdlf {
    private final Context zza;
    private final zzdko zzb;
    private final zzaqx zzc;
    private final zzcag zzd;
    private final zza zze;
    private final zzaxe zzf;
    private final Executor zzg;
    private final zzbek zzh;
    private final zzdlx zzi;
    private final zzdom zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnh zzl;
    private final zzdrh zzm;
    private final zzfgo zzn;
    private final zzfik zzo;
    private final zzech zzp;
    private final zzecs zzq;

    public zzdlf(Context context0, zzdko zzdko0, zzaqx zzaqx0, zzcag zzcag0, zza zza0, zzaxe zzaxe0, Executor executor0, zzfca zzfca0, zzdlx zzdlx0, zzdom zzdom0, ScheduledExecutorService scheduledExecutorService0, zzdrh zzdrh0, zzfgo zzfgo0, zzfik zzfik0, zzech zzech0, zzdnh zzdnh0, zzecs zzecs0) {
        this.zza = context0;
        this.zzb = zzdko0;
        this.zzc = zzaqx0;
        this.zzd = zzcag0;
        this.zze = zza0;
        this.zzf = zzaxe0;
        this.zzg = executor0;
        this.zzh = zzfca0.zzi;
        this.zzi = zzdlx0;
        this.zzj = zzdom0;
        this.zzk = scheduledExecutorService0;
        this.zzm = zzdrh0;
        this.zzn = zzfgo0;
        this.zzo = zzfik0;
        this.zzp = zzech0;
        this.zzl = zzdnh0;
        this.zzq = zzecs0;
    }

    // 检测为 Lambda 实现
    final zzbef zza(JSONObject jSONObject0, List list0) [...]

    // 检测为 Lambda 实现
    final d zzb(zzq zzq0, zzfbe zzfbe0, zzfbi zzfbi0, String s, String s1, Object object0) [...]

    final d zzc(String s, Object object0) {
        zzcgx zzcgx0 = zzcgx.zza();
        zzcfi zzcfi0 = zzcfu.zza(this.zza, zzcgx0, "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        d d0 = zzcar.zza(zzcfi0);
        zzcfi0.zzN().zzA(new zzdkv(((zzcar)d0)));
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeU)).booleanValue()) {
            zzcfi0.loadData(Base64.encodeToString(s.getBytes(), 1), "text/html", "base64");
            return d0;
        }
        zzcfi0.loadData(s, "text/html", "UTF-8");
        return d0;
    }

    public final d zzd(JSONObject jSONObject0, String s) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("attribution");
        if(jSONObject1 == null) {
            return zzfye.zzh(null);
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("images");
        JSONObject jSONObject2 = jSONObject1.optJSONObject("image");
        if(jSONArray0 == null && jSONObject2 != null) {
            jSONArray0 = new JSONArray();
            jSONArray0.put(jSONObject2);
        }
        d d0 = zzfye.zzm(this.zzo(jSONArray0, false, true), (List list0) -> {
            zzbef zzbef0 = null;
            if(list0 != null && !list0.isEmpty()) {
                String s = jSONObject1.optString("text");
                Integer integer0 = zzdlf.zzq(jSONObject1, "bg_color");
                Integer integer1 = zzdlf.zzq(jSONObject1, "text_color");
                int v = jSONObject1.optInt("text_size", -1);
                boolean z = jSONObject1.optBoolean("allow_pub_rendering");
                int v1 = jSONObject1.optInt("animation_ms", 1000);
                int v2 = jSONObject1.optInt("presentation_ms", 4000);
                if(v > 0) {
                    zzbef0 = v;
                }
                return new zzbef(s, list0, integer0, integer1, ((Integer)zzbef0), v2 + v1, this.zzh.zze, z);
            }
            return null;
        }, this.zzg);
        return zzdlf.zzm(jSONObject1.optBoolean("require"), d0, null);
    }

    public final d zze(JSONObject jSONObject0, String s) {
        return this.zzn(jSONObject0.optJSONObject(s), this.zzh.zzb);
    }

    public final d zzf(JSONObject jSONObject0, String s) {
        return this.zzo(jSONObject0.optJSONArray("images"), this.zzh.zzb, this.zzh.zzd);
    }

    public final d zzg(JSONObject jSONObject0, String s, zzfbe zzfbe0, zzfbi zzfbi0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjn)).booleanValue()) {
            return zzfye.zzh(null);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("images");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(0);
            if(jSONObject1 == null) {
                return zzfye.zzh(null);
            }
            String s1 = jSONObject1.optString("base_url");
            String s2 = jSONObject1.optString("html");
            zzq zzq0 = this.zzk(jSONObject1.optInt("width", 0), jSONObject1.optInt("height", 0));
            if(TextUtils.isEmpty(s2)) {
                return zzfye.zzh(null);
            }
            d d0 = zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
                zzcfi zzcfi0 = this.zzj.zza(zzq0, zzfbe0, zzfbi0);
                d d0 = zzcar.zza(zzcfi0);
                zzdne zzdne0 = this.zzl.zzb();
                zzcfi0.zzN().zzM(zzdne0, zzdne0, zzdne0, zzdne0, zzdne0, false, null, new zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzdne0, null, null, null);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
                    zzcfi0.zzad("/getNativeAdViewSignals", zzbiq.zzs);
                }
                zzcfi0.zzad("/getNativeClickMeta", zzbiq.zzt);
                zzcfi0.zzN().zzA(new zzdkz(((zzcar)d0)));
                zzcfi0.zzab(s1, s2, null);
                return d0;
            }, zzcan.zze);
            return zzfye.zzn(d0, new zzdky(d0), zzcan.zzf);
        }
        return zzfye.zzh(null);
    }

    public final d zzh(JSONObject jSONObject0, zzfbe zzfbe0, zzfbi zzfbi0) {
        JSONObject jSONObject1 = zzbu.zzg(jSONObject0, new String[]{"html_containers", "instream"});
        if(jSONObject1 == null) {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("video");
            if(jSONObject2 == null) {
                return zzfye.zzh(null);
            }
            String s = jSONObject2.optString("vast_xml");
            boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zzjm)).booleanValue() && jSONObject2.has("html");
            if(TextUtils.isEmpty(s)) {
                if(!z) {
                    zzcaa.zzj("Required field \'vast_xml\' or \'html\' is missing");
                    return zzfye.zzh(null);
                }
                return zzdlf.zzl(zzfye.zzo(this.zzp(jSONObject2, zzfbe0, zzfbi0), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzdC)))))), TimeUnit.SECONDS, this.zzk), null);
            }
            return z ? zzdlf.zzl(zzfye.zzo(this.zzp(jSONObject2, zzfbe0, zzfbi0), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzdC)))))), TimeUnit.SECONDS, this.zzk), null) : zzdlf.zzl(zzfye.zzo(this.zzi.zza(jSONObject2), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzdC)))))), TimeUnit.SECONDS, this.zzk), null);
        }
        return this.zzp(jSONObject1, zzfbe0, zzfbi0);
    }

    public static final zzel zzi(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject1.optJSONObject("default_reason");
        return jSONObject2 == null ? null : zzdlf.zzr(jSONObject2);
    }

    public static final List zzj(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 == null) {
            return zzfud.zzl();
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("reasons");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                zzel zzel0 = zzdlf.zzr(jSONArray0.optJSONObject(v));
                if(zzel0 != null) {
                    arrayList0.add(zzel0);
                }
            }
            return zzfud.zzj(arrayList0);
        }
        return zzfud.zzl();
    }

    private final zzq zzk(int v, int v1) {
        if(v == 0) {
            if(v1 != 0) {
                v = 0;
                goto label_5;
            }
            return zzq.zzc();
        }
    label_5:
        AdSize adSize0 = new AdSize(v, v1);
        return new zzq(this.zza, adSize0);
    }

    private static d zzl(d d0, Object object0) {
        zzdlc zzdlc0 = new zzdlc(null);
        return zzfye.zzf(d0, Exception.class, zzdlc0, zzcan.zzf);
    }

    // 去混淆评级： 低(20)
    private static d zzm(boolean z, d d0, Object object0) {
        return z ? zzfye.zzn(d0, new zzdla(d0), zzcan.zzf) : zzdlf.zzl(d0, null);
    }

    private final d zzn(JSONObject jSONObject0, boolean z) {
        if(jSONObject0 == null) {
            return zzfye.zzh(null);
        }
        String s = jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            return zzfye.zzh(null);
        }
        double f = jSONObject0.optDouble("scale", 1.0);
        boolean z1 = jSONObject0.optBoolean("is_transparent", true);
        int v = jSONObject0.optInt("width", -1);
        int v1 = jSONObject0.optInt("height", -1);
        if(z) {
            return zzfye.zzh(new zzbei(null, Uri.parse(s), f, v, v1));
        }
        d d0 = zzfye.zzm(this.zzb.zzb(s, f, z1), new zzdld(s, f, v, v1), this.zzg);
        return zzdlf.zzm(jSONObject0.optBoolean("require"), d0, null);
    }

    private final d zzo(JSONArray jSONArray0, boolean z, boolean z1) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            int v = z1 ? jSONArray0.length() : 1;
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(this.zzn(jSONArray0.optJSONObject(v1), z));
            }
            return zzfye.zzm(zzfye.zzd(arrayList0), zzdlb.zza, this.zzg);
        }
        return zzfye.zzh(Collections.emptyList());
    }

    private final d zzp(JSONObject jSONObject0, zzfbe zzfbe0, zzfbi zzfbi0) {
        String s = jSONObject0.optString("base_url");
        String s1 = jSONObject0.optString("html");
        zzq zzq0 = this.zzk(jSONObject0.optInt("width", 0), jSONObject0.optInt("height", 0));
        d d0 = this.zzi.zzb(s, s1, zzfbe0, zzfbi0, zzq0);
        return zzfye.zzn(d0, new zzdle(d0), zzcan.zzf);
    }

    private static Integer zzq(JSONObject jSONObject0, String s) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
            return Color.rgb(jSONObject1.getInt("r"), jSONObject1.getInt("g"), jSONObject1.getInt("b"));
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    private static final zzel zzr(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        String s = jSONObject0.optString("reason");
        String s1 = jSONObject0.optString("ping_url");
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? null : new zzel(s, s1);
    }
}


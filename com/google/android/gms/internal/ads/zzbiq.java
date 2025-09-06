package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbiq {
    public static final zzbir zzA;
    public static final zzbir zzB;
    public static final zzbir zzC;
    public static final zzbir zza;
    public static final zzbir zzb;
    public static final zzbir zzc;
    public static final zzbir zzd;
    public static final zzbir zze;
    public static final zzbir zzf;
    public static final zzbir zzg;
    public static final zzbir zzh;
    public static final zzbir zzi;
    public static final zzbir zzj;
    public static final zzbir zzk;
    public static final zzbir zzl;
    public static final zzbir zzm;
    public static final zzbir zzn;
    public static final zzbjg zzo;
    public static final zzbir zzp;
    public static final zzbir zzq;
    public static final zzbir zzr;
    public static final zzbir zzs;
    public static final zzbir zzt;
    public static final zzbir zzu;
    public static final zzbir zzv;
    public static final zzbir zzw;
    public static final zzbir zzx;
    public static final zzbir zzy;
    public static final zzbir zzz;

    static {
        zzbiq.zza = zzbhs.zza;
        zzbiq.zzb = zzbhu.zza;
        zzbiq.zzc = (zzcgj zzcgj0, Map map0) -> {
            Intent intent0;
            JSONObject jSONObject2;
            JSONArray jSONArray0;
            JSONObject jSONObject0;
            PackageManager packageManager0 = zzcgj0.getContext().getPackageManager();
            String s = (String)map0.get("data");
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
                ((zzbll)zzcgj0).zze("openableIntents", new JSONObject());
                return;
            }
            try {
                jSONArray0 = jSONObject0.getJSONArray("intents");
            }
            catch(JSONException unused_ex) {
                ((zzbll)zzcgj0).zze("openableIntents", new JSONObject());
                return;
            }
            JSONObject jSONObject1 = new JSONObject();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    jSONObject2 = jSONArray0.getJSONObject(v);
                }
                catch(JSONException jSONException0) {
                    zzcaa.zzh("Error parsing the intent data.", jSONException0);
                    continue;
                }
                String s1 = jSONObject2.optString("id");
                String s2 = jSONObject2.optString("u");
                String s3 = jSONObject2.optString("i");
                String s4 = jSONObject2.optString("m");
                String s5 = jSONObject2.optString("p");
                String s6 = jSONObject2.optString("c");
                String s7 = jSONObject2.optString("intent_url");
                ResolveInfo resolveInfo0 = null;
                if(TextUtils.isEmpty(s7)) {
                    intent0 = null;
                }
                else {
                    try {
                        intent0 = Intent.parseUri(s7, 0);
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        zzcaa.zzh(("Error parsing the url: " + s7), uRISyntaxException0);
                        intent0 = null;
                    }
                }
                boolean z = true;
                if(intent0 == null) {
                    intent0 = new Intent();
                    if(!TextUtils.isEmpty(s2)) {
                        intent0.setData(Uri.parse(s2));
                    }
                    if(!TextUtils.isEmpty(s3)) {
                        intent0.setAction(s3);
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        intent0.setType(s4);
                    }
                    if(!TextUtils.isEmpty(s5)) {
                        intent0.setPackage(s5);
                    }
                    if(!TextUtils.isEmpty(s6)) {
                        String[] arr_s = s6.split("/", 2);
                        if(arr_s.length == 2) {
                            intent0.setComponent(new ComponentName(arr_s[0], arr_s[1]));
                        }
                    }
                }
                try {
                    resolveInfo0 = packageManager0.resolveActivity(intent0, 0x10000);
                }
                catch(NullPointerException nullPointerException0) {
                    zzt.zzo().zzu(nullPointerException0, intent0.toString());
                }
                if(resolveInfo0 == null) {
                    z = false;
                }
                try {
                    jSONObject1.put(s1, z);
                }
                catch(JSONException jSONException1) {
                    zzcaa.zzh("Error constructing openable urls response.", jSONException1);
                }
            }
            ((zzbll)zzcgj0).zze("openableIntents", jSONObject1);
        };
        zzbiq.zzd = new zzbii();
        zzbiq.zze = new zzbij();
        zzbiq.zzf = zzbhq.zza;
        zzbiq.zzg = new zzbik();
        zzbiq.zzh = new zzbil();
        zzbiq.zzi = zzbhp.zza;
        zzbiq.zzj = new zzbim();
        zzbiq.zzk = new zzbin();
        zzbiq.zzl = new zzcdi();
        zzbiq.zzm = new zzcdj();
        zzbiq.zzn = new zzbhk();
        zzbiq.zzo = new zzbjg();
        zzbiq.zzp = new zzbio();
        zzbiq.zzq = new zzbip();
        zzbiq.zzr = new zzbhv();
        zzbiq.zzs = new zzbhw();
        zzbiq.zzt = new zzbhx();
        zzbiq.zzu = new zzbhy();
        zzbiq.zzv = new zzbhz();
        zzbiq.zzw = new zzbia();
        zzbiq.zzx = new zzbib();
        zzbiq.zzy = new zzbic();
        zzbiq.zzz = new zzbid();
        zzbiq.zzA = new zzbie();
        zzbiq.zzB = new zzbig();
        zzbiq.zzC = new zzbih();
    }

    public static d zza(zzcfi zzcfi0, String s) {
        Uri uri0 = Uri.parse(s);
        try {
            zzaqx zzaqx0 = zzcfi0.zzI();
            if(zzaqx0 != null && zzaqx0.zzf(uri0)) {
                uri0 = zzaqx0.zza(uri0, zzcfi0.getContext(), zzcfi0.zzF(), zzcfi0.zzi());
            }
        }
        catch(zzaqy unused_ex) {
            zzcaa.zzj(("Unable to append parameter to URL: " + s));
        }
        String s1 = zzbyh.zzb(uri0, zzcfi0.getContext());
        long v = (long)(((Long)zzbdj.zze.zze()));
        if(v > 0L && v <= 233012802L) {
            d d0 = zzfye.zzm(zzfye.zze(zzfxv.zzu(zzcfi0.zzR()), Throwable.class, zzbhm.zza, zzcan.zzf), new zzbhn(s1), zzcan.zzf);
            zzbho zzbho0 = new zzbho(s1);
            return zzfye.zze(d0, Throwable.class, zzbho0, zzcan.zzf);
        }
        return zzfye.zzh(s1);
    }

    // 检测为 Lambda 实现
    static void zzb(zzcgj zzcgj0, Map map0) [...]

    public static void zzc(Map map0, zzddw zzddw0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjK)).booleanValue() && map0.containsKey("sc") && ((String)map0.get("sc")).equals("1") && zzddw0 != null) {
            zzddw0.zzbK();
        }
    }
}


package com.google.android.gms.ads.internal.util;

import Z1.d;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzj implements zzg {
    private boolean zzA;
    private String zzB;
    private int zzC;
    private int zzD;
    private long zzE;
    private final Object zza;
    private boolean zzb;
    private final List zzc;
    private d zzd;
    private zzave zze;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private boolean zzh;
    private String zzi;
    private String zzj;
    private boolean zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private int zzo;
    private zzbzd zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private Set zzu;
    private JSONObject zzv;
    private boolean zzw;
    private boolean zzx;
    private String zzy;
    private String zzz;

    public zzj() {
        this.zza = new Object();
        this.zzc = new ArrayList();
        this.zze = null;
        this.zzh = true;
        this.zzk = true;
        this.zzl = "-1";
        this.zzm = "-1";
        this.zzn = "-1";
        this.zzo = -1;
        this.zzp = new zzbzd("", 0L);
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = Collections.emptySet();
        this.zzv = new JSONObject();
        this.zzw = true;
        this.zzx = true;
        this.zzy = null;
        this.zzz = "";
        this.zzA = false;
        this.zzB = "";
        this.zzC = -1;
        this.zzD = -1;
        this.zzE = 0L;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String s) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
            return;
        }
        this.zzT();
        synchronized(this.zza) {
            if(this.zzB.equals(s)) {
                return;
            }
            this.zzB = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("linked_ad_unit", s);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
            return;
        }
        this.zzT();
        synchronized(this.zza) {
            if(this.zzA == z) {
                return;
            }
            this.zzA = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("linked_device", z);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String s) {
        this.zzT();
        synchronized(this.zza) {
            if(TextUtils.equals(this.zzy, s)) {
                return;
            }
            this.zzy = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("display_cutout", s);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzr == v) {
                return;
            }
            this.zzr = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("first_ad_req_time_ms", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int v) {
        this.zzT();
        synchronized(this.zza) {
            this.zzo = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                if(v == -1) {
                    sharedPreferences$Editor0.remove("gad_has_consent_for_cookies");
                }
                else {
                    sharedPreferences$Editor0.putInt("gad_has_consent_for_cookies", v);
                }
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String s, String s1) {
        this.zzT();
        synchronized(this.zza) {
            switch(s) {
                case "IABTCF_PurposeConsents": {
                    this.zzn = s1;
                    break;
                }
                case "IABTCF_TCString": {
                    this.zzm = s1;
                    break;
                }
                case "IABTCF_gdprApplies": {
                    this.zzl = s1;
                    break;
                }
                default: {
                    return;
                }
            }
            if(this.zzg != null) {
                if(s1.equals("-1")) {
                    this.zzg.remove(s);
                }
                else {
                    this.zzg.putString(s, s1);
                }
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String s) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
            return;
        }
        this.zzT();
        synchronized(this.zza) {
            if(this.zzz.equals(s)) {
                return;
            }
            this.zzz = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("inspector_info", s);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        this.zzT();
        synchronized(this.zza) {
            if(z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean z) {
        this.zzT();
        synchronized(this.zza) {
            long v1 = System.currentTimeMillis();
            long v2 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzjy)));
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", v1 + v2);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(String s, String s1, boolean z) {
        this.zzT();
        synchronized(this.zza) {
            JSONArray jSONArray0 = this.zzv.optJSONArray(s);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
            int v1 = jSONArray0.length();
            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v2);
                if(jSONObject0 == null) {
                    return;
                }
                if(s1.equals(jSONObject0.optString("template_id"))) {
                    if(z && jSONObject0.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    v1 = v2;
                    break;
                }
            }
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("template_id", s1);
                jSONObject1.put("uses_media_view", z);
                jSONObject1.put("timestamp_ms", zzt.zzB().currentTimeMillis());
                jSONArray0.put(v1, jSONObject1);
                this.zzv.put(s, jSONArray0);
            }
            catch(JSONException jSONException0) {
                zzcaa.zzk("Could not update native advanced settings", jSONException0);
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzs == v) {
                return;
            }
            this.zzs = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("request_in_session_count", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(int v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzD == v) {
                return;
            }
            this.zzD = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("sd_app_measure_npa", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(long v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzE == v) {
                return;
            }
            this.zzE = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("sd_app_measure_npa_ts", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzw;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzx;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzA;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzau)).booleanValue()) {
            return false;
        }
        this.zzT();
        return this.zzk;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
        this.zzT();
        synchronized(this.zza) {
            SharedPreferences sharedPreferences0 = this.zzf;
            boolean z = false;
            if(sharedPreferences0 == null) {
                return false;
            }
            if(sharedPreferences0.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if(this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z = true;
            }
            return z;
        }
    }

    // 检测为 Lambda 实现
    final void zzS(Context context0, String s) [...]

    private final void zzT() {
        d d0 = this.zzd;
        if(d0 == null) {
            return;
        }
        if(d0.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            zzcaa.zzk("Interrupted while waiting for preferences loaded.", interruptedException0);
        }
        catch(CancellationException | ExecutionException | TimeoutException cancellationException0) {
            zzcaa.zzh("Fail to initialize AdSharedPreferenceManager.", cancellationException0);
        }
    }

    private final void zzU() {
        zzi zzi0 = () -> {
            if(!this.zzb) {
                return null;
            }
            if(this.zzN() && this.zzO()) {
                return null;
            }
            if(!((Boolean)zzbdc.zzb.zze()).booleanValue()) {
                return null;
            }
            synchronized(this.zza) {
                if(Looper.getMainLooper() == null) {
                    return null;
                }
                if(this.zze == null) {
                    this.zze = new zzave();
                }
                this.zze.zze();
                zzcaa.zzi("start fetching content...");
                return this.zze;
            }
        };
        zzcan.zza.execute(zzi0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzo;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzs;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzq;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzr;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzE;
    }

    // 检测为 Lambda 实现
    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzave zzg() [...]

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzbzd zzh() {
        this.zzT();
        synchronized(this.zza) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkw)).booleanValue() && this.zzp.zzj()) {
                for(Object object1: this.zzc) {
                    ((Runnable)object1).run();
                }
            }
            return this.zzp;
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzbzd zzi() {
        synchronized(this.zza) {
        }
        return this.zzp;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzj;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzB;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzy;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String s) {
        this.zzT();
        Object object0 = this.zza;
        __monitor_enter(object0);
        switch(s) {
            case "IABTCF_PurposeConsents": {
                __monitor_exit(object0);
                return this.zzn;
            }
            case "IABTCF_TCString": {
                __monitor_exit(object0);
                return this.zzm;
            }
            case "IABTCF_gdprApplies": {
                __monitor_exit(object0);
                return this.zzl;
            }
            default: {
                __monitor_exit(object0);
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzz;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        this.zzT();
        synchronized(this.zza) {
        }
        return this.zzv;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable0) {
        this.zzc.add(runnable0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Context context0) {
        synchronized(this.zza) {
            if(this.zzf != null) {
                return;
            }
        }
        zzh zzh0 = () -> {
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob", 0);
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            synchronized(this.zza) {
                this.zzf = sharedPreferences0;
                this.zzg = sharedPreferences$Editor0;
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
                this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
                this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                this.zzt = this.zzf.getInt("version_code", this.zzt);
                this.zzp = new zzbzd(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
                this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
                this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
                this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
                this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
                this.zzy = this.zzf.getString("display_cutout", this.zzy);
                this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
                this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
                this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
                this.zzz = this.zzf.getString("inspector_info", this.zzz);
                this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
                this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
                this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
                this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
                this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
                this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
                try {
                    this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                }
                catch(JSONException jSONException0) {
                    zzcaa.zzk("Could not convert native advanced settings to json object", jSONException0);
                }
                this.zzU();
            }
        };
        this.zzd = zzcan.zza.zza(zzh0);
        this.zzb = true;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        this.zzT();
        synchronized(this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.remove("native_advanced_settings");
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzq == v) {
                return;
            }
            this.zzq = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("app_last_background_time_ms", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String s) {
        this.zzT();
        synchronized(this.zza) {
            long v1 = zzt.zzB().currentTimeMillis();
            if(s != null && !s.equals(this.zzp.zzc())) {
                this.zzp = new zzbzd(s, v1);
                SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
                if(sharedPreferences$Editor0 != null) {
                    sharedPreferences$Editor0.putString("app_settings_json", s);
                    this.zzg.putLong("app_settings_last_update_ms", v1);
                    this.zzg.apply();
                }
                this.zzU();
                for(Object object1: this.zzc) {
                    ((Runnable)object1).run();
                }
                return;
            }
            this.zzp.zzg(v1);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int v) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzt == v) {
                return;
            }
            this.zzt = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("version_code", v);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String s) {
        this.zzT();
        synchronized(this.zza) {
            if(s.equals(this.zzi)) {
                return;
            }
            this.zzi = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("content_url_hashes", s);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzw == z) {
                return;
            }
            this.zzw = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String s) {
        this.zzT();
        synchronized(this.zza) {
            if(s.equals(this.zzj)) {
                return;
            }
            this.zzj = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("content_vertical_hashes", s);
                this.zzg.apply();
            }
            this.zzU();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        this.zzT();
        synchronized(this.zza) {
            if(this.zzx == z) {
                return;
            }
            this.zzx = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            this.zzU();
        }
    }
}


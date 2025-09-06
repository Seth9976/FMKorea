package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdue implements zzdtp, zzdvc {
    private final zzdum zza;
    private final zzdvd zzb;
    private final zzdtq zzc;
    private final zzdtz zzd;
    private final zzdto zze;
    private final zzduy zzf;
    private final String zzg;
    private final String zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private String zzl;
    private JSONObject zzm;
    private long zzn;
    private zzdua zzo;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private zzdud zzs;
    private long zzt;

    zzdue(zzdum zzdum0, zzdvd zzdvd0, zzdtq zzdtq0, Context context0, zzcag zzcag0, zzdtz zzdtz0, zzduy zzduy0, String s) {
        this.zzi = new HashMap();
        this.zzj = new HashMap();
        this.zzk = new HashMap();
        this.zzl = "{}";
        this.zzn = 0x7FFFFFFFFFFFFFFFL;
        this.zzo = zzdua.zza;
        this.zzs = zzdud.zza;
        this.zzt = 0L;
        this.zza = zzdum0;
        this.zzb = zzdvd0;
        this.zzc = zzdtq0;
        this.zze = new zzdto(context0);
        this.zzg = zzcag0.zza;
        this.zzh = s;
        this.zzd = zzdtz0;
        this.zzf = zzduy0;
        zzt.zzs().zzg(this);
    }

    public final zzdua zza() {
        return this.zzo;
    }

    public final d zzb(String s) {
        synchronized(this) {
            d d0 = new zzcas();
            if(this.zzj.containsKey(s)) {
                ((zzcas)d0).zzc(((zzdts)this.zzj.get(s)));
            }
            else {
                if(!this.zzk.containsKey(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    this.zzk.put(s, arrayList0);
                }
                ((List)this.zzk.get(s)).add(d0);
            }
            return d0;
        }
    }

    public final String zzc() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && this.zzp()) {
                if(this.zzn < zzt.zzB().currentTimeMillis() / 1000L) {
                    this.zzl = "{}";
                    this.zzn = 0x7FFFFFFFFFFFFFFFL;
                    return "";
                }
                return this.zzl.equals("{}") ? "" : this.zzl;
            }
            return "";
        }
    }

    public final String zzd() {
        JSONObject jSONObject0;
        synchronized(this) {
            jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("isTestMode", this.zzp);
                jSONObject0.put("gesture", this.zzo);
                if(this.zzn > zzt.zzB().currentTimeMillis() / 1000L) {
                    jSONObject0.put("networkExtras", this.zzl);
                    jSONObject0.put("networkExtrasExpirationSecs", this.zzn);
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        return jSONObject0.toString();
    }

    public final JSONObject zze() {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("platform", "ANDROID");
                if(!TextUtils.isEmpty(this.zzh)) {
                    jSONObject0.put("sdkVersion", "afma-sdk-a-v" + this.zzh);
                }
                jSONObject0.put("internalSdkVersion", this.zzg);
                jSONObject0.put("osVersion", Build.VERSION.RELEASE);
                jSONObject0.put("adapters", this.zzd.zza());
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziZ)).booleanValue()) {
                    String s = zzt.zzo().zzm();
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("plugin", s);
                    }
                }
                if(this.zzn < zzt.zzB().currentTimeMillis() / 1000L) {
                    this.zzl = "{}";
                }
                jSONObject0.put("networkExtras", this.zzl);
                jSONObject0.put("adSlots", this.zzs());
                jSONObject0.put("appInfo", this.zze.zza());
                String s1 = zzt.zzo().zzh().zzh().zzc();
                if(!TextUtils.isEmpty(s1)) {
                    jSONObject0.put("cld", new JSONObject(s1));
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziP)).booleanValue()) {
                    JSONObject jSONObject1 = this.zzm;
                    if(jSONObject1 != null) {
                        zzcaa.zze(("Server data: " + jSONObject1.toString()));
                        jSONObject0.put("serverData", this.zzm);
                    }
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
                    jSONObject0.put("openAction", this.zzs);
                    jSONObject0.put("gesture", this.zzo);
                }
            }
            catch(JSONException jSONException0) {
                zzt.zzo().zzt(jSONException0, "Inspector.toJson");
                zzcaa.zzk("Ad inspector encountered an error", jSONException0);
            }
            return jSONObject0;
        }
    }

    public final void zzf(String s, zzdts zzdts0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && this.zzp()) {
                if(this.zzq >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zziB))))) {
                    zzcaa.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                    return;
                }
                if(!this.zzi.containsKey(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    this.zzi.put(s, arrayList0);
                }
                ++this.zzq;
                ((List)this.zzi.get(s)).add(zzdts0);
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
                    return;
                }
                String s1 = zzdts0.zzc();
                this.zzj.put(s1, zzdts0);
                if(this.zzk.containsKey(s1)) {
                    List list0 = (List)this.zzk.get(s1);
                    for(Object object0: list0) {
                        ((zzcas)object0).zzc(zzdts0);
                    }
                    list0.clear();
                }
            }
        }
    }

    public final void zzg() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue() && zzt.zzo().zzh().zzP()) {
            this.zzt();
            return;
        }
        String s = zzt.zzo().zzh().zzo();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            if(new JSONObject(s).optBoolean("isTestMode", false)) {
                this.zzt();
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public final void zzh(zzda zzda0, zzdud zzdud0) {
        synchronized(this) {
            if(!this.zzp()) {
                try {
                    zzda0.zze(zzfdb.zzd(18, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzcaa.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                    return;
                }
                return;
            }
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
                try {
                    zzda0.zze(zzfdb.zzd(1, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzcaa.zzj("Ad inspector had an internal error.");
                }
                return;
            }
            this.zzs = zzdud0;
            zzbjk zzbjk0 = new zzbjk(this);
            zzbjd zzbjd0 = new zzbjd(this.zzf);
            this.zza.zzj(zzda0, zzbjk0, zzbjd0);
        }
    }

    public final void zzi(String s, long v) {
        synchronized(this) {
            this.zzl = s;
            this.zzn = v;
            this.zzu();
        }
    }

    public final void zzj(long v) {
        synchronized(this) {
            this.zzt += v;
        }
    }

    public final void zzk(boolean z) {
        if(this.zzr) {
            if(z) {
            label_5:
                if(!this.zzp) {
                    this.zzy();
                    return;
                }
            }
        }
        else if(z) {
            this.zzt();
            goto label_5;
        }
        if(!this.zzp()) {
            this.zzx();
        }
    }

    public final void zzl(zzdua zzdua0) {
        this.zzv(zzdua0, true);
    }

    public final void zzm(JSONObject jSONObject0) {
        synchronized(this) {
            this.zzm = jSONObject0;
        }
    }

    public final void zzn(boolean z) {
        if(!this.zzr && z) {
            this.zzt();
        }
        this.zzw(z, true);
    }

    public final boolean zzo() {
        return this.zzm != null;
    }

    public final boolean zzp() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
                return !this.zzp && !zzt.zzs().zzl() ? false : true;
            }
            return this.zzp;
        }
    }

    public final boolean zzq() {
        synchronized(this) {
        }
        return this.zzp;
    }

    public final boolean zzr() {
        return this.zzt < ((long)(((Long)zzba.zzc().zzb(zzbbr.zziU))));
    }

    private final JSONObject zzs() {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: this.zzi.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: ((List)map$Entry0.getValue())) {
                    zzdts zzdts0 = (zzdts)object1;
                    if(zzdts0.zzg()) {
                        jSONArray0.put(zzdts0.zzd());
                    }
                }
                if(jSONArray0.length() > 0) {
                    jSONObject0.put(((String)map$Entry0.getKey()), jSONArray0);
                }
            }
            return jSONObject0;
        }
    }

    private final void zzt() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        this.zzz(zzt.zzo().zzh().zzo());
    }

    private final void zzu() {
        zzt.zzo().zzh().zzG(this.zzd());
    }

    private final void zzv(zzdua zzdua0, boolean z) {
        synchronized(this) {
            if(this.zzo == zzdua0) {
                return;
            }
            if(this.zzp()) {
                this.zzx();
            }
            this.zzo = zzdua0;
            if(this.zzp()) {
                this.zzy();
            }
            if(z) {
                this.zzu();
            }
        }
    }

    private final void zzw(boolean z, boolean z1) {
        synchronized(this) {
            if(this.zzp == z) {
                return;
            }
            this.zzp = z;
            if(z && (!((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue() || !zzt.zzs().zzl())) {
                this.zzy();
            }
            else if(!this.zzp()) {
                this.zzx();
            }
            if(z1) {
                this.zzu();
            }
        }
    }

    private final void zzx() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.zzo.ordinal()) {
            case 1: {
                this.zzb.zza();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.zzc.zza();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    private final void zzy() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.zzo.ordinal()) {
            case 1: {
                this.zzb.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.zzc.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    private final void zzz(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(TextUtils.isEmpty(s)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            this.zzw(jSONObject0.optBoolean("isTestMode", false), false);
            String s1 = jSONObject0.optString("gesture", "NONE");
            this.zzv(((zzdua)Enum.valueOf(zzdua.class, s1)), false);
            this.zzl = jSONObject0.optString("networkExtras", "{}");
            this.zzn = jSONObject0.optLong("networkExtrasExpirationSecs", 0x7FFFFFFFFFFFFFFFL);
            FIN.finallyExec$NT(v);
        }
        catch(JSONException unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }
}


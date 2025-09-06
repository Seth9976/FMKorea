package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzesg;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map zzc;
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context0, String s) {
        String s1;
        this.zza = context0.getApplicationContext();
        this.zzb = s;
        this.zzc = new TreeMap();
        try {
            s1 = "com.fmkorea.m.fmk-" + Wrappers.packageManager(context0).getPackageInfo("com.fmkorea.m.fmk", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzcaa.zzh("Unable to get package version name for reporting", packageManager$NameNotFoundException0);
            s1 = "com.fmkorea.m.fmk-missing";
        }
        this.zzf = s1;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(zzl zzl0, zzcag zzcag0) {
        this.zzd = zzl0.zzj.zza;
        Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle0 == null) {
            return;
        }
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            if("csa_customDomain".equals(s)) {
                this.zze = bundle0.getString(s);
            }
            else if(s.startsWith("csa_")) {
                String s1 = bundle0.getString(s);
                this.zzc.put(s.substring(4), s1);
            }
        }
        this.zzc.put("SDKVersion", zzcag0.zza);
        if(((Boolean)zzbcy.zza.zze()).booleanValue()) {
            try {
                JSONArray jSONArray0 = new JSONArray("[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
                Bundle bundle1 = zzesg.zzc(this.zza, jSONArray0);
                for(Object object1: bundle1.keySet()) {
                    String s2 = bundle1.get(((String)object1)).toString();
                    this.zzc.put(((String)object1), s2);
                }
            }
            catch(JSONException jSONException0) {
                zzcaa.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", jSONException0);
            }
        }
    }
}


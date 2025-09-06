package com.google.android.gms.internal.consent_sdk;

import W1.c.c;
import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzas {
    static final zzdf zza;
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    static {
        zzas.zza = zzdf.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    zzas(Application application0) {
        this.zzb = application0;
        SharedPreferences sharedPreferences0 = application0.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences0;
        this.zzd = new HashSet(sharedPreferences0.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    // 去混淆评级： 低(20)
    public final c zzb() {
        return c.valueOf(this.zzc.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    public final Map zzc() {
        String s1;
        Application application0 = this.zzb;
        Set set0 = this.zzc.getStringSet("stored_info", zzdf.zzi());
        if(set0.isEmpty()) {
            set0 = zzas.zza;
        }
        Map map0 = new HashMap();
        for(Object object0: set0) {
            String s = (String)object0;
            zzco zzco0 = zzcq.zza(application0, s);
            if(zzco0 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: " + s);
            }
            else {
                Object object1 = application0.getSharedPreferences(zzco0.zza, 0).getAll().get(zzco0.zzb);
                if(object1 == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: " + s);
                }
                else {
                    if(object1 instanceof Boolean) {
                        s1 = ((Boolean)object1).booleanValue() ? "1" : "0";
                    }
                    else if(object1 instanceof Number) {
                        s1 = object1.toString();
                    }
                    else if(object1 instanceof String) {
                        s1 = (String)object1;
                    }
                    else {
                        goto label_30;
                    }
                    map0.put(s, s1);
                    continue;
                label_30:
                    Log.d("UserMessagingPlatform", "Failed to fetch stored info: " + s);
                }
            }
        }
        return map0;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        zzcq.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int v) {
        this.zzc.edit().putInt("consent_status", v).apply();
    }

    public final void zzh(c c$c0) {
        this.zzc.edit().putString("privacy_options_requirement_status", c$c0.name()).apply();
    }

    public final void zzi(Set set0) {
        this.zzc.edit().putStringSet("stored_info", set0).apply();
    }
}


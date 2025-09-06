package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzaq implements zzf {
    private final Application zza;
    private final zzas zzb;
    private final Executor zzc;

    public zzaq(Application application0, zzas zzas0, Executor executor0) {
        this.zza = application0;
        this.zzb = zzas0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzf
    public final Executor zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzf
    public final boolean zzb(String s, JSONObject jSONObject0) {
        switch(s) {
            case "clear": {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("keys");
                if(jSONArray0 != null && jSONArray0.length() != 0) {
                    HashSet hashSet0 = new HashSet();
                    int v1 = jSONArray0.length();
                    for(int v = 0; v < v1; ++v) {
                        String s1 = jSONArray0.optString(v);
                        if(TextUtils.isEmpty(s1)) {
                            Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + v);
                        }
                        else {
                            hashSet0.add(s1);
                        }
                    }
                    zzcq.zzb(this.zza, hashSet0);
                    return true;
                }
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args." + jSONObject0.toString());
                return true;
            }
            case "write": {
                zzcp zzcp0 = new zzcp(this.zza);
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s2 = (String)object0;
                    Object object1 = jSONObject0.opt(s2);
                    Log.d("UserMessagingPlatform", "Writing to storage: [" + s2 + "] " + object1);
                    if(zzcp0.zzc(s2, object1)) {
                        this.zzb.zzd().add(s2);
                    }
                    else {
                        Log.d("UserMessagingPlatform", "Failed writing key: " + s2);
                    }
                }
                this.zzb.zzf();
                zzcp0.zzb();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}


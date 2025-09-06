package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map.Entry;

public final class zzam {
    public final String zza;
    public String zzb;
    public Bundle zzc;

    // This method was un-flattened
    public zzam(JsonReader jsonReader0) {
        this.zzc = new Bundle();
        HashMap hashMap0 = new HashMap();
        jsonReader0.beginObject();
        String s = "";
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            if(s1 == null) {
                s1 = "";
            }
        alab1:
            switch(s1) {
                case "params": {
                    s = jsonReader0.nextString();
                    continue;
                }
                case "signal_dictionary": {
                    hashMap0 = new HashMap();
                    jsonReader0.beginObject();
                    while(true) {
                        if(!jsonReader0.hasNext()) {
                            break alab1;
                        }
                        hashMap0.put(jsonReader0.nextName(), jsonReader0.nextString());
                    }
                }
                default: {
                    jsonReader0.skipValue();
                    continue;
                }
            }
            jsonReader0.endObject();
        }
        this.zza = s;
        jsonReader0.endObject();
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null && map$Entry0.getValue() != null) {
                this.zzc.putString(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
            }
        }
    }
}


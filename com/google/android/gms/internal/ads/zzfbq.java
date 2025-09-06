package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbq {
    public final List zza;
    public final zzfbi zzb;
    public final List zzc;

    zzfbq(JsonReader jsonReader0) {
        List list0 = Collections.emptyList();
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginObject();
        zzfbi zzfbi0 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if("responses".equals(s)) {
                jsonReader0.beginArray();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if("ad_configs".equals(s1)) {
                        list0 = new ArrayList();
                        jsonReader0.beginArray();
                        while(jsonReader0.hasNext()) {
                            list0.add(new zzfbe(jsonReader0));
                        }
                        jsonReader0.endArray();
                    }
                    else if(s1.equals("common")) {
                        zzfbi0 = new zzfbi(jsonReader0);
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                jsonReader0.endObject();
                jsonReader0.endArray();
            }
            else if(s.equals("actions")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    jsonReader0.beginObject();
                    String s2 = null;
                    JSONObject jSONObject0 = null;
                    while(jsonReader0.hasNext()) {
                        String s3 = jsonReader0.nextName();
                        if("name".equals(s3)) {
                            s2 = jsonReader0.nextString();
                        }
                        else if("info".equals(s3)) {
                            jSONObject0 = zzbu.zzh(jsonReader0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    if(s2 != null) {
                        arrayList0.add(new zzfbp(s2, jSONObject0));
                    }
                    jsonReader0.endObject();
                }
                jsonReader0.endArray();
            }
        }
        this.zzc = arrayList0;
        this.zza = list0;
        if(zzfbi0 == null) {
            zzfbi0 = new zzfbi(new JsonReader(new StringReader("{}")));
        }
        this.zzb = zzfbi0;
    }

    public static zzfbq zza(Reader reader0) {
        try {
            return new zzfbq(new JsonReader(reader0));
        }
        catch(IOException | IllegalStateException | JSONException | NumberFormatException | AssertionError iOException0) {
            throw new zzfbj("unable to parse ServerResponse", iOException0);
        }
        finally {
            IOUtils.closeQuietly(reader0);
        }
    }
}


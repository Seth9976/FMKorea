package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public final class zzeab {
    public int zza;
    public Map zzb;
    public String zzc;
    public long zzd;

    public zzeab() {
        this.zza = 0;
        this.zzb = new HashMap();
        this.zzc = "";
        this.zzd = -1L;
    }

    public static zzeab zza(Reader reader0) {
        zzeab zzeab0;
        try {
            JsonReader jsonReader0 = new JsonReader(reader0);
            HashMap hashMap0 = new HashMap();
            String s = "";
            jsonReader0.beginObject();
            long v1 = -1L;
            int v2 = 0;
            while(jsonReader0.hasNext()) {
                String s1 = jsonReader0.nextName();
                if("response".equals(s1)) {
                    v2 = jsonReader0.nextInt();
                }
                else if("body".equals(s1)) {
                    s = jsonReader0.nextString();
                }
                else if("latency".equals(s1)) {
                    v1 = jsonReader0.nextLong();
                }
                else if("headers".equals(s1)) {
                    hashMap0 = new HashMap();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        hashMap0.put(jsonReader0.nextName(), zzbu.zzd(jsonReader0));
                    }
                    jsonReader0.endObject();
                }
                else {
                    jsonReader0.skipValue();
                }
            }
            jsonReader0.endObject();
            zzeab0 = new zzeab();
            zzeab0.zza = v2;
            if(s != null) {
                zzeab0.zzc = s;
            }
            zzeab0.zzd = v1;
            zzeab0.zzb = hashMap0;
            return zzeab0;
        }
        catch(IOException | IllegalStateException | NumberFormatException | AssertionError iOException0) {
            throw new zzfbj("Unable to parse Response", iOException0);
        }
        finally {
            IOUtils.closeQuietly(reader0);
        }
    }
}


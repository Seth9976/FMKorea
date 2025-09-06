package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzbzz {
    public static final int zza = 0;
    private static final Object zzb = null;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private static final Clock zze;
    private static final Set zzf;
    private final List zzg;

    static {
        zzbzz.zzb = new Object();
        zzbzz.zze = DefaultClock.getInstance();
        zzbzz.zzf = new HashSet(Arrays.asList(new String[0]));
    }

    public zzbzz() {
        this(null);
    }

    public zzbzz(String s) {
        List list0 = zzbzz.zzk() ? Arrays.asList(new String[]{"network_request_b9862198-b1fc-422e-9c62-a9ebe73fbe22"}) : new ArrayList();
        this.zzg = list0;
    }

    // 检测为 Lambda 实现
    static void zza(String s, String s1, Map map0, byte[] arr_b, JsonWriter jsonWriter0) [...]

    // 检测为 Lambda 实现
    static void zzb(int v, Map map0, JsonWriter jsonWriter0) [...]

    public final void zzc(HttpURLConnection httpURLConnection0, byte[] arr_b) {
        if(!zzbzz.zzk()) {
            return;
        }
        HashMap hashMap0 = httpURLConnection0.getRequestProperties() == null ? null : new HashMap(httpURLConnection0.getRequestProperties());
        this.zzp(new String(httpURLConnection0.getURL().toString()), new String(httpURLConnection0.getRequestMethod()), hashMap0, arr_b);
    }

    public final void zzd(String s, String s1, Map map0, byte[] arr_b) {
        if(!zzbzz.zzk()) {
            return;
        }
        this.zzp(s, "GET", map0, arr_b);
    }

    public final void zze(HttpURLConnection httpURLConnection0, int v) {
        String s = null;
        if(!zzbzz.zzk()) {
            return;
        }
        this.zzq((httpURLConnection0.getHeaderFields() == null ? null : new HashMap(httpURLConnection0.getHeaderFields())), v);
        if(v >= 200 && v < 300) {
            return;
        }
        try {
            s = httpURLConnection0.getResponseMessage();
        }
        catch(IOException iOException0) {
            zzcaa.zzj(("Can not get error message from error HttpURLConnection\n" + iOException0.getMessage()));
        }
        this.zzo(s);
    }

    public final void zzf(Map map0, int v) {
        if(!zzbzz.zzk()) {
            return;
        }
        this.zzq(map0, v);
        if(v >= 200 && v < 300) {
            return;
        }
        this.zzo(null);
    }

    public final void zzg(String s) {
        if(!zzbzz.zzk()) {
            return;
        }
        if(s == null) {
            return;
        }
        this.zzh(s.getBytes());
    }

    public final void zzh(byte[] arr_b) {
        this.zzn("onNetworkResponseBody", new zzbzx(arr_b));
    }

    public static void zzi() {
        synchronized(zzbzz.zzb) {
            zzbzz.zzc = false;
            zzbzz.zzd = false;
            zzcaa.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized(zzbzz.zzb) {
            zzbzz.zzc = true;
            zzbzz.zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z = false;
        synchronized(zzbzz.zzb) {
            if(zzbzz.zzc && zzbzz.zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        synchronized(zzbzz.zzb) {
        }
        return zzbzz.zzc;
    }

    private static void zzm(String s) {
        synchronized(zzbzz.class) {
            zzcaa.zzi("GMA Debug BEGIN");
            for(int v1 = 0; v1 < s.length(); v1 += 4000) {
                zzcaa.zzi(("GMA Debug CONTENT " + s.substring(v1, Math.min(v1 + 4000, s.length()))));
            }
            zzcaa.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String s, zzbzy zzbzy0) {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.beginObject();
            jsonWriter0.name("timestamp").value(zzbzz.zze.currentTimeMillis());
            jsonWriter0.name("event").value(s);
            jsonWriter0.name("components").beginArray();
            for(Object object0: this.zzg) {
                jsonWriter0.value(((String)object0));
            }
            jsonWriter0.endArray();
            zzbzy0.zza(jsonWriter0);
            jsonWriter0.endObject();
            jsonWriter0.flush();
            jsonWriter0.close();
        }
        catch(IOException iOException0) {
            zzcaa.zzh("unable to log", iOException0);
        }
        zzbzz.zzm(stringWriter0.toString());
    }

    private final void zzo(String s) {
        this.zzn("onNetworkRequestError", new zzbzv(s));
    }

    private final void zzp(String s, String s1, Map map0, byte[] arr_b) {
        this.zzn("onNetworkRequest", (JsonWriter jsonWriter0) -> {
            jsonWriter0.name("params").beginObject();
            jsonWriter0.name("firstline").beginObject();
            jsonWriter0.name("uri").value(s);
            jsonWriter0.name("verb").value(s1);
            jsonWriter0.endObject();
            zzbzz.zzr(jsonWriter0, map0);
            if(arr_b != null) {
                jsonWriter0.name("body").value(Base64Utils.encode(arr_b));
            }
            jsonWriter0.endObject();
        });
    }

    private final void zzq(Map map0, int v) {
        this.zzn("onNetworkResponse", (JsonWriter jsonWriter0) -> {
            jsonWriter0.name("params").beginObject();
            jsonWriter0.name("firstline").beginObject();
            jsonWriter0.name("code").value(((long)v));
            jsonWriter0.endObject();
            zzbzz.zzr(jsonWriter0, map0);
            jsonWriter0.endObject();
        });
    }

    private static void zzr(JsonWriter jsonWriter0, Map map0) {
        if(map0 == null) {
            return;
        }
        jsonWriter0.name("headers").beginArray();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(zzbzz.zzf.contains(s)) {
            }
            else if(map$Entry0.getValue() instanceof List) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    jsonWriter0.beginObject();
                    jsonWriter0.name("name").value(s);
                    jsonWriter0.name("value").value(((String)object1));
                    jsonWriter0.endObject();
                }
            }
            else if(map$Entry0.getValue() instanceof String) {
                jsonWriter0.beginObject();
                jsonWriter0.name("name").value(s);
                jsonWriter0.name("value").value(((String)map$Entry0.getValue()));
                jsonWriter0.endObject();
            }
            else {
                zzcaa.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                if(true) {
                    break;
                }
            }
        }
        jsonWriter0.endArray();
    }
}


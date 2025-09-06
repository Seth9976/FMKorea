package com.google.android.gms.internal.consent_sdk;

import W1.c.a;
import W1.c.b;
import W1.c.c;
import W1.d;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

final class zzx {
    private final Application zza;
    private final zzae zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzas zze;
    private final zzbq zzf;
    private final zzn zzg;
    private final zzaa zzh;
    private final zzg zzi;

    zzx(Application application0, zzae zzae0, Handler handler0, Executor executor0, zzas zzas0, zzbq zzbq0, zzn zzn0, zzaa zzaa0, zzg zzg0) {
        this.zza = application0;
        this.zzb = zzae0;
        this.zzc = handler0;
        this.zzd = executor0;
        this.zze = zzas0;
        this.zzf = zzbq0;
        this.zzg = zzn0;
        this.zzh = zzaa0;
        this.zzi = zzg0;
    }

    // 检测为 Lambda 实现
    final void zza(b c$b0, zzac zzac0) [...]

    // 检测为 Lambda 实现
    final void zzb(Activity activity0, d d0, b c$b0, a c$a0) [...]

    final void zzc(Activity activity0, d d0, b c$b0, a c$a0) {
        zzw zzw0 = () -> {
            try {
                W1.a a0 = d0.a();
                if(a0 == null || !a0.b()) {
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcn.zza(this.zza) + "\") to set this as a debug device.");
                }
                zzcm zzcm0 = this.zzd(this.zzg.zzd(activity0, d0));
                zzac zzac0 = new zzz(this.zzh, zzcm0).zza();
                this.zze.zzg(zzac0.zza);
                this.zze.zzh(zzac0.zzb);
                this.zzf.zzd(zzac0.zzc);
                this.zzi.zza().execute(() -> {
                    c$b0.getClass();
                    zzt zzt0 = new zzt(c$b0);
                    this.zzc.post(zzt0);
                    if(zzac0.zzb != c.g) {
                        this.zzf.zzc();
                    }
                });
                return;
            }
            catch(zzi zzi0) {
            }
            catch(RuntimeException runtimeException0) {
                goto label_16;
            }
            zzu zzu0 = new zzu(c$a0, zzi0);
            this.zzc.post(zzu0);
            return;
        label_16:
            zzv zzv0 = new zzv(c$a0, new zzi(1, "Caught exception when trying to request consent info update: " + Log.getStackTraceString(runtimeException0)));
            this.zzc.post(zzv0);
        };
        this.zzd.execute(zzw0);
    }

    private final zzcm zzd(zzck zzck0) {
        zzcm zzcm1;
        JsonReader jsonReader0;
        BufferedReader bufferedReader0;
        JsonWriter jsonWriter0;
        OutputStreamWriter outputStreamWriter0;
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = (HttpURLConnection)new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection0.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection0.setConnectTimeout(10000);
            httpURLConnection0.setReadTimeout(30000);
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.setRequestMethod("POST");
            httpURLConnection0.setRequestProperty("Content-Type", "application/json");
            outputStreamWriter0 = new OutputStreamWriter(httpURLConnection0.getOutputStream(), "UTF-8");
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            throw new zzi(4, "The server timed out.", socketTimeoutException0);
        }
        catch(IOException iOException0) {
            throw new zzi(2, "Error making request.", iOException0);
        }
        try {
            jsonWriter0 = new JsonWriter(outputStreamWriter0);
        }
        catch(Throwable throwable0) {
            goto label_160;
        }
        try {
            jsonWriter0.beginObject();
            String s = zzck0.zza;
            if(s != null) {
                jsonWriter0.name("admob_app_id");
                jsonWriter0.value(s);
            }
            String s1 = zzck0.zzb;
            if(s1 != null) {
                jsonWriter0.name("adid");
                jsonWriter0.value(s1);
            }
            zzcg zzcg0 = zzck0.zzc;
            if(zzcg0 != null) {
                jsonWriter0.name("device_info");
                jsonWriter0.beginObject();
                int v = zzcg0.zzc;
                if(v != 1) {
                    jsonWriter0.name("os_type");
                    switch(v - 1) {
                        case 0: {
                            jsonWriter0.value("UNKNOWN");
                            break;
                        }
                        case 1: {
                            jsonWriter0.value("ANDROID");
                        }
                    }
                }
                String s2 = zzcg0.zza;
                if(s2 != null) {
                    jsonWriter0.name("model");
                    jsonWriter0.value(s2);
                }
                Integer integer0 = zzcg0.zzb;
                if(integer0 != null) {
                    jsonWriter0.name("android_api_level");
                    jsonWriter0.value(integer0);
                }
                jsonWriter0.endObject();
            }
            String s3 = zzck0.zzd;
            if(s3 != null) {
                jsonWriter0.name("language_code");
                jsonWriter0.value(s3);
            }
            Boolean boolean0 = zzck0.zze;
            if(boolean0 != null) {
                jsonWriter0.name("tag_for_under_age_of_consent");
                jsonWriter0.value(boolean0.booleanValue());
            }
            Map map0 = zzck0.zzf;
            if(!map0.isEmpty()) {
                jsonWriter0.name("stored_infos_map");
                jsonWriter0.beginObject();
                for(Object object0: map0.entrySet()) {
                    jsonWriter0.name(((String)((Map.Entry)object0).getKey()));
                    jsonWriter0.value(((String)((Map.Entry)object0).getValue()));
                }
                jsonWriter0.endObject();
            }
            zzci zzci0 = zzck0.zzg;
            if(zzci0 != null) {
                jsonWriter0.name("screen_info");
                jsonWriter0.beginObject();
                Integer integer1 = zzci0.zza;
                if(integer1 != null) {
                    jsonWriter0.name("width");
                    jsonWriter0.value(integer1);
                }
                Integer integer2 = zzci0.zzb;
                if(integer2 != null) {
                    jsonWriter0.name("height");
                    jsonWriter0.value(integer2);
                }
                Double double0 = zzci0.zzc;
                if(double0 != null) {
                    jsonWriter0.name("density");
                    jsonWriter0.value(double0);
                }
                List list0 = zzci0.zzd;
                if(!list0.isEmpty()) {
                    jsonWriter0.name("screen_insets");
                    jsonWriter0.beginArray();
                    for(Object object1: list0) {
                        jsonWriter0.beginObject();
                        Integer integer3 = ((zzch)object1).zza;
                        if(integer3 != null) {
                            jsonWriter0.name("top");
                            jsonWriter0.value(integer3);
                        }
                        Integer integer4 = ((zzch)object1).zzb;
                        if(integer4 != null) {
                            jsonWriter0.name("left");
                            jsonWriter0.value(integer4);
                        }
                        Integer integer5 = ((zzch)object1).zzc;
                        if(integer5 != null) {
                            jsonWriter0.name("right");
                            jsonWriter0.value(integer5);
                        }
                        Integer integer6 = ((zzch)object1).zzd;
                        if(integer6 != null) {
                            jsonWriter0.name("bottom");
                            jsonWriter0.value(integer6);
                        }
                        jsonWriter0.endObject();
                    }
                    jsonWriter0.endArray();
                }
                jsonWriter0.endObject();
            }
            zzce zzce0 = zzck0.zzh;
            if(zzce0 != null) {
                jsonWriter0.name("app_info");
                jsonWriter0.beginObject();
                String s4 = zzce0.zza;
                if(s4 != null) {
                    jsonWriter0.name("package_name");
                    jsonWriter0.value(s4);
                }
                String s5 = zzce0.zzb;
                if(s5 != null) {
                    jsonWriter0.name("publisher_display_name");
                    jsonWriter0.value(s5);
                }
                String s6 = zzce0.zzc;
                if(s6 != null) {
                    jsonWriter0.name("version");
                    jsonWriter0.value(s6);
                }
                jsonWriter0.endObject();
            }
            zzcj zzcj0 = zzck0.zzi;
            if(zzcj0 != null) {
                jsonWriter0.name("sdk_info");
                jsonWriter0.beginObject();
                String s7 = zzcj0.zza;
                if(s7 != null) {
                    jsonWriter0.name("version");
                    jsonWriter0.value(s7);
                }
                jsonWriter0.endObject();
            }
            List list1 = zzck0.zzj;
            if(!list1.isEmpty()) {
                jsonWriter0.name("debug_params");
                jsonWriter0.beginArray();
                for(Object object2: list1) {
                    switch(((zzcf)object2).ordinal()) {
                        case 0: {
                            jsonWriter0.value("DEBUG_PARAM_UNKNOWN");
                            break;
                        }
                        case 1: {
                            jsonWriter0.value("ALWAYS_SHOW");
                            break;
                        }
                        case 2: {
                            jsonWriter0.value("GEO_OVERRIDE_EEA");
                            break;
                        }
                        case 3: {
                            jsonWriter0.value("GEO_OVERRIDE_NON_EEA");
                            break;
                        }
                        case 4: {
                            jsonWriter0.value("PREVIEWING_DEBUG_MESSAGES");
                        }
                    }
                }
                jsonWriter0.endArray();
            }
            jsonWriter0.endObject();
            goto label_157;
        }
        catch(Throwable throwable1) {
        }
        try {
            jsonWriter0.close();
            throw throwable1;
        }
        catch(Throwable throwable2) {
            try {
                zzr.zza(throwable1, throwable2);
                throw throwable1;
            label_157:
                jsonWriter0.close();
                goto label_165;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_160:
            outputStreamWriter0.close();
            throw throwable0;
        }
        catch(Throwable throwable3) {
            try {
                zzr.zza(throwable0, throwable3);
                throw throwable0;
            label_165:
                outputStreamWriter0.close();
                int v1 = httpURLConnection0.getResponseCode();
                if(v1 != 200) {
                    throw new IOException("Http error code - " + v1 + ".\n" + new Scanner(httpURLConnection0.getErrorStream()).useDelimiter("\\A").next());
                }
                String s8 = httpURLConnection0.getHeaderField("x-ump-using-header");
                if(s8 != null) {
                    zzcm zzcm0 = zzcm.zza(new JsonReader(new StringReader(s8)));
                    zzcm0.zza = new Scanner(httpURLConnection0.getInputStream()).useDelimiter("\\A").next();
                    return zzcm0;
                }
                bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getInputStream(), "UTF-8"));
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                throw new zzi(4, "The server timed out.", socketTimeoutException0);
            }
            catch(IOException iOException0) {
                throw new zzi(2, "Error making request.", iOException0);
            }
        }
        try {
            bufferedReader0.readLine();
            jsonReader0 = new JsonReader(bufferedReader0);
        }
        catch(Throwable throwable4) {
            goto label_188;
        }
        try {
            zzcm1 = zzcm.zza(jsonReader0);
            goto label_185;
        }
        catch(Throwable throwable5) {
            try {
                jsonReader0.close();
                throw throwable5;
            }
            catch(Throwable throwable6) {
                try {
                    zzr.zza(throwable5, throwable6);
                    throw throwable5;
                label_185:
                    jsonReader0.close();
                    goto label_193;
                }
                catch(Throwable throwable4) {
                }
            }
        }
        try {
        label_188:
            bufferedReader0.close();
            throw throwable4;
        }
        catch(Throwable throwable7) {
            try {
                zzr.zza(throwable4, throwable7);
                throw throwable4;
            label_193:
                bufferedReader0.close();
                return zzcm1;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
            }
            catch(IOException iOException0) {
                throw new zzi(2, "Error making request.", iOException0);
            }
        }
        throw new zzi(4, "The server timed out.", socketTimeoutException0);
    }
}


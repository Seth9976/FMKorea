package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1;
    private static final AtomicBoolean a;

    static {
        DexLoadErrorReporter.a = new AtomicBoolean();
    }

    private static void b(Context context0, JSONObject jSONObject0, String s) {
        jSONObject0.put("APPBUILD", context0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0).versionCode);
        ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0);
        jSONObject0.put("APPNAME", context0.getPackageManager().getApplicationLabel(applicationInfo0));
        jSONObject0.put("APPVERS", context0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0).versionName);
        jSONObject0.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject0.put("SDK", "android");
        jSONObject0.put("SESSION_ID", s);
        jSONObject0.put("MODEL", Build.MODEL);
        jSONObject0.put("BUNDLE", "com.fmkorea.m.fmk");
        jSONObject0.put("SDK_VERSION", BuildConfigApi.getVersionName(context0));
        jSONObject0.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context0, String s, double f) {
        class a extends Thread {
            final Context f;
            final String g;

            a(Context context0, String s) {
                this.g = s;
                super();
            }

            @Override
            public void run() {
                InputStream inputStream1;
                ByteArrayOutputStream byteArrayOutputStream0;
                byte[] arr_b;
                DataOutputStream dataOutputStream0;
                JSONObject jSONObject3;
                HttpURLConnection httpURLConnection1;
                InputStream inputStream0;
                OutputStream outputStream0;
                HttpURLConnection httpURLConnection0;
                super.run();
                try {
                    httpURLConnection0 = (HttpURLConnection)new URL("https://www.facebook.com/adnw_logging/").openConnection();
                }
                catch(Throwable throwable0) {
                    outputStream0 = null;
                    inputStream0 = null;
                    httpURLConnection1 = null;
                    goto label_63;
                }
                try {
                    httpURLConnection0.setRequestMethod("POST");
                    httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection0.setRequestProperty("Accept", "application/json");
                    httpURLConnection0.setRequestProperty("Accept-Charset", "UTF-8");
                    httpURLConnection0.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection0.setDoOutput(true);
                    httpURLConnection0.setDoInput(true);
                    httpURLConnection0.connect();
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("attempt", "0");
                    DexLoadErrorReporter.b(this.f, jSONObject0, "056c1718-1595-4d0b-a4a7-05f0d2625620");
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("subtype", "generic");
                    jSONObject1.put("subtype_code", "1320");
                    jSONObject1.put("caught_exception", "1");
                    jSONObject1.put("stacktrace", this.g);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", "77c778b2-89d0-4cb0-9dca-e67ce7a17d5c");
                    jSONObject2.put("type", "debug");
                    httpURLConnection1 = httpURLConnection0;
                    jSONObject2.put("session_time", "" + System.currentTimeMillis() / 1000L);
                    jSONObject2.put("time", "" + System.currentTimeMillis() / 1000L);
                    jSONObject2.put("session_id", "056c1718-1595-4d0b-a4a7-05f0d2625620");
                    jSONObject2.put("data", jSONObject1);
                    jSONObject2.put("attempt", "0");
                    DexLoadErrorReporter.b(this.f, jSONObject1, "056c1718-1595-4d0b-a4a7-05f0d2625620");
                    JSONArray jSONArray0 = new JSONArray();
                    jSONArray0.put(jSONObject2);
                    jSONObject3 = new JSONObject();
                    jSONObject3.put("data", jSONObject0);
                    jSONObject3.put("events", jSONArray0);
                    dataOutputStream0 = new DataOutputStream(httpURLConnection1.getOutputStream());
                }
                catch(Throwable throwable0) {
                    outputStream0 = null;
                    inputStream0 = null;
                    goto label_63;
                }
                try {
                    dataOutputStream0.writeBytes("payload=" + URLEncoder.encode(jSONObject3.toString(), "UTF-8"));
                    dataOutputStream0.flush();
                    arr_b = new byte[0x4000];
                    byteArrayOutputStream0 = new ByteArrayOutputStream();
                    inputStream1 = httpURLConnection1.getInputStream();
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    outputStream0 = dataOutputStream0;
                }
                inputStream0 = null;
                goto label_63;
                try {
                    while(true) {
                    label_54:
                        int v = inputStream1.read(arr_b);
                        if(v == -1) {
                            break;
                        }
                        byteArrayOutputStream0.write(arr_b, 0, v);
                    }
                    byteArrayOutputStream0.flush();
                    goto label_91;
                }
                catch(Throwable throwable0) {
                    inputStream0 = inputStream1;
                    outputStream0 = dataOutputStream0;
                }
                try {
                label_63:
                    Log.e("FBAudienceNetwork", "Can\'t send error.", throwable0);
                }
                catch(Throwable throwable1) {
                    if(outputStream0 != null) {
                        try {
                            outputStream0.close();
                        }
                        catch(Exception exception0) {
                            Log.e("FBAudienceNetwork", "Can\'t close connection.", exception0);
                        }
                    }
                    if(inputStream0 != null) {
                        try {
                            inputStream0.close();
                        }
                        catch(Exception exception1) {
                            Log.e("FBAudienceNetwork", "Can\'t close connection.", exception1);
                        }
                    }
                    if(httpURLConnection1 != null) {
                        httpURLConnection1.disconnect();
                    }
                    throw throwable1;
                }
                if(outputStream0 != null) {
                    try {
                        outputStream0.close();
                    }
                    catch(Exception exception2) {
                        Log.e("FBAudienceNetwork", "Can\'t close connection.", exception2);
                    }
                }
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(Exception exception3) {
                        Log.e("FBAudienceNetwork", "Can\'t close connection.", exception3);
                    }
                }
                if(httpURLConnection1 == null) {
                    return;
                    try {
                    label_91:
                        dataOutputStream0.close();
                    }
                    catch(Exception exception4) {
                        Log.e("FBAudienceNetwork", "Can\'t close connection.", exception4);
                    }
                    try {
                        inputStream1.close();
                    }
                    catch(Exception exception5) {
                        Log.e("FBAudienceNetwork", "Can\'t close connection.", exception5);
                    }
                }
                httpURLConnection1.disconnect();
            }
        }

        AtomicBoolean atomicBoolean0 = DexLoadErrorReporter.a;
        if(!atomicBoolean0.get() && Math.random() < f) {
            atomicBoolean0.set(true);
            new a(context0, s).start();
        }
    }
}


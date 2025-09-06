package com.google.android.gms.internal.measurement;

import X1.g;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public final class zzgj {
    public static class zza {
        private static volatile g zza;

        static {
        }

        public static g zza(Context context0) {
            g g1;
            synchronized(zza.class) {
                g g0 = zza.zza;
                if(g0 == null) {
                    if((Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug")) && (Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys"))) {
                        if(!context0.isDeviceProtectedStorage()) {
                            context0 = context0.createDeviceProtectedStorageContext();
                        }
                        g1 = zzgj.zza(context0);
                    }
                    else {
                        g1 = g.a();
                    }
                    g0 = g1;
                    zza.zza = g0;
                }
                return g0;
            }
        }
    }

    static g zza(Context context0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            g g0 = zzgj.zzb(context0);
            return g0.c() ? g.d(zzgj.zza(context0, ((File)g0.b()))) : g.a();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    private static zzgh zza(Context context0, File file0) {
        try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0)))) {
            androidx.collection.g g0 = new androidx.collection.g();
            HashMap hashMap0 = new HashMap();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                String[] arr_s = s.split(" ", 3);
                if(arr_s.length == 3) {
                    String s1 = zzgj.zza(arr_s[0]);
                    String s2 = Uri.decode(zzgj.zza(arr_s[1]));
                    String s3 = (String)hashMap0.get(arr_s[2]);
                    if(s3 == null) {
                        String s4 = zzgj.zza(arr_s[2]);
                        s3 = Uri.decode(s4);
                        if(s3.length() < 0x400 || s3 == s4) {
                            hashMap0.put(s4, s3);
                        }
                    }
                    if(!g0.containsKey(s1)) {
                        g0.put(s1, new androidx.collection.g());
                    }
                    ((androidx.collection.g)g0.get(s1)).put(s2, s3);
                }
                else {
                    Log.e("HermeticFileOverrides", "Invalid: " + s);
                }
            }
            Log.w("HermeticFileOverrides", "Parsed " + file0 + " for Android package " + "com.fmkorea.m.fmk");
            return new zzgc(g0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    private static final String zza(String s) {
        return new String(s);
    }

    private static g zzb(Context context0) {
        try {
            File file0 = new File(context0.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file0.exists() ? g.d(file0) : g.a();
        }
        catch(RuntimeException runtimeException0) {
            Log.e("HermeticFileOverrides", "no data dir", runtimeException0);
            return g.a();
        }
    }
}


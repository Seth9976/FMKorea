package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzcn {
    private static String zza;

    public static String zza(Context context0) {
        synchronized(zzcn.class) {
            if(zzcn.zza == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
                if(s == null || zzcn.zzb()) {
                    s = "emulator";
                }
                zzcn.zza = zzcn.zzc(s);
            }
            return zzcn.zza;
        }
    }

    // 去混淆评级： 中等(160)
    public static boolean zzb() {
        return Build.MODEL.contains("google_sdk") || Build.MODEL.contains("sdk_goog3") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(Build.PRODUCT);
    }

    private static String zzc(String s) {
        for(int v = 0; true; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                messageDigest0.update(s.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest0.digest()));
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            catch(ArithmeticException unused_ex) {
                break;
            }
        }
        return "";
    }
}


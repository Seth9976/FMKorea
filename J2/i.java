package j2;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import g2.f;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class i {
    static enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map p;

        static {
            HashMap hashMap0 = new HashMap(4);
            a.p = hashMap0;
            hashMap0.put("armeabi-v7a", a.l);
            hashMap0.put("armeabi", a.k);
            hashMap0.put("arm64-v8a", a.o);
            hashMap0.put("x86", a.f);
        }

        // 去混淆评级： 低(20)
        static a b() {
            if(TextUtils.isEmpty("arm64-v8a")) {
                f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return a.m;
            }
            a i$a0 = (a)a.p.get("arm64-v8a");
            return i$a0 == null ? a.m : i$a0;
        }
    }

    private static final char[] a;
    private static long b;

    static {
        i.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        i.b = -1L;
    }

    public static boolean A() {
        boolean z = i.z();
        if(!z && Build.TAGS != null && Build.TAGS.contains("test-keys")) {
            return true;
        }
        return new File("/system/app/Superuser.apk").exists() ? true : !z && new File("/system/xbin/su").exists();
    }

    public static boolean B(String s, String s1) {
        return s == null ? s1 == null : s.equals(s1);
    }

    public static String C(String s) {
        return i.u(s, "SHA-1");
    }

    public static String D(InputStream inputStream0) {
        Scanner scanner0 = new Scanner(inputStream0).useDelimiter("\\A");
        return scanner0.hasNext() ? scanner0.next() : "";
    }

    public static long a(Context context0) {
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        ((ActivityManager)context0.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo0);
        return activityManager$MemoryInfo0.availMem;
    }

    public static long b(String s) {
        StatFs statFs0 = new StatFs(s);
        long v = (long)statFs0.getBlockSize();
        return ((long)statFs0.getBlockCount()) * v - v * ((long)statFs0.getAvailableBlocks());
    }

    public static boolean c(Context context0) {
        if(i.d(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean d(Context context0, String s) {
        return context0.checkCallingOrSelfPermission(s) == 0;
    }

    public static void e(Closeable closeable0, String s) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException iOException0) {
                f.f().e(s, iOException0);
            }
        }
    }

    public static void f(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    static long g(String s, String s1, int v) {
        return Long.parseLong(s.split(s1)[0].trim()) * ((long)v);
    }

    public static String h(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(s != null) {
                    arrayList0.add(s.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList0);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: arrayList0) {
                stringBuilder0.append(((String)object0));
            }
            String s1 = stringBuilder0.toString();
            return s1.length() <= 0 ? null : i.C(s1);
        }
        return null;
    }

    public static String i(File file0, String s) {
        String[] arr_s;
        BufferedReader bufferedReader0;
        String s1 = null;
        if(file0.exists()) {
            try {
                bufferedReader0 = null;
                bufferedReader0 = new BufferedReader(new FileReader(file0), 0x400);
                goto label_7;
            }
            catch(Exception exception0) {
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            i.e(((Closeable)s1), "Failed to close system file reader.");
            throw throwable0;
            try {
                try {
                    do {
                    label_7:
                        String s2 = bufferedReader0.readLine();
                        if(s2 == null) {
                            goto label_20;
                        }
                        arr_s = Pattern.compile("\\s*:\\s*").split(s2, 2);
                    }
                    while(arr_s.length <= 1 || !arr_s[0].equals(s));
                    s1 = arr_s[1];
                }
                catch(Exception exception0) {
                label_14:
                    f.f().e("Error parsing " + file0, exception0);
                }
            }
            catch(Throwable throwable0) {
                s1 = bufferedReader0;
                i.e(((Closeable)s1), "Failed to close system file reader.");
                throw throwable0;
            }
        label_20:
            i.e(bufferedReader0, "Failed to close system file reader.");
            return s1;
        }
        return null;
    }

    public static ActivityManager.RunningAppProcessInfo j(String s, Context context0) {
        List list0 = ((ActivityManager)context0.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.processName.equals(s)) {
                    return activityManager$RunningAppProcessInfo0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static boolean k(Context context0, String s, boolean z) {
        if(context0 != null) {
            Resources resources0 = context0.getResources();
            if(resources0 != null) {
                int v = i.r(context0, s, "bool");
                if(v > 0) {
                    return resources0.getBoolean(v);
                }
                int v1 = i.r(context0, s, "string");
                return v1 <= 0 ? z : Boolean.parseBoolean(context0.getString(v1));
            }
        }
        return z;
    }

    public static List l(Context context0) {
        List list0 = new ArrayList();
        int v1 = i.r(context0, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int v2 = i.r(context0, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int v3 = i.r(context0, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if(v1 != 0 && v2 != 0 && v3 != 0) {
            String[] arr_s = context0.getResources().getStringArray(v1);
            String[] arr_s1 = context0.getResources().getStringArray(v2);
            String[] arr_s2 = context0.getResources().getStringArray(v3);
            if(arr_s.length == arr_s2.length && arr_s1.length == arr_s2.length) {
                for(int v = 0; v < arr_s2.length; ++v) {
                    list0.add(new j2.f(arr_s[v], arr_s1[v], arr_s2[v]));
                }
                return list0;
            }
            f.f().b(String.format("Lengths did not match: %d %d %d", ((int)arr_s.length), ((int)arr_s1.length), ((int)arr_s2.length)));
            return list0;
        }
        f.f().b(String.format("Could not find resources: %d %d %d", v1, v2, v3));
        return list0;
    }

    public static int m() {
        return a.b().ordinal();
    }

    public static int n() {
        int v = i.z();
        if(i.A()) {
            v |= 2;
        }
        return i.y() ? v | 4 : v;
    }

    public static String o(Context context0) {
        int v = i.r(context0, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if(v == 0) {
            v = i.r(context0, "com.crashlytics.android.build_id", "string");
        }
        return v == 0 ? null : context0.getResources().getString(v);
    }

    // 去混淆评级： 低(20)
    public static boolean p(Context context0) {
        return i.z() ? false : ((SensorManager)context0.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String q(Context context0) {
        int v = context0.getApplicationContext().getApplicationInfo().icon;
        if(v > 0) {
            try {
                String s = context0.getResources().getResourcePackageName(v);
                return "android".equals(s) ? "com.fmkorea.m.fmk" : s;
            }
            catch(Resources.NotFoundException unused_ex) {
                return "com.fmkorea.m.fmk";
            }
        }
        return "com.fmkorea.m.fmk";
    }

    public static int r(Context context0, String s, String s1) {
        return context0.getResources().getIdentifier(s, s1, i.q(context0));
    }

    public static SharedPreferences s(Context context0) {
        return context0.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static long t() {
        synchronized(i.class) {
            if(i.b == -1L) {
                String s = i.i(new File("/proc/meminfo"), "MemTotal");
                long v1 = 0L;
                if(!TextUtils.isEmpty(s)) {
                    String s1 = s.toUpperCase(Locale.US);
                    try {
                        if(s1.endsWith("KB")) {
                            v1 = i.g(s1, "KB", 0x400);
                        }
                        else if(s1.endsWith("MB")) {
                            v1 = i.g(s1, "MB", 0x100000);
                        }
                        else if(s1.endsWith("GB")) {
                            v1 = i.g(s1, "GB", 0x40000000);
                        }
                        else {
                            f.f().k("Unexpected meminfo format while computing RAM: " + s1);
                        }
                        i.b = v1;
                        return i.b;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    f.f().e("Unexpected meminfo format while computing RAM: " + s1, numberFormatException0);
                }
                i.b = v1;
            }
            return i.b;
        }
    }

    private static String u(String s, String s1) {
        return i.v(s.getBytes(), s1);
    }

    private static String v(byte[] arr_b, String s) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance(s);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            f.f().e("Could not create hashing algorithm: " + s + ", returning empty string.", noSuchAlgorithmException0);
            return "";
        }
        messageDigest0.update(arr_b);
        return i.w(messageDigest0.digest());
    }

    public static String w(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length * 2];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_c[v * 2] = i.a[(v1 & 0xFF) >>> 4];
            arr_c[v * 2 + 1] = i.a[v1 & 15];
        }
        return new String(arr_c);
    }

    public static boolean x(Context context0) {
        return (context0.getApplicationInfo().flags & 2) != 0;
    }

    // 去混淆评级： 低(20)
    public static boolean y() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    // 去混淆评级： 低(30)
    public static boolean z() {
        return Build.PRODUCT.contains("sdk") || (Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu"));
    }
}


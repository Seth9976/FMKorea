package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.app.p;
import com.huawei.hms.api.HuaweiApiAvailability;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSUtils {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");

        private final String f;

        private b(String s1) {
            this.f = s1;
        }

        public static b b(String s) {
            b[] arr_oSUtils$b = b.values();
            for(int v = 0; v < arr_oSUtils$b.length; ++v) {
                b oSUtils$b0 = arr_oSUtils$b[v];
                if(oSUtils$b0.f.equalsIgnoreCase(s)) {
                    return oSUtils$b0;
                }
            }
            return null;
        }
    }

    public static int a = 3;
    static final int[] b;

    static {
        OSUtils.b = new int[]{401, 402, 403, 404, 410};
    }

    int A(Context context0, String s) {
        int v = this.e();
        try {
            UUID.fromString(s);
        }
        catch(Throwable throwable0) {
            I1.b(C.g, "OneSignal AppId format is invalid.\nExample: \'b2f7f966-d8cc-11e4-bed1-df8f05be55ba\'\n", throwable0);
            return -999;
        }
        if("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(s) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(s)) {
            I1.a(C.h, "OneSignal Example AppID detected, please update to your app\'s id found on OneSignal.com");
        }
        int v1 = 1;
        if(v == 1) {
            Integer integer0 = this.c();
            if(integer0 != null) {
                v1 = (int)integer0;
            }
        }
        Integer integer1 = this.b(context0);
        return integer1 == null ? v1 : ((int)integer1);
    }

    static boolean B() {
        return new OSUtils().e() == 1;
    }

    static boolean C() {
        return new OSUtils().e() == 2;
    }

    static boolean D() {
        return OSUtils.P("com.google.android.gms");
    }

    private static boolean E() {
        HuaweiApiAvailability huaweiApiAvailability0 = HuaweiApiAvailability.getInstance();
        try {
            return huaweiApiAvailability0.isHuaweiMobileServicesAvailable(I1.b) == 0;
        }
        catch(RuntimeException runtimeException0) {
            if(!i.a(runtimeException0.getCause())) {
                throw runtimeException0;
            }
            return false;
        }
    }

    private static boolean F() {
        return OSUtils.P("com.huawei.hwid");
    }

    static boolean G() {
        return new OSUtils().e() == 13;
    }

    static boolean H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    static boolean I(String s) {
        return !TextUtils.isEmpty(s);
    }

    static boolean J(String s) {
        return s != null && !s.matches("^[0-9]");
    }

    static Set K() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static Set L(JSONArray jSONArray0) {
        Set set0 = new HashSet();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            set0.add(jSONArray0.getString(v));
        }
        return set0;
    }

    private static void M(Uri uri0) {
        Intent intent0 = OSUtils.O(uri0);
        I1.b.startActivity(intent0);
    }

    static void N(String s) {
        OSUtils.M(Uri.parse(s.trim()));
    }

    static Intent O(Uri uri0) {
        Intent intent0;
        b oSUtils$b0 = uri0.getScheme() == null ? null : b.b(uri0.getScheme());
        if(oSUtils$b0 == null) {
            oSUtils$b0 = b.i;
            if(!uri0.toString().contains("://")) {
                uri0 = Uri.parse(("http://" + uri0.toString()));
            }
        }
        if(a.a[oSUtils$b0.ordinal()] == 1) {
            intent0 = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent0.setData(uri0);
        }
        else {
            intent0 = new Intent("android.intent.action.VIEW", uri0);
        }
        intent0.addFlags(0x10000000);
        return intent0;
    }

    private static boolean P(String s) {
        z z0 = Y1.a.a(I1.b, s, 0x80);
        if(!z0.b()) {
            return false;
        }
        PackageInfo packageInfo0 = z0.a();
        return packageInfo0 == null ? false : packageInfo0.applicationInfo.enabled;
    }

    static long[] Q(JSONObject jSONObject0) {
        try {
            Object object0 = jSONObject0.opt("vib_pt");
            JSONArray jSONArray0 = object0 instanceof String ? new JSONArray(((String)object0)) : ((JSONArray)object0);
            long[] arr_v = new long[jSONArray0.length()];
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arr_v[v] = jSONArray0.optLong(v);
            }
            return arr_v;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    static void R(Runnable runnable0, int v) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable0, ((long)v));
    }

    static void S(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable0.run();
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable0);
    }

    static boolean T(String s) {
        if(s != null) {
            return false;
        }
        I1.a(C.j, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean U(int v) {
        int[] arr_v = OSUtils.b;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return false;
            }
        }
        return true;
    }

    static void V(int v) {
        try {
            Thread.sleep(v);
        }
        catch(InterruptedException interruptedException0) {
            interruptedException0.printStackTrace();
        }
    }

    static void W(Thread thread0) {
        for(boolean z = false; !z; z = true) {
            try {
                thread0.start();
            }
            catch(OutOfMemoryError unused_ex) {
                try {
                    Thread.sleep(0xFAL);
                }
                catch(InterruptedException unused_ex) {
                }
            }
        }
    }

    private boolean X() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(30)
    private boolean Y() {
        return OSUtils.D();
    }

    // 去混淆评级： 低(20)
    private boolean Z() {
        return !OSUtils.u() || !OSUtils.p() ? false : OSUtils.E();
    }

    static boolean a(Context context0) {
        try {
            return p.d(I1.b).a();
        }
        catch(Throwable unused_ex) {
            return true;
        }
    }

    private Integer b(Context context0) {
        if(Build.VERSION.SDK_INT >= 26) {
            boolean z = OSUtils.o(context0) < 26;
        }
        return null;
    }

    // 去混淆评级： 低(30)
    Integer c() {
        return null;
    }

    String d() {
        try {
            String s = ((TelephonyManager)I1.b.getSystemService("phone")).getNetworkOperatorName();
            if(!"".equals(s)) {
                return s;
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        return null;
    }

    int e() {
        if(this.X()) {
            return 2;
        }
        boolean z = this.Z();
        boolean z1 = this.Y();
        if(z1 && z) {
            return I1.b != null && OSUtils.g(I1.b, "com.onesignal.preferHMS") ? 13 : 1;
        }
        if(z1) {
            return 1;
        }
        if(z) {
            return 13;
        }
        if(OSUtils.D()) {
            return 1;
        }
        return OSUtils.F() ? 13 : 1;
    }

    static String f(Context context0, String s) {
        Bundle bundle0 = OSUtils.h(context0);
        return bundle0 == null ? null : bundle0.getString(s);
    }

    static boolean g(Context context0, String s) {
        Bundle bundle0 = OSUtils.h(context0);
        return bundle0 == null ? false : bundle0.getBoolean(s);
    }

    static Bundle h(Context context0) {
        ApplicationInfo applicationInfo0 = j.a.a(context0);
        return applicationInfo0 == null ? null : applicationInfo0.metaData;
    }

    Integer i() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)I1.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 != null) {
            switch(networkInfo0.getType()) {
                case 1: 
                case 9: {
                    return 0;
                }
                default: {
                    return 1;
                }
            }
        }
        return null;
    }

    static int j(int v, int v1) {
        return new Random().nextInt(v1 + 1 - v) + v;
    }

    static String k(Context context0, String s, String s1) {
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier(s, "string", "com.fmkorea.m.fmk");
        return v == 0 ? s1 : resources0.getString(v);
    }

    static String l(Throwable throwable0) {
        return OSUtils.m(throwable0).getMessage();
    }

    static Throwable m(Throwable throwable0) {
        while(throwable0.getCause() != null && throwable0.getCause() != throwable0) {
            throwable0 = throwable0.getCause();
        }
        return throwable0;
    }

    static Uri n(Context context0, String s) {
        Resources resources0 = context0.getResources();
        if(OSUtils.J(s)) {
            int v = resources0.getIdentifier(s, "raw", "com.fmkorea.m.fmk");
            if(v != 0) {
                return Uri.parse(("android.resource://com.fmkorea.m.fmk/" + v));
            }
        }
        int v1 = resources0.getIdentifier("onesignal_default_sound", "raw", "com.fmkorea.m.fmk");
        return v1 == 0 ? null : Uri.parse(("android.resource://com.fmkorea.m.fmk/" + v1));
    }

    static int o(Context context0) {
        return j.a.a(context0) == null ? 15 : 35;
    }

    @Keep
    private static boolean opaqueHasClass(Class class0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    static boolean p() {
        return OSUtils.t() && OSUtils.w();
    }

    static boolean q(Activity activity0, int v) {
        try {
            if((activity0.getPackageManager().getActivityInfo(activity0.getComponentName(), 0).configChanges & v) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            packageManager$NameNotFoundException0.printStackTrace();
        }
        return false;
    }

    static boolean r() [...] // 潜在的解密器

    static boolean s() [...] // 潜在的解密器

    private static boolean t() {
        return true;
    }

    private static boolean u() {
        return true;
    }

    static boolean v() {
        return true;
    }

    private static boolean w() {
        return true;
    }

    private static boolean x() [...] // Inlined contents

    private static boolean y() [...] // Inlined contents

    private static boolean z() [...] // Inlined contents
}


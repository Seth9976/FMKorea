package com.google.android.gms.ads.internal.util;

import Z1.d;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcez;
import com.google.android.gms.internal.ads.zzcgf;
import com.google.android.gms.internal.ads.zzdop;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfbi;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzgzh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzs {
    public static final zzfoe zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private boolean zzd;
    private final Object zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private final Executor zzi;

    static {
        zzs.zza = new zzf(Looper.getMainLooper());
    }

    public zzs() {
        this.zzb = new AtomicReference(null);
        this.zzc = new AtomicReference(null);
        this.zzd = true;
        this.zze = new Object();
        this.zzg = false;
        this.zzh = false;
        this.zzi = Executors.newSingleThreadExecutor();
    }

    public static final boolean zzA(Context context0) {
        if(context0 == null) {
            return false;
        }
        KeyguardManager keyguardManager0 = zzs.zzU(context0);
        return keyguardManager0 != null && keyguardManager0.isKeyguardLocked();
    }

    public static final boolean zzB(Context context0) {
        try {
            context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        }
        catch(ClassNotFoundException unused_ex) {
            return true;
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Error loading class.", throwable0);
            zzt.zzo().zzu(throwable0, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzC() {
        switch(Process.myUid()) {
            case 0: 
            case 1000: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean zzD(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
            if(activityManager0 != null && keyguardManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 == null) {
                    return false;
                }
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                        if(activityManager$RunningAppProcessInfo0.importance != 100 || keyguardManager0.inKeyguardRestrictedInputMode()) {
                            break;
                        }
                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                        return powerManager0 == null || !powerManager0.isScreenOn();
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static final boolean zzE(Context context0) {
        Bundle bundle0 = zzs.zzV(context0);
        String s = bundle0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        return TextUtils.isEmpty(zzs.zzW(bundle0)) && !TextUtils.isEmpty(s);
    }

    public static final boolean zzF(Context context0) {
        if(!(context0 instanceof Activity)) {
            return false;
        }
        Window window0 = ((Activity)context0).getWindow();
        if(window0 != null && window0.getDecorView() != null) {
            Rect rect0 = new Rect();
            Rect rect1 = new Rect();
            window0.getDecorView().getGlobalVisibleRect(rect0, null);
            window0.getDecorView().getWindowVisibleDisplayFrame(rect1);
            return rect0.bottom != 0 && rect1.bottom != 0 && rect0.top == rect1.top;
        }
        return false;
    }

    public static final void zzG(View view0, int v, MotionEvent motionEvent0) {
        String s2;
        int v3;
        int v2;
        int v1;
        String s;
        int[] arr_v = new int[2];
        Rect rect0 = new Rect();
        try {
            if(view0 instanceof zzdop) {
                view0 = ((zzdop)view0).getChildAt(0);
            }
            if(view0 instanceof zzg) {
                s = "NATIVE";
                v1 = 1;
            }
            else if(!(view0 instanceof NativeAdView)) {
                s = "UNKNOWN";
                v1 = 0;
            }
            else {
                s = "NATIVE";
                v1 = 1;
            }
            if(view0.getLocalVisibleRect(rect0)) {
                v2 = rect0.width();
                v3 = rect0.height();
            }
            else {
                v3 = 0;
                v2 = 0;
            }
            String s1 = "none";
            long v4 = zzs.zzt(view0);
            view0.getLocationOnScreen(arr_v);
            int v5 = arr_v[0];
            int v6 = arr_v[1];
            if(view0 instanceof zzcgf) {
                zzfbi zzfbi0 = ((zzcgf)view0).zzP();
                if(zzfbi0 == null) {
                    s2 = "none";
                }
                else {
                    s2 = zzfbi0.zzb;
                    view0.setContentDescription(s2 + ":" + view0.hashCode());
                }
            }
            else {
                s2 = "none";
            }
            if(view0 instanceof zzcez) {
                zzfbe zzfbe0 = ((zzcez)view0).zzD();
                if(zzfbe0 != null) {
                    s = zzfbe.zza(zzfbe0.zzb);
                    v1 = zzfbe0.zzf;
                    s1 = zzfbe0.zzF;
                }
            }
            zzcaa.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", view0.hashCode(), "com.fmkorea.m.fmk", s1, s2, s, v1, view0.getClass().getName(), v5, v6, view0.getWidth(), view0.getHeight(), v2, v3, v4, Integer.toString(v, 2)));
            return;
        }
        catch(Exception exception0) {
        }
        zzcaa.zzh("Failure getting view location.", exception0);
    }

    public static final AlertDialog.Builder zzH(Context context0) {
        return new AlertDialog.Builder(context0, zzt.zzq().zza());
    }

    public static final void zzI(Context context0, String s, String s1) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        for(Object object0: arrayList0) {
            new zzby(context0, s, ((String)object0)).zzb();
        }
    }

    public static final void zzJ(Context context0, Throwable throwable0) {
        if(context0 != null) {
            try {
                if(((Boolean)zzbds.zzb.zze()).booleanValue()) {
                    goto label_2;
                }
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        label_2:
            CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
        }
    }

    public static final String zzK(InputStreamReader inputStreamReader0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x2000);
        char[] arr_c = new char[0x800];
        int v;
        while((v = inputStreamReader0.read(arr_c)) != -1) {
            stringBuilder0.append(arr_c, 0, v);
        }
        return stringBuilder0.toString();
    }

    public static final int zzL(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException numberFormatException0) {
            zzcaa.zzj(("Could not parse value:" + numberFormatException0.toString()));
            return 0;
        }
    }

    // 检测为 Lambda 实现
    public static final Map zzM(Uri uri0) [...]

    public static final int[] zzN(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? zzs.zzr() : new int[]{view0.getWidth(), view0.getHeight()};
        }
        return zzs.zzr();
    }

    public static final int[] zzO(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            if(view0 != null) {
                new int[]{view0.getTop(), view0.getBottom()};
                int v = view0.getTop();
                int v1 = view0.getBottom();
                return new int[]{zzay.zzb().zzb(activity0, v), zzay.zzb().zzb(activity0, v1)};
            }
        }
        int[] arr_v = zzs.zzr();
        return new int[]{zzay.zzb().zzb(activity0, arr_v[0]), zzay.zzb().zzb(activity0, arr_v[1])};
    }

    public static final boolean zzP(View view0, PowerManager powerManager0, KeyguardManager keyguardManager0) {
        boolean z;
        if(zzt.zzp().zzd || keyguardManager0 == null) {
            z = true;
        }
        else if(keyguardManager0.inKeyguardRestrictedInputMode() && !zzs.zzl(view0)) {
            z = false;
        }
        else {
            z = true;
        }
        long v = zzs.zzt(view0);
        return view0.getVisibility() == 0 && view0.isShown() && (powerManager0 == null || powerManager0.isScreenOn()) ? z && (!((Boolean)zzba.zzc().zzb(zzbbr.zzbi)).booleanValue() || view0.getLocalVisibleRect(new Rect()) || view0.getGlobalVisibleRect(new Rect())) && (!((Boolean)zzba.zzc().zzb(zzbbr.zzjC)).booleanValue() || v >= ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzjE))))))) : false;
    }

    public static final void zzQ(Context context0, Intent intent0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjU)).booleanValue()) {
            try {
                zzs.zzY(context0, intent0);
            }
            catch(SecurityException securityException0) {
                zzcaa.zzk("", securityException0);
                zzt.zzo().zzu(securityException0, "AdUtil.startActivityWithUnknownContext");
            }
            return;
        }
        zzs.zzY(context0, intent0);
    }

    public static final void zzR(Context context0, Uri uri0) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            Bundle bundle0 = new Bundle();
            intent0.putExtras(bundle0);
            zzs.zzm(context0, intent0);
            bundle0.putString("com.android.browser.application_id", "com.fmkorea.m.fmk");
            context0.startActivity(intent0);
            zzcaa.zze(("Opening " + uri0.toString() + " in a new browser."));
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzcaa.zzh("No browser is found.", activityNotFoundException0);
        }
    }

    public static final int[] zzS(Activity activity0) {
        int[] arr_v = zzs.zzN(activity0);
        return new int[]{zzay.zzb().zzb(activity0, arr_v[0]), zzay.zzb().zzb(activity0, arr_v[1])};
    }

    public static final boolean zzT(View view0, Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? zzs.zzP(view0, null, zzs.zzU(context0)) : zzs.zzP(view0, ((PowerManager)context1.getSystemService("power")), zzs.zzU(context0));
    }

    private static KeyguardManager zzU(Context context0) {
        Object object0 = context0.getSystemService("keyguard");
        return object0 == null || !(object0 instanceof KeyguardManager) ? null : ((KeyguardManager)object0);
    }

    private static Bundle zzV(Context context0) {
        try {
            return Wrappers.packageManager(context0).getApplicationInfo("com.fmkorea.m.fmk", 0x80).metaData;
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            zze.zzb("Error getting metadata", packageManager$NameNotFoundException0);
            return null;
        }
    }

    private static String zzW(Bundle bundle0) {
        if(bundle0 == null) {
            return "";
        }
        String s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        return s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || s.matches("^/\\d+~.+$") ? s : "";
    }

    private static boolean zzX(String s, AtomicReference atomicReference0, String s1) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Pattern pattern0 = (Pattern)atomicReference0.get();
            if(pattern0 == null || !s1.equals(pattern0.pattern())) {
                pattern0 = Pattern.compile(s1);
                atomicReference0.set(pattern0);
            }
            return pattern0.matcher(s).matches();
        }
        catch(PatternSyntaxException unused_ex) {
            return false;
        }
    }

    private static final void zzY(Context context0, Intent intent0) {
        try {
            context0.startActivity(intent0);
        }
        catch(Throwable unused_ex) {
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
        }
    }

    public static int zza(int v) {
        if(v >= 5000) {
            return v;
        }
        if(v > 0) {
            zzcaa.zzj(("HTTP timeout too low: " + v + " milliseconds. Reverting to default timeout: 60000 milliseconds."));
        }
        return 60000;
    }

    public final d zzb(Uri uri0) {
        return zzfye.zzj(() -> {
            if(uri0 == null) {
                return null;
            }
            Map map0 = new HashMap();
            for(Object object0: uri0.getQueryParameterNames()) {
                String s = (String)object0;
                if(!TextUtils.isEmpty(s)) {
                    ((HashMap)map0).put(s, uri0.getQueryParameter(s));
                }
            }
            return map0;
        }, this.zzi);
    }

    public final String zzc(Context context0, String s) {
        synchronized(this.zze) {
            String s1 = this.zzf;
            if(s1 != null) {
                return s1;
            }
            if(s == null) {
                return zzs.zzo();
            }
            try {
                zzci zzci0 = zzci.zza();
                if(TextUtils.isEmpty(zzci0.zza)) {
                    zzci0.zza = (String)zzcf.zza(context0, new zzch(GooglePlayServicesUtilLight.getRemoteContext(context0), context0));
                }
                this.zzf = zzci0.zza;
            }
            catch(Exception unused_ex) {
            }
            if(TextUtils.isEmpty(this.zzf)) {
                this.zzf = WebSettings.getDefaultUserAgent(context0);
            }
            if(TextUtils.isEmpty(this.zzf)) {
                this.zzf = zzs.zzo();
            }
            try {
                this.zzf = this.zzf + " (Mobile; " + s;
                if(Wrappers.packageManager(context0).isCallerInstantApp()) {
                    this.zzf = this.zzf + ";aia";
                }
            }
            catch(Exception exception0) {
                zzt.zzo().zzu(exception0, "AdUtil.getUserAgent");
            }
            String s3 = this.zzf + ")";
            this.zzf = s3;
            return s3;
        }
    }

    public static List zzd() {
        List list0 = zzba.zza().zzb();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            for(Object object1: zzfrv.zzc(zzfqt.zzc(',')).zzd(((String)object0))) {
                String s = (String)object1;
                try {
                    list1.add(Long.valueOf(s));
                }
                catch(NumberFormatException unused_ex) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return list1;
    }

    static void zze(zzs zzs0, boolean z) {
        zzs0.zzd = z;
    }

    public final void zzf(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0, boolean z1, int v) {
        int v1 = zzs.zza(v);
        zzcaa.zzi(("HTTP timeout: " + v1 + " milliseconds."));
        httpURLConnection0.setConnectTimeout(v1);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setReadTimeout(v1);
        if(TextUtils.isEmpty(httpURLConnection0.getRequestProperty("User-Agent"))) {
            httpURLConnection0.setRequestProperty("User-Agent", this.zzc(context0, s));
        }
        httpURLConnection0.setUseCaches(false);
    }

    public final boolean zzg(String s) {
        String s1 = (String)zzba.zzc().zzb(zzbbr.zzac);
        return zzs.zzX(s, this.zzb, s1);
    }

    public final boolean zzh(String s) {
        String s1 = (String)zzba.zzc().zzb(zzbbr.zzad);
        return zzs.zzX(s, this.zzc, s1);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context0) {
        if(this.zzh) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbbr.zza(context0);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context0.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter0);
        }
        else {
            context0.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter0, 4);
        }
        this.zzh = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context0) {
        if(this.zzg) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        zzbbr.zza(context0);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context0.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter0);
        }
        else {
            context0.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter0, 4);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context0, Uri uri0) {
        int v;
        if(context0 == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if(context0 instanceof Activity) {
            v = 0;
        }
        else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            v = 2;
        }
        zzbbj zzbbj0 = zzbbr.zzes;
        Boolean boolean0 = (Boolean)zzba.zzc().zzb(zzbbj0);
        zzbbj zzbbj1 = zzbbr.zzet;
        if(boolean0.equals(zzba.zzc().zzb(zzbbj1))) {
            v = 9;
        }
        if(v != 0) {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
            return v;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
            zzbcs zzbcs0 = new zzbcs();
            zzbcs0.zze(new zzn(this, zzbcs0, context0, uri0));
            zzbcs0.zzb(((Activity)context0));
        }
        if(((Boolean)zzba.zzc().zzb(zzbbj1)).booleanValue()) {
            androidx.browser.customtabs.d d0 = new androidx.browser.customtabs.d.d().a();
            String s = zzgzh.zza(context0);
            d0.a.setPackage(s);
            d0.a(context0, uri0);
        }
        return 5;
    }

    public static final boolean zzl(View view0) {
        Activity activity0;
        View view1 = view0.getRootView();
        WindowManager.LayoutParams windowManager$LayoutParams0 = null;
        if(view1 == null) {
            activity0 = null;
        }
        else {
            Context context0 = view1.getContext();
            activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
        }
        if(activity0 == null) {
            return false;
        }
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            windowManager$LayoutParams0 = window0.getAttributes();
        }
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x80000) != 0;
    }

    public static final void zzm(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        Bundle bundle0 = intent0.getExtras() == null ? new Bundle() : intent0.getExtras();
        bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle0.putString("com.android.browser.application_id", "com.fmkorea.m.fmk");
        intent0.putExtras(bundle0);
    }

    public static final String zzn(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        return zzs.zzW(zzs.zzV(context0));
    }

    static final String zzo() {
        StringBuilder stringBuilder0 = new StringBuilder(0x100);
        stringBuilder0.append("Mozilla/5.0 (Linux; U; Android");
        String s = Build.VERSION.RELEASE;
        if(s != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(s);
        }
        stringBuilder0.append("; ");
        stringBuilder0.append(Locale.getDefault());
        String s1 = Build.DEVICE;
        if(s1 != null) {
            stringBuilder0.append("; ");
            stringBuilder0.append(s1);
            String s2 = Build.DISPLAY;
            if(s2 != null) {
                stringBuilder0.append(" Build/");
                stringBuilder0.append(s2);
            }
        }
        stringBuilder0.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    public static final String zzp() {
        return Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static final DisplayMetrics zzq(WindowManager windowManager0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0;
    }

    protected static final int[] zzr() {
        return new int[]{0, 0};
    }

    public static final Map zzs(String s) {
        JSONObject jSONObject0;
        Map map0 = new HashMap();
        try {
            jSONObject0 = new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            zzt.zzo().zzu(jSONException0, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map0;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            HashSet hashSet0 = new HashSet();
            JSONArray jSONArray0 = jSONObject0.optJSONArray(s1);
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s2 = jSONArray0.optString(v);
                    if(s2 != null) {
                        hashSet0.add(s2);
                    }
                }
                map0.put(s1, hashSet0);
            }
        }
        return map0;
    }

    public static final long zzt(View view0) {
        float f1;
        float f = 3.402823E+38f;
        do {
            f1 = 0.0f;
            if(!(view0 instanceof View)) {
                break;
            }
            f = Math.min(f, view0.getAlpha());
            view0 = view0.getParent();
        }
        while(f > 0.0f);
        if(f >= 0.0f) {
            f1 = f;
        }
        return (long)Math.round(f1 * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context0, String s, String s1) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("User-Agent", zzt.zzp().zzc(context0, s));
            hashMap0.put("Cache-Control", "max-stale=3600");
            String s2 = (String)new zzbo(context0).zzb(0, s1, hashMap0, null).get(60L, TimeUnit.SECONDS);
            if(s2 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(s2.getBytes("UTF-8")));
            }
        }
        catch(IOException | ExecutionException | InterruptedException | TimeoutException iOException0) {
            zzcaa.zzk("Could not fetch MRAID JS.", iOException0);
        }
        return null;
    }

    public static final String zzv() {
        Resources resources0 = zzt.zzo().zzd();
        return resources0 == null ? "Test Ad" : resources0.getString(string.s7);
    }

    public static final zzbr zzw(Context context0) {
        Object object0;
        try {
            object0 = context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception exception0) {
            zzt.zzo().zzu(exception0, "Failed to instantiate WorkManagerUtil");
            return null;
        }
        if(!(object0 instanceof IBinder)) {
            zzcaa.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        }
        if(((IBinder)object0) != null) {
            IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterface0 instanceof zzbr ? ((zzbr)iInterface0) : new zzbp(((IBinder)object0));
        }
        return null;
    }

    public static final boolean zzx(Context context0, String s) {
        return Wrappers.packageManager(zzbvb.zza(context0)).checkPermission(s, "com.fmkorea.m.fmk") == 0;
    }

    public static final boolean zzy(Context context0) {
        try {
            return DeviceProperties.isBstar(context0);
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
    }

    public static final boolean zzz(String s) {
        if(!zzbzz.zzk()) {
            return false;
        }
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzeN)).booleanValue()) {
            return false;
        }
        String s1 = (String)zzba.zzc().zzb(zzbbr.zzeP);
        if(!s1.isEmpty()) {
            String[] arr_s = s1.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return false;
                }
            }
        }
        String s2 = (String)zzba.zzc().zzb(zzbbr.zzeO);
        if(s2.isEmpty()) {
            return true;
        }
        String[] arr_s1 = s2.split(";");
        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
            if(arr_s1[v1].equals(s)) {
                return true;
            }
        }
        return false;
    }
}


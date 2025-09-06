package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b1.a;
import com.facebook.appevents.m;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

class f {
    private final m a;
    private String b;
    private String c;
    private static final ScheduledExecutorService d;

    static {
        f.d = Executors.newSingleThreadScheduledExecutor();
    }

    f(Context context0, String s) {
        this.b = s;
        this.a = new m(context0, s);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.facebook.katana", 0);
                if(packageInfo0 != null) {
                    this.c = packageInfo0.versionName;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    public String a() {
        return a.d(this) ? null : this.b;
    }

    public void b(String s, String s1, String s2, String s3, String s4, Map map0) {
        if(a.d(this)) {
            return;
        }
        try {
            Bundle bundle0 = f.f(s);
            if(s2 != null) {
                bundle0.putString("2_result", s2);
            }
            if(s3 != null) {
                bundle0.putString("5_error_message", s3);
            }
            if(s4 != null) {
                bundle0.putString("4_error_code", s4);
            }
            if(map0 != null && !map0.isEmpty()) {
                bundle0.putString("6_extras", new JSONObject(map0).toString());
            }
            bundle0.putString("3_method", s1);
            this.a.j("fb_mobile_login_method_complete", bundle0);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }

    public void c(String s, String s1) {
        if(a.d(this)) {
            return;
        }
        try {
            Bundle bundle0 = f.f(s);
            bundle0.putString("3_method", s1);
            this.a.j("fb_mobile_login_method_not_tried", bundle0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    public void d(String s, String s1) {
        if(a.d(this)) {
            return;
        }
        try {
            Bundle bundle0 = f.f(s);
            bundle0.putString("3_method", s1);
            this.a.j("fb_mobile_login_method_start", bundle0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    public void e(String s, String s1, String s2) {
        if(a.d(this)) {
            return;
        }
        try {
            Bundle bundle0 = f.f("");
            bundle0.putString("2_result", "error");
            bundle0.putString("5_error_message", s1);
            bundle0.putString("3_method", s2);
            this.a.j(s, bundle0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    static Bundle f(String s) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle0.putString("0_auth_logger_id", s);
            bundle0.putString("3_method", "");
            bundle0.putString("2_result", "");
            bundle0.putString("5_error_message", "");
            bundle0.putString("4_error_code", "");
            bundle0.putString("6_extras", "");
            return bundle0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }
}


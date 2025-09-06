package com.google.firebase;

import J2.c;
import J2.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import z2.f;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    // 检测为 Lambda 实现
    public static String a(Context context0) [...]

    // 检测为 Lambda 实现
    public static String b(Context context0) [...]

    // 检测为 Lambda 实现
    public static String c(Context context0) [...]

    // 检测为 Lambda 实现
    public static String d(Context context0) [...]

    private static String e(Context context0) {
        return context0.getApplicationInfo() == null ? "" : "35";
    }

    private static String f(Context context0) {
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        return applicationInfo0 == null || Build.VERSION.SDK_INT < 24 ? "" : String.valueOf(applicationInfo0.minSdkVersion);
    }

    private static String g(Context context0) {
        int v = Build.VERSION.SDK_INT;
        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return v < 26 || !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "" : "embedded";
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        List list0 = new ArrayList();
        list0.add(c.c());
        list0.add(f.g());
        list0.add(h.b("fire-android", "33"));
        list0.add(h.b("fire-core", "20.4.2"));
        list0.add(h.b("device-name", FirebaseCommonRegistrar.i(Build.PRODUCT)));
        list0.add(h.b("device-model", FirebaseCommonRegistrar.i(Build.DEVICE)));
        list0.add(h.b("device-brand", FirebaseCommonRegistrar.i(Build.BRAND)));
        list0.add(h.c("android-target-sdk", (Context context0) -> FirebaseCommonRegistrar.e(context0)));
        list0.add(h.c("android-min-sdk", (Context context0) -> FirebaseCommonRegistrar.f(context0)));
        list0.add(h.c("android-platform", (Context context0) -> FirebaseCommonRegistrar.g(context0)));
        list0.add(h.c("android-installer", (Context context0) -> FirebaseCommonRegistrar.h(context0)));
        list0.add(h.b("kotlin", "2.1.20"));
        return list0;
    }

    private static String h(Context context0) {
        String s = context0.getPackageManager().getInstallerPackageName("com.fmkorea.m.fmk");
        return s == null ? "" : FirebaseCommonRegistrar.i(s);
    }

    private static String i(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }
}


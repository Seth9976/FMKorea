package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import b1.a;
import com.facebook.h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class f {
    private static final String[] a;

    static {
        f.a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static String a() {
        ServiceInfo serviceInfo0;
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Context context0 = h.e();
            Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
            List list0 = context0.getPackageManager().queryIntentServices(intent0, 0);
            if(list0 == null) {
                return null;
            }
            HashSet hashSet0 = new HashSet(Arrays.asList(f.a));
            Iterator iterator0 = list0.iterator();
            do {
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                serviceInfo0 = ((ResolveInfo)object0).serviceInfo;
            }
            while(serviceInfo0 == null || !hashSet0.contains(serviceInfo0.packageName));
            return serviceInfo0.packageName;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    // 去混淆评级： 中等(60)
    public static String b() {
        return "fbconnect://cct.com.fmkorea.m.fmk";
    }

    public static String c(String s) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(G.d(h.e(), s)) {
                return s;
            }
            return G.d(h.e(), f.b()) ? f.b() : "";
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }
}


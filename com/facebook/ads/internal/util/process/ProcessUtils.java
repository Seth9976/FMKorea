package com.facebook.ads.internal.util.process;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.lang.reflect.Field;

@Keep
public final class ProcessUtils {
    private static String sProcessName;

    public static String getProcessName(Context context0) {
        synchronized(ProcessUtils.class) {
            String s = ProcessUtils.sProcessName;
            if(s != null) {
                return s;
            }
        }
        if(Build.VERSION.SDK_INT >= 28) {
            return ProcessUtils.getProcessNameAPI28();
        }
        Context context1 = context0.getApplicationContext();
        if(context1 instanceof Application) {
            String s1 = ProcessUtils.getProcessNameViaReflection(((Application)context1));
            synchronized(ProcessUtils.class) {
                ProcessUtils.sProcessName = s1;
            }
            return s1;
        }
        return null;
    }

    private static String getProcessNameAPI28() {
        try {
            return Application.getProcessName();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private static String getProcessNameViaReflection(Application application0) {
        try {
            Field field0 = application0.getClass().getField("mLoadedApk");
            field0.setAccessible(true);
            Object object0 = field0.get(application0);
            Field field1 = object0.getClass().getDeclaredField("mActivityThread");
            field1.setAccessible(true);
            Object object1 = field1.get(object0);
            return (String)object1.getClass().getDeclaredMethod("getProcessName", null).invoke(object1, null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static String getProcessSpecificName(String s, Context context0) {
        String s1 = ProcessUtils.getProcessName(context0);
        if(!TextUtils.isEmpty(s1) && !"com.fmkorea.m.fmk".equals(s1)) {
            if(s1.contains(":")) {
                s1 = s1.split(":")[1];
            }
            return s + "_" + s1;
        }
        return s;
    }
}


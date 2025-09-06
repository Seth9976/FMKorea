package B0;

import I0.a;
import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public abstract class q {
    public static Map a(Context context0) {
        int v;
        String s1;
        a a0 = a.V(context0);
        if(a0.y == null) {
            return null;
        }
        Map map0 = new HashMap();
        for(Object object0: a0.y.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            try {
                s1 = null;
                s1 = q.b(context0, ((String)map$Entry0.getValue()));
                v = 0;
            }
            catch(UnsupportedEncodingException unused_ex) {
            }
            if(s1 != null) {
                v = 1;
            }
            if((v & (s == null ? 0 : 1)) != 0) {
                ((HashMap)map0).put(s, s1);
            }
        }
        return map0;
    }

    private static String b(Context context0, String s) {
        if(s == null) {
            return null;
        }
        if(s.contains("%DEVICEID%")) {
            String s1 = Settings.Secure.getString(context0.getContentResolver(), "android_id");
            if(s1 == null) {
                s1 = "";
            }
            s = s.replace("%DEVICEID%", s1);
        }
        return s.contains("%DEVICENAME64%") ? s.replace("%DEVICENAME64%", Base64.encodeToString((Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL).getBytes("UTF-8"), 2)) : s;
    }
}


package B0;

import android.app.Activity;
import android.os.Build.VERSION;
import androidx.core.content.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import l3.m;
import l3.r;
import m3.F;
import org.json.JSONArray;
import z3.k;

public abstract class v0 {
    private static final Map a;

    static {
        v0.a = F.k(new m[]{r.a("Notifications", "android.permission.POST_NOTIFICATIONS"), r.a("Camera", "android.permission.CAMERA"), r.a("Contacts", "android.permission.READ_CONTACTS"), r.a("Microphone", "android.permission.RECORD_AUDIO"), r.a("LocationWhenInUse", "android.permission.ACCESS_FINE_LOCATION"), r.a("LocationAlways", "android.permission.ACCESS_BACKGROUND_LOCATION")});
    }

    public static final Map a(Activity activity0, JSONArray jSONArray0) {
        k.e(activity0, "activity");
        List list0 = jSONArray0 == null ? null : v0.c(jSONArray0);
        Map map0 = new LinkedHashMap();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                String s = (String)object0;
                String s1 = (String)v0.a.get(s);
                if(s1 != null && s1.length() != 0) {
                    map0.put(s, v0.b(activity0, s1));
                }
            }
            return map0;
        }
        for(Object object1: v0.a.entrySet()) {
            map0.put(((String)((Map.Entry)object1).getKey()), v0.b(activity0, ((String)((Map.Entry)object1).getValue())));
        }
        return map0;
    }

    private static final String b(Activity activity0, String s) {
        if(k.a(s, "android.permission.POST_NOTIFICATIONS") && Build.VERSION.SDK_INT < 33) {
            return "granted";
        }
        if(k.a(s, "android.permission.ACCESS_BACKGROUND_LOCATION") && Build.VERSION.SDK_INT < 29) {
            return "granted";
        }
        return a.checkSelfPermission(activity0, s) == 0 ? "granted" : "denied";
    }

    private static final List c(JSONArray jSONArray0) {
        int v = jSONArray0.length();
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(jSONArray0.getString(v1));
        }
        return list0;
    }
}


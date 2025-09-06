package I0;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import androidx.core.content.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

public abstract class v {
    public static boolean a(Activity activity0, String s) {
        try {
            PackageInfo packageInfo0 = activity0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0x1000);
            String[] arr_s = packageInfo0 == null ? null : packageInfo0.requestedPermissions;
            if(arr_s == null || arr_s.length <= 0) {
                return false;
            }
            Iterator iterator0 = new ArrayList(Arrays.asList(arr_s)).iterator();
            do {
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
            }
            while(!((String)object0).equals(s));
            return true;
        }
        catch(Exception exception0) {
            g.a().c("co.median.median_core.Utils", "hasUsesPermission: ", exception0);
            return false;
        }
    }

    public static boolean b(Activity activity0, String s) {
        return !v.a(activity0, s) || a.checkSelfPermission(activity0, s) == 0;
    }

    public static String c(JSONObject jSONObject0, String s) {
        return jSONObject0 == null || s == null || jSONObject0.isNull(s) ? null : jSONObject0.optString(s, null);
    }

    public static Integer d(String s) {
        if(s == null) {
            return null;
        }
        try {
            return Color.parseColor(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            g.a().c("co.median.median_core.Utils", "Bad color string:" + s, illegalArgumentException0);
            return null;
        }
    }
}


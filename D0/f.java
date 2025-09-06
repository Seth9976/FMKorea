package D0;

import I0.h;
import I0.l;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class f {
    private static final String a = "f";

    static {
    }

    public static String a(String s, JSONObject jSONObject0) {
        return l.b(s, jSONObject0);
    }

    public static RelativeLayout b(Activity activity0) {
        if(activity0 == null) {
            return null;
        }
        try {
            return (RelativeLayout)activity0.findViewById(activity0.getResources().getIdentifier("pluginView", "id", "com.fmkorea.m.fmk"));
        }
        catch(Exception exception0) {
            Log.e("TAG", "getAdView: Error retrieving Ad View", exception0);
            return null;
        }
    }

    public static ViewGroup c(Activity activity0) {
        if(activity0 == null) {
            return null;
        }
        try {
            ViewGroup viewGroup0 = (ViewGroup)activity0.findViewById(activity0.getResources().getIdentifier("drawer_layout", "id", "com.fmkorea.m.fmk"));
            return viewGroup0 == null ? ((ViewGroup)activity0.findViewById(activity0.getResources().getIdentifier("no_nav_root", "id", "com.fmkorea.m.fmk"))) : viewGroup0;
        }
        catch(Exception exception0) {
            Log.e("f", "getAdView: Error retrieving Root View", exception0);
            return null;
        }
    }

    public static boolean d(Activity activity0, String s) {
        if(activity0 instanceof h) {
            ((h)activity0).a(s);
            return true;
        }
        return false;
    }

    public static boolean e(Activity activity0, String s, JSONObject jSONObject0) {
        return f.d(activity0, f.a(s, jSONObject0));
    }

    public static void f(Activity activity0, String s, boolean z, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("success", z);
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("message", s1);
            }
            f.e(activity0, s, jSONObject0);
            return;
        }
        catch(JSONException jSONException0) {
        }
        Log.e("f", "sendConsentCallback: ", jSONException0);
    }
}


package co.median.android.plugins.oneSignal;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public static class co.median.android.plugins.oneSignal.a.a {
        public String a;
        public String b;
        public boolean c;

    }

    public static class b {
        public String a;
        public List b;

    }

    public List a;
    private static final String b = "co.median.android.plugins.oneSignal.a";

    static {
    }

    public static a a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            a a0 = new a();
            a0.a = new ArrayList();
            JSONArray jSONArray0 = jSONObject0.optJSONArray("sections");
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                    if(jSONObject1 != null) {
                        b a$b0 = new b();
                        a$b0.a = jSONObject1.optString("name");
                        a$b0.b = new ArrayList();
                        JSONArray jSONArray1 = jSONObject1.optJSONArray("items");
                        if(jSONArray1 != null) {
                            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                                JSONObject jSONObject2 = jSONArray1.optJSONObject(v1);
                                if(jSONObject2 != null) {
                                    co.median.android.plugins.oneSignal.a.a a$a0 = new co.median.android.plugins.oneSignal.a.a();
                                    a$a0.a = jSONObject2.optString("identifier");
                                    a$a0.b = jSONObject2.optString("name");
                                    a$a0.c = false;
                                    a$b0.b.add(a$a0);
                                }
                            }
                        }
                        a0.a.add(a$b0);
                    }
                }
            }
            return a0;
        }
        catch(JSONException jSONException0) {
        }
        Log.e("co.median.android.plugins.oneSignal.a", "Error parsing JSON for subscriptions", jSONException0);
        return null;
    }
}


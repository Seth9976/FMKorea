package h2;

import android.os.Bundle;
import g2.f;
import i2.a;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, i2.b {
    private a a;

    @Override  // i2.b
    public void a(a a0) {
        this.a = a0;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    private static String b(String s, Bundle bundle0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            jSONObject1.put(((String)object0), bundle0.get(((String)object0)));
        }
        jSONObject0.put("name", s);
        jSONObject0.put("parameters", jSONObject1);
        return jSONObject0.toString();
    }

    @Override  // h2.b
    public void onEvent(String s, Bundle bundle0) {
        a a0 = this.a;
        if(a0 != null) {
            try {
                a0.a("$A$:" + d.b(s, bundle0));
            }
            catch(JSONException unused_ex) {
                f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}


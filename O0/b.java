package O0;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public b(JSONObject jSONObject0) {
        this.a = jSONObject0.getString("name");
        this.b = jSONObject0.optString("value");
        ArrayList arrayList0 = new ArrayList();
        JSONArray jSONArray0 = jSONObject0.optJSONArray("path");
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(new c(jSONArray0.getJSONObject(v)));
            }
        }
        this.c = arrayList0;
        this.d = jSONObject0.optString("path_type", "absolute");
    }
}


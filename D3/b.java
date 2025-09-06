package d3;

import com.onesignal.Q0;
import com.onesignal.v1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class b extends a {
    public b(c c0, Q0 q00, v1 v10) {
        k.e(c0, "dataRepository");
        k.e(q00, "logger");
        k.e(v10, "timeProvider");
        super(c0, q00, v10);
    }

    @Override  // d3.a
    public void a(JSONObject jSONObject0, e3.a a0) {
        k.e(jSONObject0, "jsonObject");
        k.e(a0, "influence");
    }

    @Override  // d3.a
    public void b() {
        e3.c c0 = this.k() == null ? e3.c.i : this.k();
        c c1 = this.f();
        if(c0 == e3.c.g) {
            c0 = e3.c.h;
        }
        c1.a(c0);
    }

    @Override  // d3.a
    public int c() {
        return this.f().g();
    }

    @Override  // d3.a
    public e3.b d() {
        return e3.b.h;
    }

    @Override  // d3.a
    public String h() [...] // Inlined contents

    @Override  // d3.a
    public int i() {
        return this.f().f();
    }

    @Override  // d3.a
    public JSONArray l() {
        return this.f().h();
    }

    @Override  // d3.a
    public JSONArray m(String s) {
        JSONArray jSONArray0;
        try {
            jSONArray0 = this.l();
        }
        catch(JSONException jSONException0) {
            this.o().c("Generating IAM tracker getLastChannelObjects JSONObject ", jSONException0);
            return new JSONArray();
        }
        try {
            JSONArray jSONArray1 = new JSONArray();
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    if(!k.a(s, jSONArray0.getJSONObject(v1).getString("iam_id"))) {
                        jSONArray1.put(jSONArray0.getJSONObject(v1));
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
            return jSONArray1;
        }
        catch(JSONException jSONException1) {
            this.o().c("Generating tracker lastChannelObjectReceived get JSONObject ", jSONException1);
            return jSONArray0;
        }
    }

    @Override  // d3.a
    public void p() {
        this.y(this.f().e());
        this.o().d("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
    }

    @Override  // d3.a
    public void u(JSONArray jSONArray0) {
        k.e(jSONArray0, "channelObjects");
        this.f().p(jSONArray0);
    }
}


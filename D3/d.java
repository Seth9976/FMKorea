package d3;

import com.onesignal.Q0;
import com.onesignal.v1;
import e3.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class d extends a {
    public d(c c0, Q0 q00, v1 v10) {
        k.e(c0, "dataRepository");
        k.e(q00, "logger");
        k.e(v10, "timeProvider");
        super(c0, q00, v10);
    }

    @Override  // d3.a
    public void a(JSONObject jSONObject0, e3.a a0) {
        k.e(jSONObject0, "jsonObject");
        k.e(a0, "influence");
        if(a0.d().f()) {
            try {
                jSONObject0.put("direct", false);
                jSONObject0.put("notification_ids", a0.b());
            }
            catch(JSONException jSONException0) {
                this.o().c("Generating notification tracker addSessionData JSONObject ", jSONException0);
            }
        }
    }

    @Override  // d3.a
    public void b() {
        this.f().b((this.k() == null ? e3.c.i : this.k()));
        this.f().c(this.g());
    }

    @Override  // d3.a
    public int c() {
        return this.f().l();
    }

    @Override  // d3.a
    public b d() {
        return b.i;
    }

    @Override  // d3.a
    public String h() {
        return "notification_id";
    }

    @Override  // d3.a
    public int i() {
        return this.f().k();
    }

    @Override  // d3.a
    public JSONArray l() {
        return this.f().i();
    }

    @Override  // d3.a
    public JSONArray m(String s) {
        try {
            return this.l();
        }
        catch(JSONException jSONException0) {
            this.o().c("Generating Notification tracker getLastChannelObjects JSONObject ", jSONException0);
            return new JSONArray();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // d3.a
    public void p() {
        this.y(this.f().j());
        this.o().d("OneSignal NotificationTracker initInfluencedTypeFromCache: " + this);
    }

    @Override  // d3.a
    public void u(JSONArray jSONArray0) {
        k.e(jSONArray0, "channelObjects");
        this.f().r(jSONArray0);
    }
}


package d3;

import com.onesignal.Q0;
import com.onesignal.v1;
import e3.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public abstract class a {
    private c a;
    private Q0 b;
    private v1 c;
    private e3.c d;
    private JSONArray e;
    private String f;

    public a(c c0, Q0 q00, v1 v10) {
        k.e(c0, "dataRepository");
        k.e(q00, "logger");
        k.e(v10, "timeProvider");
        super();
        this.a = c0;
        this.b = q00;
        this.c = v10;
    }

    public abstract void a(JSONObject arg1, e3.a arg2);

    public abstract void b();

    public abstract int c();

    public abstract b d();

    public final e3.a e() {
        e3.a a0 = new e3.a(this.d(), e3.c.j, null);
        if(this.d == null) {
            this.p();
        }
        if(this.s()) {
            a0.f(e3.c.i);
        }
        return a0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && k.a(this.getClass(), object0.getClass()) && (this.d == ((a)object0).d && k.a(((a)object0).h(), this.h()));
    }

    protected final c f() {
        return this.a;
    }

    public final String g() {
        return this.f;
    }

    public abstract String h();

    @Override
    public int hashCode() {
        e3.c c0 = this.d;
        return c0 == null ? this.h().hashCode() : c0.hashCode() * 0x1F + this.h().hashCode();
    }

    public abstract int i();

    public final JSONArray j() {
        return this.e;
    }

    public final e3.c k() {
        return this.d;
    }

    public abstract JSONArray l();

    public abstract JSONArray m(String arg1);

    public final JSONArray n() {
        JSONArray jSONArray0 = new JSONArray();
        try {
            JSONArray jSONArray1 = this.l();
            this.b.d("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + jSONArray1);
            int v = this.i();
            long v1 = this.c.a();
            int v2 = jSONArray1.length();
            if(v2 > 0) {
                for(int v3 = 0; true; ++v3) {
                    JSONObject jSONObject0 = jSONArray1.getJSONObject(v3);
                    if(v1 - jSONObject0.getLong("time") <= ((long)(v * 60)) * 1000L) {
                        jSONArray0.put(jSONObject0.getString(this.h()));
                    }
                    if(v3 + 1 >= v2) {
                        break;
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
            this.b.c("Generating tracker getLastReceivedIds JSONObject ", jSONException0);
        }
        return jSONArray0;
    }

    public final Q0 o() {
        return this.b;
    }

    public abstract void p();

    private final boolean q() {
        return this.a.m();
    }

    private final boolean r() {
        return this.a.n();
    }

    private final boolean s() {
        return this.a.o();
    }

    public final void t() {
        this.f = null;
        JSONArray jSONArray0 = this.n();
        this.e = jSONArray0;
        this.d = (jSONArray0 == null ? 0 : jSONArray0.length()) <= 0 ? e3.c.i : e3.c.h;
        this.b();
        this.b.d("OneSignal OSChannelTracker resetAndInitInfluence: " + this.h() + " finish with influenceType: " + this.d);
    }

    @Override
    public String toString() {
        return "OSChannelTracker{tag=" + this.h() + ", influenceType=" + this.d + ", indirectIds=" + this.e + ", directId=" + this.f + '}';
    }

    public abstract void u(JSONArray arg1);

    public final void v(String s) {
        this.b.d("OneSignal OSChannelTracker for: " + this.h() + " saveLastId: " + s);
        if(s != null && s.length() != 0) {
            JSONArray jSONArray0 = this.m(s);
            this.b.d("OneSignal OSChannelTracker for: " + this.h() + " saveLastId with lastChannelObjectsReceived: " + jSONArray0);
            try {
                v1 v10 = this.c;
                jSONArray0.put(new JSONObject().put(this.h(), s).put("time", v10.a()));
            }
            catch(JSONException jSONException0) {
                this.b.c("Generating tracker newInfluenceId JSONObject ", jSONException0);
                return;
            }
            if(jSONArray0.length() > this.c()) {
                int v = jSONArray0.length() - this.c();
                JSONArray jSONArray1 = new JSONArray();
                int v1 = jSONArray0.length();
                if(v < v1) {
                    while(true) {
                        try {
                            jSONArray1.put(jSONArray0.get(v));
                        }
                        catch(JSONException jSONException1) {
                            this.b.c("Generating tracker lastChannelObjectsReceived get JSONObject ", jSONException1);
                        }
                        if(v + 1 >= v1) {
                            break;
                        }
                        ++v;
                    }
                }
                jSONArray0 = jSONArray1;
            }
            this.b.d("OneSignal OSChannelTracker for: " + this.h() + " with channelObjectToSave: " + jSONArray0);
            this.u(jSONArray0);
        }
    }

    public final void w(String s) {
        this.f = s;
    }

    public final void x(JSONArray jSONArray0) {
        this.e = jSONArray0;
    }

    public final void y(e3.c c0) {
        this.d = c0;
    }
}


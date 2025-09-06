package K0;

import org.json.JSONObject;
import z3.k;

public final class n {
    private final boolean a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;

    public n(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        boolean z = false;
        this(jSONObject0.optBoolean("active", false), false, false, "", "");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("snapchat");
        this.b = jSONObject1 == null ? false : jSONObject1.optBoolean("active", false);
        String s = null;
        String s1 = "";
        String s2 = jSONObject1 == null ? null : jSONObject1.optString("clientId", "");
        if(s2 == null) {
            s2 = "";
        }
        this.d = s2;
        JSONObject jSONObject2 = jSONObject0.optJSONObject("instagram");
        if(jSONObject2 != null) {
            z = jSONObject2.optBoolean("active", false);
        }
        this.c = z;
        if(jSONObject2 != null) {
            s = jSONObject2.optString("appId", "");
        }
        if(s != null) {
            s1 = s;
        }
        this.e = s1;
    }

    public n(boolean z, boolean z1, boolean z2, String s, String s1) {
        k.e(s, "snapchatClientId");
        k.e(s1, "instagramAppId");
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = s;
        this.e = s1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(this.a != ((n)object0).a) {
            return false;
        }
        if(this.b != ((n)object0).b) {
            return false;
        }
        if(this.c != ((n)object0).c) {
            return false;
        }
        return k.a(this.d, ((n)object0).d) ? k.a(this.e, ((n)object0).e) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = this.b;
        if(v2) {
            v2 = 1;
        }
        if(!this.c) {
            v1 = false;
        }
        return this.e.hashCode() + (this.d.hashCode() + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F) * 0x1F;
    }

    @Override
    public String toString() {
        return "SocialShare(enabled=" + this.a + ", snapchatEnabled=" + this.b + ", instagramEnabled=" + this.c + ", snapchatClientId=" + this.d + ", instagramAppId=" + this.e + ")";
    }
}


package K0;

import org.json.JSONObject;
import z3.k;

public final class l {
    private final boolean a;
    private final String b;
    private final String c;
    private final boolean d;

    public l(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        boolean z = jSONObject0.optBoolean("active", false);
        String s = jSONObject0.optString("androidAppKey");
        k.d(s, "params.optString(\"androidAppKey\")");
        String s1 = jSONObject0.optString("androidApiEndpoint");
        k.d(s1, "params.optString(\"androidApiEndpoint\")");
        this(z, s, s1, jSONObject0.optBoolean("autoRegister", true));
    }

    public l(boolean z, String s, String s1, boolean z1) {
        k.e(s, "appKey");
        k.e(s1, "apiEndpoint");
        super();
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = z1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        if(this.a != ((l)object0).a) {
            return false;
        }
        if(!k.a(this.b, ((l)object0).b)) {
            return false;
        }
        return k.a(this.c, ((l)object0).c) ? this.d == ((l)object0).d : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = this.b.hashCode();
        int v3 = this.c.hashCode();
        if(!this.d) {
            v1 = false;
        }
        return (v3 + (v2 + v * 0x1F) * 0x1F) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "OrttoPushConfig(enabled=" + this.a + ", appKey=" + this.b + ", apiEndpoint=" + this.c + ", autoRegister=" + this.d + ")";
    }
}


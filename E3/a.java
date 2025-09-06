package e3;

import org.json.JSONArray;
import org.json.JSONObject;
import z3.k;

public final class a {
    private c a;
    private b b;
    private JSONArray c;

    public a(b b0, c c0, JSONArray jSONArray0) {
        k.e(b0, "influenceChannel");
        k.e(c0, "influenceType");
        super();
        this.b = b0;
        this.a = c0;
        this.c = jSONArray0;
    }

    public a(String s) {
        k.e(s, "jsonString");
        super();
        JSONObject jSONObject0 = new JSONObject(s);
        String s1 = jSONObject0.getString("influence_channel");
        String s2 = jSONObject0.getString("influence_type");
        String s3 = jSONObject0.getString("influence_ids");
        this.b = b.g.a(s1);
        this.a = c.f.a(s2);
        k.d(s3, "ids");
        this.c = s3.length() == 0 ? null : new JSONArray(s3);
    }

    public final a a() {
        return new a(this.b, this.a, this.c);
    }

    public final JSONArray b() {
        return this.c;
    }

    public final b c() {
        return this.b;
    }

    public final c d() {
        return this.a;
    }

    public final void e(JSONArray jSONArray0) {
        this.c = jSONArray0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return k.a(a.class, class0) && (this.b == ((a)object0).b && this.a == ((a)object0).a);
        }
        return false;
    }

    public final void f(c c0) {
        k.e(c0, "<set-?>");
        this.a = c0;
    }

    public final String g() {
        String s = new JSONObject().put("influence_channel", this.b.toString()).put("influence_type", this.a.toString()).put("influence_ids", (this.c == null ? "" : String.valueOf(this.c))).toString();
        k.d(s, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return s;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.b + ", influenceType=" + this.a + ", ids=" + this.c + '}';
    }
}


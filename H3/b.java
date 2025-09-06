package h3;

import org.json.JSONObject;
import z3.k;

public final class b {
    private final String a;
    private final d b;
    private float c;
    private long d;

    public b(String s, d d0, float f, long v) {
        k.e(s, "outcomeId");
        super();
        this.a = s;
        this.b = d0;
        this.c = f;
        this.d = v;
    }

    public final String a() {
        return this.a;
    }

    public final d b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final float d() {
        return this.c;
    }

    public final boolean e() {
        return this.b == null || this.b.a() == null && this.b.b() == null;
    }

    public final void f(long v) {
        this.d = v;
    }

    public final JSONObject g() {
        JSONObject jSONObject0 = new JSONObject().put("id", this.a);
        d d0 = this.b;
        if(d0 != null) {
            jSONObject0.put("sources", d0.g());
        }
        float f = this.c;
        if(f > 0.0f) {
            jSONObject0.put("weight", f);
        }
        long v = this.d;
        if(v > 0L) {
            jSONObject0.put("timestamp", v);
        }
        k.d(jSONObject0, "json");
        return jSONObject0;
    }

    @Override
    public String toString() {
        return "OSOutcomeEventParams{outcomeId=\'" + this.a + "\', outcomeSource=" + this.b + ", weight=" + this.c + ", timestamp=" + this.d + '}';
    }
}


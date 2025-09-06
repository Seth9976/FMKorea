package h3;

import org.json.JSONObject;

public final class d {
    private e a;
    private e b;

    public d(e e0, e e1) {
        this.a = e0;
        this.b = e1;
    }

    public final e a() {
        return this.a;
    }

    public final e b() {
        return this.b;
    }

    public final d c(e e0) {
        this.d(e0);
        return this;
    }

    public final void d(e e0) {
        this.a = e0;
    }

    public final d e(e e0) {
        this.f(e0);
        return this;
    }

    public final void f(e e0) {
        this.b = e0;
    }

    public final JSONObject g() {
        JSONObject jSONObject0 = new JSONObject();
        e e0 = this.a;
        if(e0 != null) {
            jSONObject0.put("direct", e0.e());
        }
        e e1 = this.b;
        if(e1 != null) {
            jSONObject0.put("indirect", e1.e());
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return "OSOutcomeSource{directBody=" + this.a + ", indirectBody=" + this.b + '}';
    }
}

